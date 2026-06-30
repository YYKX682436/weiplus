package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class r implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f137174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.s f137175e;

    public r(com.tencent.mm.plugin.flash.action.s sVar, android.graphics.Point point) {
        this.f137175e = sVar;
        this.f137174d = point;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mm.plugin.flash.action.s sVar = this.f137175e;
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = sVar.f137179b;
        if (faceFlashActionPreviewLayout.f137064J > 0.0f && faceFlashActionPreviewLayout.K > 0) {
            com.tencent.mm.plugin.flash.view.FaceReflectMask faceReflectMask = faceFlashActionPreviewLayout.f137066e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = sVar.f137179b;
            faceReflectMask.setProgress(((float) (currentTimeMillis - faceFlashActionPreviewLayout2.K)) / faceFlashActionPreviewLayout2.f137064J);
        }
        if (sVar.f137179b.F) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onPreviewFrame set data to yt");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework ytSDKKitFramework = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance();
        android.graphics.Point point = this.f137174d;
        ytSDKKitFramework.updateWithFrameData(bArr, point.x, point.y, 1);
        com.tencent.mm.plugin.facedetect.model.v.b().c(bArr);
    }
}
