package g90;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f269698h;

    public i(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, java.util.Map map) {
        this.f269694d = sVar;
        this.f269695e = f9Var;
        this.f269696f = i17;
        this.f269697g = i18;
        this.f269698h = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269694d;
        com.tencent.mm.storage.f9 f9Var = this.f269695e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269696f));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("clk_result", java.lang.Integer.valueOf(this.f269697g));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        bm5.j0.a(i17, this.f269698h);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("ChatPicVideoItemPage", "view_clk", i17, 32337);
    }
}
