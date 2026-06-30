package sk3;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer f408954d;

    public a(com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer) {
        this.f408954d = dynamicBgContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "hide gradient");
        com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBgSurfaceView = this.f408954d.getDynamicBgSurfaceView();
        if (dynamicBgSurfaceView != null) {
            dynamicBgSurfaceView.setShowGradientView(false);
        }
    }
}
