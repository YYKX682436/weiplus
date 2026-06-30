package com.tencent.mm.plugin.mmsight.ui.cameraglview;

/* loaded from: classes14.dex */
public class MMSightCameraGLSurfaceView extends android.opengl.GLSurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public hi3.c f149302d;

    /* renamed from: e, reason: collision with root package name */
    public int f149303e;

    /* renamed from: f, reason: collision with root package name */
    public int f149304f;

    /* renamed from: g, reason: collision with root package name */
    public int f149305g;

    public MMSightCameraGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149302d = null;
        getHolder().addCallback(this);
        try {
            try {
                try {
                    getHolder().setType(2);
                } catch (java.lang.Exception unused) {
                    getHolder().setType(0);
                }
            } catch (java.lang.Exception unused2) {
            }
        } catch (java.lang.Exception unused3) {
            getHolder().setType(1);
        }
        setEGLContextFactory(new hi3.e(this));
        setEGLConfigChooser(new hi3.d(this, 5, 6, 5, 0, 0, 0));
        hi3.c cVar = new hi3.c();
        this.f149302d = cVar;
        setRenderer(cVar);
        setRenderMode(0);
    }

    public int getFrameHeight() {
        return this.f149304f;
    }

    public int getFrameRotate() {
        return this.f149305g;
    }

    public int getFrameWidth() {
        return this.f149303e;
    }

    public hi3.c getRenderer() {
        return this.f149302d;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", surfaceHolder, this, java.lang.Integer.valueOf(getId()));
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", surfaceHolder, this);
    }
}
