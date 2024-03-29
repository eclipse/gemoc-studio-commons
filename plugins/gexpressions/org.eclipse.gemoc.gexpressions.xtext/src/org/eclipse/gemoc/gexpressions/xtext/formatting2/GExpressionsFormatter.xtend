/*
 * generated by Xtext 2.33.0
 */
package org.eclipse.gemoc.gexpressions.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.gemoc.gexpressions.GOrExpression
import org.eclipse.gemoc.gexpressions.GProgram
import org.eclipse.gemoc.gexpressions.xtext.services.GExpressionsGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GExpressionsFormatter extends AbstractFormatter2 {
	
	@Inject extension GExpressionsGrammarAccess

	def dispatch void format(GProgram gProgram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (gImportStatement : gProgram.imports) {
			gImportStatement.format
		}
		for (gExpression : gProgram.expressions) {
			gExpression.format
		}
	}

	def dispatch void format(GOrExpression gOrExpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		gOrExpression.rightOperand.format
		gOrExpression.leftOperand.format
	}
	
	// TODO: implement for GXorExpression, GAndExpression, GEqualityExpression, GRelationExpression, GAdditionExpression, GMultiplicationExpression, GNegationExpression, GIfExpression, GBraceExpression, GNavigationExpression
}
