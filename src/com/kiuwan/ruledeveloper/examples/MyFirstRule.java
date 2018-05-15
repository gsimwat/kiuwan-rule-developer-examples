package com.kiuwan.ruledeveloper.examples;

import com.als.core.AbstractRule;
import com.als.core.RuleContext;
import com.als.core.ast.BaseNode;

/**
 * com.kiuwan.MyFirstRule - My first rule
 *
 * @author Created with Kiuwan Rule Developer
 * @version 1.0 (2015/03/09 06:00:07)
 */
public class MyFirstRule extends AbstractRule {

  @Override public void initialize(RuleContext ctx) {
    super.initialize(ctx);
    // fetch and initialize rule configuration properties
  }

  @Override protected void visit(BaseNode root, final RuleContext ctx) {
    ctx.getReport().addRuleViolation(createRuleViolation(ctx, 2));
    ctx.getReport().addRuleViolation(createRuleViolation(ctx, 4));
    ctx.getReport().addRuleViolation(createRuleViolation(ctx, 8));
  }

  @Override public void postProcess(RuleContext ctx) {
    super.postProcess(ctx);
    // Add postprocessing logic, if any
  }

}