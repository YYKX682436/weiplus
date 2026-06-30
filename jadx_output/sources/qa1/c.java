package qa1;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f360971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qa1.h f360972g;

    public c(qa1.h hVar, int i17, int i18, android.graphics.SurfaceTexture surfaceTexture) {
        this.f360972g = hVar;
        this.f360969d = i17;
        this.f360970e = i18;
        this.f360971f = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f360972g;
        hVar.getClass();
        android.graphics.SurfaceTexture surfaceTexture = this.f360971f;
        hVar.f360994g = surfaceTexture;
        hVar.f360995h = rs0.i.f399296a.m(new android.view.Surface(surfaceTexture), null, 0, 0, android.opengl.EGL14.EGL_NO_CONTEXT);
        ms0.c cVar = hVar.f360998n;
        int i17 = this.f360969d;
        int i18 = this.f360970e;
        if (cVar != null) {
            cVar.onSurfaceCreated(null, null);
            hVar.f360998n.t(i17, i18);
            hVar.f360998n.u(i17, i18);
            hVar.f360998n.k(true);
        }
        super/*gh.k*/.onSurfaceTextureAvailable(hVar.f360999o.b(), i17, i18);
        hVar.f361000p.getAndSet(true);
    }
}
