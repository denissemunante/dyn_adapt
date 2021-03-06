/*
 * generated by Xtext 2.9.1
 */
package eu.supersede.dynadapt.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import eu.supersede.dynadapt.dsl.ide.contentassist.antlr.internal.InternalAspectParser;
import eu.supersede.dynadapt.dsl.services.AspectGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class AspectParser extends AbstractContentAssistParser {

	@Inject
	private AspectGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAspectParser createParser() {
		InternalAspectParser result = new InternalAspectParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
					put(grammarAccess.getAspectAccess().getGroup_12(), "rule__Aspect__Group_12__0");
					put(grammarAccess.getAspectAccess().getGroup_18(), "rule__Aspect__Group_18__0");
					put(grammarAccess.getPointcutAccess().getGroup(), "rule__Pointcut__Group__0");
					put(grammarAccess.getPointcutAccess().getGroup_5(), "rule__Pointcut__Group_5__0");
					put(grammarAccess.getCompositionAccess().getGroup(), "rule__Composition__Group__0");
					put(grammarAccess.getCompositionAccess().getGroup_5(), "rule__Composition__Group_5__0");
					put(grammarAccess.getCompositionAccess().getGroup_6(), "rule__Composition__Group_6__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getAspectAccess().getNameAssignment_1(), "rule__Aspect__NameAssignment_1");
					put(grammarAccess.getAspectAccess().getFeatureAssignment_4(), "rule__Aspect__FeatureAssignment_4");
					put(grammarAccess.getAspectAccess().getAdviceAssignment_7(), "rule__Aspect__AdviceAssignment_7");
					put(grammarAccess.getAspectAccess().getPointcutsAssignment_11(), "rule__Aspect__PointcutsAssignment_11");
					put(grammarAccess.getAspectAccess().getPointcutsAssignment_12_1(), "rule__Aspect__PointcutsAssignment_12_1");
					put(grammarAccess.getAspectAccess().getCompositionsAssignment_17(), "rule__Aspect__CompositionsAssignment_17");
					put(grammarAccess.getAspectAccess().getCompositionsAssignment_18_1(), "rule__Aspect__CompositionsAssignment_18_1");
					put(grammarAccess.getPointcutAccess().getNameAssignment_1(), "rule__Pointcut__NameAssignment_1");
					put(grammarAccess.getPointcutAccess().getPatternAssignment_4(), "rule__Pointcut__PatternAssignment_4");
					put(grammarAccess.getPointcutAccess().getRoleAssignment_5_2(), "rule__Pointcut__RoleAssignment_5_2");
					put(grammarAccess.getCompositionAccess().getNameAssignment_1(), "rule__Composition__NameAssignment_1");
					put(grammarAccess.getCompositionAccess().getFeature_enabledAssignment_4(), "rule__Composition__Feature_enabledAssignment_4");
					put(grammarAccess.getCompositionAccess().getJointpointRoleAssignment_5_2(), "rule__Composition__JointpointRoleAssignment_5_2");
					put(grammarAccess.getCompositionAccess().getAdviceAssignment_6_2(), "rule__Composition__AdviceAssignment_6_2");
					put(grammarAccess.getCompositionAccess().getActionAssignment_9(), "rule__Composition__ActionAssignment_9");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAspectParser typedParser = (InternalAspectParser) parser;
			typedParser.entryRuleAspect();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AspectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AspectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
