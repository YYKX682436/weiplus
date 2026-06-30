package ju3;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f301968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f301969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, int i17) {
        super(0);
        this.f301968d = improveCameraKitPluginLayout;
        this.f301969e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f301968d.getEnableLandscape() ? 0 : this.f301969e;
        float f17 = i17;
        this.f301968d.getCameraSwitchPlugin().b(f17);
        yt3.a4 switchFlashPlugin = this.f301968d.getSwitchFlashPlugin();
        if (!(switchFlashPlugin.f465348g == f17) && com.tencent.mm.app.w.INSTANCE.f53889n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchFlashPlugin", "updateOrientation " + f17 + "  " + switchFlashPlugin.f465345d.getRotation());
            switchFlashPlugin.f465348g = f17;
            switchFlashPlugin.f465345d.animate().cancel();
            switchFlashPlugin.f465345d.animate().rotation(f17).setDuration(100L).start();
        }
        android.view.View cameraView = this.f301968d.getCameraView();
        kotlin.jvm.internal.o.e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        ((com.tencent.mm.media.camera.view.CameraKitView) cameraView).setCurrentOrientation(i17);
        return jz5.f0.f302826a;
    }
}
