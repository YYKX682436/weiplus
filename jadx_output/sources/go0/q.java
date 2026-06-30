package go0;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(go0.f0 f0Var) {
        super(0);
        this.f273816d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture b17;
        go0.f0 f0Var = this.f273816d;
        ft0.d dVar = f0Var.f273764m;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        java.lang.Object obj = f0Var.f273766o;
        if (obj != null) {
            if (f0Var.f273765n == null) {
                if ((obj instanceof android.view.Surface) && !((android.view.Surface) obj).isValid()) {
                    f0Var.f273765n = null;
                } else if (!(obj instanceof android.view.SurfaceHolder) || ((android.view.SurfaceHolder) obj).getSurface().isValid()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreRender", "makeOutputSurface");
                    rs0.g gVar = rs0.i.f399296a;
                    rs0.h hVar = f0Var.f273763i;
                    kotlin.jvm.internal.o.d(hVar);
                    android.opengl.EGLSurface k17 = gVar.k(hVar.f399292a, obj);
                    f0Var.f273765n = k17;
                    rs0.h hVar2 = f0Var.f273763i;
                    android.opengl.EGL14.eglMakeCurrent(hVar2 != null ? hVar2.f399292a : null, k17, k17, hVar2 != null ? hVar2.f399294c : null);
                } else {
                    f0Var.f273765n = null;
                }
            }
            ft0.d dVar2 = f0Var.f273764m;
            if (dVar2 != null) {
                dVar2.d(null);
            }
            rs0.h hVar3 = f0Var.f273763i;
            if (hVar3 != null) {
                android.opengl.EGLDisplay eGLDisplay = hVar3.f399292a;
                android.opengl.EGLSurface eGLSurface = f0Var.f273765n;
                if (eGLSurface == null) {
                    eGLSurface = hVar3.f399293b;
                }
                android.opengl.EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
            }
        }
        return jz5.f0.f302826a;
    }
}
