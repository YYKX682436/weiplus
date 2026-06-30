package g90;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269752h;

    public r(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        this.f269748d = sVar;
        this.f269749e = f9Var;
        this.f269750f = i17;
        this.f269751g = i18;
        this.f269752h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269748d;
        com.tencent.mm.storage.f9 f9Var = this.f269749e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f269750f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269751g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269752h));
        lVarArr[4] = new jz5.l("origin_type", java.lang.Integer.valueOf(f9Var.A0() == 1 ? 2 : 1));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("view_origin_btn", "view_exp", i17, 32337);
    }
}
