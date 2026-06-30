package g90;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269714g;

    public l(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        this.f269711d = sVar;
        this.f269712e = f9Var;
        this.f269713f = i17;
        this.f269714g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269711d;
        com.tencent.mm.storage.f9 f9Var = this.f269712e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269713f));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269714g));
        lVarArr[3] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("resave_win", "view_exp", i17, 32337);
    }
}
