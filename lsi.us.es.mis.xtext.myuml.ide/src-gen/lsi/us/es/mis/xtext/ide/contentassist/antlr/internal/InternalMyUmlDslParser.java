package lsi.us.es.mis.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lsi.us.es.mis.xtext.services.MyUmlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUmlDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'String'", "'Integer'", "'Date'", "'Double'", "'Boolean'", "'UML'", "'{'", "'}'", "'Entity'", "'Attr'", "'->'", "':'", "'['", "'..'", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyUmlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyUmlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyUmlDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyUmlDsl.g"; }


    	private MyUmlDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyUmlDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUml"
    // InternalMyUmlDsl.g:53:1: entryRuleUml : ruleUml EOF ;
    public final void entryRuleUml() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:54:1: ( ruleUml EOF )
            // InternalMyUmlDsl.g:55:1: ruleUml EOF
            {
             before(grammarAccess.getUmlRule()); 
            pushFollow(FOLLOW_1);
            ruleUml();

            state._fsp--;

             after(grammarAccess.getUmlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUml"


    // $ANTLR start "ruleUml"
    // InternalMyUmlDsl.g:62:1: ruleUml : ( ( rule__Uml__Group__0 ) ) ;
    public final void ruleUml() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:66:2: ( ( ( rule__Uml__Group__0 ) ) )
            // InternalMyUmlDsl.g:67:2: ( ( rule__Uml__Group__0 ) )
            {
            // InternalMyUmlDsl.g:67:2: ( ( rule__Uml__Group__0 ) )
            // InternalMyUmlDsl.g:68:3: ( rule__Uml__Group__0 )
            {
             before(grammarAccess.getUmlAccess().getGroup()); 
            // InternalMyUmlDsl.g:69:3: ( rule__Uml__Group__0 )
            // InternalMyUmlDsl.g:69:4: rule__Uml__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uml__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUmlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUml"


    // $ANTLR start "entryRuleEntity"
    // InternalMyUmlDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyUmlDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyUmlDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyUmlDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyUmlDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyUmlDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyUmlDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalMyUmlDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyUmlDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:104:1: ( ruleAttribute EOF )
            // InternalMyUmlDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyUmlDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyUmlDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyUmlDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyUmlDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyUmlDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMyUmlDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalMyUmlDsl.g:128:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:129:1: ( ruleRelationship EOF )
            // InternalMyUmlDsl.g:130:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalMyUmlDsl.g:137:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:141:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalMyUmlDsl.g:142:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalMyUmlDsl.g:142:2: ( ( rule__Relationship__Group__0 ) )
            // InternalMyUmlDsl.g:143:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalMyUmlDsl.g:144:3: ( rule__Relationship__Group__0 )
            // InternalMyUmlDsl.g:144:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleCardinality"
    // InternalMyUmlDsl.g:153:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:154:1: ( ruleCardinality EOF )
            // InternalMyUmlDsl.g:155:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalMyUmlDsl.g:162:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:166:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalMyUmlDsl.g:167:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalMyUmlDsl.g:167:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalMyUmlDsl.g:168:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalMyUmlDsl.g:169:3: ( rule__Cardinality__Group__0 )
            // InternalMyUmlDsl.g:169:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleMaxValue"
    // InternalMyUmlDsl.g:178:1: entryRuleMaxValue : ruleMaxValue EOF ;
    public final void entryRuleMaxValue() throws RecognitionException {
        try {
            // InternalMyUmlDsl.g:179:1: ( ruleMaxValue EOF )
            // InternalMyUmlDsl.g:180:1: ruleMaxValue EOF
            {
             before(grammarAccess.getMaxValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxValue();

            state._fsp--;

             after(grammarAccess.getMaxValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalMyUmlDsl.g:187:1: ruleMaxValue : ( ( rule__MaxValue__Alternatives ) ) ;
    public final void ruleMaxValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:191:2: ( ( ( rule__MaxValue__Alternatives ) ) )
            // InternalMyUmlDsl.g:192:2: ( ( rule__MaxValue__Alternatives ) )
            {
            // InternalMyUmlDsl.g:192:2: ( ( rule__MaxValue__Alternatives ) )
            // InternalMyUmlDsl.g:193:3: ( rule__MaxValue__Alternatives )
            {
             before(grammarAccess.getMaxValueAccess().getAlternatives()); 
            // InternalMyUmlDsl.g:194:3: ( rule__MaxValue__Alternatives )
            // InternalMyUmlDsl.g:194:4: rule__MaxValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MaxValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaxValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyUmlDsl.g:203:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:207:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMyUmlDsl.g:208:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMyUmlDsl.g:208:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMyUmlDsl.g:209:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMyUmlDsl.g:210:3: ( rule__PrimitiveType__Alternatives )
            // InternalMyUmlDsl.g:210:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "rule__MaxValue__Alternatives"
    // InternalMyUmlDsl.g:218:1: rule__MaxValue__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MaxValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:222:1: ( ( RULE_INT ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUmlDsl.g:223:2: ( RULE_INT )
                    {
                    // InternalMyUmlDsl.g:223:2: ( RULE_INT )
                    // InternalMyUmlDsl.g:224:3: RULE_INT
                    {
                     before(grammarAccess.getMaxValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMaxValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUmlDsl.g:229:2: ( '*' )
                    {
                    // InternalMyUmlDsl.g:229:2: ( '*' )
                    // InternalMyUmlDsl.g:230:3: '*'
                    {
                     before(grammarAccess.getMaxValueAccess().getAsteriskKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMaxValueAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValue__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalMyUmlDsl.g:239:1: rule__PrimitiveType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:243:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Boolean' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyUmlDsl.g:244:2: ( ( 'String' ) )
                    {
                    // InternalMyUmlDsl.g:244:2: ( ( 'String' ) )
                    // InternalMyUmlDsl.g:245:3: ( 'String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalMyUmlDsl.g:246:3: ( 'String' )
                    // InternalMyUmlDsl.g:246:4: 'String'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUmlDsl.g:250:2: ( ( 'Integer' ) )
                    {
                    // InternalMyUmlDsl.g:250:2: ( ( 'Integer' ) )
                    // InternalMyUmlDsl.g:251:3: ( 'Integer' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalMyUmlDsl.g:252:3: ( 'Integer' )
                    // InternalMyUmlDsl.g:252:4: 'Integer'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUmlDsl.g:256:2: ( ( 'Date' ) )
                    {
                    // InternalMyUmlDsl.g:256:2: ( ( 'Date' ) )
                    // InternalMyUmlDsl.g:257:3: ( 'Date' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalMyUmlDsl.g:258:3: ( 'Date' )
                    // InternalMyUmlDsl.g:258:4: 'Date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUmlDsl.g:262:2: ( ( 'Double' ) )
                    {
                    // InternalMyUmlDsl.g:262:2: ( ( 'Double' ) )
                    // InternalMyUmlDsl.g:263:3: ( 'Double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalMyUmlDsl.g:264:3: ( 'Double' )
                    // InternalMyUmlDsl.g:264:4: 'Double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUmlDsl.g:268:2: ( ( 'Boolean' ) )
                    {
                    // InternalMyUmlDsl.g:268:2: ( ( 'Boolean' ) )
                    // InternalMyUmlDsl.g:269:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalMyUmlDsl.g:270:3: ( 'Boolean' )
                    // InternalMyUmlDsl.g:270:4: 'Boolean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Uml__Group__0"
    // InternalMyUmlDsl.g:278:1: rule__Uml__Group__0 : rule__Uml__Group__0__Impl rule__Uml__Group__1 ;
    public final void rule__Uml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:282:1: ( rule__Uml__Group__0__Impl rule__Uml__Group__1 )
            // InternalMyUmlDsl.g:283:2: rule__Uml__Group__0__Impl rule__Uml__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Uml__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uml__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__0"


    // $ANTLR start "rule__Uml__Group__0__Impl"
    // InternalMyUmlDsl.g:290:1: rule__Uml__Group__0__Impl : ( 'UML' ) ;
    public final void rule__Uml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:294:1: ( ( 'UML' ) )
            // InternalMyUmlDsl.g:295:1: ( 'UML' )
            {
            // InternalMyUmlDsl.g:295:1: ( 'UML' )
            // InternalMyUmlDsl.g:296:2: 'UML'
            {
             before(grammarAccess.getUmlAccess().getUMLKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUmlAccess().getUMLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__0__Impl"


    // $ANTLR start "rule__Uml__Group__1"
    // InternalMyUmlDsl.g:305:1: rule__Uml__Group__1 : rule__Uml__Group__1__Impl rule__Uml__Group__2 ;
    public final void rule__Uml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:309:1: ( rule__Uml__Group__1__Impl rule__Uml__Group__2 )
            // InternalMyUmlDsl.g:310:2: rule__Uml__Group__1__Impl rule__Uml__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Uml__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uml__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__1"


    // $ANTLR start "rule__Uml__Group__1__Impl"
    // InternalMyUmlDsl.g:317:1: rule__Uml__Group__1__Impl : ( '{' ) ;
    public final void rule__Uml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:321:1: ( ( '{' ) )
            // InternalMyUmlDsl.g:322:1: ( '{' )
            {
            // InternalMyUmlDsl.g:322:1: ( '{' )
            // InternalMyUmlDsl.g:323:2: '{'
            {
             before(grammarAccess.getUmlAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUmlAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__1__Impl"


    // $ANTLR start "rule__Uml__Group__2"
    // InternalMyUmlDsl.g:332:1: rule__Uml__Group__2 : rule__Uml__Group__2__Impl rule__Uml__Group__3 ;
    public final void rule__Uml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:336:1: ( rule__Uml__Group__2__Impl rule__Uml__Group__3 )
            // InternalMyUmlDsl.g:337:2: rule__Uml__Group__2__Impl rule__Uml__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Uml__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uml__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__2"


    // $ANTLR start "rule__Uml__Group__2__Impl"
    // InternalMyUmlDsl.g:344:1: rule__Uml__Group__2__Impl : ( ( rule__Uml__EntitiesAssignment_2 )* ) ;
    public final void rule__Uml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:348:1: ( ( ( rule__Uml__EntitiesAssignment_2 )* ) )
            // InternalMyUmlDsl.g:349:1: ( ( rule__Uml__EntitiesAssignment_2 )* )
            {
            // InternalMyUmlDsl.g:349:1: ( ( rule__Uml__EntitiesAssignment_2 )* )
            // InternalMyUmlDsl.g:350:2: ( rule__Uml__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getUmlAccess().getEntitiesAssignment_2()); 
            // InternalMyUmlDsl.g:351:2: ( rule__Uml__EntitiesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUmlDsl.g:351:3: rule__Uml__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Uml__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUmlAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__2__Impl"


    // $ANTLR start "rule__Uml__Group__3"
    // InternalMyUmlDsl.g:359:1: rule__Uml__Group__3 : rule__Uml__Group__3__Impl rule__Uml__Group__4 ;
    public final void rule__Uml__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:363:1: ( rule__Uml__Group__3__Impl rule__Uml__Group__4 )
            // InternalMyUmlDsl.g:364:2: rule__Uml__Group__3__Impl rule__Uml__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Uml__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uml__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__3"


    // $ANTLR start "rule__Uml__Group__3__Impl"
    // InternalMyUmlDsl.g:371:1: rule__Uml__Group__3__Impl : ( ( rule__Uml__RelationshipsAssignment_3 )* ) ;
    public final void rule__Uml__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:375:1: ( ( ( rule__Uml__RelationshipsAssignment_3 )* ) )
            // InternalMyUmlDsl.g:376:1: ( ( rule__Uml__RelationshipsAssignment_3 )* )
            {
            // InternalMyUmlDsl.g:376:1: ( ( rule__Uml__RelationshipsAssignment_3 )* )
            // InternalMyUmlDsl.g:377:2: ( rule__Uml__RelationshipsAssignment_3 )*
            {
             before(grammarAccess.getUmlAccess().getRelationshipsAssignment_3()); 
            // InternalMyUmlDsl.g:378:2: ( rule__Uml__RelationshipsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyUmlDsl.g:378:3: rule__Uml__RelationshipsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Uml__RelationshipsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUmlAccess().getRelationshipsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__3__Impl"


    // $ANTLR start "rule__Uml__Group__4"
    // InternalMyUmlDsl.g:386:1: rule__Uml__Group__4 : rule__Uml__Group__4__Impl ;
    public final void rule__Uml__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:390:1: ( rule__Uml__Group__4__Impl )
            // InternalMyUmlDsl.g:391:2: rule__Uml__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uml__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__4"


    // $ANTLR start "rule__Uml__Group__4__Impl"
    // InternalMyUmlDsl.g:397:1: rule__Uml__Group__4__Impl : ( '}' ) ;
    public final void rule__Uml__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:401:1: ( ( '}' ) )
            // InternalMyUmlDsl.g:402:1: ( '}' )
            {
            // InternalMyUmlDsl.g:402:1: ( '}' )
            // InternalMyUmlDsl.g:403:2: '}'
            {
             before(grammarAccess.getUmlAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUmlAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyUmlDsl.g:413:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:417:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyUmlDsl.g:418:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyUmlDsl.g:425:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:429:1: ( ( 'Entity' ) )
            // InternalMyUmlDsl.g:430:1: ( 'Entity' )
            {
            // InternalMyUmlDsl.g:430:1: ( 'Entity' )
            // InternalMyUmlDsl.g:431:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyUmlDsl.g:440:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:444:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyUmlDsl.g:445:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyUmlDsl.g:452:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:456:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyUmlDsl.g:457:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyUmlDsl.g:457:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyUmlDsl.g:458:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyUmlDsl.g:459:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyUmlDsl.g:459:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyUmlDsl.g:467:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:471:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyUmlDsl.g:472:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyUmlDsl.g:479:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:483:1: ( ( '{' ) )
            // InternalMyUmlDsl.g:484:1: ( '{' )
            {
            // InternalMyUmlDsl.g:484:1: ( '{' )
            // InternalMyUmlDsl.g:485:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyUmlDsl.g:494:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:498:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyUmlDsl.g:499:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyUmlDsl.g:506:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:510:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalMyUmlDsl.g:511:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalMyUmlDsl.g:511:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalMyUmlDsl.g:512:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalMyUmlDsl.g:513:2: ( rule__Entity__AttributesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyUmlDsl.g:513:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMyUmlDsl.g:521:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:525:1: ( rule__Entity__Group__4__Impl )
            // InternalMyUmlDsl.g:526:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMyUmlDsl.g:532:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:536:1: ( ( '}' ) )
            // InternalMyUmlDsl.g:537:1: ( '}' )
            {
            // InternalMyUmlDsl.g:537:1: ( '}' )
            // InternalMyUmlDsl.g:538:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyUmlDsl.g:548:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:552:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyUmlDsl.g:553:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyUmlDsl.g:560:1: rule__Attribute__Group__0__Impl : ( 'Attr' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:564:1: ( ( 'Attr' ) )
            // InternalMyUmlDsl.g:565:1: ( 'Attr' )
            {
            // InternalMyUmlDsl.g:565:1: ( 'Attr' )
            // InternalMyUmlDsl.g:566:2: 'Attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyUmlDsl.g:575:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:579:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyUmlDsl.g:580:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyUmlDsl.g:587:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:591:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyUmlDsl.g:592:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyUmlDsl.g:592:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyUmlDsl.g:593:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyUmlDsl.g:594:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyUmlDsl.g:594:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyUmlDsl.g:602:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:606:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyUmlDsl.g:607:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyUmlDsl.g:613:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:617:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalMyUmlDsl.g:618:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalMyUmlDsl.g:618:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalMyUmlDsl.g:619:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalMyUmlDsl.g:620:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalMyUmlDsl.g:620:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalMyUmlDsl.g:629:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:633:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalMyUmlDsl.g:634:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalMyUmlDsl.g:641:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__SourceAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:645:1: ( ( ( rule__Relationship__SourceAssignment_0 ) ) )
            // InternalMyUmlDsl.g:646:1: ( ( rule__Relationship__SourceAssignment_0 ) )
            {
            // InternalMyUmlDsl.g:646:1: ( ( rule__Relationship__SourceAssignment_0 ) )
            // InternalMyUmlDsl.g:647:2: ( rule__Relationship__SourceAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getSourceAssignment_0()); 
            // InternalMyUmlDsl.g:648:2: ( rule__Relationship__SourceAssignment_0 )
            // InternalMyUmlDsl.g:648:3: rule__Relationship__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalMyUmlDsl.g:656:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:660:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalMyUmlDsl.g:661:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalMyUmlDsl.g:668:1: rule__Relationship__Group__1__Impl : ( '->' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:672:1: ( ( '->' ) )
            // InternalMyUmlDsl.g:673:1: ( '->' )
            {
            // InternalMyUmlDsl.g:673:1: ( '->' )
            // InternalMyUmlDsl.g:674:2: '->'
            {
             before(grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalMyUmlDsl.g:683:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:687:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalMyUmlDsl.g:688:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalMyUmlDsl.g:695:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__TargetAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:699:1: ( ( ( rule__Relationship__TargetAssignment_2 ) ) )
            // InternalMyUmlDsl.g:700:1: ( ( rule__Relationship__TargetAssignment_2 ) )
            {
            // InternalMyUmlDsl.g:700:1: ( ( rule__Relationship__TargetAssignment_2 ) )
            // InternalMyUmlDsl.g:701:2: ( rule__Relationship__TargetAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_2()); 
            // InternalMyUmlDsl.g:702:2: ( rule__Relationship__TargetAssignment_2 )
            // InternalMyUmlDsl.g:702:3: rule__Relationship__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalMyUmlDsl.g:710:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:714:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalMyUmlDsl.g:715:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalMyUmlDsl.g:722:1: rule__Relationship__Group__3__Impl : ( ':' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:726:1: ( ( ':' ) )
            // InternalMyUmlDsl.g:727:1: ( ':' )
            {
            // InternalMyUmlDsl.g:727:1: ( ':' )
            // InternalMyUmlDsl.g:728:2: ':'
            {
             before(grammarAccess.getRelationshipAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalMyUmlDsl.g:737:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:741:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalMyUmlDsl.g:742:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalMyUmlDsl.g:749:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__RoleAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:753:1: ( ( ( rule__Relationship__RoleAssignment_4 ) ) )
            // InternalMyUmlDsl.g:754:1: ( ( rule__Relationship__RoleAssignment_4 ) )
            {
            // InternalMyUmlDsl.g:754:1: ( ( rule__Relationship__RoleAssignment_4 ) )
            // InternalMyUmlDsl.g:755:2: ( rule__Relationship__RoleAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getRoleAssignment_4()); 
            // InternalMyUmlDsl.g:756:2: ( rule__Relationship__RoleAssignment_4 )
            // InternalMyUmlDsl.g:756:3: rule__Relationship__RoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__RoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalMyUmlDsl.g:764:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:768:1: ( rule__Relationship__Group__5__Impl )
            // InternalMyUmlDsl.g:769:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalMyUmlDsl.g:775:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__CardinalityAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:779:1: ( ( ( rule__Relationship__CardinalityAssignment_5 ) ) )
            // InternalMyUmlDsl.g:780:1: ( ( rule__Relationship__CardinalityAssignment_5 ) )
            {
            // InternalMyUmlDsl.g:780:1: ( ( rule__Relationship__CardinalityAssignment_5 ) )
            // InternalMyUmlDsl.g:781:2: ( rule__Relationship__CardinalityAssignment_5 )
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityAssignment_5()); 
            // InternalMyUmlDsl.g:782:2: ( rule__Relationship__CardinalityAssignment_5 )
            // InternalMyUmlDsl.g:782:3: rule__Relationship__CardinalityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__CardinalityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getCardinalityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalMyUmlDsl.g:791:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:795:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalMyUmlDsl.g:796:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalMyUmlDsl.g:803:1: rule__Cardinality__Group__0__Impl : ( '[' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:807:1: ( ( '[' ) )
            // InternalMyUmlDsl.g:808:1: ( '[' )
            {
            // InternalMyUmlDsl.g:808:1: ( '[' )
            // InternalMyUmlDsl.g:809:2: '['
            {
             before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalMyUmlDsl.g:818:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:822:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalMyUmlDsl.g:823:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalMyUmlDsl.g:830:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__MinAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:834:1: ( ( ( rule__Cardinality__MinAssignment_1 ) ) )
            // InternalMyUmlDsl.g:835:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            {
            // InternalMyUmlDsl.g:835:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            // InternalMyUmlDsl.g:836:2: ( rule__Cardinality__MinAssignment_1 )
            {
             before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); 
            // InternalMyUmlDsl.g:837:2: ( rule__Cardinality__MinAssignment_1 )
            // InternalMyUmlDsl.g:837:3: rule__Cardinality__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getMinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalMyUmlDsl.g:845:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:849:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalMyUmlDsl.g:850:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalMyUmlDsl.g:857:1: rule__Cardinality__Group__2__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:861:1: ( ( '..' ) )
            // InternalMyUmlDsl.g:862:1: ( '..' )
            {
            // InternalMyUmlDsl.g:862:1: ( '..' )
            // InternalMyUmlDsl.g:863:2: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalMyUmlDsl.g:872:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:876:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalMyUmlDsl.g:877:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalMyUmlDsl.g:884:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__MaxAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:888:1: ( ( ( rule__Cardinality__MaxAssignment_3 ) ) )
            // InternalMyUmlDsl.g:889:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            {
            // InternalMyUmlDsl.g:889:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            // InternalMyUmlDsl.g:890:2: ( rule__Cardinality__MaxAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); 
            // InternalMyUmlDsl.g:891:2: ( rule__Cardinality__MaxAssignment_3 )
            // InternalMyUmlDsl.g:891:3: rule__Cardinality__MaxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__MaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalMyUmlDsl.g:899:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:903:1: ( rule__Cardinality__Group__4__Impl )
            // InternalMyUmlDsl.g:904:2: rule__Cardinality__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalMyUmlDsl.g:910:1: rule__Cardinality__Group__4__Impl : ( ']' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:914:1: ( ( ']' ) )
            // InternalMyUmlDsl.g:915:1: ( ']' )
            {
            // InternalMyUmlDsl.g:915:1: ( ']' )
            // InternalMyUmlDsl.g:916:2: ']'
            {
             before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__Uml__EntitiesAssignment_2"
    // InternalMyUmlDsl.g:926:1: rule__Uml__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__Uml__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:930:1: ( ( ruleEntity ) )
            // InternalMyUmlDsl.g:931:2: ( ruleEntity )
            {
            // InternalMyUmlDsl.g:931:2: ( ruleEntity )
            // InternalMyUmlDsl.g:932:3: ruleEntity
            {
             before(grammarAccess.getUmlAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getUmlAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__EntitiesAssignment_2"


    // $ANTLR start "rule__Uml__RelationshipsAssignment_3"
    // InternalMyUmlDsl.g:941:1: rule__Uml__RelationshipsAssignment_3 : ( ruleRelationship ) ;
    public final void rule__Uml__RelationshipsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:945:1: ( ( ruleRelationship ) )
            // InternalMyUmlDsl.g:946:2: ( ruleRelationship )
            {
            // InternalMyUmlDsl.g:946:2: ( ruleRelationship )
            // InternalMyUmlDsl.g:947:3: ruleRelationship
            {
             before(grammarAccess.getUmlAccess().getRelationshipsRelationshipParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getUmlAccess().getRelationshipsRelationshipParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uml__RelationshipsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyUmlDsl.g:956:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:960:1: ( ( RULE_ID ) )
            // InternalMyUmlDsl.g:961:2: ( RULE_ID )
            {
            // InternalMyUmlDsl.g:961:2: ( RULE_ID )
            // InternalMyUmlDsl.g:962:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalMyUmlDsl.g:971:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:975:1: ( ( ruleAttribute ) )
            // InternalMyUmlDsl.g:976:2: ( ruleAttribute )
            {
            // InternalMyUmlDsl.g:976:2: ( ruleAttribute )
            // InternalMyUmlDsl.g:977:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyUmlDsl.g:986:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:990:1: ( ( RULE_ID ) )
            // InternalMyUmlDsl.g:991:2: ( RULE_ID )
            {
            // InternalMyUmlDsl.g:991:2: ( RULE_ID )
            // InternalMyUmlDsl.g:992:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalMyUmlDsl.g:1001:1: rule__Attribute__TypeAssignment_2 : ( rulePrimitiveType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1005:1: ( ( rulePrimitiveType ) )
            // InternalMyUmlDsl.g:1006:2: ( rulePrimitiveType )
            {
            // InternalMyUmlDsl.g:1006:2: ( rulePrimitiveType )
            // InternalMyUmlDsl.g:1007:3: rulePrimitiveType
            {
             before(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Relationship__SourceAssignment_0"
    // InternalMyUmlDsl.g:1016:1: rule__Relationship__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1020:1: ( ( ( RULE_ID ) ) )
            // InternalMyUmlDsl.g:1021:2: ( ( RULE_ID ) )
            {
            // InternalMyUmlDsl.g:1021:2: ( ( RULE_ID ) )
            // InternalMyUmlDsl.g:1022:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_0_0()); 
            // InternalMyUmlDsl.g:1023:3: ( RULE_ID )
            // InternalMyUmlDsl.g:1024:4: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getSourceEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__SourceAssignment_0"


    // $ANTLR start "rule__Relationship__TargetAssignment_2"
    // InternalMyUmlDsl.g:1035:1: rule__Relationship__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1039:1: ( ( ( RULE_ID ) ) )
            // InternalMyUmlDsl.g:1040:2: ( ( RULE_ID ) )
            {
            // InternalMyUmlDsl.g:1040:2: ( ( RULE_ID ) )
            // InternalMyUmlDsl.g:1041:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_2_0()); 
            // InternalMyUmlDsl.g:1042:3: ( RULE_ID )
            // InternalMyUmlDsl.g:1043:4: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TargetAssignment_2"


    // $ANTLR start "rule__Relationship__RoleAssignment_4"
    // InternalMyUmlDsl.g:1054:1: rule__Relationship__RoleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Relationship__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1058:1: ( ( RULE_STRING ) )
            // InternalMyUmlDsl.g:1059:2: ( RULE_STRING )
            {
            // InternalMyUmlDsl.g:1059:2: ( RULE_STRING )
            // InternalMyUmlDsl.g:1060:3: RULE_STRING
            {
             before(grammarAccess.getRelationshipAccess().getRoleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRoleSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RoleAssignment_4"


    // $ANTLR start "rule__Relationship__CardinalityAssignment_5"
    // InternalMyUmlDsl.g:1069:1: rule__Relationship__CardinalityAssignment_5 : ( ruleCardinality ) ;
    public final void rule__Relationship__CardinalityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1073:1: ( ( ruleCardinality ) )
            // InternalMyUmlDsl.g:1074:2: ( ruleCardinality )
            {
            // InternalMyUmlDsl.g:1074:2: ( ruleCardinality )
            // InternalMyUmlDsl.g:1075:3: ruleCardinality
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityCardinalityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getCardinalityCardinalityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__CardinalityAssignment_5"


    // $ANTLR start "rule__Cardinality__MinAssignment_1"
    // InternalMyUmlDsl.g:1084:1: rule__Cardinality__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cardinality__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1088:1: ( ( RULE_INT ) )
            // InternalMyUmlDsl.g:1089:2: ( RULE_INT )
            {
            // InternalMyUmlDsl.g:1089:2: ( RULE_INT )
            // InternalMyUmlDsl.g:1090:3: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getMinINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__MinAssignment_1"


    // $ANTLR start "rule__Cardinality__MaxAssignment_3"
    // InternalMyUmlDsl.g:1099:1: rule__Cardinality__MaxAssignment_3 : ( ruleMaxValue ) ;
    public final void rule__Cardinality__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUmlDsl.g:1103:1: ( ( ruleMaxValue ) )
            // InternalMyUmlDsl.g:1104:2: ( ruleMaxValue )
            {
            // InternalMyUmlDsl.g:1104:2: ( ruleMaxValue )
            // InternalMyUmlDsl.g:1105:3: ruleMaxValue
            {
             before(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMaxValue();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__MaxAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}