[JS Api](../index.md) / UnionExpressionNode

# Interface: UnionExpressionNode

## Hierarchy

- [`BaseNode`](BaseNode.md)

  ↳ **`UnionExpressionNode`**

## Table of contents

### Properties

- [directives](UnionExpressionNode.md#directives)
- [docs](UnionExpressionNode.md#docs)
- [end](UnionExpressionNode.md#end)
- [flags](UnionExpressionNode.md#flags)
- [kind](UnionExpressionNode.md#kind)
- [options](UnionExpressionNode.md#options)
- [parent](UnionExpressionNode.md#parent)
- [pos](UnionExpressionNode.md#pos)
- [symbol](UnionExpressionNode.md#symbol)

## Properties

### directives

• `Optional` `Readonly` **directives**: readonly [`DirectiveExpressionNode`](DirectiveExpressionNode.md)[]

#### Inherited from

[BaseNode](BaseNode.md).[directives](BaseNode.md#directives)

___

### docs

• `Optional` `Readonly` **docs**: readonly [`DocNode`](DocNode.md)[]

#### Inherited from

[BaseNode](BaseNode.md).[docs](BaseNode.md#docs)

___

### end

• `Readonly` **end**: `number`

The ending position measured in UTF-16 code units from the start of the
full string. Exclusive.

#### Inherited from

[BaseNode](BaseNode.md).[end](BaseNode.md#end)

___

### flags

• `Readonly` **flags**: [`NodeFlags`](../enums/NodeFlags.md)

#### Inherited from

[BaseNode](BaseNode.md).[flags](BaseNode.md#flags)

___

### kind

• `Readonly` **kind**: [`UnionExpression`](../enums/SyntaxKind.md#unionexpression)

#### Overrides

[BaseNode](BaseNode.md).[kind](BaseNode.md#kind)

___

### options

• `Readonly` **options**: readonly [`Expression`](../index.md#expression)[]

___

### parent

• `Optional` `Readonly` **parent**: [`Node`](../index.md#node)

#### Inherited from

[BaseNode](BaseNode.md).[parent](BaseNode.md#parent)

___

### pos

• `Readonly` **pos**: `number`

The starting position of the ranger measured in UTF-16 code units from the
start of the full string. Inclusive.

#### Inherited from

[BaseNode](BaseNode.md).[pos](BaseNode.md#pos)

___

### symbol

• `Readonly` **symbol**: [`Sym`](Sym.md)

Could be undefined but making this optional creates a lot of noise. In practice,
you will likely only access symbol in cases where you know the node has a symbol.

#### Inherited from

[BaseNode](BaseNode.md).[symbol](BaseNode.md#symbol)