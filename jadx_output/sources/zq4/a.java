package zq4;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.ErrorCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq4.b f475039a;

    public a(zq4.b bVar) {
        this.f475039a = bVar;
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i17, android.hardware.Camera camera) {
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "Camera Error: " + i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "Camera Error: CAMERA_ERROR_EVICTED");
            xq4.d dVar = this.f475039a.f475049i;
            if (dVar != null) {
                dVar.s();
            }
        }
    }
}
