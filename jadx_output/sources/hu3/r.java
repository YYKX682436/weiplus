package hu3;

/* loaded from: classes5.dex */
public final class r implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285190d;

    public r(hu3.n0 n0Var) {
        this.f285190d = n0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("menu ratio update ");
        hu3.n0 n0Var = this.f285190d;
        sb6.append(n0Var.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
        if (n0Var.D) {
            return;
        }
        if (n0Var.f285164h == 1 && n0Var.f285165i == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "menu ratio update >> is use maas");
        n0Var.D = true;
    }
}
