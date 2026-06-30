package jo5;

/* loaded from: classes14.dex */
public final class i implements com.tencent.mm.plugin.voipmp.platform.l {

    /* renamed from: f, reason: collision with root package name */
    public static volatile android.content.Context f300950f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f300951a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final kz5.q f300952b = new kz5.q();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f300953c = jz5.h.b(jo5.g.f300943d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f300954d = jz5.h.b(new jo5.f(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f300955e = jz5.h.b(new jo5.e(this));

    public final jo5.c a(long j17) {
        int i17;
        if (!(j17 == 0) && (i17 = (int) (j17 - 1)) >= 0) {
            java.util.ArrayList arrayList = this.f300951a;
            if (i17 < arrayList.size()) {
                return (jo5.c) arrayList.get(i17);
            }
        }
        return null;
    }

    public final android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f300954d).getValue();
    }

    public final void c(jo5.c cVar) {
        try {
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = cVar.f300937d;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession2 = cVar.f300937d;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.close();
            }
        } catch (java.lang.Exception unused2) {
        }
        cVar.f300937d = null;
    }
}
