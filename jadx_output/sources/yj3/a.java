package yj3;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f462669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yj3.g gVar) {
        super(0);
        this.f462669d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.g gVar = rs0.i.f399296a;
        yj3.g gVar2 = this.f462669d;
        gVar2.f462684j = gVar.l(gVar2.f462675a, gVar2.f462676b, android.opengl.EGL14.EGL_NO_CONTEXT);
        os0.c cVar = new os0.c(gVar2.f462675a, gVar2.f462676b, 0, 0, 0, 0, 60, null);
        gVar2.f462680f = cVar;
        cVar.f348011t = new yj3.e(gVar2);
        jz5.g gVar3 = gVar2.f462686l;
        is0.c cVar2 = (is0.c) ((jz5.n) gVar3).getValue();
        os0.c cVar3 = gVar2.f462680f;
        if (cVar3 != null) {
            cVar3.H = ((is0.c) ((jz5.n) gVar3).getValue()).f294395e;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar2.f294395e);
        gVar2.f462681g = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(gVar2.f462675a, gVar2.f462676b);
        android.graphics.SurfaceTexture surfaceTexture2 = gVar2.f462681g;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new yj3.f(gVar2));
        }
        gVar2.f462683i = new android.view.Surface(gVar2.f462681g);
        rs0.h hVar = gVar2.f462684j;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar.f399293b;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f399294c)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "makeEGLCurrent failed ");
            }
        }
        gVar2.f462677c.invoke(gVar2);
        return jz5.f0.f302826a;
    }
}
