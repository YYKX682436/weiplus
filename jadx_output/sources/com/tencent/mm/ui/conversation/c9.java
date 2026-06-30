package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class c9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207613e;

    public c9(java.lang.String str, com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207612d = str;
        this.f207613e = openImKefuServiceConversationFmUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207613e;
        com.tencent.mm.storage.l4 l4Var = openImKefuServiceConversationFmUI.f207404i;
        java.lang.String str = this.f207612d;
        com.tencent.mm.ui.report.k0.b(4, str, l4Var);
        openImKefuServiceConversationFmUI.getClass();
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ai(str, new com.tencent.mm.ui.conversation.f9(openImKefuServiceConversationFmUI));
    }
}
