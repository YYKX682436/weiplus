package w74;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.OnlineVideoView f443547a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f443548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443549c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w74.h f443550d;

    public g(w74.h hVar, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        this.f443550d = hVar;
        this.f443547a = onlineVideoView;
        this.f443548b = cardLayoutManager;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f443548b;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                w74.b bVar = this.f443550d.f443555e;
                if (bVar != null && (onlineVideoView = this.f443547a) != null) {
                    bVar.f(p17, onlineVideoView.getDuration());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        w74.h hVar = this.f443550d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        int i18 = i17 / 1000;
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f443548b;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                if (hVar.f443555e != null && (onlineVideoView = this.f443547a) != null) {
                    java.lang.Object tag = onlineVideoView.getTag(com.tencent.mm.R.id.f486984n33);
                    if ((tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 1) {
                        onlineVideoView.setTag(com.tencent.mm.R.id.f486984n33, 0);
                        this.f443549c = false;
                        w74.b bVar = hVar.f443555e;
                        bVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        w74.a d17 = bVar.d(p17);
                        if (d17 != null) {
                            d17.f443512g += d17.f443516k;
                            d17.f443516k = 0;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    }
                    w74.b bVar2 = hVar.f443555e;
                    int i19 = i18 * 1000;
                    bVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    w74.a d18 = bVar2.d(p17);
                    if (d18 != null) {
                        d18.f443516k = i19;
                        if (d18.f443513h < i19) {
                            d18.f443513h = i19;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    if (!this.f443549c && i18 >= 1) {
                        this.f443549c = true;
                        w74.b bVar3 = hVar.f443555e;
                        bVar3.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        w74.a d19 = bVar3.d(p17);
                        if (d19 != null) {
                            d19.f443510e++;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        try {
            this.f443549c = false;
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f443548b;
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f443547a;
            w74.h hVar = this.f443550d;
            if (cardLayoutManager != null) {
                int p17 = cardLayoutManager.p();
                w74.b bVar = hVar.f443555e;
                if (bVar != null && onlineVideoView != null) {
                    bVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    w74.a d17 = bVar.d(p17);
                    if (d17 != null) {
                        d17.f443511f++;
                        d17.f443512g += d17.f443514i;
                        d17.f443516k = 0;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    hVar.f443555e.f(p17, onlineVideoView.getDuration());
                }
            }
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            if (hVar.f443551a) {
                if (onlineVideoView != null) {
                    onlineVideoView.M(0, true);
                }
            } else if (cardLayoutManager != null) {
                cardLayoutManager.A();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }
}
