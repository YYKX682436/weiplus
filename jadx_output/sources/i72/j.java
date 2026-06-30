package i72;

/* loaded from: classes14.dex */
public class j implements android.hardware.Camera.PreviewCallback {
    public j(i72.m mVar) {
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mm.plugin.facedetect.model.v.b().c(bArr);
    }
}
