package q74;

/* loaded from: classes4.dex */
public class a1 implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.OnlineVideoView f360402a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f360403b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f360404c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f360405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q74.b1 f360406e;

    public a1(q74.b1 b1Var, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, int i17) {
        this.f360406e = b1Var;
        this.f360405d = -1;
        this.f360402a = onlineVideoView;
        this.f360403b = cardLayoutManager;
        this.f360405d = java.lang.Math.max(i17, 0);
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f360403b;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                this.f360405d = p17;
                q74.b0 b0Var = this.f360406e.f360422e;
                if (b0Var != null && (onlineVideoView = this.f360402a) != null) {
                    b0Var.l(p17, onlineVideoView.getDuration());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f360403b;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                if (p17 != this.f360405d) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
                    return;
                }
                if (this.f360406e.f360422e != null && (onlineVideoView = this.f360402a) != null) {
                    java.lang.Object tag = onlineVideoView.getTag(com.tencent.mm.R.id.f486984n33);
                    if ((tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 1) {
                        this.f360402a.setTag(com.tencent.mm.R.id.f486984n33, 0);
                        this.f360404c = false;
                        q74.b0 b0Var = this.f360406e.f360422e;
                        b0Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        q74.a0 d17 = b0Var.d(p17);
                        if (d17 != null) {
                            d17.f360396i += d17.f360399l;
                            d17.f360399l = 0;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    }
                    this.f360406e.f360422e.k(p17, i17);
                    int i18 = i17 / 1000;
                    if (!this.f360404c && i18 >= 1) {
                        this.f360404c = true;
                        q74.b0 b0Var2 = this.f360406e.f360422e;
                        b0Var2.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        q74.a0 d18 = b0Var2.d(p17);
                        if (d18 != null) {
                            d18.f360394g++;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            this.f360404c = false;
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f360403b;
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f360402a;
            q74.b1 b1Var = this.f360406e;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                q74.b0 b0Var = b1Var.f360422e;
                if (b0Var != null && onlineVideoView != null) {
                    b0Var.i(p17);
                    b1Var.f360422e.l(p17, onlineVideoView.getDuration());
                }
            }
            b1Var.g(cardLayoutManager, onlineVideoView);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }
}
