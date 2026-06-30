package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f209540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.s5 f209542f;

    public q5(com.tencent.mm.ui.s5 s5Var, android.graphics.Bitmap bitmap, int i17) {
        this.f209542f = s5Var;
        this.f209540d = bitmap;
        this.f209541e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.s5 s5Var = this.f209542f;
        s5Var.f209775j.E = true;
        s5Var.f209769d.R(this.f209540d);
        int i17 = s5Var.f209770e;
        if (i17 == 3) {
            s5Var.f209775j.r1(s5Var.f209769d, 8, 8, 8, false, 0, 0, 0, s5Var.f209766a);
        } else if (i17 == 4) {
            s5Var.f209775j.r1(s5Var.f209769d, 8, 8, 0, false, 0, 0, 0, s5Var.f209766a);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image success, msgId:%d, showType:%d", java.lang.Long.valueOf(s5Var.f209771f), java.lang.Integer.valueOf(s5Var.f209770e));
        s5Var.f209775j.n1(s5Var.f209771f, s5Var.f209770e, s5Var.f209772g, s5Var.f209773h);
        if (this.f209541e == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 13L, 1L, false);
        }
    }
}
