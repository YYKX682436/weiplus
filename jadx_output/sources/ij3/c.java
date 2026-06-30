package ij3;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij3.f f291701d;

    public c(ij3.f fVar) {
        this.f291701d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        ij3.f fVar = this.f291701d;
        if (fVar.f291705f == null) {
            fj3.f fVar2 = fVar.f291704e;
            if (fVar2 == null || (hVar = fVar2.f263203e) == null || (eGLContext = hVar.f399294c) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
            } else {
                fVar.f291705f = fVar.K(new fj3.a(fVar.f291707h, eGLContext, new ij3.b(fVar.f291708i), -1L));
            }
        }
    }
}
