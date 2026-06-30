package dd4;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        super(0);
        this.f229035d = flexibleLivePhotoView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229035d;
        flexibleLivePhotoView.m("onFirstFrameAvailable");
        android.widget.RelativeLayout videoContainer = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getVideoContainer();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$aniToPlayView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aniToPlayView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        flexibleLivePhotoView.f169192g.post(new dd4.g(videoContainer, flexibleLivePhotoView, new android.animation.AnimatorSet()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aniToPlayView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$aniToPlayView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getVideoContainer().performHapticFeedback(4);
        y51.e playCallback = flexibleLivePhotoView.getPlayCallback();
        if (playCallback != null) {
            playCallback.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$2");
        return f0Var;
    }
}
