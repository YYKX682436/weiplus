package hu3;

/* loaded from: classes5.dex */
public final class q implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285187d;

    public q(hu3.n0 n0Var) {
        this.f285187d = n0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f475588b;
        hu3.n0 n0Var = this.f285187d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "unSelectBeauty");
            kotlinx.coroutines.l.d(n0Var.f285163g, null, null, new hu3.p(n0Var, null), 3, null);
            return;
        }
        android.os.Bundle bundle = cVar.f475589c;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_1_INT")) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MENU_BEAUTY >> " + valueOf);
        if (valueOf != null) {
            kotlinx.coroutines.l.d(n0Var.f285163g, null, null, new hu3.o(valueOf.intValue(), n0Var, null), 3, null);
        }
    }
}
