package com.tencent.thumbplayer.caputure;

/* loaded from: classes16.dex */
public class TPSystemCapture implements com.tencent.thumbplayer.adapter.player.ITPCapture, com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMediaImageListener {
    private android.content.res.AssetFileDescriptor mAssetFileDescriptor;
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.api.TPCaptureCallBack> mCallBackMap = new java.util.HashMap();
    private java.io.FileDescriptor mFileDescriptor;
    private java.lang.String mUrl;

    public TPSystemCapture(java.lang.String str) {
        this.mUrl = str;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPCapture
    public void generateImageAsyncAtTime(long j17, com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TPSysImageCaptureParams tPSysImageCaptureParams = new com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TPSysImageCaptureParams();
        tPSysImageCaptureParams.url = this.mUrl;
        tPSysImageCaptureParams.fileDescriptor = this.mFileDescriptor;
        tPSysImageCaptureParams.assetFileDescriptor = this.mAssetFileDescriptor;
        tPSysImageCaptureParams.positionMs = j17;
        tPSysImageCaptureParams.width = tPImageGeneratorParams.width;
        tPSysImageCaptureParams.height = tPImageGeneratorParams.height;
        this.mCallBackMap.put(java.lang.Integer.valueOf(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.GetImageCaptureInstance().captureImageWithPosition(tPSysImageCaptureParams, this)), tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMediaImageListener
    public void onCaptureFailed(int i17, int i18) {
        com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(java.lang.Integer.valueOf(i17));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoFailed(i18);
        }
    }

    @Override // com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMediaImageListener
    public void onCaptureSucceed(int i17, long j17, int i18, int i19, android.graphics.Bitmap bitmap, long j18) {
        com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(java.lang.Integer.valueOf(i17));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoSuccess(bitmap);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPCapture
    public void release() {
        this.mCallBackMap.clear();
    }

    public TPSystemCapture(java.io.FileDescriptor fileDescriptor) {
        this.mFileDescriptor = fileDescriptor;
    }

    public TPSystemCapture(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mAssetFileDescriptor = assetFileDescriptor;
    }
}
