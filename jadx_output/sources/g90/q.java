package g90;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269747h;

    public q(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        this.f269743d = sVar;
        this.f269744e = f9Var;
        this.f269745f = i17;
        this.f269746g = i18;
        this.f269747h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269743d;
        com.tencent.mm.storage.f9 f9Var = this.f269744e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f269745f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269746g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269747h));
        lVarArr[4] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("view_origin_btn", "view_clk", i17, 32337);
    }
}
