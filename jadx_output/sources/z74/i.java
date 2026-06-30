package z74;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f470615b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f470614a = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f470616c = true;

    /* renamed from: d, reason: collision with root package name */
    public long f470617d = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:7:0x0017, B:9:0x0028, B:13:0x0032, B:15:0x0037), top: B:6:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView a(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "getVideoViewWithMediaId"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.Map r2 = r7.f470614a
            r3 = 0
            java.lang.String r4 = "VideoViewManager"
            if (r2 != 0) goto L17
            java.lang.String r8 = "are you sure? the map is null? I don't think the statement can reach!!"
            com.tencent.mars.xlog.Log.w(r4, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L17:
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r9 = r2.get(r9)     // Catch: java.lang.Throwable -> L58
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r9     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "shouldUseNewVideoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L58
            r5 = 1
            if (r9 == 0) goto L31
            boolean r6 = r7.b(r9)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            r6 = 0
            goto L32
        L31:
            r6 = r5
        L32:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L54
            java.lang.String r9 = "onNewVideoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)     // Catch: java.lang.Throwable -> L58
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView     // Catch: java.lang.Throwable -> L58
            r2.<init>(r8, r5)     // Catch: java.lang.Throwable -> L58
            long r5 = r7.f470617d     // Catch: java.lang.Throwable -> L58
            r2.setShowLoadingDelayTime(r5)     // Catch: java.lang.Throwable -> L58
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L58
            r5 = -1
            r8.<init>(r5, r5)     // Catch: java.lang.Throwable -> L58
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> L58
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)     // Catch: java.lang.Throwable -> L58
            r9 = r2
        L54:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        L58:
            java.lang.String r8 = "getVideoViewWithMediaId has something wrong!"
            com.tencent.mars.xlog.Log.e(r4, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z74.i.a(android.content.Context, java.lang.String):com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean b(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (!(onlineVideoView instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView)) {
            com.tencent.mars.xlog.Log.w("VideoViewManager", "the video view is not SnsTimelineVideoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) onlineVideoView;
        if (!snsTimelineVideoView.f170646r2 && !snsTimelineVideoView.f170644p2 && !snsTimelineVideoView.O1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return false;
        }
        com.tencent.mars.xlog.Log.i("VideoViewManager", "the video view is destroyed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        return true;
    }

    public void c(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f470614a;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) map).entrySet()) {
            if (entry != null && entry.getValue() != null && (onlineVideoView2 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) entry.getValue()) != onlineVideoView) {
                onlineVideoView2.F();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f470614a;
        java.lang.String str = this.f470615b;
        try {
            if (!android.text.TextUtils.isEmpty(str) && map != null && (onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) ((android.util.ArrayMap) map).get(str)) != null) {
                onlineVideoView.F();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("VideoViewManager", "pausePlay has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        java.util.Map map = this.f470614a;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        java.util.Iterator it = ((android.util.ArrayMap) map).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (entry != null && b((com.tencent.mm.plugin.sns.ui.OnlineVideoView) entry.getValue())) {
                it.remove();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void f(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, java.lang.String str) {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("VideoViewManager", "resumePlay has something wrong!");
        }
        if (this.f470616c && (str == null || !str.equals(this.f470615b))) {
            z17 = false;
            if (onlineVideoView == null && z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                if (onlineVideoView instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) {
                    z18 = ((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) onlineVideoView).f0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                    z18 = false;
                }
                if (z18) {
                    if (onlineVideoView.getDuration() - onlineVideoView.getCurrentPosition() < 500) {
                        com.tencent.mars.xlog.Log.i("VideoViewManager", "the current position is too near to end of the video!!");
                        onlineVideoView.M(0, true);
                    } else {
                        onlineVideoView.K();
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("VideoViewManager", "the media is is not same as the current one!!!");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        }
        z17 = true;
        if (onlineVideoView == null) {
        }
        com.tencent.mars.xlog.Log.i("VideoViewManager", "the media is is not same as the current one!!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void g(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            java.util.Map map = this.f470614a;
            if (map == null || str == null || ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) ((android.util.ArrayMap) map).get(str)) != onlineVideoView || onlineVideoView == null || b(onlineVideoView)) {
                onlineVideoView = null;
            }
            if (onlineVideoView != null) {
                onlineVideoView.M(0, true);
                onlineVideoView.setTag(com.tencent.mm.R.id.f486984n33, 1);
            } else {
                com.tencent.mars.xlog.Log.i("VideoViewManager", "the media is is not same as the current one, or the view is destroyed!!!");
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("VideoViewManager", "seekPlay has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void h(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, xd4.j0 j0Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        i(onlineVideoView, j0Var, str, str2, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void i(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, xd4.j0 j0Var, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (onlineVideoView == null || j0Var == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        try {
            onlineVideoView.setVisibility(0);
            if (this.f470616c) {
                c(onlineVideoView);
            }
            e();
            onlineVideoView.P(j0Var.f453659a, j0Var.f453660b, j0Var.f453661c);
            onlineVideoView.x(false);
            onlineVideoView.setMute(true);
            onlineVideoView.D(i17);
            java.util.Map map = this.f470614a;
            if (map != null) {
                ((android.util.ArrayMap) map).put(str2, onlineVideoView);
            }
            ((android.util.ArrayMap) map).size();
            if (this.f470616c) {
                this.f470615b = str2;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("VideoViewManager", "startPlay has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    public void j() {
        java.util.Map map;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            map = this.f470614a;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("VideoViewManager", "stopAll has something wrong!");
        }
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) map).entrySet()) {
            if (entry != null && entry.getValue() != null) {
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) entry.getValue();
                if (onlineVideoView instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) {
                    ((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) onlineVideoView).g0();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }
}
