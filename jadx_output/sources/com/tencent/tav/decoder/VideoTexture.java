package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class VideoTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "VideoTexture";
    private com.tencent.tav.decoder.Filter copyFilter;
    private com.tencent.tav.decoder.VideoCropInfo cropInfo;
    private boolean frameAvailable;
    private final java.lang.Object frameSyncObject;
    private int preferRotation;
    private boolean quitFlag;
    private com.tencent.tav.decoder.RenderContext renderContext;
    private android.os.HandlerThread renderThread;
    private android.graphics.SurfaceTexture surfaceTexture;
    private int surfaceTextureRotation;
    private final float[] surfaceTextureTransform;
    private com.tencent.tav.coremedia.TextureInfo textureInfo;
    private android.graphics.Matrix textureMatrix;
    private int textureType;

    public VideoTexture(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        this.frameSyncObject = new java.lang.Object();
        this.quitFlag = false;
        float[] fArr = new float[16];
        this.surfaceTextureTransform = fArr;
        this.surfaceTextureRotation = 0;
        this.preferRotation = 0;
        this.textureInfo = textureInfo;
        initSurfaceTexture(textureInfo.textureID);
        this.surfaceTexture.getTransformMatrix(fArr);
        this.preferRotation = 0;
    }

    private android.graphics.Matrix getTextureMatrix(android.graphics.SurfaceTexture surfaceTexture, int i17) {
        surfaceTexture.getTransformMatrix(this.surfaceTextureTransform);
        float[] fArr = this.surfaceTextureTransform;
        float f17 = fArr[0];
        float f18 = fArr[4];
        float f19 = fArr[12];
        float f27 = fArr[1];
        float f28 = fArr[5];
        float f29 = fArr[13];
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (i17 != 0) {
            com.tencent.tav.decoder.DecoderUtils.getRotationMatrix(matrix2, i17, 1.0f, 1.0f);
        }
        if (((int) f17) == f17 && ((int) f27) == f27 && ((int) f18) == f18 && ((int) f28) == f28) {
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            if (i17 != 0) {
                matrix.preConcat(matrix2);
            }
        } else {
            matrix.setValues(new float[]{f17, f18, f19, f27, f28, f29, 0.0f, 0.0f, 1.0f});
        }
        if (i17 != 0) {
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            matrix2.invert(matrix3);
            matrix.postConcat(matrix3);
        }
        return matrix;
    }

    private void initSurfaceTexture(int i17) {
        this.surfaceTexture = new android.graphics.SurfaceTexture(i17);
        this.surfaceTexture.setOnFrameAvailableListener(this, this.renderThread != null ? new android.os.Handler(this.renderThread.getLooper()) : new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    private boolean isIdentity() {
        android.graphics.Matrix matrix = this.textureMatrix;
        return matrix == null || matrix.isIdentity();
    }

    private boolean isOES() {
        return this.textureType == 36197;
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
        java.lang.Class<?>[] clsArr = {android.graphics.SurfaceTexture.class, android.os.Looper.class};
        try {
            android.os.HandlerThread handlerThread = this.renderThread;
            java.lang.Object newInstance = cls.getConstructor(clsArr).newInstance(this.surfaceTexture, handlerThread != null ? handlerThread.getLooper() : android.os.Looper.getMainLooper());
            java.lang.reflect.Field declaredField = this.surfaceTexture.getClass().getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            declaredField.set(this.surfaceTexture, newInstance);
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "reflectLooper", e17);
        }
    }

    private void releaseFilter() {
        com.tencent.tav.decoder.Filter filter = this.copyFilter;
        if (filter != null) {
            filter.release();
        }
    }

    private void releaseTextureInfo() {
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null) {
            textureInfo.release();
            this.textureInfo = null;
        }
    }

    public boolean awaitNewImage() {
        return awaitNewImage(3000L);
    }

    public com.tencent.tav.coremedia.TextureInfo copyTexture() {
        if (this.copyFilter == null) {
            com.tencent.tav.decoder.Filter filter = new com.tencent.tav.decoder.Filter();
            this.copyFilter = filter;
            filter.setRendererWidth(this.renderContext.width());
            this.copyFilter.setRendererHeight(this.renderContext.height());
            this.copyFilter.setRenderForScreen(false);
        }
        com.tencent.tav.decoder.Filter filter2 = this.copyFilter;
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        return filter2.applyFilter(textureInfo, null, textureInfo.getTextureMatrix());
    }

    public com.tencent.tav.decoder.VideoCropInfo getCropInfo() {
        return this.cropInfo;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public com.tencent.tav.decoder.RenderContext getRenderContext() {
        return this.renderContext;
    }

    public int getSurfaceTextureRotation() {
        return this.surfaceTextureRotation;
    }

    public float[] getSurfaceTextureTransform() {
        return this.surfaceTextureTransform;
    }

    public com.tencent.tav.coremedia.TextureInfo getTextureInfo() {
        return this.textureInfo;
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

    public void quitIfWaiting() {
        synchronized (this.frameSyncObject) {
            this.quitFlag = true;
            this.frameSyncObject.notifyAll();
        }
    }

    public void release() {
        releaseTextureInfo();
        releaseSurfaceTexture();
        releaseFilter();
    }

    public void releaseSurfaceTexture() {
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.surfaceTexture = null;
        }
    }

    public void setCropInfo(com.tencent.tav.decoder.VideoCropInfo videoCropInfo) {
        this.cropInfo = videoCropInfo;
        if (videoCropInfo == null || videoCropInfo.width <= 0 || videoCropInfo.height <= 0) {
            return;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        int i17 = textureInfo.textureID;
        int i18 = textureInfo.textureType;
        int i19 = videoCropInfo.width;
        int i27 = videoCropInfo.height;
        android.graphics.Matrix textureMatrix = textureInfo.getTextureMatrix();
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = this.textureInfo;
        this.textureInfo = new com.tencent.tav.coremedia.TextureInfo(i17, i18, i19, i27, textureMatrix, textureInfo2.preferRotation, textureInfo2.surfaceTextureTransform);
    }

    public void setRenderContext(com.tencent.tav.decoder.RenderContext renderContext) {
        this.renderContext = renderContext;
    }

    public void setSurfaceTextureRotation(int i17) {
        this.surfaceTextureRotation = i17;
    }

    public android.graphics.SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public android.graphics.Matrix surfaceTextureMatrix() {
        if (isIdentity() && isOES()) {
            this.textureMatrix = getTextureMatrix(this.surfaceTexture, this.preferRotation);
        }
        return this.textureMatrix;
    }

    public boolean awaitNewImage(long j17) {
        int ceil = (int) java.lang.Math.ceil((((float) j17) * 1.0f) / 50.0f);
        synchronized (this.frameSyncObject) {
            while (!this.frameAvailable && !this.quitFlag && ceil > 0) {
                ceil--;
                try {
                    this.frameSyncObject.wait(50L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            this.frameAvailable = false;
            if (ceil == 0) {
                return false;
            }
            if (this.quitFlag) {
                this.quitFlag = false;
                return false;
            }
            com.tencent.tav.decoder.RenderContext.checkEglError("before updateTexImage");
            this.surfaceTexture.updateTexImage();
            this.textureInfo.setTextureMatrix(getTextureMatrix(this.surfaceTexture, this.preferRotation));
            this.textureInfo.setSurfaceTextureTransform(this.surfaceTextureTransform);
            this.textureInfo.setSurfaceTextureRotation(this.surfaceTextureRotation);
            com.tencent.tav.decoder.VideoCropInfo videoCropInfo = this.cropInfo;
            if (videoCropInfo == null) {
                return true;
            }
            if (videoCropInfo.cropRight - videoCropInfo.cropLeft == videoCropInfo.width && videoCropInfo.cropBottom - videoCropInfo.cropTop == videoCropInfo.height) {
                return true;
            }
            com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
            com.tencent.tav.decoder.VideoCropInfo videoCropInfo2 = this.cropInfo;
            textureInfo.setTextureRect(new android.graphics.Rect(videoCropInfo2.cropLeft, videoCropInfo2.cropTop, videoCropInfo2.cropRight, videoCropInfo2.cropBottom));
            return true;
        }
    }

    public VideoTexture(int i17, int i18) {
        this(i17, i18, 36197, 0, null);
    }

    public VideoTexture(int i17, int i18, int i19, int i27, android.os.HandlerThread handlerThread) {
        this(i17, i18, i19, i27, com.tencent.tav.decoder.RenderContext.createTexture(i19), handlerThread);
    }

    public VideoTexture(int i17, int i18, int i19, int i27, int i28, android.os.HandlerThread handlerThread) {
        this.frameSyncObject = new java.lang.Object();
        this.quitFlag = false;
        this.surfaceTextureTransform = new float[16];
        this.surfaceTextureRotation = 0;
        this.preferRotation = 0;
        this.textureType = i19;
        this.renderThread = handlerThread;
        initSurfaceTexture(i28);
        this.textureInfo = new com.tencent.tav.coremedia.TextureInfo(i28, i19, i17, i18, null, i27);
        this.preferRotation = i27;
    }
}
