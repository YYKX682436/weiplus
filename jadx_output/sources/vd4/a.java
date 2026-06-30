package vd4;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout f436060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout snsFixedResolutionCameraKitPluginLayout) {
        super(0);
        this.f436060d = snsFixedResolutionCameraKitPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
        com.tencent.mm.media.camera.view.CameraKitView cameraKitView = (com.tencent.mm.media.camera.view.CameraKitView) this.f436060d.findViewById(com.tencent.mm.R.id.b5a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
        return cameraKitView;
    }
}
