package tc4;

/* loaded from: classes4.dex */
public final class h0 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417352d;

    public h0(tc4.n0 n0Var) {
        this.f417352d = n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        int i19 = tc4.n0.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        tc4.n0 n0Var = this.f417352d;
        long j17 = n0Var.J1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        long c17 = c01.id.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        long j18 = n0Var.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        tc4.n0.Z(n0Var, j17 + (c17 - j18));
        tc4.n0.a0(n0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        tc4.n0.a0(this.f417352d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        int i17 = tc4.n0.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        tc4.n0 n0Var = this.f417352d;
        n0Var.G1 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        boolean z17 = n0Var.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.K1 = 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            tc4.n0.Z(n0Var, 0L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.I1 = 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long c17 = c01.id.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.H1 = c17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        }
        long c18 = c01.id.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var.K1 = c18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        int i17 = tc4.n0.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        this.f417352d.c0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        android.widget.FrameLayout Y = tc4.n0.Y(this.f417352d);
        if (Y != null) {
            Y.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$1");
    }
}
