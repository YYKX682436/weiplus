package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPVideoCapture implements com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback {
    private static final java.lang.String TAG = "TPThumbPlayer[TPVideoCapture.java]";
    private com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator mTpImageGenerator;
    private int mWidth = 0;
    private int mHeight = 0;
    private long mRequestedTimeMsToleranceBefore = 0;
    private long mRequestedTimeMsToleranceAfter = 0;
    private long mOpaque = 0;
    private java.util.Map<java.lang.String, com.tencent.thumbplayer.api.TPVideoCapture.TPVideoCaptureCallBack> mCallBackMap = new java.util.HashMap();

    /* loaded from: classes16.dex */
    public interface TPVideoCaptureCallBack {
        void onCaptureError(int i17);

        void onCaptureSuccess(android.graphics.Bitmap[] bitmapArr);
    }

    public TPVideoCapture(java.lang.String str) {
        this.mTpImageGenerator = new com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator(str, this);
        try {
            this.mTpImageGenerator.init();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }

    private java.lang.String generateOpaqueKey(long j17, long j18) {
        return "opaque_" + j17 + "time_" + j18;
    }

    private com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams getParameters() {
        com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams = new com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams();
        tPImageGeneratorParams.format = 37;
        tPImageGeneratorParams.width = this.mWidth;
        tPImageGeneratorParams.height = this.mHeight;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = this.mRequestedTimeMsToleranceAfter;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = this.mRequestedTimeMsToleranceBefore;
        return tPImageGeneratorParams;
    }

    public void generateImageAsyncAtTime(long j17, com.tencent.thumbplayer.api.TPVideoCapture.TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        long j18 = this.mOpaque + 1;
        this.mOpaque = j18;
        this.mCallBackMap.put(generateOpaqueKey(j18, j17), tPVideoCaptureCallBack);
        try {
            this.mTpImageGenerator.generateImageAsyncAtTime(j17, this.mOpaque, getParameters());
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "generateImageAsyncAtTime: " + android.util.Log.getStackTraceString(e17));
        }
    }

    public void generateImagesAsyncForTimes(long[] jArr, com.tencent.thumbplayer.api.TPVideoCapture.TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        this.mOpaque++;
        for (long j17 : jArr) {
            this.mCallBackMap.put(generateOpaqueKey(this.mOpaque, j17), tPVideoCaptureCallBack);
        }
        try {
            this.mTpImageGenerator.generateImagesAsyncForTimes(jArr, this.mOpaque, getParameters());
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "generateImagesAsyncForTimes: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i17, long j17, long j18, long j19, com.tencent.thumbplayer.core.common.TPVideoFrame tPVideoFrame) {
        com.tencent.thumbplayer.api.TPVideoCapture.TPVideoCaptureCallBack tPVideoCaptureCallBack = this.mCallBackMap.get(generateOpaqueKey(j19, j17));
        if (tPVideoCaptureCallBack != null) {
            if (i17 != 0 || tPVideoFrame == null) {
                tPVideoCaptureCallBack.onCaptureError(i17);
            } else {
                tPVideoCaptureCallBack.onCaptureSuccess(com.tencent.thumbplayer.caputure.TPCaptureUtils.frame2Bitmaps(tPVideoFrame));
            }
        }
        this.mCallBackMap.remove(generateOpaqueKey(j19, j17));
    }

    public void release() {
        try {
            this.mTpImageGenerator.cancelAllImageGenerations();
            this.mTpImageGenerator.unInit();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "release: " + android.util.Log.getStackTraceString(e17));
        }
        this.mCallBackMap.clear();
        this.mTpImageGenerator = null;
    }

    public void setSize(int i17, int i18) {
        if (i17 < 0 || i18 < 0) {
            throw new java.lang.IllegalArgumentException("Size is illegal");
        }
        this.mWidth = i17;
        this.mHeight = i18;
    }

    public void setTimeMsTolerance(long j17, long j18) {
        if (j17 > j18) {
            throw new java.lang.IllegalArgumentException("Tolerance is illegal");
        }
        this.mRequestedTimeMsToleranceBefore = j17;
        this.mRequestedTimeMsToleranceAfter = j18;
    }
}
