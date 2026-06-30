package xd4;

/* loaded from: classes4.dex */
public final class x implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f453716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView f453717b;

    public x(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        this.f453716a = weakReference;
        this.f453717b = onlineVideoView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView) this.f453716a.get();
        if (suspendableHeroSeekBarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        } else {
            suspendableHeroSeekBarView.n(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView) this.f453716a.get();
        if (suspendableHeroSeekBarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        } else {
            suspendableHeroSeekBarView.n(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView) this.f453716a.get();
        if (suspendableHeroSeekBarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
            return;
        }
        suspendableHeroSeekBarView.n(false);
        this.f453717b.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView) this.f453716a.get();
        if (suspendableHeroSeekBarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        } else {
            suspendableHeroSeekBarView.n(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$2");
        }
    }
}
