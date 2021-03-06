package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.Node;
import quantstamp.solidity.lang.ast.VariableDefinition;
import quantstamp.solidity.lang.ast.expression.ExpressionStatement;

// SimpleStatement = VariableDefinition | ExpressionStatement

public final class SimpleStatement extends Node {
  public final VariableDefinition varDef;
  public final ExpressionStatement exprStmt;

  public SimpleStatement(final VariableDefinition varDef) {
    this.varDef = varDef;
    this.exprStmt = null;
  }

  public SimpleStatement(final ExpressionStatement exprStmt) {
    this.varDef = null;
    this.exprStmt = exprStmt;
  }
}
