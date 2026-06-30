package com.tencent.tav.core;

/* loaded from: classes14.dex */
public class AssetImageGenerator {
    private final java.lang.String TAG;
    private byte _hellAccFlag_;
    private com.tencent.tav.core.AssetImageGenerator.ApertureMode apertureMode;
    private boolean appliesPreferredTrackTransform;
    protected com.tencent.tav.asset.Asset asset;
    protected com.tencent.tav.core.AssetExtension assetExtension;
    private final com.tencent.tav.core.AssetImageGenerator.ImageGeneratorThread generatorThread;
    private long generatorThreadId;
    private com.tencent.tav.coremedia.CGSize maximumSize;
    private java.nio.ByteBuffer outBitmapReaderBuffer;
    private java.lang.String outSavePath;
    private com.tencent.tav.core.AssetImageGenerator.OutputBitmapFactory outputBitmapFactory;
    private com.tencent.tav.decoder.RenderContext renderContext;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private com.tencent.tav.core.compositing.VideoCompositing videoCompositing;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;
    private com.tencent.tav.core.VideoCompositionDecoderTrack videoCompositionDecoderTrack;

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode;

        static {
            int[] iArr = new int[com.tencent.tav.core.AssetImageGenerator.ApertureMode.values().length];
            $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode = iArr;
            try {
                iArr[com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode[com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode[com.tencent.tav.core.AssetImageGenerator.ApertureMode.scaleToFit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public enum ApertureMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    /* loaded from: classes6.dex */
    public enum AssetImageGeneratorResult {
        AssetImageGeneratorSucceeded,
        AssetImageGeneratorFailed,
        AssetImageGeneratorCancelled
    }

    /* loaded from: classes7.dex */
    public static class DefaultBitmapFactory implements com.tencent.tav.core.AssetImageGenerator.OutputBitmapFactory {
        private byte _hellAccFlag_;

        private DefaultBitmapFactory() {
        }

        public /* synthetic */ DefaultBitmapFactory(com.tencent.tav.core.AssetImageGenerator.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.tencent.tav.core.AssetImageGenerator.OutputBitmapFactory
        public android.graphics.Bitmap getOutputBitmap(int i17, int i18) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/core/AssetImageGenerator$DefaultBitmapFactory", "getOutputBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator$DefaultBitmapFactory", "getOutputBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            return createBitmap;
        }
    }

    /* loaded from: classes10.dex */
    public interface ImageGeneratorListener {
        void onCompletion(com.tencent.tav.coremedia.CMTime cMTime, android.graphics.Bitmap bitmap, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult assetImageGeneratorResult);
    }

    /* loaded from: classes14.dex */
    public class ImageGeneratorThread extends android.os.HandlerThread implements android.os.Handler.Callback {
        private static final int MSG_CREATE_RENDERCONTEXT = 3;
        private static final int MSG_GENERATOR_COVER = 1;
        private static final int MSG_RELEASE = 2;
        private com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener generatorListener;
        private android.os.Handler handler;
        private java.util.List<com.tencent.tav.coremedia.CMTime> requestedTimes;

        public ImageGeneratorThread(java.lang.String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void generatorCover() {
            for (com.tencent.tav.coremedia.CMTime cMTime : this.requestedTimes) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 1;
                obtain.obj = cMTime;
                this.handler.sendMessage(obtain);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initHandler() {
            this.handler = new android.os.Handler(getLooper(), this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 2;
            this.handler.sendMessage(obtain);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            android.graphics.Bitmap bitmap;
            int i17 = message.what;
            if (i17 != 1) {
                if (i17 != 2) {
                    return false;
                }
                this.handler.removeCallbacksAndMessages(null);
                com.tencent.tav.core.AssetImageGenerator.this.doRelease();
                quit();
                return false;
            }
            try {
                bitmap = com.tencent.tav.core.AssetImageGenerator.this.copyCGImageAtTimeAndActualTime((com.tencent.tav.coremedia.CMTime) message.obj, null);
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.core.AssetImageGenerator.this.TAG, "copyCGImage", e17);
                bitmap = null;
            }
            com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener imageGeneratorListener = this.generatorListener;
            if (imageGeneratorListener == null) {
                return false;
            }
            imageGeneratorListener.onCompletion((com.tencent.tav.coremedia.CMTime) message.obj, bitmap, null, bitmap != null ? com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult.AssetImageGeneratorSucceeded : com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult.AssetImageGeneratorFailed);
            return false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        public void setGeneratorListener(com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener imageGeneratorListener) {
            this.generatorListener = imageGeneratorListener;
        }

        public void setRequestedTimes(java.util.List<com.tencent.tav.coremedia.CMTime> list) {
            this.requestedTimes = list;
        }
    }

    /* loaded from: classes7.dex */
    public interface OutputBitmapFactory {
        android.graphics.Bitmap getOutputBitmap(int i17, int i18);
    }

    public AssetImageGenerator(com.tencent.tav.asset.Asset asset) {
        this(asset, new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL));
    }

    private android.graphics.Bitmap bitmapFromFBO(com.tencent.tav.decoder.RenderContext renderContext, com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        com.tencent.tav.coremedia.TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        if (textureInfo == null) {
            return null;
        }
        android.graphics.Bitmap readBitmapFromTexture = readBitmapFromTexture(renderContext, textureInfo);
        android.graphics.Matrix matrix = getMatrix(this.maximumSize, new com.tencent.tav.coremedia.CGSize(textureInfo.width, textureInfo.height));
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postScale(1.0f, -1.0f);
        matrix2.postTranslate(0.0f, readBitmapFromTexture.getHeight());
        if (matrix != null) {
            matrix.postConcat(matrix2);
        } else {
            matrix = matrix2;
        }
        com.tencent.tav.coremedia.CGSize cGSize = this.maximumSize;
        if (cGSize == null) {
            cGSize = new com.tencent.tav.coremedia.CGSize(textureInfo.width, textureInfo.height);
        }
        int i17 = (int) cGSize.width;
        int i18 = (int) cGSize.height;
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(i18));
        aVar.c(java.lang.Integer.valueOf(i17));
        aVar.c(0);
        aVar.c(0);
        aVar.c(readBitmapFromTexture);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/tav/core/AssetImageGenerator", "bitmapFromFBO", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/CMSampleBuffer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator", "bitmapFromFBO", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/CMSampleBuffer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    private android.graphics.Bitmap doGenerator(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.RenderContext initRenderContext = initRenderContext();
        com.tencent.tav.coremedia.CMSampleBuffer cmSampleBuffer = getCmSampleBuffer(cMTime, initRenderContext);
        return !initRenderContext.isPBufferEnable() ? bitmapFromFBO(initRenderContext, cmSampleBuffer) : readBitmap(renderToMaximumSizeBox(initRenderContext, cmSampleBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRelease() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "doRelease: start, thread = " + java.lang.Thread.currentThread().getName());
        com.tencent.tav.core.VideoCompositionDecoderTrack videoCompositionDecoderTrack = this.videoCompositionDecoderTrack;
        if (videoCompositionDecoderTrack != null) {
            videoCompositionDecoderTrack.release();
            this.videoCompositionDecoderTrack = null;
        }
        com.tencent.tav.core.compositing.VideoCompositing videoCompositing = this.videoCompositing;
        if (videoCompositing != null) {
            videoCompositing.release();
            this.videoCompositing = null;
        }
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.release();
            this.renderContext = null;
        }
        this.videoComposition = null;
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "doRelease: end, thread = " + java.lang.Thread.currentThread().getName());
    }

    private com.tencent.tav.coremedia.CMSampleBuffer getCmSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.RenderContext renderContext) {
        if (this.videoCompositionDecoderTrack == null) {
            this.videoCompositionDecoderTrack = new com.tencent.tav.core.VideoCompositionDecoderTrack(this.assetExtension, 1);
            for (com.tencent.tav.asset.AssetTrack assetTrack : this.asset.getTracks()) {
                if (assetTrack.getMediaType() == 1) {
                    this.videoCompositionDecoderTrack.addTrack(assetTrack);
                }
            }
            this.videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
            com.tencent.tav.core.composition.VideoComposition videoComposition = this.videoComposition;
            com.tencent.tav.core.compositing.VideoCompositing customVideoCompositor = videoComposition == null ? null : videoComposition.getCustomVideoCompositor();
            this.videoCompositing = customVideoCompositor;
            this.videoCompositionDecoderTrack.setVideoCompositing(customVideoCompositor);
            this.videoCompositionDecoderTrack.start(renderContext);
        }
        this.videoCompositionDecoderTrack.seekTo(cMTime, false, true);
        return this.videoCompositionDecoderTrack.readSample(cMTime);
    }

    private android.graphics.Matrix getMatrix(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2) {
        if (cGSize == null || cGSize2 == null || this.apertureMode == null) {
            return null;
        }
        com.tencent.tav.coremedia.CGRect cGRect = new com.tencent.tav.coremedia.CGRect(new android.graphics.PointF(), cGSize2);
        com.tencent.tav.coremedia.CGRect cGRect2 = new com.tencent.tav.coremedia.CGRect(new android.graphics.PointF(), cGSize);
        int i17 = com.tencent.tav.core.AssetImageGenerator.AnonymousClass1.$SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode[this.apertureMode.ordinal()];
        if (i17 == 1) {
            return com.tencent.tav.core.CGMathFunctions.transformBySourceRectFit(cGRect, cGRect2);
        }
        if (i17 == 2) {
            return com.tencent.tav.core.CGMathFunctions.transformBySourceRectFill(cGRect, cGRect2);
        }
        if (i17 != 3) {
            return null;
        }
        return com.tencent.tav.core.CGMathFunctions.transformByScaleFitRect(cGRect, cGRect2);
    }

    private com.tencent.tav.decoder.RenderContext initRenderContext() {
        this.generatorThreadId = java.lang.Thread.currentThread().getId();
        if (this.renderContext == null) {
            com.tencent.tav.coremedia.CGSize cGSize = this.maximumSize;
            if (cGSize == null) {
                cGSize = this.asset.getNaturalSize();
            }
            com.tencent.tav.decoder.RenderContext renderContext = new com.tencent.tav.decoder.RenderContext((int) cGSize.width, (int) cGSize.height);
            this.renderContext = renderContext;
            renderContext.setParams(this.renderContextParams);
        }
        this.renderContext.makeCurrent();
        return this.renderContext;
    }

    private android.graphics.Bitmap readBitmap(com.tencent.tav.coremedia.CGSize cGSize) {
        if (this.outputBitmapFactory == null) {
            this.outputBitmapFactory = new com.tencent.tav.core.AssetImageGenerator.DefaultBitmapFactory(null);
        }
        android.graphics.Bitmap outputBitmap = this.outputBitmapFactory.getOutputBitmap((int) cGSize.width, (int) cGSize.height);
        if (outputBitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888 && outputBitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_4444) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "readBitmap: bitmap 格式错误：暂时只支持ARGB_8888、ARGB_4444格式");
            return outputBitmap;
        }
        int width = outputBitmap.getWidth() * outputBitmap.getHeight() * 4;
        java.nio.ByteBuffer byteBuffer = this.outBitmapReaderBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < width) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(width);
            this.outBitmapReaderBuffer = allocateDirect;
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.outBitmapReaderBuffer.rewind();
            this.outBitmapReaderBuffer.clear();
        }
        android.opengl.GLES20.glReadPixels(0, 0, outputBitmap.getWidth(), outputBitmap.getHeight(), com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.outBitmapReaderBuffer);
        this.outBitmapReaderBuffer.rewind();
        outputBitmap.copyPixelsFromBuffer(this.outBitmapReaderBuffer);
        this.outBitmapReaderBuffer.clear();
        return outputBitmap;
    }

    private android.graphics.Bitmap readBitmapFromTexture(com.tencent.tav.decoder.RenderContext renderContext, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        renderContext.makeCurrent();
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureID, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(textureInfo.width * textureInfo.height * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, textureInfo.width, textureInfo.height, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        int i17 = textureInfo.width;
        int i18 = textureInfo.height;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/core/AssetImageGenerator", "readBitmapFromTexture", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator", "readBitmapFromTexture", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }

    private com.tencent.tav.coremedia.CGSize renderToMaximumSizeBox(com.tencent.tav.decoder.RenderContext renderContext, com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        com.tencent.tav.coremedia.TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        com.tencent.tav.coremedia.CGSize cGSize = this.maximumSize;
        if (cGSize == null) {
            cGSize = new com.tencent.tav.coremedia.CGSize(textureInfo.width, textureInfo.height);
        }
        if (textureInfo != null) {
            com.tencent.tav.core.composition.VideoComposition videoComposition = this.videoComposition;
            com.tencent.tav.decoder.Filter lookUpFilter = videoComposition != null && videoComposition.getLutBitmap() != null && !this.videoComposition.getLutBitmap().isRecycled() ? new com.tencent.tav.decoder.LookUpFilter(this.videoComposition.getLutBitmap()) : new com.tencent.tav.decoder.Filter();
            lookUpFilter.setRendererWidth((int) cGSize.width);
            lookUpFilter.setRendererHeight((int) cGSize.height);
            android.graphics.Matrix matrix = getMatrix(this.maximumSize, new com.tencent.tav.coremedia.CGSize(textureInfo.width, textureInfo.height));
            renderContext.makeCurrent();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            int[] iArr = new int[4];
            android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
            android.opengl.GLES20.glViewport(0, 0, (int) cGSize.width, (int) cGSize.height);
            lookUpFilter.applyFilter(textureInfo, matrix, matrix2);
            lookUpFilter.release();
            renderContext.setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
            renderContext.swapBuffers();
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return cGSize;
    }

    public android.graphics.Bitmap copyCGImageAtTimeAndActualTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            return doGenerator(cMTime);
        }
        throw new java.lang.Exception("cannot process in the main thread");
    }

    public void generateCGImagesAsynchronouslyForTimes(java.util.List<com.tencent.tav.coremedia.CMTime> list, com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener imageGeneratorListener) {
        this.generatorThread.setRequestedTimes(list);
        this.generatorThread.setGeneratorListener(imageGeneratorListener);
        this.generatorThread.generatorCover();
    }

    public com.tencent.tav.core.AssetExtension getAssetExtension() {
        return this.assetExtension;
    }

    public com.tencent.tav.decoder.RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public void release() {
        if (java.lang.Thread.currentThread().getId() != this.generatorThreadId) {
            this.generatorThread.release();
            this.videoComposition = null;
        } else {
            doRelease();
            this.generatorThread.quit();
        }
    }

    public void setApertureMode(com.tencent.tav.core.AssetImageGenerator.ApertureMode apertureMode) {
        this.apertureMode = apertureMode;
    }

    public void setAppliesPreferredTrackTransform(boolean z17) {
        this.appliesPreferredTrackTransform = z17;
    }

    public void setMaximumSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.maximumSize = cGSize;
    }

    public void setOutSavePath(java.lang.String str) {
        this.outSavePath = str;
    }

    public void setOutputBitmapFactory(com.tencent.tav.core.AssetImageGenerator.OutputBitmapFactory outputBitmapFactory) {
        this.outputBitmapFactory = outputBitmapFactory;
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.renderContextParams = renderContextParams;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.setParams(renderContextParams);
        }
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    public AssetImageGenerator(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.AssetExtension assetExtension) {
        this.TAG = "AssetImageGenerator@" + java.lang.Integer.toHexString(hashCode());
        this.generatorThreadId = -1L;
        this.asset = asset;
        this.assetExtension = assetExtension;
        this.apertureMode = com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFit;
        com.tencent.tav.core.AssetImageGenerator.ImageGeneratorThread imageGeneratorThread = new com.tencent.tav.core.AssetImageGenerator.ImageGeneratorThread("image_generator");
        this.generatorThread = imageGeneratorThread;
        imageGeneratorThread.start();
        imageGeneratorThread.initHandler();
    }
}
