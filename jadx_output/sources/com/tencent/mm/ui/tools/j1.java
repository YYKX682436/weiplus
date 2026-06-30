package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f210501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f210503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f210504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f210505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f210506i;

    public j1(qk.o oVar, android.app.Activity activity, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17, java.lang.Runnable runnable) {
        this.f210501d = oVar;
        this.f210502e = activity;
        this.f210503f = z3Var;
        this.f210504g = z17;
        this.f210505h = i17;
        this.f210506i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = this.f210504g;
        int i18 = this.f210505h;
        qk.o oVar = this.f210501d;
        android.app.Activity activity = this.f210502e;
        com.tencent.mm.storage.z3 z3Var = this.f210503f;
        com.tencent.mm.ui.tools.n1.a(oVar, activity, z3Var, z17, i18);
        ((qk.s6) gm0.j1.s(qk.s6.class)).da(oVar);
        java.lang.Runnable runnable = this.f210506i;
        if (runnable != null) {
            runnable.run();
        }
        if (com.tencent.mm.storage.z3.D4(z3Var.d1())) {
            com.tencent.mm.plugin.exdevice.model.l3.fj().J0(gm0.j1.b().k());
        }
    }
}
