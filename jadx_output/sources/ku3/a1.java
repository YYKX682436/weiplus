package ku3;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, int i17) {
        super(0);
        this.f312161d = professionalCameraKitPluginLayout;
        this.f312162e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.f155856x1;
        com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312161d;
        int i18 = professionalCameraKitPluginLayout.getEnableLandscape() ? 0 : this.f312162e;
        professionalCameraKitPluginLayout.getCameraSwitchPlugin().b(i18);
        android.view.View cameraView = professionalCameraKitPluginLayout.getCameraView();
        kotlin.jvm.internal.o.e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        ((com.tencent.mm.media.camera.view.CameraKitView) cameraView).setCurrentOrientation(i18);
        return jz5.f0.f302826a;
    }
}
