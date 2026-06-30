package g90;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f269669i;

    public c(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, int i27) {
        this.f269664d = sVar;
        this.f269665e = f9Var;
        this.f269666f = i17;
        this.f269667g = i18;
        this.f269668h = i19;
        this.f269669i = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269664d;
        com.tencent.mm.storage.f9 f9Var = this.f269665e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f269666f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269667g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269668h));
        lVarArr[4] = new jz5.l("pic_video_menu_btn", java.lang.Integer.valueOf(this.f269669i));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("chat_pic_video_menu_btn", "view_clk", i17, 32337);
    }
}
