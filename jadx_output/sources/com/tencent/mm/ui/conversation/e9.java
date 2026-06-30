package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class e9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207654e;

    public e9(java.lang.String str, com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207653d = str;
        this.f207654e = openImKefuServiceConversationFmUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.report.k0.b(2, this.f207653d, this.f207654e.f207404i);
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207654e;
        java.lang.String str = this.f207653d;
        openImKefuServiceConversationFmUI.getClass();
        com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(str);
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        ac0Var.f369912d = du5Var;
        ac0Var.f369914f = r66.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
        openImKefuServiceConversationFmUI.f207405m = false;
        c01.w9.h(str, new com.tencent.mm.ui.conversation.z8(openImKefuServiceConversationFmUI, db5.e1.Q(openImKefuServiceConversationFmUI.thisActivity(), openImKefuServiceConversationFmUI.getString(com.tencent.mm.R.string.f490573yv), openImKefuServiceConversationFmUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.conversation.a9(openImKefuServiceConversationFmUI))));
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(this.f207653d);
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.ui.conversation.d9.f207635d);
    }
}
