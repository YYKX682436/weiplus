package n72;

/* loaded from: classes14.dex */
public class c implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f335253d;

    public c(n72.q qVar) {
        this.f335253d = qVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        n72.q qVar = this.f335253d;
        if (qVar.N) {
            if (qVar.f335282q && this.f335253d.f335283r && this.f335253d.G == 2) {
                k72.j.f304725a.a(bArr, camera);
                return;
            }
            return;
        }
        if (qVar.f335271J != null) {
            if (qVar.M) {
                int i17 = qVar.L.get();
                n72.q qVar2 = this.f335253d;
                if (i17 >= qVar2.K) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "drop frame  %d", java.lang.Integer.valueOf(qVar2.L.get()));
                    return;
                }
            }
            n72.q qVar3 = this.f335253d;
            qVar3.f335271J.postToWorker(qVar3.M ? new n72.n(qVar3, bArr, camera) : new n72.o(qVar3, bArr, camera));
        }
    }
}
