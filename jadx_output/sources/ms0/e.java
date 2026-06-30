package ms0;

/* loaded from: classes10.dex */
public abstract class e extends ms0.c {
    public e(int i17, int i18) {
        super(0, 0, 0, 0, i17, i18);
    }

    @Override // ms0.c, android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        try {
            com.tencent.mm.sdk.platformtools.b3 b3Var = qs0.a.f366207a;
            synchronized (b3Var) {
                try {
                    b3Var.b();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreviewRenderSignal", e17, "markRendering error", new java.lang.Object[0]);
                }
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f330953i;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.AbsSurfaceRenderer", e18, "updateTexImage error", new java.lang.Object[0]);
        }
        if (this.f330955k) {
            this.f330955k = false;
        } else {
            super.onDrawFrame(gl10);
        }
    }

    public /* synthetic */ e(int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, (i19 & 2) != 0 ? 2 : i18);
    }
}
