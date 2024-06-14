---
jsApi: true
title: "[I] NullValue"

---
## Extends

- `BaseValue`

## Properties

| Property | Modifier | Type | Description | Overrides | Inherited from |
| :------ | :------ | :------ | :------ | :------ | :------ |
| `entityKind` | `readonly` | `"Value"` | - | `BaseValue.entityKind` | `BaseValue.entityKind` |
| `type` | `public` | [`Type`](../type-aliases/Type.md) | <p>Represent the storage type of a value.</p><p>**Example**</p><code>const a = "hello"; // Type here would be "hello"<p>const b: string = a;  // Type here would be string</p><p>const c: string \| int32 = b; // Type here would be string \| int32</p></code> | `BaseValue.type` | `BaseValue.type` |
| `value` | `public` | `null` | - | - | - |
| `valueKind` | `public` | `"NullValue"` | - | `BaseValue.valueKind` | `BaseValue.valueKind` |