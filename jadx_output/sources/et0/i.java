package et0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f256541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(et0.k kVar) {
        super(0);
        this.f256541d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture b17;
        et0.k kVar = this.f256541d;
        ft0.d dVar = kVar.f256548i;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ms0.c cVar = kVar.f256547h;
        if (cVar != null) {
            cVar.onDrawFrame(null);
        }
        rs0.h hVar = kVar.f256543d;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f399292a, hVar.f399293b, java.lang.System.nanoTime());
            android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
        }
        return jz5.f0.f302826a;
    }
}
