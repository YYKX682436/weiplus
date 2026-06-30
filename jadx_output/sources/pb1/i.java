package pb1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f353141b;

    /* renamed from: c, reason: collision with root package name */
    public pb1.x f353142c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f353143d;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f353147h;

    /* renamed from: j, reason: collision with root package name */
    public android.content.BroadcastReceiver f353149j;

    /* renamed from: o, reason: collision with root package name */
    public volatile ob1.l f353154o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353140a = "MicroMsg.Ble.BleScanWorker#" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f353144e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f353145f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f353146g = new android.os.Handler();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f353148i = new pb1.c(this);

    /* renamed from: k, reason: collision with root package name */
    public volatile pb1.h f353150k = null;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f353151l = new pb1.d(this);

    /* renamed from: m, reason: collision with root package name */
    public int f353152m = -1;

    /* renamed from: n, reason: collision with root package name */
    public volatile pb1.v f353153n = pb1.p.f353160a;

    public i(android.content.Context context) {
        this.f353141b = context;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat a(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(ya.b.MEDIUM)) {
                    c17 = 0;
                    break;
                }
                break;
            case 107348:
                if (str.equals("low")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3202466:
                if (str.equals("high")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat(1, 1, 0L, null);
            case 1:
                return new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat(0, 1, 0L, null);
            case 2:
                return new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat(2, 1, 0L, null);
            default:
                return a(ya.b.MEDIUM);
        }
    }

    public final synchronized void b() {
        if (this.f353141b == null) {
            com.tencent.mars.xlog.Log.w(this.f353140a, "initBroadcaseListener, context is null");
            return;
        }
        if (this.f353149j == null) {
            com.tencent.mars.xlog.Log.i(this.f353140a, "bluetoothStateListener init");
            this.f353149j = new pb1.f(this);
            this.f353141b.registerReceiver(this.f353149j, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Type inference failed for: r2v20, types: [pb1.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(pb1.h r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.i.c(pb1.h):void");
    }

    public synchronized ob1.m d() {
        if (this.f353145f.get() && this.f353142c != null) {
            if (!this.f353144e.get()) {
                com.tencent.mars.xlog.Log.w(this.f353140a, "not scan", new java.lang.Object[0]);
                return ob1.m.f344018e;
            }
            android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
            if (d17 != null && qb1.b.b()) {
                com.tencent.mars.xlog.Log.w(this.f353140a, "stopBleScan, stopScan", new java.lang.Object[0]);
                this.f353144e.set(false);
                pb1.x xVar = this.f353142c;
                ((pb1.j) pb1.m.f353157a).getClass();
                pb1.k kVar = (pb1.k) pb1.j.f353155a.remove(xVar);
                if (kVar != null) {
                    if (d17.getBluetoothLeScanner() == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ble.BleScannerCompat", "bluetoothscanner is null, return");
                    } else {
                        d17.getBluetoothLeScanner().stopScan(kVar);
                    }
                }
                if (kb1.b.a().f306221e) {
                    pb1.u uVar = (pb1.u) i95.n0.c(pb1.u.class);
                    if (uVar == null) {
                        uVar = pb1.o.f353159d;
                    }
                    uVar.t9(this.f353152m);
                    this.f353152m = -1;
                    this.f353146g.removeCallbacks(this.f353151l);
                }
                return ob1.m.f344018e;
            }
            com.tencent.mars.xlog.Log.e(this.f353140a, "BluetoothAdapter is null, err", new java.lang.Object[0]);
            return ob1.m.f344022i;
        }
        return ob1.m.f344021h;
    }
}
