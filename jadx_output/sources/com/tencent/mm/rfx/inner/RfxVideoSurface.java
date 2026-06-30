package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class RfxVideoSurface implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static int HandlerThreadCount;
    private static final java.lang.Object handlerLock = new java.lang.Object();
    private static android.os.HandlerThread handlerThread;
    private android.view.Surface outputSurface;
    private android.graphics.SurfaceTexture surfaceTexture;
    private int width = 0;
    private int height = 0;
    private final java.lang.Object frameSyncObject = new java.lang.Object();
    private boolean frameAvailable = false;
    private boolean released = false;
    private int retainCount = 1;

    private static com.tencent.mm.rfx.inner.RfxVideoSurface Make(int i17, int i18) {
        com.tencent.mm.rfx.inner.RfxVideoSurface rfxVideoSurface = new com.tencent.mm.rfx.inner.RfxVideoSurface();
        rfxVideoSurface.width = i17;
        rfxVideoSurface.height = i18;
        synchronized (handlerLock) {
            StartHandlerThread();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                rfxVideoSurface.surfaceTexture = new android.graphics.SurfaceTexture(false);
            } else {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
                rfxVideoSurface.surfaceTexture = surfaceTexture;
                surfaceTexture.detachFromGLContext();
            }
            rfxVideoSurface.surfaceTexture.setOnFrameAvailableListener(rfxVideoSurface, new android.os.Handler(handlerThread.getLooper()));
        }
        rfxVideoSurface.outputSurface = new android.view.Surface(rfxVideoSurface.surfaceTexture);
        return rfxVideoSurface;
    }

    private static synchronized void StartHandlerThread() {
        synchronized (com.tencent.mm.rfx.inner.RfxVideoSurface.class) {
            HandlerThreadCount++;
            if (handlerThread == null) {
                android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("rfxpag_VideoSurface");
                handlerThread = handlerThread2;
                handlerThread2.start();
            }
        }
    }

    private boolean attachToGLContext(int i17) {
        try {
            this.surfaceTexture.attachToGLContext(i17);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private void reflectLooper() {
        java.lang.Class<?> cls;
        java.lang.Class<?>[] declaredClasses = android.graphics.SurfaceTexture.class.getDeclaredClasses();
        int length = declaredClasses.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                cls = null;
                break;
            }
            cls = declaredClasses[i17];
            if (cls.getName().toLowerCase().contains("handler")) {
                break;
            } else {
                i17++;
            }
        }
        if (cls == null) {
            return;
        }
        try {
            java.lang.Object newInstance = cls.getConstructor(android.graphics.SurfaceTexture.class, android.os.Looper.class).newInstance(this.surfaceTexture, handlerThread.getLooper());
            java.lang.reflect.Field declaredField = this.surfaceTexture.getClass().getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            declaredField.set(this.surfaceTexture, newInstance);
        } catch (java.lang.Exception unused) {
        }
    }

    private boolean updateTexImage() {
        synchronized (this.frameSyncObject) {
            int i17 = 10;
            while (!this.frameAvailable && i17 > 0) {
                i17--;
                try {
                    this.frameSyncObject.wait(50L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            this.frameAvailable = false;
            if (i17 == 0) {
                return false;
            }
            try {
                this.surfaceTexture.updateTexImage();
                return true;
            } catch (java.lang.Exception unused2) {
                return false;
            }
        }
    }

    private int videoHeight() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        float abs = java.lang.Math.abs(fArr[5]);
        return abs > 0.0f ? java.lang.Math.round(this.height / (abs + ((fArr[13] - abs) * 2.0f))) : this.height;
    }

    private int videoWidth() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        float abs = java.lang.Math.abs(fArr[0]);
        return abs > 0.0f ? java.lang.Math.round(this.width / (abs + (fArr[12] * 2.0f))) : this.width;
    }

    public android.view.Surface getOutputSurface() {
        return this.outputSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.frameSyncObject) {
            if (this.frameAvailable) {
                new java.lang.RuntimeException("frameAvailable already set, frame could be dropped");
            } else {
                this.frameAvailable = true;
                this.frameSyncObject.notifyAll();
            }
        }
    }

    public void release() {
        int i17 = this.retainCount - 1;
        this.retainCount = i17;
        if (this.released || i17 > 0) {
            return;
        }
        this.released = true;
        synchronized (handlerLock) {
            int i18 = HandlerThreadCount - 1;
            HandlerThreadCount = i18;
            if (i18 == 0) {
                handlerThread.quit();
                handlerThread = null;
            }
        }
        android.view.Surface surface = this.outputSurface;
        if (surface != null) {
            surface.release();
            this.outputSurface = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.surfaceTexture = null;
        }
    }

    public void retain() {
        this.retainCount++;
    }
}
