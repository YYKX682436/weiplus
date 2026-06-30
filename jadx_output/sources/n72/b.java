package n72;

/* loaded from: classes14.dex */
public class b implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f335251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n72.q f335252e;

    public b(n72.q qVar, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f335252e = qVar;
        this.f335251d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.tencent.mm.sdk.platformtools.u3.h(new n72.a(this));
        android.hardware.Camera.PreviewCallback previewCallback = this.f335251d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
