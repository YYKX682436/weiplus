package iq4;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.plugin.ball.service.d {

    /* renamed from: n, reason: collision with root package name */
    public long f293799n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f293800o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f293801p;

    public c(iq4.a aVar) {
        b(9, "VOIPFloatBall");
        t().f93086f = 10;
        if (gq4.v.Bi() != null) {
            t().f93087g = java.lang.String.valueOf(gq4.v.Bi().n());
        }
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, currentSituation:%s", java.lang.Long.valueOf(this.f293800o));
        if (gq4.v.Bi().f176562e) {
            return;
        }
        if (iq.b.H()) {
            ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
            com.tencent.mm.plugin.multitalk.model.e3.Ri().C(false);
        } else if (iq.b.j() != 0) {
            ((jp5.o) i95.n0.c(jp5.o.class)).K8();
        }
    }

    public void e0(int i17, boolean z17, android.view.View view, long j17, boolean z18) {
        if (view != null) {
            if (i17 == 4 || i17 == 8) {
                if (!u()) {
                    iq4.a aVar = new iq4.a(this, i17, view, z17, z18, j17);
                    long j18 = this.f293799n + 200;
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis = j18 - java.lang.System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        aVar.run();
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, add delayed:%s", java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mm.sdk.platformtools.u3.i(aVar, currentTimeMillis);
                    this.f293801p = new java.lang.ref.WeakReference(aVar);
                    return;
                }
                if (this.f93132d.f93050h == view) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", java.lang.Integer.valueOf(i17), view);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", java.lang.Integer.valueOf(i17), view, this.f93132d.f93050h);
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
                ballInfo.I = true;
                ballInfo.f93050h = view;
                ballInfo.f93045J = false;
                ballInfo.f93058s = false;
                ballInfo.F = true;
                if (!z17) {
                    ballInfo.H = i17;
                } else if (i17 == 4) {
                    ballInfo.H = 512;
                } else if (i17 == 8) {
                    ballInfo.H = 1024;
                }
                h0(i17, z17, z18);
                g0(i17, z17);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
                this.f293800o = j17;
                j();
            }
        }
    }

    public void f0(android.widget.FrameLayout frameLayout) {
        java.lang.ref.WeakReference weakReference = this.f293801p;
        if (weakReference != null && weakReference.get() != null) {
            com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) this.f293801p.get());
            this.f293801p = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, canceled delayed add runnable");
        }
        if (!u()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, no ball, view:%s", frameLayout);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, has ball, view:%s", frameLayout);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f293799n = java.lang.System.currentTimeMillis();
        this.f293800o = 0L;
        d();
    }

    public final void g0(int i17, boolean z17) {
        if (z17 || i17 == 4) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            if (ballInfo.P == null) {
                ballInfo.P = new np1.c();
            }
        }
        if (z17) {
            com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            int e17 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0y);
            int e18 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0y);
            int e19 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0x);
            this.f93132d.P.f338791a = new android.graphics.Point(e17, e19);
            this.f93132d.P.f338792b = new android.graphics.Point(e18, e19);
            return;
        }
        if (i17 != 4) {
            this.f93132d.P = null;
            return;
        }
        com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        int e27 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480520a10);
        int e28 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0z);
        int e29 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0w);
        int e37 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0v);
        this.f93132d.P.f338791a = new android.graphics.Point(e27, e28);
        this.f93132d.P.f338792b = new android.graphics.Point(e29, e37);
        np1.c cVar = this.f93132d.P;
        android.graphics.Point point = cVar.f338791a;
        android.graphics.Point point2 = cVar.f338792b;
    }

    public void h0(int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo.f93051i == null) {
            ballInfo.f93051i = new android.graphics.Point();
        }
        com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        if (i17 == 8) {
            if (z17) {
                this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0y);
                this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0x);
            } else {
                this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0w);
                this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0v);
            }
        } else if (i17 == 4) {
            if (z17) {
                this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0y);
                this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0x);
            } else {
                this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480520a10);
                this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0z);
            }
        }
        if (z18) {
            android.graphics.Point point = this.f93132d.f93051i;
            int i18 = point.x;
            point.x = point.y;
            point.y = i18;
        }
        android.graphics.Point point2 = this.f93132d.f93051i;
    }
}
