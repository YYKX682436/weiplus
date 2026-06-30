package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class RenderContext implements com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final java.lang.String TAG = "RenderContext";
    private android.opengl.EGLContext _eglContext;
    private java.util.HashMap<android.view.Surface, java.lang.String> activeSurfaceCache;
    private android.opengl.EGLConfig eglConfig;
    private android.opengl.EGLDisplay eglDisplay;
    private android.opengl.EGLSurface eglSurface;
    private java.util.HashMap<java.lang.String, android.view.Surface> freeSurfaceCache;
    private com.tencent.tav.coremedia.CGRect glViewportRect;
    private int height;
    private boolean isSharedContext;
    private boolean pBufferEnable;
    private com.tencent.tav.decoder.RenderContextParams params;
    private volatile boolean released;
    private java.util.List<android.view.Surface> releasingSurfaceCache;
    private android.view.Surface surface;
    private android.os.HandlerThread textureProcessThread;
    private long threadId;
    private java.util.HashMap<android.view.Surface, com.tencent.tav.decoder.VideoTexture> videoTextureMap;
    private int width;

    public RenderContext(int i17, int i18) {
        this(i17, i18, null);
    }

    public static boolean checkEglActionSuccess(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            com.tencent.tav.decoder.logger.Logger.e(TAG, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            sb6.append(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            new java.lang.RuntimeException("EGL error encountered (see log): " + sb6.toString());
        }
        return !z17;
    }

    public static void checkEglError(java.lang.String str) {
        checkEglActionSuccess(str);
    }

    private void checkThread() {
        if (this.threadId != java.lang.Thread.currentThread().getId()) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.threadId + ", Thread.currentThread() name = " + java.lang.Thread.currentThread().getName(), new java.lang.RuntimeException());
        }
    }

    private void createEGLSurface() {
        if (this.textureProcessThread == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RenderContext_TextureRenderThread");
            this.textureProcessThread = handlerThread;
            handlerThread.start();
        }
        android.opengl.EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            android.opengl.EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        android.view.Surface surface = this.surface;
        if (surface == null) {
            this.eglSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, this.width, 12374, this.height, 12344}, 0);
        } else {
            this.eglSurface = android.opengl.EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surface, new int[]{12344}, 0);
        }
    }

    public static int createTexture(int i17) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i18 = iArr[0];
        android.opengl.GLES20.glBindTexture(i17, i18);
        checkEglError("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(i17, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(i17, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(i17, 10243, 33071);
        checkEglError("glTexParameter");
        return i18;
    }

    private synchronized void eglSetup(android.opengl.EGLContext eGLContext) {
        android.opengl.EGLDisplay eglGetDisplay;
        this.threadId = java.lang.Thread.currentThread().getId();
        if (this.released) {
            return;
        }
        try {
            eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            this.eglDisplay = eglGetDisplay;
        } catch (java.lang.Error | java.lang.Exception unused) {
        }
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            new java.lang.RuntimeException("unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.eglDisplay = null;
            new java.lang.RuntimeException("unable to initialize EGL14");
            return;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            return;
        }
        int[] iArr2 = {12440, 2, 12344};
        if (eGLContext != null) {
            this.isSharedContext = true;
            this._eglContext = android.opengl.EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], eGLContext, iArr2, 0);
            checkEglError("eglCreateContext");
            if (this._eglContext == null) {
                new java.lang.RuntimeException("null context");
                return;
            }
        } else {
            this._eglContext = android.opengl.EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, iArr2, 0);
            checkEglError("eglCreateContext");
            if (this._eglContext == null) {
                new java.lang.RuntimeException("null context");
                return;
            }
        }
        this.eglConfig = eGLConfigArr[0];
        createEGLSurface();
        if (checkEglActionSuccess("eglCreateWindowSurface")) {
            this.pBufferEnable = true;
        }
        if (this.eglSurface == null) {
            new java.lang.RuntimeException("surface was null");
        }
    }

    private synchronized int loadShader(int i17, java.lang.String str) {
        int i18 = 0;
        if (this.released) {
            return 0;
        }
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        checkEglError("glCreateShader type=" + i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "Could not compile shader " + i17 + ":");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
            sb6.append(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
            android.opengl.GLES20.glDeleteShader(glCreateShader);
        } else {
            i18 = glCreateShader;
        }
        return i18;
    }

    private synchronized void release(android.view.Surface surface) {
        checkThread();
        if (surface == null) {
            return;
        }
        if (this.videoTextureMap.containsKey(surface)) {
            this.videoTextureMap.remove(surface).release();
        }
        surface.release();
    }

    private void releaseReleadingSurface() {
        checkThread();
        for (int i17 = 0; i17 < this.releasingSurfaceCache.size(); i17++) {
            release(this.releasingSurfaceCache.remove(i17));
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator
    public synchronized android.view.Surface createOutputSurface(int i17, int i18, int i19) {
        android.view.Surface remove;
        if (this.released) {
            return null;
        }
        checkThread();
        releaseReleadingSurface();
        java.lang.String str = i17 + "*" + i18 + "-" + i19;
        if (this.freeSurfaceCache.containsKey(str) && (remove = this.freeSurfaceCache.remove(str)) != null) {
            this.activeSurfaceCache.put(remove, str);
            return remove;
        }
        makeCurrent();
        com.tencent.tav.decoder.VideoTexture videoTexture = new com.tencent.tav.decoder.VideoTexture(i17, i18, 36197, i19, this.textureProcessThread);
        videoTexture.setRenderContext(this);
        android.view.Surface surface = new android.view.Surface(videoTexture.surfaceTexture());
        this.videoTextureMap.put(surface, videoTexture);
        this.activeSurfaceCache.put(surface, str);
        return surface;
    }

    public android.opengl.EGLContext eglContext() {
        return this._eglContext;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator
    public synchronized void free(android.view.Surface surface) {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "free " + java.lang.Thread.currentThread().getId());
        if (surface == null) {
            return;
        }
        java.lang.String remove = this.activeSurfaceCache.remove(surface);
        if (!android.text.TextUtils.isEmpty(remove)) {
            this.freeSurfaceCache.containsKey(remove);
        }
        this.releasingSurfaceCache.add(surface);
    }

    public long getEglSurfaceHandle() {
        android.opengl.EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != null) {
            return eGLSurface.getNativeHandle();
        }
        return 0L;
    }

    public com.tencent.tav.coremedia.CGRect getGlViewportRect() {
        return this.glViewportRect;
    }

    public com.tencent.tav.decoder.RenderContextParams getParams() {
        return this.params;
    }

    public int height() {
        return this.height;
    }

    public boolean isPBufferEnable() {
        return this.pBufferEnable;
    }

    public synchronized void makeCurrent() {
        makeCurrent(false);
    }

    public void setHeight(int i17) {
        this.height = i17;
    }

    public void setParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.params = renderContextParams;
    }

    public synchronized void setPresentationTime(long j17) {
        if (this.released) {
            return;
        }
        if (this.surface != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j17 * 1000);
        }
    }

    public void setSurface(android.view.Surface surface) {
        this.surface = surface;
        createEGLSurface();
        makeCurrent();
    }

    public void setWidth(int i17) {
        this.width = i17;
    }

    public synchronized boolean swapBuffers() {
        checkThread();
        if (this.released) {
            return false;
        }
        return android.opengl.EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
    }

    public java.lang.String toString() {
        return "RenderContext{_eglContext=" + this._eglContext + ", isSharedContext=" + this.isSharedContext + ", released=" + this.released + '}';
    }

    public void updateViewport(com.tencent.tav.coremedia.CGRect cGRect) {
        android.graphics.PointF pointF;
        com.tencent.tav.coremedia.CGSize cGSize;
        if (cGRect == null || (pointF = cGRect.origin) == null || (cGSize = cGRect.size) == null) {
            return;
        }
        this.glViewportRect = cGRect;
        updateViewport((int) pointF.x, (int) pointF.y, (int) cGSize.width, (int) cGSize.height);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator
    public synchronized com.tencent.tav.decoder.VideoTexture videoTextureForSurface(android.view.Surface surface) {
        return this.videoTextureMap.get(surface);
    }

    public int width() {
        return this.width;
    }

    public RenderContext(int i17, int i18, android.view.Surface surface) {
        this(i17, i18, surface, null);
    }

    public RenderContext(int i17, int i18, android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        this.eglSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        this.isSharedContext = false;
        this.released = false;
        this.threadId = -1L;
        this.pBufferEnable = false;
        this.videoTextureMap = new java.util.HashMap<>();
        this.activeSurfaceCache = new java.util.HashMap<>();
        this.freeSurfaceCache = new java.util.HashMap<>();
        this.releasingSurfaceCache = new java.util.ArrayList();
        this.surface = surface;
        this.width = i17;
        this.height = i18;
        eglSetup(eGLContext);
        makeCurrent();
    }

    public synchronized void makeCurrent(boolean z17) {
        checkThread();
        if (this.released) {
            return;
        }
        android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
        android.opengl.EGLSurface eGLSurface = this.eglSurface;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this._eglContext)) {
            checkEglError("eglMakeCurrent failed");
            if (z17) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed");
            }
        }
    }

    public void updateViewport(int i17, int i18, int i19, int i27) {
        makeCurrent();
        android.opengl.GLES20.glViewport(i17, i18, i19, i27);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator
    public synchronized void release() {
        checkThread();
        if (this.released) {
            return;
        }
        makeCurrent();
        this.released = true;
        releaseReleadingSurface();
        java.util.Iterator<android.view.Surface> it = this.videoTextureMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        java.util.Iterator<com.tencent.tav.decoder.VideoTexture> it6 = this.videoTextureMap.values().iterator();
        while (it6.hasNext()) {
            it6.next().release();
        }
        this.videoTextureMap.clear();
        try {
            if (android.opengl.EGL14.eglGetCurrentContext().equals(this._eglContext)) {
                android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            if (!this.isSharedContext) {
                android.opengl.EGL14.eglDestroyContext(this.eglDisplay, this._eglContext);
            }
        } catch (java.lang.Error e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "release", e17);
        } catch (java.lang.Exception e18) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "release", e18);
        }
        android.os.HandlerThread handlerThread = this.textureProcessThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.eglDisplay = null;
        this._eglContext = null;
        this.eglSurface = null;
        this.surface = null;
    }
}
