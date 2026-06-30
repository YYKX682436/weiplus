package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class u8 {
    public u8(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting username: " + str + ", needAnim: " + z17 + ", post: " + z18);
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting talker is empty");
            return;
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(27, str);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        com.tencent.mm.ui.conversation.t8 t8Var = new com.tencent.mm.ui.conversation.t8(lVar, baseConversationUI, z17, z18);
        ((l41.b2) yVar).getClass();
        j41.h0 h0Var = new j41.h0(0, str, null);
        h0Var.f297634d = true;
        k41.h1.a(h0Var, t8Var);
    }
}
