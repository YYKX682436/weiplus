package com.tencent.thumbplayer.tmediacodec.preload.glrender;

/* loaded from: classes14.dex */
public class OutputSurface implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    static final int EGL_OPENGL_ES2_BIT = 4;
    static final java.lang.String TAG = "OutputSurface";
    static final boolean VERBOSE = false;
    javax.microedition.khronos.egl.EGL10 mEGL;
    javax.microedition.khronos.egl.EGLContext mEGLContext;
    javax.microedition.khronos.egl.EGLDisplay mEGLDisplay;
    javax.microedition.khronos.egl.EGLSurface mEGLSurface;
    boolean mFrameAvailable;
    java.lang.Object mFrameSyncObject = new java.lang.Object();
    android.view.Surface mSurface;
    com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture mSurfaceTexture;
    com.tencent.thumbplayer.tmediacodec.preload.glrender.TextureRender mTextureRender;

    public OutputSurface(int i17, int i18) {
        if (i17 > 0 && i18 > 0) {
            eglSetup(i17, i18);
            makeCurrent();
            setup();
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(5000L);
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
                if (!this.mFrameAvailable) {
                    throw new java.lang.RuntimeException("Surface frame wait timed out");
                    break;
                }
            }
            this.mFrameAvailable = false;
        }
        this.mTextureRender.checkGlError("before updateTexImage");
        this.mSurfaceTexture.updateTexImage();
    }

    public void changeFragmentShader(java.lang.String str) {
        this.mTextureRender.changeFragmentShader(str);
    }

    public void checkEglError(java.lang.String str) {
        boolean z17 = false;
        while (true) {
            int eglGetError = this.mEGL.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            java.lang.Integer.toHexString(eglGetError);
            z17 = true;
        }
        if (z17) {
            throw new java.lang.RuntimeException("EGL error encountered (see log)");
        }
    }

    public void drawImage() {
        this.mTextureRender.drawFrame(this.mSurfaceTexture);
    }

    public void eglSetup(int i17, int i18) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.mEGL = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.mEGLDisplay = eglGetDisplay;
        if (!this.mEGL.eglInitialize(eglGetDisplay, null)) {
            throw new java.lang.RuntimeException("unable to initialize EGL10");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        if (!this.mEGL.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
            throw new java.lang.RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        checkEglError("eglCreateContext");
        if (this.mEGLContext == null) {
            throw new java.lang.RuntimeException("null context");
        }
        this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigArr[0], new int[]{12375, i17, 12374, i18, 12344});
        checkEglError("eglCreatePbufferSurface");
        if (this.mEGLSurface == null) {
            throw new java.lang.RuntimeException("surface was null");
        }
    }

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    public void makeCurrent() {
        if (this.mEGL == null) {
            throw new java.lang.RuntimeException("not configured for makeCurrent");
        }
        checkEglError("before makeCurrent");
        javax.microedition.khronos.egl.EGL10 egl10 = this.mEGL;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.mEGLDisplay;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.mEGLSurface;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new java.lang.RuntimeException("eglMakeCurrent failed");
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new java.lang.RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    public void release() {
        javax.microedition.khronos.egl.EGL10 egl10 = this.mEGL;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.mEGLContext)) {
                javax.microedition.khronos.egl.EGL10 egl102 = this.mEGL;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.mEGLDisplay;
                javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            }
            this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        }
        this.mSurface.release();
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mEGL = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }

    public void setup() {
        com.tencent.thumbplayer.tmediacodec.preload.glrender.TextureRender textureRender = new com.tencent.thumbplayer.tmediacodec.preload.glrender.TextureRender();
        this.mTextureRender = textureRender;
        textureRender.surfaceCreated();
        com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture preloadSurfaceTexture = new com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture(this.mTextureRender.getTextureId());
        this.mSurfaceTexture = preloadSurfaceTexture;
        preloadSurfaceTexture.setActionCallback(new com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture.ActionCallback() { // from class: com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.1
            @Override // com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture.ActionCallback
            public void onReleased() {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.TAG, "mSurfaceTexture:" + com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.this.mSurfaceTexture + " onReleased, release OutputSurface");
                com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface.this.release();
            }
        });
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new com.tencent.thumbplayer.tmediacodec.hook.PreloadSurface(this.mSurfaceTexture);
    }

    public OutputSurface() {
        setup();
    }
}
