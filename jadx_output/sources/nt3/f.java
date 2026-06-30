package nt3;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f339775a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.Surface f339776b;

    /* renamed from: c, reason: collision with root package name */
    public final nt3.f0 f339777c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f339778d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f339779e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f339780f;

    public f(android.graphics.SurfaceTexture surfaceTexture, nt3.f0 f0Var) {
        this.f339775a = surfaceTexture;
        this.f339777c = f0Var;
    }

    public void a(java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "postJob");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f339780f;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "postJob but handler is null");
        } else {
            n3Var.post(runnable);
        }
    }

    public void b() {
        java.lang.String str = "CameraPreviewTextureView_renderThread" + hashCode();
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, -2);
        this.f339779e = a17;
        a17.start();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(this.f339779e.getLooper());
        this.f339780f = n3Var;
        n3Var.post(new nt3.c(this));
    }

    public f(android.view.Surface surface, nt3.f0 f0Var) {
        this.f339776b = surface;
        this.f339777c = f0Var;
    }
}
