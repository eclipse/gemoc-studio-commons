/*
 * generated by Xtext 2.33.0
 */
package org.eclipse.gemoc.gexpressions.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.gemoc.gexpressions.xtext.ide.contentassist.antlr.internal.InternalGExpressionsParser;
import org.eclipse.gemoc.gexpressions.xtext.services.GExpressionsGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GExpressionsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GExpressionsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GExpressionsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGNegationExpressionAccess().getAlternatives(), "rule__GNegationExpression__Alternatives");
			builder.put(grammarAccess.getGReferenceExpressionAccess().getAlternatives(), "rule__GReferenceExpression__Alternatives");
			builder.put(grammarAccess.getGPrimaryExpressionAccess().getAlternatives(), "rule__GPrimaryExpression__Alternatives");
			builder.put(grammarAccess.getGNumericExpressionAccess().getAlternatives(), "rule__GNumericExpression__Alternatives");
			builder.put(grammarAccess.getNavigationOperatorAccess().getAlternatives(), "rule__NavigationOperator__Alternatives");
			builder.put(grammarAccess.getGEqualityOperatorAccess().getAlternatives(), "rule__GEqualityOperator__Alternatives");
			builder.put(grammarAccess.getGRelationOperatorAccess().getAlternatives(), "rule__GRelationOperator__Alternatives");
			builder.put(grammarAccess.getGAdditionOperatorAccess().getAlternatives(), "rule__GAdditionOperator__Alternatives");
			builder.put(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives(), "rule__GMultiplicationOperator__Alternatives");
			builder.put(grammarAccess.getGNegationOperatorAccess().getAlternatives(), "rule__GNegationOperator__Alternatives");
			builder.put(grammarAccess.getGProgramAccess().getGroup(), "rule__GProgram__Group__0");
			builder.put(grammarAccess.getGProgramAccess().getGroup_1(), "rule__GProgram__Group_1__0");
			builder.put(grammarAccess.getGProgramAccess().getGroup_1_1(), "rule__GProgram__Group_1_1__0");
			builder.put(grammarAccess.getGImportStatementAccess().getGroup(), "rule__GImportStatement__Group__0");
			builder.put(grammarAccess.getGOrExpressionAccess().getGroup(), "rule__GOrExpression__Group__0");
			builder.put(grammarAccess.getGOrExpressionAccess().getGroup_1(), "rule__GOrExpression__Group_1__0");
			builder.put(grammarAccess.getGXorExpressionAccess().getGroup(), "rule__GXorExpression__Group__0");
			builder.put(grammarAccess.getGXorExpressionAccess().getGroup_1(), "rule__GXorExpression__Group_1__0");
			builder.put(grammarAccess.getGAndExpressionAccess().getGroup(), "rule__GAndExpression__Group__0");
			builder.put(grammarAccess.getGAndExpressionAccess().getGroup_1(), "rule__GAndExpression__Group_1__0");
			builder.put(grammarAccess.getGEqualityExpressionAccess().getGroup(), "rule__GEqualityExpression__Group__0");
			builder.put(grammarAccess.getGEqualityExpressionAccess().getGroup_1(), "rule__GEqualityExpression__Group_1__0");
			builder.put(grammarAccess.getGRelationExpressionAccess().getGroup(), "rule__GRelationExpression__Group__0");
			builder.put(grammarAccess.getGRelationExpressionAccess().getGroup_1(), "rule__GRelationExpression__Group_1__0");
			builder.put(grammarAccess.getGAdditionExpressionAccess().getGroup(), "rule__GAdditionExpression__Group__0");
			builder.put(grammarAccess.getGAdditionExpressionAccess().getGroup_1(), "rule__GAdditionExpression__Group_1__0");
			builder.put(grammarAccess.getGMultiplicationExpressionAccess().getGroup(), "rule__GMultiplicationExpression__Group__0");
			builder.put(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1(), "rule__GMultiplicationExpression__Group_1__0");
			builder.put(grammarAccess.getGNegationExpressionAccess().getGroup_1(), "rule__GNegationExpression__Group_1__0");
			builder.put(grammarAccess.getGNavigationExpressionAccess().getGroup(), "rule__GNavigationExpression__Group__0");
			builder.put(grammarAccess.getGNavigationExpressionAccess().getGroup_1(), "rule__GNavigationExpression__Group_1__0");
			builder.put(grammarAccess.getGReferenceExpressionAccess().getGroup_1(), "rule__GReferenceExpression__Group_1__0");
			builder.put(grammarAccess.getGStringExpressionAccess().getGroup(), "rule__GStringExpression__Group__0");
			builder.put(grammarAccess.getGBooleanExpressionAccess().getGroup(), "rule__GBooleanExpression__Group__0");
			builder.put(grammarAccess.getGIntegerExpressionAccess().getGroup(), "rule__GIntegerExpression__Group__0");
			builder.put(grammarAccess.getGDoubleExpressionAccess().getGroup(), "rule__GDoubleExpression__Group__0");
			builder.put(grammarAccess.getGEnumLiteralExpressionAccess().getGroup(), "rule__GEnumLiteralExpression__Group__0");
			builder.put(grammarAccess.getGIfExpressionAccess().getGroup(), "rule__GIfExpression__Group__0");
			builder.put(grammarAccess.getGBraceExpressionAccess().getGroup(), "rule__GBraceExpression__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getGProgramAccess().getImportsAssignment_0(), "rule__GProgram__ImportsAssignment_0");
			builder.put(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_0(), "rule__GProgram__ExpressionsAssignment_1_0");
			builder.put(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_1_1(), "rule__GProgram__ExpressionsAssignment_1_1_1");
			builder.put(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1(), "rule__GImportStatement__ImportURIAssignment_1");
			builder.put(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1(), "rule__GOrExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__GOrExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1(), "rule__GXorExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2(), "rule__GXorExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1(), "rule__GAndExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__GAndExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1(), "rule__GEqualityExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2(), "rule__GEqualityExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1(), "rule__GRelationExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2(), "rule__GRelationExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1(), "rule__GAdditionExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2(), "rule__GAdditionExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1(), "rule__GMultiplicationExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2(), "rule__GMultiplicationExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1(), "rule__GNegationExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2(), "rule__GNegationExpression__OperandAssignment_1_2");
			builder.put(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2(), "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2");
			builder.put(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1(), "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1");
			builder.put(grammarAccess.getGStringExpressionAccess().getValueAssignment_1(), "rule__GStringExpression__ValueAssignment_1");
			builder.put(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1(), "rule__GBooleanExpression__ValueAssignment_1");
			builder.put(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1(), "rule__GIntegerExpression__ValueAssignment_1");
			builder.put(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1(), "rule__GDoubleExpression__ValueAssignment_1");
			builder.put(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2(), "rule__GEnumLiteralExpression__ValueAssignment_2");
			builder.put(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2(), "rule__GIfExpression__ConditionAssignment_2");
			builder.put(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4(), "rule__GIfExpression__ThenExpressionAssignment_4");
			builder.put(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6(), "rule__GIfExpression__ElseExpressionAssignment_6");
			builder.put(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2(), "rule__GBraceExpression__InnerExpressionAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GExpressionsGrammarAccess grammarAccess;

	@Override
	protected InternalGExpressionsParser createParser() {
		InternalGExpressionsParser result = new InternalGExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
