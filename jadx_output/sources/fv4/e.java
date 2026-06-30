package fv4;

/* loaded from: classes8.dex */
public final class e implements io.flutter.view.TextureRegistry.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fv4.f f266988a;

    public e(fv4.f fVar) {
        this.f266988a = fVar;
    }

    @Override // io.flutter.view.TextureRegistry.OnFrameAvailableListener
    public final void onFrameAvailable(boolean z17) {
        java.lang.Object obj = this.f266988a.f266992e;
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj : null;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.scheduleFrame();
        }
    }
}
