package y22;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f459077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y22.g gVar) {
        super(0);
        this.f459077d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y22.g gVar = this.f459077d;
        ms0.c.o(gVar.f459084d, false, 1, null);
        rs0.h hVar = gVar.f459086f;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f399292a, hVar.f399294c);
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, hVar.f399293b);
            android.graphics.SurfaceTexture surfaceTexture = gVar.f459087g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            android.os.HandlerThread handlerThread = gVar.f459089i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            gVar.f459089i = null;
            gVar.f459090m = null;
        }
        return jz5.f0.f302826a;
    }
}
