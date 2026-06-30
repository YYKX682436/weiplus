package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class w implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f137287d;

    public w(com.tencent.mm.plugin.flash.d0 d0Var, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f137287d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.hardware.Camera.PreviewCallback previewCallback = this.f137287d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
