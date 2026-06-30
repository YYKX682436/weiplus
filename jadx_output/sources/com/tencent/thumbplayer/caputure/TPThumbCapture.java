package com.tencent.thumbplayer.caputure;

/* loaded from: classes16.dex */
public class TPThumbCapture implements com.tencent.thumbplayer.adapter.player.ITPCapture, com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback {
    private static final java.lang.String TAG = "TPThumbPlayer[TPThumbCapture.java]";
    private java.util.Map<java.lang.Long, com.tencent.thumbplayer.api.TPCaptureCallBack> mCallBackMap;
    private com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator mImageGenerator;
    private long mOpaque;

    public TPThumbCapture(java.lang.String str) {
        this.mOpaque = 0L;
        this.mImageGenerator = new com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator(str, this);
        this.mCallBackMap = new java.util.HashMap();
        try {
            this.mImageGenerator.init();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPCapture
    public void generateImageAsyncAtTime(long j17, com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        if (tPImageGeneratorParams == null) {
            tPImageGeneratorParams = new com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams();
            tPImageGeneratorParams.format = 37;
        }
        com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams2 = tPImageGeneratorParams;
        long j18 = this.mOpaque + 1;
        this.mOpaque = j18;
        this.mCallBackMap.put(java.lang.Long.valueOf(j18), tPCaptureCallBack);
        try {
            this.mImageGenerator.generateImageAsyncAtTime(j17, this.mOpaque, tPImageGeneratorParams2);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "generateImageAsyncAtTime: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i17, long j17, long j18, long j19, com.tencent.thumbplayer.core.common.TPVideoFrame tPVideoFrame) {
        com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(java.lang.Long.valueOf(j19));
        if (tPCaptureCallBack != null) {
            if (i17 != 0 || tPVideoFrame == null) {
                tPCaptureCallBack.onCaptureVideoFailed(i17);
            } else {
                android.graphics.Bitmap frame2Bitmap = com.tencent.thumbplayer.caputure.TPCaptureUtils.frame2Bitmap(tPVideoFrame);
                if (frame2Bitmap != null) {
                    tPCaptureCallBack.onCaptureVideoSuccess(frame2Bitmap);
                } else {
                    tPCaptureCallBack.onCaptureVideoFailed(com.tencent.thumbplayer.core.common.TPGeneralError.FAILED);
                }
            }
        }
        this.mCallBackMap.remove(java.lang.Long.valueOf(j19));
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPCapture
    public void release() {
        try {
            this.mImageGenerator.cancelAllImageGenerations();
            this.mImageGenerator.unInit();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "release: " + android.util.Log.getStackTraceString(e17));
        }
        this.mCallBackMap.clear();
        this.mImageGenerator = null;
    }

    public TPThumbCapture(int i17) {
        this(i17, 0L, 0L);
    }

    public TPThumbCapture(int i17, long j17, long j18) {
        this.mOpaque = 0L;
        this.mImageGenerator = new com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator(i17, j17, j18, this);
        this.mCallBackMap = new java.util.HashMap();
        try {
            this.mImageGenerator.init();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }
}
