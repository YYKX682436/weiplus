package nq;

/* loaded from: classes8.dex */
public class t {
    public t(nq.i iVar) {
    }

    public synchronized void a(nq.s sVar) {
        mq.h.b("MicroMsg.GLThread", "exiting tid=" + sVar.getId(), new java.lang.Object[0]);
        com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = (com.tencent.mm.dynamicbackground.view.GameGLSurfaceView) sVar.C.get();
        if (gameGLSurfaceView != null) {
            nq.f fVar = (nq.f) gameGLSurfaceView.f64883g;
            fVar.getClass();
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onDestroy", new java.lang.Object[0]);
            try {
                com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = fVar.f338867a;
                if (dynamicBackgroundNative != null) {
                    dynamicBackgroundNative.a();
                }
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeRelease exception", new java.lang.Object[0]);
            }
        } else {
            mq.h.b("MicroMsg.GLThread", "onFinalize:view = null", new java.lang.Object[0]);
        }
        nq.q qVar = sVar.B;
        qVar.getClass();
        mq.h.d("MicroMsg.GLThread", "destroySurface()  tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        qVar.b();
        if (sVar.f338911r) {
            sVar.f338911r = false;
            sVar.f338912s = false;
        }
        sVar.d();
        try {
            sVar.B.c();
        } catch (java.lang.Throwable th7) {
            mq.h.a("GLThreadManager", "alvinluo GLThread#threadExiting finish stack = [%s]", android.util.Log.getStackTraceString(th7));
            if (gameGLSurfaceView != null) {
                ((nq.f) gameGLSurfaceView.f64883g).e(th7);
            }
        }
        sVar.f338902f.quit();
        notifyAll();
    }
}
