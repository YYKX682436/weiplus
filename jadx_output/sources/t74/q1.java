package t74;

/* loaded from: classes4.dex */
public final class q1 implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f416228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f416230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f416231d;

    public q1(t74.w1 w1Var, int i17, com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView) {
        this.f416229b = w1Var;
        this.f416230c = i17;
        this.f416231d = snsTimelineVideoView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        t74.i2 R = t74.w1.R(this.f416229b);
        if (R != null) {
            int duration = this.f416231d.getDuration();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (this.f416230c == 0) {
                t74.h2 h2Var = R.f416166i;
                h2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.f416153f = duration;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            } else {
                t74.h2 h2Var2 = R.f416167j;
                h2Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.f416153f = duration;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        int i18 = i17 / 1000;
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f416231d;
        java.lang.Object tag = snsTimelineVideoView.getTag(com.tencent.mm.R.id.f486984n33);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        t74.w1 w1Var = this.f416229b;
        if (num != null && num.intValue() == 1) {
            com.tencent.mars.xlog.Log.i(w1Var.j(), "the video view has bean seek to 0");
            snsTimelineVideoView.setTag(com.tencent.mm.R.id.f486984n33, 0);
            this.f416228a = false;
        }
        t74.i2 R = t74.w1.R(w1Var);
        int i19 = this.f416230c;
        if (R != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (i19 == 0) {
                t74.h2 h2Var = R.f416166i;
                if (i17 >= h2Var.a()) {
                    h2Var.c(i17);
                }
            } else {
                t74.h2 h2Var2 = R.f416167j;
                if (i17 >= h2Var2.a()) {
                    h2Var2.c(i17);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        if (!this.f416228a && i18 >= 1) {
            this.f416228a = true;
            t74.i2 R2 = t74.w1.R(w1Var);
            if (R2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                if (i19 == 0) {
                    t74.h2 h2Var3 = R2.f416166i;
                    h2Var3.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    int i27 = h2Var3.f416150c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    h2Var3.f416150c = i27 + 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                } else {
                    t74.h2 h2Var4 = R2.f416167j;
                    h2Var4.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    int i28 = h2Var4.f416150c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    h2Var4.f416150c = i28 + 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        this.f416228a = false;
        t74.w1 w1Var = this.f416229b;
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (this.f416230c == 0) {
                t74.h2 h2Var = R.f416166i;
                h2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i17 = h2Var.f416151d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.f416151d = i17 + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int b17 = h2Var.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i18 = h2Var.f416153f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.d(b17 + i18);
                h2Var.c(0);
            } else {
                t74.h2 h2Var2 = R.f416167j;
                h2Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i19 = h2Var2.f416151d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.f416151d = i19 + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int b18 = h2Var2.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i27 = h2Var2.f416153f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.d(b18 + i27);
                h2Var2.c(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        kotlinx.coroutines.y0 h17 = w1Var.h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(w1Var.A0), null, new t74.m1(w1Var, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }
}
