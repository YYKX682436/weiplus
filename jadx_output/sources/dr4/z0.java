package dr4;

/* loaded from: classes14.dex */
public final class z0 implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242769d;

    public z0(dr4.p1 p1Var) {
        this.f242769d = p1Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayAdded: " + i17);
        this.f242769d.c();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayChanged: " + i17);
        this.f242769d.c();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayRemoved: " + i17);
        this.f242769d.c();
    }
}
