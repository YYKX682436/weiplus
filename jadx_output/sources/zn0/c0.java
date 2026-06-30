package zn0;

/* loaded from: classes3.dex */
public class c0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f474327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.a0 f474328f;

    public c0(zn0.a0 a0Var, java.lang.String str, go0.q1 q1Var) {
        this.f474328f = a0Var;
        this.f474326d = str;
        this.f474327e = q1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f474328f.p(this.f474326d);
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        go0.q1 q1Var = this.f474327e;
        q1Var.a(surface, false);
        q1Var.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureDestroyed");
        this.f474328f.p(this.f474326d);
        go0.q1 q1Var = this.f474327e;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f474327e.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
