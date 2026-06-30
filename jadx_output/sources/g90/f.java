package g90;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269683g;

    public f(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        this.f269680d = sVar;
        this.f269681e = f9Var;
        this.f269682f = i17;
        this.f269683g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269680d;
        com.tencent.mm.storage.f9 f9Var = this.f269681e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[1] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269682f));
        lVarArr[2] = new jz5.l("feedback_type", java.lang.Integer.valueOf(this.f269683g));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Ej("clk_full_image_feedback", i17, 32337);
    }
}
