package gy3;

/* loaded from: classes13.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.UUID f277580e = java.util.UUID.fromString("0000FEEA-0000-1000-8000-00805F9B34FB");

    /* renamed from: a, reason: collision with root package name */
    public final gy3.g f277581a;

    /* renamed from: b, reason: collision with root package name */
    public gy3.f f277582b;

    /* renamed from: c, reason: collision with root package name */
    public gy3.h f277583c;

    /* renamed from: d, reason: collision with root package name */
    public gy3.i f277584d;

    public j(java.lang.String mac, gy3.g mCallback) {
        kotlin.jvm.internal.o.g(mac, "mac");
        kotlin.jvm.internal.o.g(mCallback, "mCallback");
        this.f277581a = mCallback;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothSession", "disconnect");
        gy3.f fVar = this.f277582b;
        if (fVar != null) {
            fVar.a();
        }
        this.f277582b = null;
        gy3.h hVar = this.f277583c;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
            if (hVar.f277572g) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
            } else {
                hVar.f277572g = true;
            }
        }
        this.f277583c = null;
        gy3.i iVar = this.f277584d;
        if (iVar != null) {
            iVar.a();
        }
        this.f277584d = null;
    }
}
