package g90;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269679e;

    public e(g90.s sVar, com.tencent.mm.storage.f9 f9Var) {
        this.f269678d = sVar;
        this.f269679e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269678d;
        com.tencent.mm.storage.f9 f9Var = this.f269679e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("pic_video_is_ori", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 0)), new jz5.l("pic_video_with_original", 0), new jz5.l("has_origin_visual", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302833d).booleanValue() ? 1 : 0)), new jz5.l("chat_visual_send_ts", java.lang.Long.valueOf(f9Var.getCreateTime())));
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("wx_chat_pic_video", "view_clk", i17, 32337);
    }
}
