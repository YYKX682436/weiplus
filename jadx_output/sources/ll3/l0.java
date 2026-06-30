package ll3;

/* loaded from: classes10.dex */
public final class l0 extends gp1.e0 {
    @Override // gp1.e0, gp1.x
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        if (ballInfo == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "onFloatBalInfoReplaced type: %s", java.lang.Integer.valueOf(ballInfo.f93046d));
        if (ballInfo.f93046d == 23) {
            ll3.b1.f319140a.getClass();
            ll3.b1.f319141b.d();
        }
    }

    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        int i17 = ballInfo.f93046d;
        ll3.q0 q0Var = ll3.q0.f319210a;
        if (i17 == 6) {
            ll3.j0 j0Var = ll3.i0.f319181a;
            java.lang.String i07 = j0Var != null ? j0Var.i0(ballInfo, ll3.q0.f319214e) : null;
            if (ll3.q0.f319214e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "onMusicBallRemoved current: %s, removed: %s", ll3.q0.f319212c, i07);
                if (kotlin.jvm.internal.o.b(ll3.q0.f319212c, i07)) {
                    q0Var.c();
                }
            }
            ll3.q0.f319214e = true;
            return;
        }
        if (i17 != 23) {
            return;
        }
        java.lang.String i08 = ll3.b1.f319141b.i0(ballInfo, ll3.q0.f319214e);
        if (ll3.q0.f319214e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "onMusicBallRemoved current: %s, removed: %s", ll3.q0.f319212c, i08);
            if (kotlin.jvm.internal.o.b(ll3.q0.f319212c, i08)) {
                q0Var.c();
            }
        }
        ll3.q0.f319214e = true;
    }

    @Override // gp1.e0, gp1.x
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null && ballInfo.f93046d == 23) {
            ll3.b1.f319140a.getClass();
            ll3.b1.f319141b.d();
        }
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 6) {
            ll3.j0 j0Var = ll3.i0.f319181a;
        } else if (i17 == 23) {
            ll3.b1 b1Var = ll3.b1.f319140a;
            ll3.b1.f319141b.getClass();
        }
    }

    @Override // gp1.e0, gp1.x
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null && ballInfo.f93046d == 23) {
            if (!ballInfo.f93054o.f93069d) {
                b21.m.f();
                return;
            }
            if (!ll3.q0.f319217h) {
                b21.m.g();
                return;
            }
            b21.r b17 = b21.m.b();
            if (b17 != null) {
                b21.m.i(b17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (qp1.w.t(r5) != false) goto L27;
     */
    @Override // gp1.e0, gp1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            ll3.b1 r0 = ll3.b1.f319140a
            ll3.e1 r0 = ll3.b1.f319141b
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.f93132d
            boolean r0 = kotlin.jvm.internal.o.b(r5, r0)
            java.lang.String r1 = "MicroMsg.GlobalMusicFloatBallManager"
            if (r0 == 0) goto L1f
            java.lang.String r0 = "onFloatBallInfoAdded remove normal music ball"
            com.tencent.mars.xlog.Log.i(r1, r0)
            ll3.j0 r0 = ll3.i0.f319181a
            if (r0 == 0) goto L90
            r0.d()
            goto L90
        L1f:
            ll3.j0 r0 = ll3.i0.f319181a
            if (r0 == 0) goto L26
            com.tencent.mm.plugin.ball.model.BallInfo r2 = r0.f93132d
            goto L27
        L26:
            r2 = 0
        L27:
            boolean r2 = kotlin.jvm.internal.o.b(r5, r2)
            if (r2 == 0) goto L3a
            java.lang.String r0 = "onFloatBallInfoAdded remove music player ball"
            com.tencent.mars.xlog.Log.i(r1, r0)
            ll3.b1 r0 = ll3.b1.f319140a
            ll3.e1 r0 = ll3.b1.f319141b
            r0.d()
            goto L90
        L3a:
            int r2 = r5.f93046d
            r3 = 36
            if (r2 != r3) goto L52
            java.lang.String r2 = "onFloatBallInfoAdded for ting"
            com.tencent.mars.xlog.Log.i(r1, r2)
            ll3.b1 r1 = ll3.b1.f319140a
            ll3.e1 r1 = ll3.b1.f319141b
            r1.d()
            if (r0 == 0) goto L90
            r0.d()
            goto L90
        L52:
            r0 = 18
            if (r0 == r2) goto L6d
            r0 = 17
            if (r0 == r2) goto L6d
            java.lang.Class<pv.j0> r0 = pv.j0.class
            i95.m r0 = i95.n0.c(r0)
            pv.j0 r0 = (pv.j0) r0
            ov.p0 r0 = (ov.p0) r0
            r0.getClass()
            boolean r0 = qp1.w.t(r5)
            if (r0 == 0) goto L90
        L6d:
            int r0 = r5.f93046d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "onFloatBallInfoAdded pause music because of ball: %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            b21.r r0 = b21.m.b()
            if (r0 == 0) goto L8b
            boolean r0 = b21.m.c()
            if (r0 == 0) goto L8b
            b21.m.f()
        L8b:
            ll3.k0 r0 = ll3.k0.f319186d
            com.tencent.mm.sdk.platformtools.u3.h(r0)
        L90:
            int r5 = r5.f93046d
            r0 = 6
            if (r5 != r0) goto L98
            ll3.j0 r5 = ll3.i0.f319181a
            goto La3
        L98:
            r0 = 23
            if (r5 != r0) goto La3
            ll3.b1 r5 = ll3.b1.f319140a
            ll3.e1 r5 = ll3.b1.f319141b
            r5.getClass()
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.l0.X0(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 6) {
            ll3.j0 j0Var = ll3.i0.f319181a;
        } else if (i17 == 23) {
            ll3.b1 b1Var = ll3.b1.f319140a;
            ll3.b1.f319141b.getClass();
        }
    }
}
