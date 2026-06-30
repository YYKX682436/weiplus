package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagSurface {
    long nativeSurface;
    private android.view.Surface surface = null;
    private boolean needsReleaseSurface = false;
    private int textureID = 0;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    private RfxPagSurface(long j17) {
        this.nativeSurface = j17;
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromSurface(android.view.Surface surface) {
        return FromSurface(surface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        return FromSurfaceTexture(surfaceTexture, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromTexture(int i17, int i18, int i19) {
        return FromTexture(i17, i18, i19, false);
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromTextureForAsyncThread(int i17, int i18, int i19) {
        return FromTextureForAsyncThread(i17, i18, i19, false);
    }

    public static com.tencent.mm.rfx.RfxPagSurface MakeOffscreen(int i17, int i18) {
        long SetupOffscreen = SetupOffscreen(i17, i18);
        if (SetupOffscreen == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagSurface(SetupOffscreen);
    }

    private static native long SetupFromSurfaceWithGLContext(android.view.Surface surface, long j17);

    public static native long SetupFromTexture(int i17, int i18, int i19, boolean z17, boolean z18);

    private static native long SetupOffscreen(int i17, int i18);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public void finalize() {
        nativeFinalize();
    }

    public native void freeCache();

    public native int height();

    public void release() {
        android.view.Surface surface;
        if (this.needsReleaseSurface && (surface = this.surface) != null) {
            surface.release();
        }
        nativeRelease();
    }

    public native void updateSize();

    public native int width();

    public static com.tencent.mm.rfx.RfxPagSurface FromSurface(android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        if (surface == null) {
            return null;
        }
        long SetupFromSurfaceWithGLContext = SetupFromSurfaceWithGLContext(surface, (eGLContext == null || eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) ? 0L : eGLContext.getNativeHandle());
        if (SetupFromSurfaceWithGLContext == 0) {
            return null;
        }
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = new com.tencent.mm.rfx.RfxPagSurface(SetupFromSurfaceWithGLContext);
        rfxPagSurface.surface = surface;
        return rfxPagSurface;
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture, android.opengl.EGLContext eGLContext) {
        if (surfaceTexture == null) {
            return null;
        }
        com.tencent.mm.rfx.RfxPagSurface FromSurface = FromSurface(new android.view.Surface(surfaceTexture), eGLContext);
        if (FromSurface != null) {
            FromSurface.needsReleaseSurface = true;
        }
        return FromSurface;
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromTexture(int i17, int i18, int i19, boolean z17) {
        long SetupFromTexture = SetupFromTexture(i17, i18, i19, z17, false);
        if (SetupFromTexture == 0) {
            return null;
        }
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = new com.tencent.mm.rfx.RfxPagSurface(SetupFromTexture);
        rfxPagSurface.textureID = i17;
        return rfxPagSurface;
    }

    public static com.tencent.mm.rfx.RfxPagSurface FromTextureForAsyncThread(int i17, int i18, int i19, boolean z17) {
        long SetupFromTexture = SetupFromTexture(i17, i18, i19, z17, true);
        if (SetupFromTexture == 0) {
            return null;
        }
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = new com.tencent.mm.rfx.RfxPagSurface(SetupFromTexture);
        rfxPagSurface.textureID = i17;
        return rfxPagSurface;
    }
}
