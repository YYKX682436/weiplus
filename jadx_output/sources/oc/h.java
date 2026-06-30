package oc;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public kc.c f344104c;

    /* renamed from: d, reason: collision with root package name */
    public volatile oc.c f344105d;

    /* renamed from: e, reason: collision with root package name */
    public mc.r f344106e;

    /* renamed from: h, reason: collision with root package name */
    public volatile android.os.HandlerThread f344109h;

    /* renamed from: i, reason: collision with root package name */
    public volatile oc.f f344110i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f344102a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344103b = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f344107f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f344108g = false;

    /* renamed from: j, reason: collision with root package name */
    public long f344111j = 5000;

    public static void b(oc.h hVar) {
        if (hVar.f344104c != null) {
            int i17 = ic.d.f290281k;
            ic.d dVar = ic.c.f290280a;
            if (!dVar.f290289h) {
                dVar.b(213, "startLivenessConfig is null");
                return;
            }
            java.lang.String selectData = com.tencent.cloud.huiyan.api.HuiYanNativeApi.getSelectData();
            com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack huiYanSdkCallBack = dVar.f290288g;
            if (huiYanSdkCallBack != null) {
                huiYanSdkCallBack.onSelectSuccess(selectData);
            }
        }
    }

    public final synchronized void a() {
        try {
        } catch (java.lang.Exception e17) {
            mc.p.f325531a.e("TuringSdkHelper", "quitHandlerThread error: " + e17.getLocalizedMessage());
        }
        if (this.f344110i == null) {
            return;
        }
        this.f344110i.removeMessages(3);
        this.f344110i.removeMessages(2);
        this.f344110i.removeMessages(3);
        this.f344110i.removeMessages(4);
        this.f344110i = null;
        if (this.f344109h != null && this.f344109h.isAlive()) {
            this.f344109h.quitSafely();
        }
    }

    public final void c() {
        this.f344105d = (oc.c) oc.b.class.newInstance();
        this.f344107f = true;
        mc.q qVar = mc.p.f325531a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("real init turing: ");
        sb6.append(this.f344107f);
        sb6.append(", ");
        sb6.append(this.f344105d == null);
        sb6.append(", [turing version]: ");
        if (!this.f344107f || this.f344105d == null) {
            qVar.e("TuringSdkHelper", "get version, turing is not create!");
        } else {
            this.f344105d.getClass();
        }
        sb6.append("");
        qVar.b("TuringSdkHelper", sb6.toString());
    }
}
