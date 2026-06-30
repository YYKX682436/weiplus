package du3;

/* loaded from: classes10.dex */
public final class s implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f243692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du3.b f243693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f243694c;

    public s(du3.b0 b0Var, du3.b bVar, ju3.d0 d0Var) {
        this.f243692a = b0Var;
        this.f243693b = bVar;
        this.f243694c = d0Var;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "no permission");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select ai feature:");
        du3.b0 b0Var = this.f243692a;
        sb6.append(b0Var.f243533r);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", sb6.toString());
        b0Var.f243533r = this.f243693b;
        ju3.d0.k(this.f243694c, ju3.c0.f301868a2, null, 2, null);
    }
}
