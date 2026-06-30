package y22;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f459081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f459082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y22.g gVar, long j17) {
        super(0);
        this.f459081d = gVar;
        this.f459082e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture;
        y22.g gVar = this.f459081d;
        d32.n nVar = gVar.f459084d;
        synchronized (nVar) {
            surfaceTexture = nVar.f330953i;
        }
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        gVar.f459084d.onDrawFrame(null);
        rs0.h hVar = gVar.f459086f;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f399292a, hVar.f399293b, this.f459082e);
            android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
        }
        yz5.a aVar = gVar.f459092o;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
