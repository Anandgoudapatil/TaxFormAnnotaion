# Instead Tax Form Annotation Specification

## Goal
Define where a value from a nested taxpayer data set should be printed on a fixed PDF tax form, without coupling the annotation format to a particular PDF library.

## Structure
Each annotation contains:
- `id`: stable field identifier.
- `page`: 1-based PDF page.
- `type`: TEXT, NUMBER, CURRENCY, DATE, or CHECKBOX.
- `source.path`: JSONPath-style reference to the application data.
- `position`: target rectangle.
- `format`: rendering rules.

## Positioning
Coordinates are PDF points (72 points = 1 inch), with origin at the bottom-left. `x` increases right and `y` increases upward. `width` and `height` define the box. The form definition records page dimensions.

## Deeply nested data
Examples:
- `$.taxpayer.firstName`
- `$.income.wages`
- `$.dependents[0].firstName`
- `$.employment.employers[1].wages`

The renderer resolves the path against the proprietary data object. For a checkbox, `source.equals` provides a simple condition.

## Formatting
Supported examples include font, size, alignment, color, max length, overflow strategy, currency, decimals, separators, mask, and checkbox mark.

Recommended overflow strategies:
- `SHRINK`: reduce font size until the value fits.
- `CLIP`: clip to the rectangle.
- `ERROR`: reject the annotation during validation.

For regulated documents, `ERROR` is useful when silently changing visible content is unacceptable.

## Rendering flow
1. Load JSON specification.
2. Validate form ID/revision and page bounds.
3. Load taxpayer data.
4. Resolve `source.path`.
5. Apply conditions.
6. Format value.
7. Validate fit/overflow.
8. Draw on the specified PDF page.
9. Save the completed PDF.
10. Optionally produce a validation report.

## Reliability
Validate specification version, page number, coordinates, duplicate IDs, annotation type, path syntax, missing values, and overflow. Do not silently print stale or invalid data.

## Design decisions
A rectangle is used instead of a single point because a tax box has an area and values vary in length. Keeping data references separate from coordinates means the same taxpayer data can support multiple form revisions.

## Future enhancements
- JSON Schema validation
- multiline/wrapped text
- reusable styles
- conditional expressions
- repeated sections
- visual annotation editor
- locale-aware formatting
- annotation versioning/audit history
- PDF regression tests
