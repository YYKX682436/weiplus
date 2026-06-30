package nq;

/* loaded from: classes8.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq.s f338899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(nq.s sVar, android.os.Looper looper) {
        super(looper);
        this.f338899a = sVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        nq.t tVar = com.tencent.mm.dynamicbackground.view.GameGLSurfaceView.f64879s;
        synchronized (tVar) {
            switch (message.what) {
                case 0:
                    mq.h.b("MicroMsg.GLThread", "surfaceCreated tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    nq.s sVar = this.f338899a;
                    sVar.f338907n = true;
                    sVar.f338912s = false;
                    tVar.notifyAll();
                    break;
                case 1:
                    mq.h.b("MicroMsg.GLThread", "surfaceDestroyed tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    this.f338899a.f338907n = false;
                    tVar.notifyAll();
                    break;
                case 2:
                    mq.h.b("MicroMsg.GLThread", "onPause tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    this.f338899a.f338905i = true;
                    tVar.notifyAll();
                    break;
                case 3:
                    mq.h.b("MicroMsg.GLThread", "onResume tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    nq.s sVar2 = this.f338899a;
                    sVar2.f338905i = false;
                    sVar2.f338916w = true;
                    sVar2.getClass();
                    tVar.notifyAll();
                    break;
                case 4:
                    int i17 = message.arg1;
                    int i18 = message.arg2;
                    nq.s sVar3 = this.f338899a;
                    if (sVar3.f338913t != i17 || sVar3.f338914u != i18) {
                        mq.h.b("MicroMsg.GLThread", "windowResize w:%d h:%d tid=", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f338899a.getId()));
                        nq.s sVar4 = this.f338899a;
                        sVar4.f338913t = i17;
                        sVar4.f338914u = i18;
                        sVar4.f338919z = true;
                        sVar4.f338916w = true;
                        sVar4.getClass();
                        tVar.notifyAll();
                        break;
                    } else {
                        return;
                    }
                case 5:
                    mq.h.b("MicroMsg.GLThread", "requestExitAndWaitForDestroy tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    nq.s sVar5 = this.f338899a;
                    sVar5.f338904h = true;
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = (com.tencent.mm.dynamicbackground.view.GameGLSurfaceView) sVar5.C.get();
                    if (gameGLSurfaceView != null) {
                        ((nq.f) gameGLSurfaceView.f64883g).g();
                    }
                    tVar.notifyAll();
                    break;
                case 6:
                    mq.h.b("MicroMsg.GLThread", "requestRender tid=" + this.f338899a.getId(), new java.lang.Object[0]);
                    this.f338899a.f338916w = true;
                    tVar.notifyAll();
                    break;
            }
        }
    }
}
