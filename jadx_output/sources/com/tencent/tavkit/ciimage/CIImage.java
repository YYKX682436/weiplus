package com.tencent.tavkit.ciimage;

/* loaded from: classes14.dex */
public class CIImage implements java.lang.Cloneable {
    private static android.graphics.Bitmap.Config[] SUPPORT_CONFIGS = {android.graphics.Bitmap.Config.ALPHA_8, android.graphics.Bitmap.Config.RGB_565, android.graphics.Bitmap.Config.ARGB_4444, android.graphics.Bitmap.Config.ARGB_8888};
    private final java.lang.String TAG;
    private byte _hellAccFlag_;
    private float alpha;
    private android.graphics.Bitmap bitmap;
    private com.tencent.tav.coremedia.CGRect frame;
    private boolean isHardMode;
    private final java.util.List<com.tencent.tavkit.ciimage.CIImage> overlayImages;
    private int preferRotation;
    private int rotation;
    private final com.tencent.tav.coremedia.CGSize size;
    private java.lang.String textureCacheKey;
    private com.tencent.tav.coremedia.TextureInfo textureInfo;
    private android.graphics.Matrix transform;

    /* renamed from: com.tencent.tavkit.ciimage.CIImage$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode;

        static {
            int[] iArr = new int[com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.values().length];
            $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode = iArr;
            try {
                iArr[com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode[com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode[com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.scaleToFit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public CIImage(com.tencent.tav.coremedia.CGSize cGSize) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new java.util.ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        com.tencent.tav.decoder.logger.Logger.v(str, "CIImage() called with: renderSize = [" + cGSize + "]");
        this.size = cGSize;
    }

    private void addOverlayImage(com.tencent.tavkit.ciimage.CIImage cIImage) {
        synchronized (this) {
            this.overlayImages.add(cIImage);
        }
    }

    private android.graphics.Bitmap checkBitmapConfig(android.graphics.Bitmap bitmap) {
        return java.util.Arrays.binarySearch(SUPPORT_CONFIGS, bitmap.getConfig()) < 0 ? transcodeBitmap(bitmap) : bitmap;
    }

    private android.graphics.Bitmap decodeBitmap(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = cGSize != null ? (int) (options.outWidth / cGSize.width) : 1;
        options2.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1));
        yj0.a.e(obj2, decodeFile, "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile;
    }

    private android.graphics.Matrix getImageTextureMatrix() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    private android.graphics.Bitmap transcodeBitmap(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/CIImage", "transcodeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tavkit/ciimage/CIImage", "transcodeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void applyFillInFrame(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int i17 = com.tencent.tavkit.ciimage.CIImage.AnonymousClass1.$SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode[tAVVideoConfigurationContentMode.ordinal()];
        if (i17 == 1) {
            matrix.postConcat(com.tencent.tavkit.utils.MathUtils.transformBySourceRectFit(getExtent(), cGRect));
            imageByApplyingTransform(matrix);
            return;
        }
        if (i17 == 2) {
            matrix.postConcat(com.tencent.tavkit.utils.MathUtils.transformBySourceRectFill(getExtent(), cGRect));
            imageByApplyingTransform(matrix);
        } else {
            if (i17 != 3) {
                return;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.postScale(cGRect.size.width / getExtent().size.width, cGRect.size.height / getExtent().size.height);
            matrix.postConcat(matrix2);
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            android.graphics.PointF pointF = cGRect.origin;
            matrix3.postTranslate(pointF.x, pointF.y);
            matrix.postConcat(matrix3);
            imageByApplyingTransform(matrix);
        }
    }

    public void applyFixInSize(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        if (com.tencent.tavkit.utils.Utils.isSizeValid(cGSize)) {
            int i17 = com.tencent.tavkit.ciimage.CIImage.AnonymousClass1.$SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode[tAVVideoConfigurationContentMode.ordinal()];
            com.tencent.tav.coremedia.CGSize sizeFit = i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.tavkit.utils.MathUtils.sizeFit(this.size, cGSize) : com.tencent.tavkit.utils.MathUtils.sizeScale(this.size, cGSize) : com.tencent.tavkit.utils.MathUtils.sizeFill(this.size, cGSize) : com.tencent.tavkit.utils.MathUtils.sizeFit(this.size, cGSize);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float f17 = sizeFit.width;
            com.tencent.tav.coremedia.CGSize cGSize2 = this.size;
            matrix.postScale(f17 / cGSize2.width, sizeFit.height / cGSize2.height);
            imageByApplyingTransform(matrix);
            com.tencent.tav.coremedia.CGSize cGSize3 = this.size;
            cGSize3.height = sizeFit.height;
            cGSize3.width = sizeFit.width;
        }
    }

    public void applyFlip(boolean z17, boolean z18) {
        if (z17 || z18) {
            float f17 = z17 ? -1.0f : 1.0f;
            float f18 = z17 ? this.size.width : 0.0f;
            float f19 = z18 ? -1.0f : 1.0f;
            float f27 = z18 ? this.size.height : 0.0f;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postScale(f17, f19);
            matrix.postTranslate(f18, f27);
            imageByApplyingTransform(matrix);
        }
    }

    public void applyPreferRotation() {
        applyPreferRotation(0);
    }

    @java.lang.Deprecated
    public android.graphics.Bitmap convertToBitmap() {
        return com.tencent.tavkit.ciimage.TAVGLUtils.saveBitmap(this);
    }

    public void draw(com.tencent.tavkit.ciimage.TextureFilter textureFilter) {
        com.tencent.tav.coremedia.TextureInfo drawTextureInfo = getDrawTextureInfo();
        if (drawTextureInfo != null) {
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "draw: with drawTexture = " + drawTextureInfo + ", filter = " + textureFilter);
            textureFilter.applyFilter(drawTextureInfo, this.transform, drawTextureInfo.getTextureMatrix(), this.alpha, this.frame);
        }
        if (this.overlayImages.isEmpty()) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "draw: with: draw overlayImages = " + this.overlayImages + ", filter = " + textureFilter);
        java.util.Iterator<com.tencent.tavkit.ciimage.CIImage> it = this.overlayImages.iterator();
        while (it.hasNext()) {
            it.next().draw(textureFilter);
        }
    }

    public float getAlpha() {
        return this.alpha;
    }

    public com.tencent.tav.coremedia.TextureInfo getDrawTextureInfo() {
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null) {
            return textureInfo;
        }
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (this.textureCacheKey == null) {
            this.textureCacheKey = java.lang.String.valueOf(hashCode());
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = com.tencent.tavkit.ciimage.ThreadLocalTextureCache.getInstance().getTextureInfo(this.textureCacheKey);
        if (eglGetCurrentContext != null && textureInfo2 != null && !textureInfo2.isReleased()) {
            return textureInfo2;
        }
        if (this.bitmap == null) {
            return null;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo3 = new com.tencent.tav.coremedia.TextureInfo(com.tencent.tav.decoder.RenderContext.createTexture(3553), 3553, this.bitmap.getWidth(), this.bitmap.getHeight(), getImageTextureMatrix(), this.preferRotation);
        android.opengl.GLES20.glBindTexture(3553, textureInfo3.textureID);
        android.opengl.GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        com.tencent.tavkit.ciimage.ThreadLocalTextureCache.getInstance().putTextureInfo(this.textureCacheKey, textureInfo3);
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "getDrawTextureInfo: bind bitmap texture, texture = " + textureInfo3 + ", eglContext = " + eglGetCurrentContext);
        if (this.isHardMode) {
            this.bitmap.recycle();
            this.bitmap = null;
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "getDrawTextureInfo: isHardMode, bitmap.recycle()");
        }
        return textureInfo3;
    }

    public com.tencent.tav.coremedia.CGRect getExtent() {
        return new com.tencent.tav.coremedia.CGRect(new android.graphics.PointF(0.0f, 0.0f), this.size);
    }

    public com.tencent.tav.coremedia.CGSize getSize() {
        return this.size;
    }

    public android.graphics.Matrix getTransform() {
        return this.transform;
    }

    public com.tencent.tavkit.ciimage.CIImage imageApplyFillInFrame(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode2 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFit;
        applyFillInFrame(cGRect, tAVVideoConfigurationContentMode);
        return this;
    }

    public com.tencent.tavkit.ciimage.CIImage imageByApplyingTransform(android.graphics.Matrix matrix) {
        if (this.transform == null) {
            this.transform = new android.graphics.Matrix();
        }
        this.transform.postConcat(matrix);
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "imageByApplyingTransform() called with: in transform = [" + matrix + "], result transform = " + this.transform);
        return this;
    }

    public com.tencent.tavkit.ciimage.CIImage imageByCompositingOverImage(com.tencent.tavkit.ciimage.CIImage cIImage) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "imageByCompositingOverImage() called with: destImage = [" + cIImage + "]");
        cIImage.addOverlayImage(this);
        return cIImage;
    }

    public com.tencent.tavkit.ciimage.CIImage imageByCroppingToRect(com.tencent.tav.coremedia.CGRect cGRect) {
        if (!com.tencent.tavkit.utils.Utils.isRectValid(cGRect)) {
            return this;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "imageByCroppingToRect: frame = [" + cGRect + "]");
        com.tencent.tav.coremedia.CGSize cGSize = this.size;
        com.tencent.tav.coremedia.CGSize cGSize2 = cGRect.size;
        cGSize.width = cGSize2.width;
        cGSize.height = cGSize2.height;
        if (this.rotation % 2 != 0) {
            android.graphics.PointF pointF = cGRect.origin;
            this.frame = new com.tencent.tav.coremedia.CGRect(pointF.y, pointF.x, cGSize2.height, cGSize2.width);
        } else {
            this.frame = cGRect.m411clone();
        }
        android.graphics.PointF pointF2 = cGRect.origin;
        if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postTranslate(-pointF2.x, -pointF2.y);
            imageByApplyingTransform(matrix);
        }
        return this;
    }

    public boolean isCanvasImage() {
        return this.bitmap == null && this.textureInfo == null;
    }

    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release() start");
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.bitmap.recycle();
            this.bitmap = null;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo = com.tencent.tavkit.ciimage.ThreadLocalTextureCache.getInstance().getTextureInfo(this.textureCacheKey);
        if (textureInfo != null) {
            textureInfo.release();
            com.tencent.tavkit.ciimage.ThreadLocalTextureCache.getInstance().remove(this.textureCacheKey);
        }
        for (com.tencent.tavkit.ciimage.CIImage cIImage : this.overlayImages) {
            if (cIImage != null) {
                cIImage.release();
            }
        }
        this.overlayImages.clear();
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release() end");
    }

    public void reset() {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "reset() called, before transform = " + this.transform);
        if (this.transform != null) {
            this.transform = null;
        }
    }

    public com.tencent.tavkit.ciimage.CIImage safeApplyTransform(android.graphics.Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            return this;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "safeApplyTransform: transform = [" + matrix + "]");
        float f17 = getExtent().origin.x + (getExtent().size.width / 2.0f);
        float f18 = getExtent().origin.y + (getExtent().size.height / 2.0f);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postTranslate(-f17, -f18);
        matrix2.postConcat(matrix);
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix3.postTranslate(f17, f18);
        matrix2.postConcat(matrix3);
        return imageByApplyingTransform(matrix2);
    }

    public void setAlpha(float f17) {
        this.alpha = f17;
    }

    public void setHardMode(boolean z17) {
        this.isHardMode = z17;
    }

    public com.tencent.tavkit.ciimage.CIImage simpleClone() {
        com.tencent.tavkit.ciimage.CIImage cIImage = new com.tencent.tavkit.ciimage.CIImage(this.size.m412clone());
        cIImage.textureInfo = this.textureInfo;
        cIImage.preferRotation = this.preferRotation;
        cIImage.bitmap = this.bitmap;
        cIImage.alpha = this.alpha;
        return cIImage;
    }

    public java.lang.String toString() {
        return "CIImage{hash=" + java.lang.Integer.toHexString(hashCode()) + ", size=" + this.size + ", textureInfo=" + this.textureInfo + ", bitmap=" + this.bitmap + ", transform=" + this.transform + ", frame=" + this.frame + ", overlayImages=" + this.overlayImages + '}';
    }

    public void applyPreferRotation(int i17) {
        com.tencent.tav.coremedia.TextureInfo drawTextureInfo = getDrawTextureInfo();
        if (drawTextureInfo == null) {
            return;
        }
        int i18 = i17 + drawTextureInfo.preferRotation;
        this.rotation = i18;
        if (i18 == 0) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "applyPreferRotation: textureInfo.preferRotation = " + this.rotation);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        com.tencent.tav.decoder.DecoderUtils.getRotationMatrix(matrix, this.rotation, (float) drawTextureInfo.width, (float) drawTextureInfo.height);
        imageByApplyingTransform(matrix);
        if (this.rotation % 2 == 1) {
            com.tencent.tav.coremedia.CGSize cGSize = this.size;
            cGSize.width = drawTextureInfo.height;
            cGSize.height = drawTextureInfo.width;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tavkit.ciimage.CIImage m419clone() {
        com.tencent.tavkit.ciimage.CIImage cIImage = new com.tencent.tavkit.ciimage.CIImage(this.size.m412clone());
        cIImage.textureInfo = this.textureInfo;
        cIImage.textureCacheKey = this.textureCacheKey;
        cIImage.bitmap = this.bitmap;
        cIImage.preferRotation = this.preferRotation;
        cIImage.transform = new android.graphics.Matrix(this.transform);
        com.tencent.tav.coremedia.CGRect cGRect = this.frame;
        cIImage.frame = cGRect != null ? new com.tencent.tav.coremedia.CGRect(cGRect.origin, cGRect.size) : null;
        cIImage.overlayImages.clear();
        cIImage.overlayImages.addAll(this.overlayImages);
        cIImage.alpha = this.alpha;
        return cIImage;
    }

    public CIImage(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new java.util.ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        com.tencent.tav.decoder.logger.Logger.v(str, "CIImage() called with: textureInfo = [" + textureInfo + "]");
        this.textureInfo = textureInfo;
        this.size = new com.tencent.tav.coremedia.CGSize((float) textureInfo.width, (float) textureInfo.height);
    }

    public CIImage(android.graphics.Bitmap bitmap) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new java.util.ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        com.tencent.tav.decoder.logger.Logger.v(str, "CIImage() called with: bitmap = [" + bitmap + "]");
        this.bitmap = checkBitmapConfig(bitmap);
        this.size = new com.tencent.tav.coremedia.CGSize((float) bitmap.getWidth(), (float) bitmap.getHeight());
    }

    public CIImage(java.lang.String str) {
        this(str, null);
    }

    public CIImage(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize) {
        java.lang.String str2 = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        this.overlayImages = new java.util.ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.preferRotation = com.tencent.tavkit.utils.TAVBitmapUtils.readImagePreferRotation(str);
        android.graphics.Bitmap decodeBitmap = decodeBitmap(str, cGSize);
        this.bitmap = decodeBitmap;
        android.graphics.Bitmap checkBitmapConfig = checkBitmapConfig(decodeBitmap);
        this.bitmap = checkBitmapConfig;
        if (checkBitmapConfig != null) {
            com.tencent.tav.coremedia.CGSize cGSize2 = new com.tencent.tav.coremedia.CGSize(this.bitmap.getWidth(), this.bitmap.getHeight());
            this.size = cGSize2;
            com.tencent.tav.decoder.logger.Logger.v(str2, "CIImage() called with: imagePath = [" + str + "], sampleSize = " + cGSize + ", BitmapFactory.decodeFile cons ms = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", outBitmapSize = " + cGSize2);
            return;
        }
        com.tencent.tav.decoder.logger.Logger.e(str2, "CIImage: 图片解码失败！imagePath = " + str);
        this.size = new com.tencent.tav.coremedia.CGSize();
    }
}
