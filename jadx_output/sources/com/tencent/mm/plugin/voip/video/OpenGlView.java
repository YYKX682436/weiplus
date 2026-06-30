package com.tencent.mm.plugin.voip.video;

/* loaded from: classes13.dex */
public class OpenGlView extends com.tencent.mm.plugin.voip.video.GLTextureView {

    /* renamed from: s, reason: collision with root package name */
    public final int f177079s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f177080t;

    public OpenGlView(android.content.Context context) {
        super(context);
        this.f177079s = 1;
        this.f177079s = com.tencent.mm.plugin.voip.video.OpenGlRender.c();
        f(false, 0, 0);
    }

    @Override // com.tencent.mm.plugin.voip.video.GLTextureView
    public void c(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        super.c(surfaceTexture, i17, i18, i19);
    }

    @Override // com.tencent.mm.plugin.voip.video.GLTextureView
    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("OpenGlView", "surfaceCreated");
        super.d(surfaceTexture);
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = (com.tencent.mm.plugin.voip.video.OpenGlRender) this.f177080t.get();
        com.tencent.mars.xlog.Log.i("OpenGlRender", "%s surfaceCreated", java.lang.Integer.valueOf(openGlRender.hashCode()));
        com.tencent.mm.plugin.voip.video.OpenGlRender.c();
        openGlRender.f177053a = true;
    }

    @Override // com.tencent.mm.plugin.voip.video.GLTextureView
    public void e(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.voip.video.OpenGlView openGlView;
        com.tencent.mars.xlog.Log.i("OpenGlView", "surfaceDestroyed");
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = (com.tencent.mm.plugin.voip.video.OpenGlRender) this.f177080t.get();
        com.tencent.mars.xlog.Log.i("OpenGlRender", "onSurfaceDestroyed,mRenderMode:%d", java.lang.Integer.valueOf(openGlRender.f177058f));
        if (openGlRender.f177064l != null) {
            openGlRender.f177078z = true;
            com.tencent.mars.xlog.Log.i("OpenGlRender", "surfaceDestroy call detachGLContext");
            openGlRender.b(false);
        }
        openGlRender.f177053a = false;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "steve: after Uninit in onSurfaceDestroyed");
        openGlRender.f177055c = 0;
        openGlRender.f177056d = 0;
        java.lang.ref.WeakReference weakReference = openGlRender.f177057e;
        if (weakReference != null && (openGlView = (com.tencent.mm.plugin.voip.video.OpenGlView) weakReference.get()) != null) {
            com.tencent.mars.xlog.Log.i("OpenGlRender", "onSurfaceDestroyed queue release renderer event");
            openGlView.b(new wq4.v(openGlRender));
        }
        super.e(surfaceTexture);
    }

    public final void f(boolean z17, int i17, int i18) {
        if (this.f177079s == 2) {
            setEGLContextFactory(new wq4.b());
            setEGLConfigChooser(new wq4.a(5, 6, 5, 0, 0, 0));
        }
    }

    public void setRenderer(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
        this.f177080t = new java.lang.ref.WeakReference(openGlRender);
        super.setRenderer((wq4.q) openGlRender);
        setRenderMode(0);
    }

    public OpenGlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177079s = 1;
        this.f177079s = com.tencent.mm.plugin.voip.video.OpenGlRender.c();
        f(false, 0, 0);
    }
}
