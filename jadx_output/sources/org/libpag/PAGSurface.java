package org.libpag;

/* loaded from: classes13.dex */
public class PAGSurface {

    /* renamed from: a, reason: collision with root package name */
    private android.view.Surface f347803a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f347804b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f347805c = 0;
    long nativeSurface;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    private PAGSurface(long j17) {
        this.nativeSurface = j17;
    }

    public static org.libpag.PAGSurface FromSurface(android.view.Surface surface) {
        return FromSurface(surface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    public static org.libpag.PAGSurface FromSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        return FromSurfaceTexture(surfaceTexture, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    public static org.libpag.PAGSurface FromTexture(int i17, int i18, int i19) {
        return FromTexture(i17, i18, i19, false);
    }

    public static org.libpag.PAGSurface FromTextureForAsyncThread(int i17, int i18, int i19) {
        return FromTextureForAsyncThread(i17, i18, i19, false);
    }

    public static org.libpag.PAGSurface MakeOffscreen(int i17, int i18) {
        long SetupOffscreen = SetupOffscreen(i17, i18);
        if (SetupOffscreen == 0) {
            return null;
        }
        return new org.libpag.PAGSurface(SetupOffscreen);
    }

    private static native long SetupFromSurfaceWithGLContext(android.view.Surface surface, long j17);

    public static native long SetupFromTexture(int i17, int i18, int i19, boolean z17, boolean z18);

    private static native long SetupOffscreen(int i17, int i18);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public native boolean clearAll();

    public native boolean copyPixelsTo(android.graphics.Bitmap bitmap);

    public void finalize() {
        nativeFinalize();
    }

    public native void freeCache();

    public native int height();

    public android.graphics.Bitmap makeSnapshot() {
        android.util.Pair a17 = org.libpag.a.a(width(), height(), true);
        if (a17.first == null) {
            return null;
        }
        java.lang.Object obj = a17.second;
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 26) {
            ((android.hardware.HardwareBuffer) obj).close();
        }
        if (copyPixelsTo((android.graphics.Bitmap) a17.first)) {
            return (android.graphics.Bitmap) a17.first;
        }
        return null;
    }

    public void release() {
        android.view.Surface surface;
        freeCache();
        if (this.f347804b && (surface = this.f347803a) != null) {
            surface.release();
        }
        nativeRelease();
    }

    public native void updateSize();

    public native int width();

    public static org.libpag.PAGSurface FromSurface(android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        if (surface == null) {
            return null;
        }
        long SetupFromSurfaceWithGLContext = SetupFromSurfaceWithGLContext(surface, (eGLContext == null || eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) ? 0L : eGLContext.getNativeHandle());
        if (SetupFromSurfaceWithGLContext == 0) {
            return null;
        }
        org.libpag.PAGSurface pAGSurface = new org.libpag.PAGSurface(SetupFromSurfaceWithGLContext);
        pAGSurface.f347803a = surface;
        return pAGSurface;
    }

    public static org.libpag.PAGSurface FromSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture, android.opengl.EGLContext eGLContext) {
        if (surfaceTexture == null) {
            return null;
        }
        org.libpag.PAGSurface FromSurface = FromSurface(new android.view.Surface(surfaceTexture), eGLContext);
        if (FromSurface != null) {
            FromSurface.f347804b = true;
        }
        return FromSurface;
    }

    public static org.libpag.PAGSurface FromTexture(int i17, int i18, int i19, boolean z17) {
        long SetupFromTexture = SetupFromTexture(i17, i18, i19, z17, false);
        if (SetupFromTexture == 0) {
            return null;
        }
        org.libpag.PAGSurface pAGSurface = new org.libpag.PAGSurface(SetupFromTexture);
        pAGSurface.f347805c = i17;
        return pAGSurface;
    }

    public static org.libpag.PAGSurface FromTextureForAsyncThread(int i17, int i18, int i19, boolean z17) {
        long SetupFromTexture = SetupFromTexture(i17, i18, i19, z17, true);
        if (SetupFromTexture == 0) {
            return null;
        }
        org.libpag.PAGSurface pAGSurface = new org.libpag.PAGSurface(SetupFromTexture);
        pAGSurface.f347805c = i17;
        return pAGSurface;
    }
}
