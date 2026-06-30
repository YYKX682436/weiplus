package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class ImageDecoder implements com.tencent.tav.decoder.IVideoDecoder {
    public static final com.tencent.tav.coremedia.CGSize IMAGE_DECODE_SIZE = new com.tencent.tav.coremedia.CGSize(720.0f, 1280.0f);
    private static final java.lang.String TAG = "ImageDecoder";
    private byte _hellAccFlag_;
    private android.graphics.Bitmap bitmap;
    private com.tencent.tav.coremedia.CGSize displaySize;
    private java.lang.String sourceImagePath;
    private com.tencent.tav.coremedia.TextureInfo textureInfo;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private int preferRotation = 0;
    private com.tencent.tav.coremedia.CMTime currentDecoderTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
    private com.tencent.tav.coremedia.CMTime frameDuration = new com.tencent.tav.coremedia.CMTime(1, 30);
    private long threadId = -1;

    private void checkThread() {
        long j17 = this.threadId;
        if (j17 == -1 || j17 == java.lang.Thread.currentThread().getId()) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.threadId + ", Thread.currentThread() name = " + java.lang.Thread.currentThread().getName(), new java.lang.RuntimeException());
    }

    private synchronized com.tencent.tav.coremedia.TextureInfo createTexture() {
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null && !textureInfo.isReleased()) {
            return this.textureInfo;
        }
        if (this.bitmap == null) {
            this.bitmap = decodeBitmap(this.sourceImagePath, this.displaySize);
            this.preferRotation = readImagePreferRotation(this.sourceImagePath);
        }
        if (this.bitmap == null) {
            return null;
        }
        this.threadId = java.lang.Thread.currentThread().getId();
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = new com.tencent.tav.coremedia.TextureInfo(com.tencent.tav.decoder.RenderContext.createTexture(3553), 3553, this.bitmap.getWidth(), this.bitmap.getHeight(), getImageTextureMatrix(), this.preferRotation);
        this.textureInfo = textureInfo2;
        android.opengl.GLES20.glBindTexture(3553, textureInfo2.textureID);
        android.opengl.GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        return this.textureInfo;
    }

    private android.graphics.Bitmap decodeBitmap(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = cGSize != null ? (int) (options.outWidth / cGSize.width) : 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1));
        yj0.a.e(obj2, decodeFile, "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile;
    }

    public static com.tencent.tav.coremedia.CGSize getDefaultOutputImageSize(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = (int) (options.outWidth / IMAGE_DECODE_SIZE.width);
        options2.inJustDecodeBounds = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj2, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1)), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i17 = options2.outWidth;
        int i18 = options2.outHeight;
        return readImagePreferRotation(str) % 2 == 1 ? new com.tencent.tav.coremedia.CGSize(i18, i17) : new com.tencent.tav.coremedia.CGSize(i17, i18);
    }

    private android.graphics.Matrix getImageTextureMatrix() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    private static int readImagePreferRotation(java.lang.String str) {
        try {
            int attributeInt = new android.media.ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (java.io.IOException e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "readImagePreferRotation", e17);
            return 0;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public long getPreReadCost() {
        return 0L;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public java.lang.String getSourcePath() {
        return this.sourceImagePath;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.TextureInfo getTextureInfo() {
        return this.textureInfo;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public boolean hasTrack() {
        return this.sourceImagePath != null;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void init(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        this.sourceImagePath = str;
        this.displaySize = cGSize;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public boolean isLastFrameValid() {
        return true;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMTime nextFrameTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return cMTime.add(this.frameDuration);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public java.nio.ByteBuffer outputBuffer() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public android.view.Surface outputSurface() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public com.tencent.tav.coremedia.CMSampleState readSample() {
        return readSample(this.currentDecoderTime.add(this.frameDuration));
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMSampleBuffer readVideoSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleState readSample = readSample(cMTime);
        return (readSample.getStateCode() <= -1 || !isLastFrameValid() || readSample.getExportCode() < 0) ? new com.tencent.tav.coremedia.CMSampleBuffer(readSample) : new com.tencent.tav.coremedia.CMSampleBuffer(readSample, getTextureInfo());
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void release() {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void seekTo(com.tencent.tav.coremedia.CMTime cMTime) {
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder, com.tencent.tav.decoder.IDecoder
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        start(cMTimeRange, com.tencent.tav.coremedia.CMTime.CMTimeZero);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void switchFrame() {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        if (cMTime.bigThan(this.timeRange.getDuration())) {
            return com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
        }
        createTexture();
        return new com.tencent.tav.coremedia.CMSampleState(cMTime);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized void release(boolean z17) {
        checkThread();
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null) {
            textureInfo.release();
            this.textureInfo = null;
        }
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.bitmap.recycle();
            this.bitmap = null;
        }
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime) {
        if (cMTimeRange == null) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.frameDuration);
        } else {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), cMTimeRange.getDuration());
        }
    }
}
