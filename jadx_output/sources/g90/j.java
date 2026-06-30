package g90;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269703h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f269704i;

    public j(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, java.util.Map map) {
        this.f269699d = sVar;
        this.f269700e = f9Var;
        this.f269701f = i17;
        this.f269702g = i18;
        this.f269703h = i19;
        this.f269704i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269699d;
        com.tencent.mm.storage.f9 f9Var = this.f269700e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269701f));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269702g));
        lVarArr[3] = new jz5.l("pic_video_exit_type", java.lang.Integer.valueOf(this.f269703h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        bm5.j0.a(i17, this.f269704i);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("ChatPicVideoItemPage", "view_unexp", i17, 32337);
    }
}
