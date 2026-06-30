package v74;

/* loaded from: classes4.dex */
public final class y0 implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f433943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView f433944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v74.z0 f433945c;

    public y0(int i17, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, v74.z0 z0Var) {
        this.f433943a = i17;
        this.f433944b = onlineVideoView;
        this.f433945c = z0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart, pos=");
        int i18 = this.f433943a;
        sb6.append(i18);
        sb6.append(", durationSecond=");
        sb6.append(i17);
        sb6.append(", view.duration=");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f433944b;
        sb6.append(onlineVideoView.getDuration());
        com.tencent.mars.xlog.Log.i("AdLookbookVideoManager", sb6.toString());
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f433945c.f433950d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(1, i18, onlineVideoView.getDuration());
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        int i18 = this.f433943a;
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f433945c.f433950d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(3, i18, i17);
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, pos=");
        int i17 = this.f433943a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("AdLookbookVideoManager", sb6.toString());
        if (i17 != -1) {
            this.f433944b.M(0, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f433945c.f433950d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(2, i17, 0);
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }
}
