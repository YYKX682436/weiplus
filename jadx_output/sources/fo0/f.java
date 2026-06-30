package fo0;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final gp1.r f264807a;

    /* renamed from: b, reason: collision with root package name */
    public long f264808b;

    /* renamed from: c, reason: collision with root package name */
    public final fo0.e f264809c;

    public f(gp1.r rVar, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            ((ov.i0) ((pv.e0) i95.n0.c(pv.e0.class))).getClass();
            rVar = new com.tencent.mm.plugin.ball.service.d();
        }
        this.f264807a = rVar;
        this.f264809c = new fo0.e(this);
        rVar.b(21, "LiveFloatBall");
        ((com.tencent.mm.plugin.ball.service.d) rVar).t().f93086f = 15;
        rVar.e();
    }

    public final void a(android.graphics.Point newSize) {
        kotlin.jvm.internal.o.g(newSize, "newSize");
        gp1.r rVar = this.f264807a;
        android.graphics.Point point = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i;
        if (point != null && point.x == newSize.x) {
            android.graphics.Point point2 = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i;
            if (point2 != null && point2.y == newSize.y) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize same donothing, width:" + newSize.x + ", height:" + newSize.y);
                return;
            }
        }
        e(newSize);
        rVar.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize width:" + newSize.x + ", height:" + newSize.y);
    }

    public final void b() {
        ((com.tencent.mm.plugin.ball.service.d) this.f264807a).f93132d.G.remove("is_pause_replace_state");
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().L(21, this.f264809c);
    }

    public final void c() {
        gp1.r rVar = this.f264807a;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93090m = 3;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h0(((com.tencent.mm.plugin.ball.service.d) rVar).f93132d);
    }

    public final void d(android.widget.FrameLayout frameLayout) {
        gp1.r rVar = this.f264807a;
        if (!((com.tencent.mm.plugin.ball.service.d) rVar).u()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "removeVoipView, no ball, view:%s", frameLayout);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "removeVoipView, has ball, view:%s", frameLayout);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f264808b = java.lang.System.currentTimeMillis();
        rVar.d();
    }

    public final void e(android.graphics.Point point) {
        gp1.r rVar = this.f264807a;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i = new android.graphics.Point();
        com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i.x = point.x;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i.y = point.y;
        android.graphics.Point point2 = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93051i;
    }

    public final void f(fo0.t tVar) {
        gp1.r rVar = this.f264807a;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93086f = tVar.f264852d;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93087g = java.lang.String.valueOf(tVar.f264849a);
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93088h = tVar.f264850b ? "1" : "2";
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93084d = tVar.f264851c;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93090m = tVar.f264853e;
        int i17 = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93086f;
        java.lang.String str = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93087g;
        java.lang.String str2 = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93088h;
        int i18 = ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.M.f93084d;
    }
}
