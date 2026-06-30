package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment f208238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        super(0);
        this.f208238d = openImKefuChattingUIFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.s4 s4Var;
        r45.s4 s4Var2;
        java.lang.String str;
        int i17 = com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment.V;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseStartConversationRequest: ");
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f208238d;
        sb6.append((com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) openImKefuChattingUIFragment.S).getValue());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = openImKefuChattingUIFragment.N;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        jz5.g gVar = openImKefuChattingUIFragment.S;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) gVar).getValue();
        if ((openIMKefuStartConversationRequest == null || (s4Var2 = openIMKefuStartConversationRequest.f72277i) == null || (str = s4Var2.f385486d) == null || !(r26.n0.N(str) ^ true)) ? false : true) {
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest2 = (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) gVar).getValue();
            android.net.Uri parse = android.net.Uri.parse((openIMKefuStartConversationRequest2 == null || (s4Var = openIMKefuStartConversationRequest2.f72277i) == null) ? null : s4Var.f385486d);
            com.tencent.mars.xlog.Log.i(str2, "Uri.parse " + parse);
            java.lang.String queryParameter = parse.getQueryParameter("carryword");
            com.tencent.mars.xlog.Log.i(str2, "carryWord = " + queryParameter);
            if (queryParameter == null || queryParameter.length() == 0) {
                java.lang.String queryParameter2 = parse.getQueryParameter("_kf_custom");
                com.tencent.mars.xlog.Log.i(str2, "kf_custom = " + queryParameter2);
                if (queryParameter2 != null) {
                    try {
                        queryParameter = new org.json.JSONObject(queryParameter2).getString("carryword");
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e(str2, "parse _kf_custom failed: " + e17);
                    }
                } else {
                    queryParameter = null;
                }
                com.tencent.mars.xlog.Log.i(str2, "carryWord from js = " + queryParameter);
            }
            if (!(queryParameter == null || queryParameter.length() == 0)) {
                try {
                    byte[] decode = android.util.Base64.decode(queryParameter, 0);
                    kotlin.jvm.internal.o.f(decode, "decode(...)");
                    java.lang.String str3 = new java.lang.String(decode, r26.c.f368865a);
                    com.tencent.mars.xlog.Log.i(str2, "carryWord decoded = ".concat(str3));
                    boolean z17 = str3.length() > 0;
                    yb5.d dVar = openImKefuChattingUIFragment.f198152f;
                    if (z17) {
                        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e;
                        java.lang.String lastText = chatFooter != null ? chatFooter.getLastText() : null;
                        com.tencent.mars.xlog.Log.i(str2, "[" + openImKefuChattingUIFragment.hashCode() + "] lastTextInFooter: " + lastText);
                        boolean z18 = lastText == null || lastText.length() == 0;
                        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
                        if (z18) {
                            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f199263e;
                            if (chatFooter2 != null) {
                                chatFooter2.setLastText(str3);
                            }
                        } else {
                            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter3 = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f199263e;
                            if (chatFooter3 != null) {
                                chatFooter3.setLastText(lastText + ' ' + str3);
                            }
                        }
                        com.tencent.mars.xlog.Log.i(str2, "put carryWord to footer lastText");
                    }
                    ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).E0(1);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str2, e18, "", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
