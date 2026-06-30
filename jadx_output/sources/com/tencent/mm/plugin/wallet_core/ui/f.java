package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k f180258d;

    public f(com.tencent.mm.plugin.wallet_core.ui.k kVar) {
        this.f180258d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
        com.tencent.mm.plugin.wallet_core.ui.k kVar = this.f180258d;
        java.lang.String d17 = kVar.f180365e.d1();
        ((qv.q) v2Var).getClass();
        qk.o b17 = r01.z.b(d17);
        ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(b17, (android.app.Activity) kVar.f180364d, kVar.f180365e, false);
        kVar.e();
        kVar.b();
        kVar.c(null);
        kVar.a(10);
    }
}
