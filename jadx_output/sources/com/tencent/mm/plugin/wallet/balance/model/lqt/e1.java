package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177627a;

    public e1(android.app.Activity activity) {
        this.f177627a = (com.tencent.mm.plugin.wallet.balance.model.lqt.z0) new em5.i().a(activity, com.tencent.mm.plugin.wallet.balance.model.lqt.z0.class);
    }

    public void a(com.tencent.mm.plugin.wallet.balance.model.lqt.d1 d1Var, com.tencent.mm.plugin.wallet.balance.model.lqt.c1 c1Var) {
        com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var = this.f177627a;
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("LqtDetailInteractorGlueApiHelper", "interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
            return;
        }
        ((km5.q) z0Var.f177755b.b().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.b1(this, d1Var))).s(new com.tencent.mm.plugin.wallet.balance.model.lqt.a1(this, c1Var));
    }
}
