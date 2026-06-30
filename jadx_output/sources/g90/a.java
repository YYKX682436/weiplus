package g90;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269658g;

    public a(g90.s sVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17) {
        this.f269655d = sVar;
        this.f269656e = f9Var;
        this.f269657f = str;
        this.f269658g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269655d;
        com.tencent.mm.storage.f9 f9Var = this.f269656e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[1] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269658g));
        lVarArr[2] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        lVarArr[3] = new jz5.l("is_origin_expired", java.lang.Integer.valueOf(g90.s.Bi(sVar, f9Var) ? 1 : 0));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj(this.f269657f, "view_clk", i17, 32337);
    }
}
