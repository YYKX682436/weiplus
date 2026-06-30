package nq;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq.e f338864d;

    public d(nq.e eVar) {
        this.f338864d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq.e eVar = this.f338864d;
        com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = eVar.f338865d.f338875i;
        if (gameGLSurfaceView != null) {
            gameGLSurfaceView.b();
        }
        com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView2 = eVar.f338865d.f338875i;
        if (gameGLSurfaceView2 != null) {
            gameGLSurfaceView2.setVisibility(4);
        }
    }
}
