package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class v0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208562b;

    public v0(android.content.Context context, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208561a = context;
        this.f208562b = j1Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "save, success, srcPath: " + srcPath + ", destPath: " + destPath);
        android.content.Context context = this.f208561a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492304g00, destPath), 1).show();
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208562b;
        qj5.n nVar = j1Var.f208500f;
        if (nVar != null) {
            nVar.u();
        }
        j1Var.f208500f = null;
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "save, failed, srcPath: " + srcPath + ", destPath: " + destPath);
        android.content.Context context = this.f208561a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
