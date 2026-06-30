package z74;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f470590a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.Reference f470591b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.Reference f470592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f470593d;

    /* renamed from: e, reason: collision with root package name */
    public z74.c f470594e = null;

    /* renamed from: f, reason: collision with root package name */
    public z74.a f470595f = null;

    public e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, i64.b1 b1Var, int i17) {
        this.f470590a = snsInfo;
        this.f470591b = new java.lang.ref.WeakReference(onlineVideoView);
        this.f470592c = new java.lang.ref.WeakReference(b1Var);
        this.f470593d = i17;
    }

    public static java.lang.String d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "normal time line item";
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "base card time line item";
        }
        if (i17 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        return "grid card time line item";
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        d(this.f470593d);
        b(z74.b.f470584d, i17 * 1000, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    public final void b(z74.b bVar, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        z74.c cVar = this.f470594e;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) this.f470591b.get();
        if (cVar != null && onlineVideoView != null) {
            cVar.a(onlineVideoView, bVar, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        i64.b1 b1Var = (i64.b1) this.f470592c.get();
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) this.f470591b.get();
        if (onlineVideoView != null && (snsInfo = this.f470590a) != null && b1Var != null) {
            long j17 = i17;
            long duration = onlineVideoView.getDuration();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            long j18 = snsInfo.field_snsId;
            if (snsInfo.isAd()) {
                b1Var.s(snsInfo.field_snsId);
                b1Var.v(snsInfo.field_snsId, j17);
                if (!b1Var.m(j18)) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    b1Var.w(j18, android.os.SystemClock.elapsedRealtime());
                    b1Var.x(j18, (int) (duration / 1000), true);
                    b1Var.d(j18, j18);
                    ca4.z0.t0(j18);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            } else {
                com.tencent.mars.xlog.Log.w("SnsAd.OnlineAdVideoCallback", "doOnlinePlayerPlaying, the info is not Ad, snsId=" + ca4.z0.t0(j18));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            }
        }
        b(z74.b.f470585e, 0, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCompletion() {
        /*
            r8 = this;
            java.lang.String r0 = "onCompletion"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r8.f470593d
            d(r2)
            java.lang.ref.Reference r2 = r8.f470592c
            java.lang.Object r2 = r2.get()
            i64.b1 r2 = (i64.b1) r2
            java.lang.ref.Reference r3 = r8.f470591b
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r3
            java.lang.String r4 = "doOnlineVideoCompletion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f470590a
            if (r5 == 0) goto L52
            if (r2 == 0) goto L52
            long r6 = r5.field_snsId
            ca4.z0.t0(r6)
            boolean r5 = r5.isAd()
            if (r5 != 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "online player completion, !isAd,  snsId="
            r2.<init>(r5)
            java.lang.String r5 = ca4.z0.t0(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "SnsAd.OnlineAdVideoCallback"
            com.tencent.mars.xlog.Log.e(r5, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L55
        L4f:
            r2.b(r6)
        L52:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L55:
            r2 = 0
            if (r3 == 0) goto L74
            java.lang.String r4 = "shouldLoopPlay"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            z74.a r5 = r8.f470595f
            r6 = 1
            if (r5 != 0) goto L68
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            r5 = r6
            goto L6f
        L68:
            boolean r5 = r5.a()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L6f:
            if (r5 == 0) goto L74
            r3.M(r2, r6)
        L74:
            z74.b r3 = z74.b.f470587g
            r8.b(r3, r2, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z74.e.onCompletion():void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx
    public void onPause() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        i64.b1 b1Var = (i64.b1) this.f470592c.get();
        if (b1Var != null && (snsInfo = this.f470590a) != null) {
            b1Var.q(snsInfo.field_snsId);
        }
        b(z74.b.f470586f, 0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }
}
