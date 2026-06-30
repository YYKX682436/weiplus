package w74;

/* loaded from: classes4.dex */
public class h implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f443551a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f443552b;

    /* renamed from: c, reason: collision with root package name */
    public final z74.i f443553c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f443554d;

    /* renamed from: e, reason: collision with root package name */
    public final w74.b f443555e;

    public h(z74.i iVar, w74.b bVar) {
        this.f443553c = iVar;
        this.f443555e = bVar;
    }

    @Override // z84.c
    public void a(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        try {
            w74.b bVar = this.f443555e;
            if (bVar != null) {
                bVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                if (i17 == bVar.f443522f) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                } else {
                    bVar.f443522f = i17;
                    w74.a d17 = bVar.d(i17);
                    if (d17 != null) {
                        d17.f443508c++;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            e(cardLayoutManager, i17, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        try {
            if (i17 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                this.f443551a = true;
                if (cardLayoutManager != null) {
                    cardLayoutManager.o();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                this.f443551a = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|7|8|(11:10|11|12|13|14|(4:16|17|18|(2:53|54)(4:24|(2:26|(2:28|(1:48)(5:32|(2:34|(3:36|(1:38)(1:(1:(1:44)(1:45))(1:46))|39))|47|(0)(0)|39))(2:49|(1:51)))(1:52)|40|41))|56|18|(0)|53|54)|59|12|13|14|(0)|56|18|(0)|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0031, B:16:0x0039), top: B:13:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w74.h.e(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, int, boolean):void");
    }

    public final void f(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        if (onlineVideoView != null && (iVar = this.f443553c) != null) {
            a84.y0.i(onlineVideoView);
            a84.y0.o(onlineVideoView, -1, -1);
            a84.y0.b(viewGroup, onlineVideoView, 0);
            a84.y0.p(onlineVideoView, true);
            onlineVideoView.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            onlineVideoView.setVideoCallback(new w74.g(this, cardLayoutManager, onlineVideoView));
            iVar.h(onlineVideoView, j0Var, j0Var.f453662d, j0Var.f453659a.f377855d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    public void g(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.tencent.mars.xlog.Log.i("SnsAd.TopicCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f443552b = true;
        if (cardLayoutManager != null) {
            try {
                int p17 = cardLayoutManager.p();
                if (p17 >= 0) {
                    e(cardLayoutManager, p17, true);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }
}
