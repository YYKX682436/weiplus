package zh1;

/* loaded from: classes8.dex */
public final class k implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472896d;

    public k(zh1.n nVar) {
        this.f472896d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onDismiss");
        zh1.u0 u0Var = this.f472896d.f472919n;
        if (u0Var != null) {
            u0Var.a();
        }
        di1.f fVar = (di1.f) this.f472896d.f472916h;
        synchronized (fVar) {
            com.tencent.mars.xlog.Log.i(fVar.f232641m, "updateSessionId");
            java.lang.String a17 = c01.n2.a("OpenMaterial#" + fVar.f232630b.name());
            kotlin.jvm.internal.o.f(a17, "buildSessionId(...)");
            fVar.f232640l = a17;
            fVar.f232641m = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + fVar.f232640l;
        }
    }
}
