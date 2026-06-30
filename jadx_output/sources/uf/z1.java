package uf;

/* loaded from: classes7.dex */
public final class z1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427133d;

    public z1(uf.c2 c2Var) {
        this.f427133d = c2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        uf.c2 c2Var = this.f427133d;
        uf.c2.b(c2Var, null, 0);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = c2Var.f426994d;
        if (appBrandRuntime != null) {
            appBrandRuntime.B1(c2Var.f427012y);
        }
    }
}
