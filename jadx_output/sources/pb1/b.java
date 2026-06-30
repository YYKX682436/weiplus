package pb1;

/* loaded from: classes7.dex */
public final class b implements pb1.v {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f353128d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353129a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f353130b;

    /* renamed from: c, reason: collision with root package name */
    public int f353131c;

    static {
        f353128d = com.tencent.mars.xlog.Log.getLogLevel() <= 1;
    }

    public b(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f353129a = tag;
    }

    @Override // pb1.v
    public void a(int i17, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat resultCompat) {
        kotlin.jvm.internal.o.g(resultCompat, "resultCompat");
        if (f353128d) {
            resultCompat.toString();
            return;
        }
        java.util.Map map = this.f353130b;
        if (map == null) {
            map = new java.util.HashMap();
            this.f353130b = map;
        }
        pb1.a aVar = new pb1.a(resultCompat);
        java.lang.Integer num = (java.lang.Integer) map.get(aVar);
        java.lang.String str = this.f353129a;
        if (num != null) {
            com.tencent.mars.xlog.Log.i(str, "onScanResult, id: " + num + ", result: " + aVar);
            return;
        }
        int i18 = this.f353131c;
        this.f353131c = i18 + 1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        map.put(aVar, valueOf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScanResult, id: ");
        sb6.append(valueOf);
        sb6.append(", result: ");
        java.lang.String scanResultCompat = aVar.f353127a.toString();
        kotlin.jvm.internal.o.f(scanResultCompat, "toString(...)");
        sb6.append(scanResultCompat);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
