package dd4;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        super(0);
        this.f229030d = flexibleLivePhotoView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$1");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229030d;
        flexibleLivePhotoView.m("playComplete");
        android.widget.RelativeLayout videoContainer = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getVideoContainer();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        flexibleLivePhotoView.f169192g.post(new dd4.i(videoContainer, flexibleLivePhotoView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        y51.e playCallback = flexibleLivePhotoView.getPlayCallback();
        if (playCallback != null) {
            playCallback.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhotoVideoView$1");
        return f0Var;
    }
}
