package p10;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350954d;

    public h(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350954d = magicDebugPanelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350954d;
        if (magicDebugPanelView.f65815e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "auto profile timeout (60000ms), force stop");
            magicDebugPanelView.d();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "auto profile timeout but already stopped, skip");
        }
        magicDebugPanelView.f65817g = null;
    }
}
