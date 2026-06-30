package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class b implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f137116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137117e;

    public b(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, android.graphics.Point point) {
        this.f137117e = faceFlashActionPreviewLayout;
        this.f137116d = point;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137117e;
        if (faceFlashActionPreviewLayout.f137064J > 0.0f && faceFlashActionPreviewLayout.K > 0) {
            faceFlashActionPreviewLayout.f137066e.setProgress(((float) (java.lang.System.currentTimeMillis() - faceFlashActionPreviewLayout.K)) / faceFlashActionPreviewLayout.f137064J);
        }
        if (faceFlashActionPreviewLayout.F) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "logicReset onPreviewFrame set data to yt");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework ytSDKKitFramework = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance();
        android.graphics.Point point = this.f137116d;
        ytSDKKitFramework.updateWithFrameData(bArr, point.x, point.y, 1);
        com.tencent.mm.plugin.facedetect.model.v.b().c(bArr);
    }
}
