package gn4;

/* loaded from: classes15.dex */
public class l implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273637d;

    public l(gn4.z zVar) {
        this.f273637d = zVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        boolean t17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoEnded");
        gn4.z zVar = this.f273637d;
        zVar.getFSVideoUIComponent().I2().g(str);
        zVar.getFSVideoUIComponent().o4().f264477d = 1;
        int b17 = zVar.getFSVideoUIComponent().b1();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "clicfg_topstory_v_video_play  %s", java.lang.Integer.valueOf(b17));
        if (b17 == 1 && zVar.getFSVideoUIComponent().p6() && (zVar.f264528z instanceof gn4.d1)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            ((gn4.d1) zVar.f264528z).s(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "VVideoAutoPlay replay succ");
            t17 = true;
        } else {
            t17 = zVar.getFSVideoUIComponent().t1(zVar.f264528z.u() + 1);
        }
        if (!t17 && (zVar.f264528z instanceof fn4.m)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused2) {
            }
            ((fn4.m) zVar.f264528z).s(true);
        }
        zVar.N = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        r45.zn6 zn6Var;
        com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gn4.z zVar = this.f273637d;
        fn4.z0 s47 = zVar.A.s4();
        fn4.b bVar = zVar.A;
        r45.xn6 d17 = s47.d(bVar.Y2());
        int i19 = 0;
        if (d17 != null && d17.K != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17.K.size()), d17.f390256e, java.lang.Integer.valueOf(d17.U));
            int i27 = 0;
            while (true) {
                if (i27 >= d17.K.size()) {
                    break;
                }
                if (d17.f390256e.equals(((r45.zn6) d17.K.get(i27)).f392244d)) {
                    int i28 = i27 + 1;
                    if (i28 < d17.K.size() && (zn6Var = (r45.zn6) d17.K.get(i28)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(zn6Var.f392244d)) {
                        d17.U = zn6Var.f392245e;
                        d17.f390256e = zn6Var.f392244d;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", java.lang.Integer.valueOf(i28), zn6Var.f392244d, java.lang.Integer.valueOf(zn6Var.f392245e));
                        uu4.b.a(17);
                        zVar.postDelayed(new gn4.k(this), 100L);
                        return;
                    }
                } else {
                    i27++;
                }
            }
        }
        bVar.s4().q(bVar.r0(), bVar.Y2());
        zVar.k(zVar.getContext().getString(com.tencent.mm.R.string.f493443k73, i17 + ":" + i18), zVar.getContext().getString(com.tencent.mm.R.string.f493446k80));
        fn4.l1 I2 = zVar.getFSVideoUIComponent().I2();
        fn4.c1 c1Var = I2.f264573b;
        if (c1Var != null && c1Var.getSessionId().equals(str)) {
            I2.m();
        }
        pm4.y.b(i17);
        rm4.d dVar = zVar.getFSVideoUIComponent().o4().f264479f;
        if (dVar != null && dVar.f397452a > 0) {
            i19 = ((int) (java.lang.System.currentTimeMillis() - dVar.f397452a)) / 1000;
        }
        pm4.y.d(d17, i17, str3, i19);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaiting");
        this.f273637d.N = true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaitingEnd");
        gn4.z zVar = this.f273637d;
        zVar.N = false;
        zVar.i();
        rm4.d dVar = zVar.getFSVideoUIComponent().o4().f264479f;
        if (dVar == null || dVar.f397463l != 0) {
            return;
        }
        dVar.f397463l = java.lang.System.currentTimeMillis() - dVar.f397452a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "FirstLoadTime %d %d", java.lang.Long.valueOf(dVar.f397460i), java.lang.Long.valueOf(dVar.f397463l));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onPrepared");
        gn4.z zVar = this.f273637d;
        fn4.h0 h0Var = zVar.H;
        h0Var.f264546i = -1;
        h0Var.f264547j = 0;
        h0Var.f264545h = 0.0f;
        if (zVar.N) {
            return;
        }
        zVar.i();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
