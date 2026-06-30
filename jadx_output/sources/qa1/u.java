package qa1;

/* loaded from: classes7.dex */
public interface u extends et0.r {
    ms0.c getAbsSurfaceRenderer();

    android.opengl.EGLContext getEGLContext();

    int getPreviewTextureId();

    int getSurfaceHeight();

    int getSurfaceWidth();

    boolean isAvailable();

    void setOnSurfaceTextureAvailableDelegate(qa1.t tVar);

    void setOnTextureDrawFinishDelegate(yz5.l lVar);

    void setPreviewRenderer(ms0.c cVar);
}
