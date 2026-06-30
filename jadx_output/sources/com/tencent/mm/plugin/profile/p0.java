package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class p0 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153574f;

    public p0(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.storage.z3 z3Var, int i17) {
        this.f153574f = e0Var;
        this.f153572d = z3Var;
        this.f153573e = i17;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.z3 z3Var = this.f153572d;
        if (z17) {
            com.tencent.mm.plugin.profile.e0.b(this.f153574f, z3Var, this.f153573e, str);
            return;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
            return;
        }
        r21.w.wi().k1(str, 2);
        r61.z1.c(z3Var.J0(), 1);
        com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent = new com.tencent.mm.autogen.events.RecoverAccountFriendEvent();
        java.lang.String J0 = z3Var.J0();
        am.hq hqVar = recoverAccountFriendEvent.f54666g;
        hqVar.f6862a = J0;
        hqVar.f6863b = 1;
        recoverAccountFriendEvent.e();
    }
}
