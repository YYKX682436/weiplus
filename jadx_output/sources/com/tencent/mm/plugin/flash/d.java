package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class d implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f137196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.e f137197e;

    public d(com.tencent.mm.plugin.flash.e eVar, android.graphics.Point point) {
        this.f137197e = eVar;
        this.f137196d = point;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mm.plugin.flash.e eVar = this.f137197e;
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = eVar.f137216a;
        if (faceFlashPreviewLayout.F > 0.0f) {
            com.tencent.mm.plugin.flash.view.FaceFlashReflectMask faceFlashReflectMask = faceFlashPreviewLayout.f137019d;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout2 = eVar.f137216a;
            faceFlashReflectMask.setProgress(((float) (currentTimeMillis - faceFlashPreviewLayout2.G)) / faceFlashPreviewLayout2.F);
        }
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework ytSDKKitFramework = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance();
        android.graphics.Point point = this.f137196d;
        ytSDKKitFramework.updateWithFrameData(bArr, point.x, point.y, 1);
        com.tencent.mm.plugin.facedetect.model.v.b().c(bArr);
    }
}
