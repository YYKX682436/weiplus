package g90;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269721h;

    public m(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        this.f269717d = sVar;
        this.f269718e = f9Var;
        this.f269719f = i17;
        this.f269720g = i18;
        this.f269721h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269717d;
        com.tencent.mm.storage.f9 f9Var = this.f269718e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("pic_video_is_ori", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 0)), new jz5.l("video_pic_save_type", java.lang.Integer.valueOf(this.f269719f)), new jz5.l("has_origin_visual", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302833d).booleanValue() ? 1 : 0)), new jz5.l("is_origin_expired", java.lang.Integer.valueOf(g90.s.Bi(sVar, f9Var) ? 1 : 0)), new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f269720g)), new jz5.l("view_type", java.lang.Integer.valueOf(this.f269721h)));
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("chat_video_pic_save", "view_clk", i17, 32337);
    }
}
