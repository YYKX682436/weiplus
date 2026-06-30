package lw1;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw1.f f321549d;

    public c(lw1.f fVar) {
        this.f321549d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        lw1.f fVar = this.f321549d;
        if (fVar.f321553f == null) {
            iw1.f fVar2 = fVar.f321552e;
            if (fVar2 == null || (hVar = fVar2.f295208e) == null || (eGLContext = hVar.f399294c) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
            } else {
                fVar.f321553f = fVar.K(new iw1.a(fVar.f321555h, eGLContext, new lw1.b(fVar.f321556i), -1L));
            }
        }
    }
}
