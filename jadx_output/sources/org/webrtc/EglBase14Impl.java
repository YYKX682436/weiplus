package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class EglBase14Impl implements org.webrtc.EglBase14 {
    private static final int CURRENT_SDK_VERSION = android.os.Build.VERSION.SDK_INT;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final java.lang.String TAG = "EglBase14Impl";
    private android.opengl.EGLConfig eglConfig;
    private android.opengl.EGLContext eglContext;
    private android.opengl.EGLDisplay eglDisplay;
    private android.opengl.EGLSurface eglSurface = android.opengl.EGL14.EGL_NO_SURFACE;

    /* loaded from: classes14.dex */
    public static class Context implements org.webrtc.EglBase14.Context {
        private final android.opengl.EGLContext egl14Context;

        public Context(android.opengl.EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            return org.webrtc.EglBase14Impl.CURRENT_SDK_VERSION >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }

        @Override // org.webrtc.EglBase14.Context
        public android.opengl.EGLContext getRawContext() {
            return this.egl14Context;
        }
    }

    public EglBase14Impl(android.opengl.EGLContext eGLContext, int[] iArr) {
        android.opengl.EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(eglDisplay, iArr);
        int openGlesVersionFromConfig = org.webrtc.EglBase.EglBaseStatic.getOpenGlesVersionFromConfig(iArr);
        org.webrtc.Logging.d(TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
        this.eglContext = createEglContext(eGLContext, this.eglDisplay, this.eglConfig, openGlesVersionFromConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == android.opengl.EGL14.EGL_NO_DISPLAY || this.eglContext == android.opengl.EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new java.lang.RuntimeException("This object has been released");
        }
    }

    private static android.opengl.EGLContext createEglContext(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i17) {
        android.opengl.EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, i17, 12344};
        if (eGLContext == null) {
            eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        }
        synchronized (org.webrtc.EglBase.lock) {
            eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != android.opengl.EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new java.lang.RuntimeException("Failed to create EGL context: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    private void createSurfaceInternal(java.lang.Object obj) {
        if (!(obj instanceof android.view.Surface) && !(obj instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create window surface: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay eGLDisplay, int[] iArr) {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new java.lang.RuntimeException("eglChooseConfig failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new java.lang.RuntimeException("Unable to find any matching EGL config");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.RuntimeException("eglChooseConfig returned null");
    }

    private static android.opengl.EGLDisplay getEglDisplay() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL14 display: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new java.lang.RuntimeException("Unable to initialize EGL14: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    public static boolean isEGL14Supported() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SDK version: ");
        int i17 = CURRENT_SDK_VERSION;
        sb6.append(i17);
        sb6.append(". isEGL14Supported: ");
        sb6.append(i17 >= 18);
        org.webrtc.Logging.d(TAG, sb6.toString());
        return i17 >= 18;
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i17, int i18) {
        checkIsNotReleased();
        if (this.eglSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i17, 12374, i18, 12344}, 0);
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create pixel buffer surface with size " + i17 + "x" + i18 + ": 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.view.Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        synchronized (org.webrtc.EglBase.lock) {
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                throw new java.lang.RuntimeException("eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != android.opengl.EGL14.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == android.opengl.EGL14.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (org.webrtc.EglBase.lock) {
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            android.opengl.EGLSurface eGLSurface = this.eglSurface;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        synchronized (org.webrtc.EglBase.lock) {
            android.opengl.EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        }
        android.opengl.EGL14.eglReleaseThread();
        android.opengl.EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        android.opengl.EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            android.opengl.EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            synchronized (org.webrtc.EglBase.lock) {
                android.opengl.EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new java.lang.RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.graphics.SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public org.webrtc.EglBase14Impl.Context getEglBaseContext() {
        return new org.webrtc.EglBase14Impl.Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j17) {
        checkIsNotReleased();
        if (this.eglSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            synchronized (org.webrtc.EglBase.lock) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j17);
                android.opengl.EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new java.lang.RuntimeException("No EGLSurface - can't swap buffers");
    }
}
