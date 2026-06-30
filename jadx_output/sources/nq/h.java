package nq;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView f338880d;

    public h(com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView, nq.g gVar) {
        this.f338880d = dynamicBackgroundGLSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq.f fVar = this.f338880d.f64878t;
        if (fVar != null) {
            try {
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender release", new java.lang.Object[0]);
                com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = fVar.f338867a;
                if (dynamicBackgroundNative != null) {
                    dynamicBackgroundNative.a();
                }
                fVar.f338871e = null;
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo SurfaceView reset and nativeRelease", new java.lang.Object[0]);
                fVar.f338869c = 0;
                fVar.f338870d = 0;
                fVar.f338878l = false;
                fVar.f338872f = false;
                fVar.f338874h = false;
                fVar.f338873g = false;
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeRelease exception", new java.lang.Object[0]);
            }
        }
    }
}
