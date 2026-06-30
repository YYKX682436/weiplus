package xd4;

/* loaded from: classes4.dex */
public final class w implements z35.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f453715a;

    public w(java.lang.ref.WeakReference weakReference) {
        this.f453715a = weakReference;
    }

    @Override // z35.s0
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) this.f453715a.get();
        if (onlineVideoView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
            return;
        }
        if (z17) {
            onlineVideoView.K();
        } else {
            onlineVideoView.F();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initPlayStatus$1");
    }
}
