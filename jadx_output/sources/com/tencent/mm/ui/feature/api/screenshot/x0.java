package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208581g;

    public x0(android.content.Context context, java.lang.String str, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, qj5.q qVar) {
        this.f208578d = context;
        this.f208579e = str;
        this.f208580f = j1Var;
        this.f208581g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.STORAGE;
        d85.f0 f0Var = d85.f0.M;
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208580f;
        qj5.q qVar = this.f208581g;
        android.content.Context context = this.f208578d;
        java.lang.String str = this.f208579e;
        if (((d85.d1) m0Var).Di(g0Var, f0Var, new com.tencent.mm.ui.feature.api.screenshot.w0(j1Var, qVar, context, str))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "permission ungranted");
            return;
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, str, new com.tencent.mm.ui.feature.api.screenshot.v0(context, j1Var));
    }
}
