package p74;

/* loaded from: classes4.dex */
public final class u implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f352596a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.OnlineVideoView f352597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352598c;

    /* renamed from: d, reason: collision with root package name */
    public int f352599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p74.w f352600e;

    public u(p74.w wVar, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager mCardLayoutManager, com.tencent.mm.plugin.sns.ui.OnlineVideoView mBindingVideoView, int i17) {
        kotlin.jvm.internal.o.g(mCardLayoutManager, "mCardLayoutManager");
        kotlin.jvm.internal.o.g(mBindingVideoView, "mBindingVideoView");
        this.f352600e = wVar;
        this.f352596a = mCardLayoutManager;
        this.f352597b = mBindingVideoView;
        this.f352599d = i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f352596a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f352600e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int p17 = cardLayoutManager.p();
            this.f352599d = p17;
            if (p74.w.e(wVar) != null && (onlineVideoView = this.f352597b) != null) {
                p74.w.e(wVar).l(p17, onlineVideoView.getDuration());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.m(cardLayoutManager, p17, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        java.lang.Object m521constructorimpl;
        int p17;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f352600e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            p17 = this.f352596a.p();
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (p17 != this.f352599d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
            return;
        }
        if (p74.w.e(wVar) != null && (onlineVideoView = this.f352597b) != null) {
            java.lang.Object tag = onlineVideoView.getTag(com.tencent.mm.R.id.f486984n33);
            if ((tag instanceof java.lang.Integer) && kotlin.jvm.internal.o.b(tag, 1)) {
                onlineVideoView.setTag(com.tencent.mm.R.id.f486984n33, 0);
                this.f352598c = false;
                q74.b0 e17 = p74.w.e(wVar);
                e17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = e17.d(p17);
                if (d17 != null) {
                    d17.f360396i += d17.f360399l;
                    d17.f360399l = 0;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            p74.w.e(wVar).k(p17, i17);
            int i18 = i17 / 1000;
            if (!this.f352598c && i18 >= 1) {
                this.f352598c = true;
                q74.b0 e18 = p74.w.e(wVar);
                e18.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d18 = e18.d(p17);
                if (d18 != null) {
                    d18.f360394g++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f352596a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f352600e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHasUserInteraction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            boolean z17 = wVar.f352616j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHasUserInteraction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            this.f352598c = false;
            int p17 = cardLayoutManager.p();
            q74.b0 e17 = p74.w.e(wVar);
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f352597b;
            if (e17 != null && onlineVideoView != null) {
                p74.w.e(wVar).i(p17);
                p74.w.e(wVar).l(p17, onlineVideoView.getDuration());
            }
            p74.w.f(wVar, cardLayoutManager, onlineVideoView, p17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx
    public void onPause() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f352596a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f352600e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int p17 = cardLayoutManager.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.m(cardLayoutManager, p17, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }
}
