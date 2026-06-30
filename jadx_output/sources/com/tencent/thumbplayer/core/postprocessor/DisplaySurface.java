package com.tencent.thumbplayer.core.postprocessor;

/* loaded from: classes14.dex */
public class DisplaySurface {
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final java.lang.String TAG = "sifeng: DisplaySurface";
    private static final boolean VERBOSE = false;
    private int mCurrentPlayMode = 0;
    private android.opengl.EGLContext mEGLContext;
    private android.opengl.EGLDisplay mEGLDisplay;
    private android.opengl.EGLSurface mEGLSurface;
    public int mHeight;
    private android.view.Surface mSurface;
    private final com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType mType;
    public int mWidth;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_888 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {12445, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {12445, 13632, 12344};

    public DisplaySurface(android.view.Surface surface, com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType) {
        surface.getClass();
        this.mSurface = surface;
        this.mType = tPProcessType;
    }

    private void checkEglError(java.lang.String str) {
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            release();
            throw new java.lang.RuntimeException("EGL error encountered (see log)");
        }
    }

    private android.opengl.EGLConfig getEglConfig() {
        int[] iArr = this.mType == com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_HDR2SDR ? EGL_CONFIG_ATTRIBUTES_RGBA_1010102 : EGL_CONFIG_ATTRIBUTES_RGBA_888;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != null && android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "eglChooseConfig error");
        release();
        throw new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
    }

    public void eglSetup() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "eglGetDisplay error");
            release();
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "eglInitialize error");
            release();
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        this.mEGLContext = android.opengl.EGL14.eglCreateContext(this.mEGLDisplay, getEglConfig(), android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        checkEglError("eglCreateContext");
        if (this.mEGLContext == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "eglCreateContext error");
            release();
            throw new java.lang.RuntimeException("null context");
        }
        switchPlayMode(this.mCurrentPlayMode, this.mSurface);
        if (this.mEGLSurface != null) {
            return;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "eglCreateWindowSurface error");
        release();
        throw new java.lang.RuntimeException("surface was null");
    }

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    public int getmHeight() {
        return this.mHeight;
    }

    public int getmWidth() {
        return this.mWidth;
    }

    public void makeCurrent() {
        android.opengl.EGLSurface eGLSurface = this.mEGLSurface;
        if (eGLSurface == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "mEGLSurface is null");
        } else {
            if (android.opengl.EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
                return;
            }
            checkEglError("makeCurrent");
        }
    }

    public void querySurface() {
        android.opengl.EGLSurface eGLSurface;
        this.mWidth = 0;
        this.mHeight = 0;
        android.opengl.EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay == android.opengl.EGL14.EGL_NO_DISPLAY || (eGLSurface = this.mEGLSurface) == null || eGLDisplay == null) {
            throw new java.lang.RuntimeException("querySurface failed");
        }
        int[] iArr = new int[1];
        if (android.opengl.EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            this.mWidth = iArr[0];
        }
        if (android.opengl.EGL14.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12374, iArr, 0)) {
            this.mHeight = iArr[0];
        }
    }

    public void release() {
        try {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "display surface release");
            if (android.opengl.EGL14.eglGetCurrentContext().equals(this.mEGLContext)) {
                android.opengl.EGLDisplay eGLDisplay = this.mEGLDisplay;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "eglMakeCurrent no surface,ret:" + android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT));
            }
            android.opengl.EGLSurface eGLSurface2 = this.mEGLSurface;
            if (eGLSurface2 != null) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "eglDestroySurface,ret:" + android.opengl.EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface2));
            }
            android.opengl.EGLContext eGLContext = this.mEGLContext;
            if (eGLContext != null) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "eglDestroyContext,ret:" + android.opengl.EGL14.eglDestroyContext(this.mEGLDisplay, eGLContext));
            }
            this.mEGLDisplay = null;
            this.mEGLContext = null;
            this.mEGLSurface = null;
            this.mSurface = null;
        } catch (java.lang.Exception unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "display render release failed!");
        }
    }

    public boolean swapBuffers() {
        return android.opengl.EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    }

    public void switchPlayMode(int i17, android.view.Surface surface) {
        if (this.mCurrentPlayMode == i17 && surface == null) {
            return;
        }
        this.mCurrentPlayMode = i17;
        if (surface != null && surface.isValid()) {
            this.mSurface = surface;
        }
        if (this.mEGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = this.mEGLDisplay;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext);
            android.opengl.EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
        }
        int i18 = this.mCurrentPlayMode;
        if (i18 == 4) {
            this.mEGLSurface = android.opengl.EGL14.eglCreateWindowSurface(this.mEGLDisplay, getEglConfig(), this.mSurface, EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ, 0);
        } else if (i18 != 5) {
            this.mEGLSurface = android.opengl.EGL14.eglCreateWindowSurface(this.mEGLDisplay, getEglConfig(), this.mSurface, new int[]{12344}, 0);
        } else {
            this.mEGLSurface = android.opengl.EGL14.eglCreateWindowSurface(this.mEGLDisplay, getEglConfig(), this.mSurface, EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG, 0);
        }
        checkEglError("eglCreateWindowSurface mode:" + this.mCurrentPlayMode);
    }
}
