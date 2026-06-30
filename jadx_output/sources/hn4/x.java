package hn4;

/* loaded from: classes15.dex */
public class x implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282605d;

    public x(hn4.z zVar) {
        this.f282605d = zVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        hn4.z zVar = this.f282605d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoEnded, pos:%s, listpos:%s", java.lang.Integer.valueOf(zVar.f264528z.u()), java.lang.Integer.valueOf(zVar.f264528z.u()));
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.g(str);
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264477d = 1;
        if (!((com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI) zVar.getListVideoUIComponent()).t1(zVar.f264528z.u() + 1) && (zVar.f264528z instanceof fn4.m)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            ((fn4.m) zVar.f264528z).s(true);
        }
        zVar.G.w();
        zVar.f282608J = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        r45.xn6 d17;
        r45.zn6 zn6Var;
        com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryListVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = 0;
        hn4.z zVar = this.f282605d;
        if (i17 != 0 && (d17 = zVar.A.s4().d(zVar.A.Y2())) != null && d17.K != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17.K.size()), d17.f390256e, java.lang.Integer.valueOf(d17.U));
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", java.lang.Integer.valueOf(i28), zn6Var.f392244d, java.lang.Integer.valueOf(zn6Var.f392245e));
                        uu4.b.a(17);
                        zVar.postDelayed(new hn4.w(this), 100L);
                        return;
                    }
                } else {
                    i27++;
                }
            }
        }
        fn4.z0 s47 = zVar.A.s4();
        fn4.b bVar = zVar.A;
        s47.q(bVar.r0(), bVar.Y2());
        zVar.k(zVar.getContext().getString(com.tencent.mm.R.string.f493443k73, i17 + ":" + i18), zVar.getContext().getString(com.tencent.mm.R.string.f493446k80));
        fn4.l1 l1Var = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J;
        fn4.c1 c1Var = l1Var.f264573b;
        if (c1Var != null && c1Var.getSessionId().equals(str)) {
            l1Var.m();
        }
        pm4.y.b(i17);
        rm4.d dVar = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264479f;
        if (dVar != null && dVar.f397452a > 0) {
            i19 = ((int) (java.lang.System.currentTimeMillis() - dVar.f397452a)) / 1000;
        }
        pm4.y.d(zVar.E, i17, str3, i19);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaiting");
        this.f282605d.f282608J = true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaitingEnd");
        hn4.z zVar = this.f282605d;
        zVar.f282608J = false;
        zVar.G.w();
        if (zVar.E.V != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onVideoWaitingEnd");
            android.view.View view = zVar.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zVar.i();
        rm4.d dVar = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264479f;
        if (dVar == null || dVar.f397463l != 0) {
            return;
        }
        dVar.f397463l = java.lang.System.currentTimeMillis() - dVar.f397452a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "FirstLoadTime %d %d", java.lang.Long.valueOf(dVar.f397460i), java.lang.Long.valueOf(dVar.f397463l));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onPrepared");
        hn4.z zVar = this.f282605d;
        fn4.h0 h0Var = zVar.H;
        h0Var.f264546i = -1;
        h0Var.f264547j = 0;
        h0Var.f264545h = 0.0f;
        if (zVar.f282608J) {
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
