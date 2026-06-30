package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class EglBase10Impl implements org.webrtc.EglBase10 {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final java.lang.String TAG = "EglBase10Impl";
    private final javax.microedition.khronos.egl.EGL10 egl;
    private javax.microedition.khronos.egl.EGLConfig eglConfig;
    private javax.microedition.khronos.egl.EGLContext eglContext;
    private javax.microedition.khronos.egl.EGLDisplay eglDisplay;
    private javax.microedition.khronos.egl.EGLSurface eglSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* loaded from: classes13.dex */
    public static class Context implements org.webrtc.EglBase10.Context {
        private final javax.microedition.khronos.egl.EGL10 egl;
        private final javax.microedition.khronos.egl.EGLContext eglContext;
        private final javax.microedition.khronos.egl.EGLConfig eglContextConfig;

        public Context(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLContext eGLContext, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglContextConfig = eGLConfig;
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            javax.microedition.khronos.egl.EGLContext eglGetCurrentContext = this.egl.eglGetCurrentContext();
            javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eglGetCurrentDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                eglGetCurrentDisplay = this.egl.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
            try {
                if (eglGetCurrentContext != this.eglContext) {
                    eGLSurface = this.egl.eglCreatePbufferSurface(eglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        throw new java.lang.RuntimeException("Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                return org.webrtc.EglBase10Impl.access$000();
            } finally {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, null);
                }
            }
        }

        @Override // org.webrtc.EglBase10.Context
        public javax.microedition.khronos.egl.EGLContext getRawContext() {
            return this.eglContext;
        }
    }

    public EglBase10Impl(javax.microedition.khronos.egl.EGLContext eGLContext, int[] iArr) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.egl = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(egl10, eglDisplay, iArr);
        int openGlesVersionFromConfig = org.webrtc.EglBase.EglBaseStatic.getOpenGlesVersionFromConfig(iArr);
        org.webrtc.Logging.d(TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
        this.eglContext = createEglContext(eGLContext, this.eglDisplay, this.eglConfig, openGlesVersionFromConfig);
    }

    public static /* synthetic */ long access$000() {
        return nativeGetCurrentNativeEGLContext();
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY || this.eglContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new java.lang.RuntimeException("This object has been released");
        }
    }

    private javax.microedition.khronos.egl.EGLContext createEglContext(javax.microedition.khronos.egl.EGLContext eGLContext, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17) {
        javax.microedition.khronos.egl.EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i17, 12344};
        if (eGLContext == null) {
            eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        synchronized (org.webrtc.EglBase.lock) {
            eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new java.lang.RuntimeException("Failed to create EGL context: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    private void createSurfaceInternal(java.lang.Object obj) {
        if (!(obj instanceof android.view.SurfaceHolder) && !(obj instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create window surface: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    private static javax.microedition.khronos.egl.EGLConfig getEglConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, int[] iArr) {
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new java.lang.RuntimeException("eglChooseConfig failed: 0x" + java.lang.Integer.toHexString(egl10.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new java.lang.RuntimeException("Unable to find any matching EGL config");
        }
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.RuntimeException("eglChooseConfig returned null");
    }

    private javax.microedition.khronos.egl.EGLDisplay getEglDisplay() {
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL10 display: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
        }
        if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        }
        throw new java.lang.RuntimeException("Unable to initialize EGL10: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    private static native long nativeGetCurrentNativeEGLContext();

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i17, int i18) {
        checkIsNotReleased();
        if (this.eglSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("Already has an EGLSurface");
        }
        javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i17, 12374, i18, 12344});
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new java.lang.RuntimeException("Failed to create pixel buffer surface with size " + i17 + "x" + i18 + ": 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.view.Surface surface) {
        createSurfaceInternal(new android.view.SurfaceHolder(surface) { // from class: org.webrtc.EglBase10Impl.1FakeSurfaceHolder
            private final android.view.Surface surface;

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(android.view.SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public android.view.Surface getSurface() {
                return this.surface;
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(android.view.SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i17, int i18) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i17) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z17) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @java.lang.Deprecated
            public void setType(int i17) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            public android.graphics.Canvas lockCanvas(android.graphics.Rect rect) {
                return null;
            }
        });
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        synchronized (org.webrtc.EglBase.lock) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.egl;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.eglDisplay;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT)) {
                throw new java.lang.RuntimeException("eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public org.webrtc.EglBase.Context getEglBaseContext() {
        return new org.webrtc.EglBase10Impl.Context(this.egl, this.eglContext, this.eglConfig);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            throw new java.lang.RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (org.webrtc.EglBase.lock) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.egl;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.eglDisplay;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(this.egl.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            synchronized (org.webrtc.EglBase.lock) {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
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
    public void swapBuffers(long j17) {
        swapBuffers();
    }
}
