package v74;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final v74.v0 f433947a;

    /* renamed from: b, reason: collision with root package name */
    public final z74.i f433948b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f433949c;

    /* renamed from: d, reason: collision with root package name */
    public final v74.x0 f433950d;

    static {
        new v74.w0(null);
    }

    public z0(v74.v0 mAdLookbookStatistic) {
        kotlin.jvm.internal.o.g(mAdLookbookStatistic, "mAdLookbookStatistic");
        this.f433947a = mAdLookbookStatistic;
        z74.i iVar = new z74.i();
        this.f433948b = iVar;
        this.f433949c = new java.util.HashMap();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsSingleVideoPlayMode", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        iVar.f470616c = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsSingleVideoPlayMode", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        iVar.f470617d = 1000L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        this.f433950d = new v74.x0(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:11:0x0023, B:14:0x0050, B:16:0x005d, B:18:0x0066, B:20:0x0072, B:26:0x007a, B:27:0x0080, B:28:0x0086, B:29:0x006d, B:30:0x004b), top: B:10:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11, android.view.ViewGroup r12, com.tencent.mm.plugin.sns.storage.SnsInfo r13, r45.jj4 r14, boolean r15) {
        /*
            r10 = this;
            z74.i r0 = r10.f433948b
            java.lang.String r1 = "playVideo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            if (r12 == 0) goto L12
            android.content.Context r4 = r12.getContext()
            goto L13
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = "AdLookbookVideoManager"
            if (r4 == 0) goto Laf
            if (r13 == 0) goto Laf
            if (r14 == 0) goto L1e
            java.lang.String r4 = r14.f377855d
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L23
            goto Laf
        L23:
            xd4.j0 r4 = new xd4.j0     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            r4.f453659a = r14     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r13.getLocalid()     // Catch: java.lang.Throwable -> L93
            r4.f453660b = r6     // Catch: java.lang.Throwable -> L93
            long r6 = r13.field_snsId     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = ca4.z0.t0(r6)     // Catch: java.lang.Throwable -> L93
            r4.f453662d = r6     // Catch: java.lang.Throwable -> L93
            int r13 = r13.getCreateTime()     // Catch: java.lang.Throwable -> L93
            r4.f453661c = r13     // Catch: java.lang.Throwable -> L93
            android.content.Context r13 = r12.getContext()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r14.f377855d     // Catch: java.lang.Throwable -> L93
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r13 = r0.a(r13, r6)     // Catch: java.lang.Throwable -> L93
            if (r13 != 0) goto L4b
            goto L50
        L4b:
            r6 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r6)     // Catch: java.lang.Throwable -> L93
        L50:
            java.lang.String r6 = "getVideoViewInContainer"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L93
            boolean r8 = a84.y0.e(r12)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L6d
            r8 = 0
            android.view.View r8 = r12.getChildAt(r8)     // Catch: java.lang.Throwable -> L93
            boolean r9 = r8 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L6d
            r3 = r8
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r3     // Catch: java.lang.Throwable -> L93
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L93
            goto L70
        L6d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L93
        L70:
            if (r3 != 0) goto L76
            r10.b(r11, r13, r12, r4)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L76:
            if (r3 != r13) goto L86
            if (r15 == 0) goto L80
            java.lang.String r11 = r14.f377855d     // Catch: java.lang.Throwable -> L93
            r0.f(r3, r11)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L80:
            java.lang.String r11 = r14.f377855d     // Catch: java.lang.Throwable -> L93
            r0.g(r3, r11)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L86:
            java.lang.String r14 = "videoView changed"
            com.tencent.mars.xlog.Log.w(r5, r14)     // Catch: java.lang.Throwable -> L93
            a84.y0.c(r12)     // Catch: java.lang.Throwable -> L93
            r10.b(r11, r13, r12, r4)     // Catch: java.lang.Throwable -> L93
            goto Lab
        L93:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "playVideo, exp="
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.e(r5, r12)
            java.lang.String r12 = "AdLookbookVideoHelper playVideo"
            ca4.q.c(r12, r11)
        Lab:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        Laf:
            java.lang.String r11 = "playVideo params error"
            com.tencent.mars.xlog.Log.e(r5, r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.z0.a(int, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final void b(int i17, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
        com.tencent.mars.xlog.Log.i("AdLookbookVideoManager", "startPlay, pos=" + i17);
        if (onlineVideoView != null) {
            j0Var.f453660b = ca4.m0.e(j0Var.f453660b, j0Var.f453659a.f377855d + '_');
            a84.y0.i(onlineVideoView);
            a84.y0.o(onlineVideoView, -1, -1);
            a84.y0.b(viewGroup, onlineVideoView, 0);
            a84.y0.p(onlineVideoView, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alwaysShowThumb", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.f166441h2 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alwaysShowThumb", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            onlineVideoView.setVideoCallback(new v74.y0(i17, onlineVideoView, this));
            java.lang.Integer num = (java.lang.Integer) this.f433949c.get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 0;
            }
            this.f433948b.i(onlineVideoView, j0Var, j0Var.f453662d, j0Var.f453659a.f377855d, num.intValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
        com.tencent.mars.xlog.Log.e("AdLookbookVideoManager", "stopAll");
        try {
            this.f433950d.removeCallbacksAndMessages(null);
            this.f433948b.j();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLookbookVideoManager", "stopAll, exp=" + th6);
            ca4.q.c("AdLookbookVideoHelper stopAll", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
    }
}
