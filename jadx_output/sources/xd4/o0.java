package xd4;

/* loaded from: classes4.dex */
public class o0 {

    /* renamed from: f, reason: collision with root package name */
    public static xd4.o0 f453686f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f453687a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f453688b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f453689c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453690d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f453691e;

    public static synchronized xd4.o0 d() {
        xd4.o0 o0Var;
        synchronized (xd4.o0.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            if (f453686f == null) {
                f453686f = new xd4.o0();
            }
            o0Var = f453686f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        return o0Var;
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_enable_new_small_video_type, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "enableNewSmallViewType %b", java.lang.Boolean.valueOf(fj6));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return fj6;
    }

    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f453691e;
        if (snsTimelineVideoView != null && str.equals(snsTimelineVideoView.f170641m2)) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.f453691e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return snsTimelineVideoView2;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f453688b).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it.next();
            if (str.equals(snsTimelineVideoView3.f170641m2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return snsTimelineVideoView3;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return null;
    }

    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        java.util.Iterator it = ((java.util.ArrayList) this.f453688b).iterator();
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it.next();
            if (snsTimelineVideoView2.f170639k2 == xd4.d0.AVAILABLE) {
                snsTimelineVideoView = snsTimelineVideoView2;
            }
        }
        if (snsTimelineVideoView == null) {
            if (((java.util.ArrayList) this.f453688b).size() < 3) {
                snsTimelineVideoView = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView(context);
                ((java.util.ArrayList) this.f453688b).add(snsTimelineVideoView);
                ((java.util.LinkedList) this.f453687a).add(new java.lang.ref.WeakReference(snsTimelineVideoView));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i17 = -1;
                for (int i18 = 0; i18 < ((java.util.ArrayList) this.f453688b).size(); i18++) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) ((java.util.ArrayList) this.f453688b).get(i18);
                    if (snsTimelineVideoView3.f170639k2 != xd4.d0.PLAYING && snsTimelineVideoView3.f170642n2 < com.tencent.wcdb.core.Database.DictDefaultMatchValue && !snsTimelineVideoView3.f170644p2) {
                        i17 = i18;
                    }
                    if (snsTimelineVideoView3.f170644p2) {
                        arrayList.add(snsTimelineVideoView3);
                    }
                }
                if (i17 >= 0 || arrayList.size() <= 0) {
                    snsTimelineVideoView = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) ((java.util.ArrayList) this.f453688b).get(i17 < 0 ? 0 : i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "use minIndex: %s", java.lang.Integer.valueOf(i17));
                } else {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) arrayList.get(0);
                    ((java.util.ArrayList) this.f453688b).remove(snsTimelineVideoView4);
                    if (snsTimelineVideoView4 != null && snsTimelineVideoView4.getParent() != null) {
                        snsTimelineVideoView4.f170645q2 = false;
                        ((android.view.ViewGroup) snsTimelineVideoView4.getParent()).removeView(snsTimelineVideoView4);
                    } else if (snsTimelineVideoView4 != null) {
                        snsTimelineVideoView4.g0();
                    }
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView5 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView(context);
                    ((java.util.ArrayList) this.f453688b).add(snsTimelineVideoView5);
                    ((java.util.LinkedList) this.f453687a).add(new java.lang.ref.WeakReference(snsTimelineVideoView5));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "use new one, removes size:%s, first:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) arrayList.get(0)).hashCode()));
                    snsTimelineVideoView = snsTimelineVideoView5;
                }
            }
        }
        snsTimelineVideoView.f170639k2 = xd4.d0.ATTACHING;
        snsTimelineVideoView.x(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s getAvailableVideoView, setState ATTACHING", java.lang.Integer.valueOf(snsTimelineVideoView.hashCode()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return snsTimelineVideoView;
    }

    public boolean e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f453688b).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it.next();
            if (str.equals(snsTimelineVideoView.f170641m2) && snsTimelineVideoView.f170639k2 != xd4.d0.AVAILABLE) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return false;
    }

    public boolean f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f453690d) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        boolean equals = this.f453690d.equals(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return equals;
    }

    public final boolean g(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean z17 = false;
        if (onlineVideoView != null) {
            try {
                if (onlineVideoView.w()) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return z17;
    }

    public void h(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        int i17 = this.f453689c - 1;
        this.f453689c = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        int i18 = this.f453689c;
        if (i18 <= 0 || (activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI)) {
            if (i18 > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(31L, 4L, 1L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "stopAll");
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f453691e;
            if (snsTimelineVideoView != null) {
                ((java.util.ArrayList) this.f453688b).add(snsTimelineVideoView);
            }
            int i19 = 0;
            if (!((java.util.ArrayList) this.f453688b).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) this.f453688b).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it.next();
                    if (snsTimelineVideoView2 != null && snsTimelineVideoView2.getParent() != null) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) snsTimelineVideoView2.getParent();
                        snsTimelineVideoView2.f170645q2 = false;
                        viewGroup.removeView(snsTimelineVideoView2);
                    }
                    if (snsTimelineVideoView2 != null) {
                        snsTimelineVideoView2.g0();
                    }
                }
                ((java.util.ArrayList) this.f453688b).clear();
            }
            this.f453691e = null;
            this.f453690d = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            java.util.Iterator it6 = this.f453687a.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) ((java.lang.ref.WeakReference) it6.next()).get();
                if (snsTimelineVideoView3 != null) {
                    if (!snsTimelineVideoView3.f170646r2) {
                        i19++;
                    }
                    snsTimelineVideoView3.t();
                    ((ku5.t0) ku5.t0.f312615d).g(new xd4.m0(this, snsTimelineVideoView3));
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.SnsVideoViewMgr", "[fallbackRelease] releaseCount=%s allCount=%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(((java.util.LinkedList) this.f453687a).size()));
            ((java.util.LinkedList) this.f453687a).clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay onUIPause");
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f453691e;
        if (snsTimelineVideoView != null) {
            boolean g17 = g(snsTimelineVideoView);
            this.f453691e.j0();
            if (g17) {
                this.f453691e.H();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay");
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f453691e;
        if (snsTimelineVideoView != null) {
            boolean g17 = g(snsTimelineVideoView);
            this.f453691e.i0(true);
            if (g17) {
                this.f453691e.H();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    public void k(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, xd4.j0 j0Var, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (j0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SnsVideoViewMgr", "startPlay without videoInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return;
        }
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) onlineVideoView;
        this.f453691e = snsTimelineVideoView;
        if (snsTimelineVideoView != null) {
            snsTimelineVideoView.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str3 = j0Var.f453659a.f377855d;
        java.util.List list = this.f453688b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "lxl startPlay, pos:%s, vid:%s, tlObjId:%s videoViewsSize: %s info %s", valueOf, str3, str2, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), onlineVideoView.Q());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it.next();
            if (snsTimelineVideoView2 != onlineVideoView) {
                if (snsTimelineVideoView2.w() || snsTimelineVideoView2.f0()) {
                    boolean g17 = g(snsTimelineVideoView2);
                    snsTimelineVideoView2.i0(true);
                    if (g17) {
                        snsTimelineVideoView2.H();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s pause ", java.lang.Integer.valueOf(snsTimelineVideoView2.hashCode()));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s remove isPlaying:%s, isPause:%s", java.lang.Integer.valueOf(snsTimelineVideoView2.hashCode()), java.lang.Boolean.valueOf(snsTimelineVideoView2.w()), java.lang.Boolean.valueOf(snsTimelineVideoView2.f0()));
                    arrayList.add(snsTimelineVideoView2);
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) it6.next();
            if (snsTimelineVideoView3.getParent() != null) {
                ((android.view.ViewGroup) snsTimelineVideoView3.getParent()).removeView(snsTimelineVideoView3);
            }
            ((java.util.ArrayList) list).remove(snsTimelineVideoView3);
            snsTimelineVideoView3.g0();
        }
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = this.f453691e;
        if (snsTimelineVideoView4.f170640l2 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(str2, snsTimelineVideoView4.f170641m2) && this.f453691e.f170640l2.f453659a.f377855d.equals(j0Var.f453659a.f377855d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s has been played or playing, just resume", java.lang.Integer.valueOf(this.f453691e.hashCode()));
                if (!this.f453691e.w()) {
                    this.f453691e.setScene(1);
                    this.f453691e.setSessionId(new kk.v(gm0.j1.b().h()).toString() + "_" + java.lang.System.currentTimeMillis());
                    this.f453691e.setSessionTimestamp(java.lang.System.currentTimeMillis());
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView5 = this.f453691e;
                    snsTimelineVideoView5.setSnsId(snsTimelineVideoView5.f170640l2.f453662d);
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView6 = this.f453691e;
                    snsTimelineVideoView6.setFilePath(com.tencent.mm.plugin.sns.model.y6.p(snsTimelineVideoView6.f170640l2.f453659a));
                }
                this.f453691e.K();
                this.f453691e.setMute(true);
                this.f453691e.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s played another video, destroy it", java.lang.Integer.valueOf(this.f453691e.hashCode()));
            this.f453691e.h0();
        }
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView7 = this.f453691e;
        snsTimelineVideoView7.f170640l2 = j0Var;
        snsTimelineVideoView7.f170641m2 = str2;
        snsTimelineVideoView7.f170639k2 = xd4.d0.PLAYING;
        snsTimelineVideoView7.f170642n2 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "%s startPlay, setState PLAYING %s", java.lang.Integer.valueOf(this.f453691e.hashCode()), onlineVideoView.Q());
        this.f453690d = str2;
        this.f453691e.setMute(true);
        this.f453691e.P(j0Var.f453659a, j0Var.f453660b, j0Var.f453661c);
        this.f453691e.a();
        this.f453691e.C();
        this.f453691e.setScene(1);
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView8 = this.f453691e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(new kk.v(gm0.j1.b().h()).toString());
        sb6.append("_");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        snsTimelineVideoView8.setSessionId(sb6.toString());
        this.f453691e.setSessionTimestamp(java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView9 = this.f453691e;
        snsTimelineVideoView9.setSnsId(snsTimelineVideoView9.f170640l2.f453662d);
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView10 = this.f453691e;
        snsTimelineVideoView10.setFilePath(com.tencent.mm.plugin.sns.model.y6.p(snsTimelineVideoView10.f170640l2.f453659a));
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoViewMgr", "lxl normal start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }
}
