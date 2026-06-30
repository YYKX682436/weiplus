package ju3;

/* loaded from: classes10.dex */
public final class k implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f301960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301961b;

    public k(boolean z17, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout) {
        this.f301960a = z17;
        this.f301961b = cameraKitPluginLayout;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue() || this.f301960a) {
            return;
        }
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.B;
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout = this.f301961b;
        cameraKitPluginLayout.getClass();
        try {
            if (cameraKitPluginLayout.ignoreLifeCycle) {
                return;
            }
            cameraKitPluginLayout.f155792n.f(androidx.lifecycle.m.ON_RESUME);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraKitPluginLayout", e17, "handleLifecycleEvent error", new java.lang.Object[0]);
        }
    }
}
