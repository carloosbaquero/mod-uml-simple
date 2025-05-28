package lsi.us.es.mis.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lsi.us.es.mis.xtext.services.MyUmlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUmlDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UML'", "'{'", "'}'", "'Entity'", "'Attr'", "'->'", "':'", "'['", "'..'", "']'", "'*'", "'String'", "'Integer'", "'Date'", "'Double'", "'Boolean'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
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

        public InternalMyUmlDslParser(TokenStream input, MyUmlDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Uml";
       	}

       	@Override
       	protected MyUmlDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUml"
    // InternalMyUmlDsl.g:65:1: entryRuleUml returns [EObject current=null] : iv_ruleUml= ruleUml EOF ;
    public final EObject entryRuleUml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUml = null;


        try {
            // InternalMyUmlDsl.g:65:44: (iv_ruleUml= ruleUml EOF )
            // InternalMyUmlDsl.g:66:2: iv_ruleUml= ruleUml EOF
            {
             newCompositeNode(grammarAccess.getUmlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUml=ruleUml();

            state._fsp--;

             current =iv_ruleUml; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUml"


    // $ANTLR start "ruleUml"
    // InternalMyUmlDsl.g:72:1: ruleUml returns [EObject current=null] : (otherlv_0= 'UML' otherlv_1= '{' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relationships_3_0= ruleRelationship ) )* otherlv_4= '}' ) ;
    public final EObject ruleUml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relationships_3_0 = null;



        	enterRule();

        try {
            // InternalMyUmlDsl.g:78:2: ( (otherlv_0= 'UML' otherlv_1= '{' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relationships_3_0= ruleRelationship ) )* otherlv_4= '}' ) )
            // InternalMyUmlDsl.g:79:2: (otherlv_0= 'UML' otherlv_1= '{' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relationships_3_0= ruleRelationship ) )* otherlv_4= '}' )
            {
            // InternalMyUmlDsl.g:79:2: (otherlv_0= 'UML' otherlv_1= '{' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relationships_3_0= ruleRelationship ) )* otherlv_4= '}' )
            // InternalMyUmlDsl.g:80:3: otherlv_0= 'UML' otherlv_1= '{' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relationships_3_0= ruleRelationship ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUmlAccess().getUMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUmlAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyUmlDsl.g:88:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyUmlDsl.g:89:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyUmlDsl.g:89:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyUmlDsl.g:90:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getUmlAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUmlRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"lsi.us.es.mis.xtext.MyUmlDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyUmlDsl.g:107:3: ( (lv_relationships_3_0= ruleRelationship ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyUmlDsl.g:108:4: (lv_relationships_3_0= ruleRelationship )
            	    {
            	    // InternalMyUmlDsl.g:108:4: (lv_relationships_3_0= ruleRelationship )
            	    // InternalMyUmlDsl.g:109:5: lv_relationships_3_0= ruleRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getUmlAccess().getRelationshipsRelationshipParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_relationships_3_0=ruleRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUmlRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_3_0,
            	    						"lsi.us.es.mis.xtext.MyUmlDsl.Relationship");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUmlAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUml"


    // $ANTLR start "entryRuleEntity"
    // InternalMyUmlDsl.g:134:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyUmlDsl.g:134:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyUmlDsl.g:135:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyUmlDsl.g:141:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyUmlDsl.g:147:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyUmlDsl.g:148:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyUmlDsl.g:148:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyUmlDsl.g:149:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyUmlDsl.g:153:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyUmlDsl.g:154:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyUmlDsl.g:154:4: (lv_name_1_0= RULE_ID )
            // InternalMyUmlDsl.g:155:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyUmlDsl.g:175:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUmlDsl.g:176:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyUmlDsl.g:176:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyUmlDsl.g:177:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"lsi.us.es.mis.xtext.MyUmlDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyUmlDsl.g:202:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyUmlDsl.g:202:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyUmlDsl.g:203:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyUmlDsl.g:209:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attr' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= rulePrimitiveType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyUmlDsl.g:215:2: ( (otherlv_0= 'Attr' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= rulePrimitiveType ) ) ) )
            // InternalMyUmlDsl.g:216:2: (otherlv_0= 'Attr' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= rulePrimitiveType ) ) )
            {
            // InternalMyUmlDsl.g:216:2: (otherlv_0= 'Attr' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= rulePrimitiveType ) ) )
            // InternalMyUmlDsl.g:217:3: otherlv_0= 'Attr' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= rulePrimitiveType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttrKeyword_0());
            		
            // InternalMyUmlDsl.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyUmlDsl.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyUmlDsl.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalMyUmlDsl.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyUmlDsl.g:239:3: ( (lv_type_2_0= rulePrimitiveType ) )
            // InternalMyUmlDsl.g:240:4: (lv_type_2_0= rulePrimitiveType )
            {
            // InternalMyUmlDsl.g:240:4: (lv_type_2_0= rulePrimitiveType )
            // InternalMyUmlDsl.g:241:5: lv_type_2_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePrimitiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"lsi.us.es.mis.xtext.MyUmlDsl.PrimitiveType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalMyUmlDsl.g:262:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalMyUmlDsl.g:262:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalMyUmlDsl.g:263:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalMyUmlDsl.g:269:1: ruleRelationship returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_role_4_0= RULE_STRING ) ) ( (lv_cardinality_5_0= ruleCardinality ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_role_4_0=null;
        EObject lv_cardinality_5_0 = null;



        	enterRule();

        try {
            // InternalMyUmlDsl.g:275:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_role_4_0= RULE_STRING ) ) ( (lv_cardinality_5_0= ruleCardinality ) ) ) )
            // InternalMyUmlDsl.g:276:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_role_4_0= RULE_STRING ) ) ( (lv_cardinality_5_0= ruleCardinality ) ) )
            {
            // InternalMyUmlDsl.g:276:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_role_4_0= RULE_STRING ) ) ( (lv_cardinality_5_0= ruleCardinality ) ) )
            // InternalMyUmlDsl.g:277:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_role_4_0= RULE_STRING ) ) ( (lv_cardinality_5_0= ruleCardinality ) )
            {
            // InternalMyUmlDsl.g:277:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyUmlDsl.g:278:4: (otherlv_0= RULE_ID )
            {
            // InternalMyUmlDsl.g:278:4: (otherlv_0= RULE_ID )
            // InternalMyUmlDsl.g:279:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyUmlDsl.g:294:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyUmlDsl.g:295:4: (otherlv_2= RULE_ID )
            {
            // InternalMyUmlDsl.g:295:4: (otherlv_2= RULE_ID )
            // InternalMyUmlDsl.g:296:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getColonKeyword_3());
            		
            // InternalMyUmlDsl.g:311:3: ( (lv_role_4_0= RULE_STRING ) )
            // InternalMyUmlDsl.g:312:4: (lv_role_4_0= RULE_STRING )
            {
            // InternalMyUmlDsl.g:312:4: (lv_role_4_0= RULE_STRING )
            // InternalMyUmlDsl.g:313:5: lv_role_4_0= RULE_STRING
            {
            lv_role_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_role_4_0, grammarAccess.getRelationshipAccess().getRoleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyUmlDsl.g:329:3: ( (lv_cardinality_5_0= ruleCardinality ) )
            // InternalMyUmlDsl.g:330:4: (lv_cardinality_5_0= ruleCardinality )
            {
            // InternalMyUmlDsl.g:330:4: (lv_cardinality_5_0= ruleCardinality )
            // InternalMyUmlDsl.g:331:5: lv_cardinality_5_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getCardinalityCardinalityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_cardinality_5_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_5_0,
            						"lsi.us.es.mis.xtext.MyUmlDsl.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleCardinality"
    // InternalMyUmlDsl.g:352:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalMyUmlDsl.g:352:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalMyUmlDsl.g:353:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalMyUmlDsl.g:359:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= ruleMaxValue ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalMyUmlDsl.g:365:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= ruleMaxValue ) ) otherlv_4= ']' ) )
            // InternalMyUmlDsl.g:366:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= ruleMaxValue ) ) otherlv_4= ']' )
            {
            // InternalMyUmlDsl.g:366:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= ruleMaxValue ) ) otherlv_4= ']' )
            // InternalMyUmlDsl.g:367:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= ruleMaxValue ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyUmlDsl.g:371:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalMyUmlDsl.g:372:4: (lv_min_1_0= RULE_INT )
            {
            // InternalMyUmlDsl.g:372:4: (lv_min_1_0= RULE_INT )
            // InternalMyUmlDsl.g:373:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_min_1_0, grammarAccess.getCardinalityAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalMyUmlDsl.g:393:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalMyUmlDsl.g:394:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalMyUmlDsl.g:394:4: (lv_max_3_0= ruleMaxValue )
            // InternalMyUmlDsl.g:395:5: lv_max_3_0= ruleMaxValue
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_3_0,
            						"lsi.us.es.mis.xtext.MyUmlDsl.MaxValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleMaxValue"
    // InternalMyUmlDsl.g:420:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;


        try {
            // InternalMyUmlDsl.g:420:48: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalMyUmlDsl.g:421:2: iv_ruleMaxValue= ruleMaxValue EOF
            {
             newCompositeNode(grammarAccess.getMaxValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxValue=ruleMaxValue();

            state._fsp--;

             current =iv_ruleMaxValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalMyUmlDsl.g:427:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyUmlDsl.g:433:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalMyUmlDsl.g:434:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalMyUmlDsl.g:434:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyUmlDsl.g:435:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMaxValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyUmlDsl.g:443:3: kw= '*'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMaxValueAccess().getAsteriskKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyUmlDsl.g:452:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyUmlDsl.g:458:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) ) )
            // InternalMyUmlDsl.g:459:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) )
            {
            // InternalMyUmlDsl.g:459:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyUmlDsl.g:460:3: (enumLiteral_0= 'String' )
                    {
                    // InternalMyUmlDsl.g:460:3: (enumLiteral_0= 'String' )
                    // InternalMyUmlDsl.g:461:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUmlDsl.g:468:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalMyUmlDsl.g:468:3: (enumLiteral_1= 'Integer' )
                    // InternalMyUmlDsl.g:469:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUmlDsl.g:476:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyUmlDsl.g:476:3: (enumLiteral_2= 'Date' )
                    // InternalMyUmlDsl.g:477:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUmlDsl.g:484:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyUmlDsl.g:484:3: (enumLiteral_3= 'Double' )
                    // InternalMyUmlDsl.g:485:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUmlDsl.g:492:3: (enumLiteral_4= 'Boolean' )
                    {
                    // InternalMyUmlDsl.g:492:3: (enumLiteral_4= 'Boolean' )
                    // InternalMyUmlDsl.g:493:4: enumLiteral_4= 'Boolean'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}