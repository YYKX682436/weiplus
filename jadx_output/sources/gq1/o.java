package gq1;

/* loaded from: classes13.dex */
public class o implements gq1.a, u32.a1, android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f274518w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f274519x;

    /* renamed from: d, reason: collision with root package name */
    public final gq1.c f274520d;

    /* renamed from: e, reason: collision with root package name */
    public final gq1.a f274521e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f274522f;

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f274524h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f274525i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f274523g = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f274526m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f274527n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f274528o = "";

    /* renamed from: p, reason: collision with root package name */
    public gq1.d f274529p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f274530q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f274531r = new com.tencent.mm.sdk.platformtools.b4(u32.i1.a().f424310b.getSerialTag(), (com.tencent.mm.sdk.platformtools.a4) new gq1.f(this), true);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f274532s = new com.tencent.mm.sdk.platformtools.b4(u32.i1.a().f424310b.getSerialTag(), (com.tencent.mm.sdk.platformtools.a4) new gq1.g(this), true);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f274533t = new com.tencent.mm.sdk.platformtools.b4(u32.i1.a().f424310b.getSerialTag(), (com.tencent.mm.sdk.platformtools.a4) new gq1.h(this), true);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f274534u = new com.tencent.mm.sdk.platformtools.b4(u32.i1.a().f424310b.getSerialTag(), (com.tencent.mm.sdk.platformtools.a4) new gq1.i(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f274535v = new com.tencent.mm.sdk.platformtools.b4(u32.i1.a().f424310b.getSerialTag(), (com.tencent.mm.sdk.platformtools.a4) new gq1.j(this), true);

    public o(gq1.a aVar) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("aCallback is null");
        }
        this.f274522f = new java.util.HashSet();
        this.f274520d = new gq1.c(this);
        this.f274521e = aVar;
        this.f274525i = new com.tencent.mm.sdk.platformtools.n3(u32.i1.a().f424310b.getSerialTag());
        this.f274524h = ((android.bluetooth.BluetoothManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("bluetooth")).getAdapter();
    }

    @Override // u32.a1
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // u32.a1
    public void b(java.lang.String str, java.lang.String str2, int i17, int i18, byte[] bArr) {
        a42.i.a(bArr);
        if (i17 != 0) {
            return;
        }
        gq1.d dVar = new gq1.d();
        if (dVar.a(bArr)) {
            java.util.UUID j17 = a42.i.j(dVar.f274500b.f274537c);
            if (j17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
            } else if (this.f274522f.contains(j17)) {
                if (this.f274526m) {
                    this.f274528o = str;
                }
                this.f274525i.post(new gq1.m(this, i18, str, dVar));
            }
        }
    }

    @Override // u32.a1
    public void c(int i17) {
        if (i17 != 0) {
            return;
        }
        e();
    }

    @Override // gq1.a
    public void d(double d17, gq1.b bVar) {
        java.lang.String a17 = a42.i.a(bVar.f274494a.f274500b.f274537c);
        if (a17.length() >= 32) {
            a17 = a17.substring(0, 8) + "-" + a17.substring(8, 12) + "-" + a17.substring(12, 16) + "-" + a17.substring(16, 20) + "-" + a17.substring(20);
        }
        java.lang.String str = a17 + ((int) bVar.f274494a.f274500b.f274538d) + ((int) bVar.f274494a.f274500b.f274539e);
        java.util.Map map = this.f274530q;
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str);
        gq1.a aVar = this.f274521e;
        if (containsKey) {
            long longValue = ((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue > 500) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(currentTimeMillis));
                aVar.d(d17, bVar);
                return;
            }
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        aVar.d(d17, bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + a17 + ",major = " + ((int) bVar.f274494a.f274500b.f274538d) + ",minor = " + (bVar.f274494a.f274500b.f274539e & 65535));
    }

    public final void e() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter;
        ((java.util.concurrent.ConcurrentHashMap) this.f274530q).clear();
        f274518w = false;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f274534u;
        if (!b4Var.e()) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f274533t;
        if (!b4Var2.e()) {
            b4Var2.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f274532s;
        if (!b4Var3.e()) {
            b4Var3.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var4 = this.f274531r;
        if (!b4Var4.e()) {
            b4Var4.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var5 = this.f274535v;
        if (!b4Var5.e()) {
            b4Var5.d();
        }
        if (!this.f274523g || (bluetoothAdapter = this.f274524h) == null) {
            return;
        }
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(this);
        }
        this.f274523g = false;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        gq1.d dVar = new gq1.d();
        if (dVar.a(bArr)) {
            java.util.UUID j17 = a42.i.j(dVar.f274500b.f274537c);
            if (j17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
                return;
            }
            if (this.f274522f.contains(j17)) {
                if (this.f274526m) {
                    this.f274527n = i17;
                    this.f274529p = dVar;
                    com.tencent.mm.sdk.platformtools.b4 b4Var = this.f274531r;
                    if (b4Var.e()) {
                        b4Var.c(2000L, 2000L);
                    }
                    this.f274526m = false;
                }
                this.f274525i.post(new gq1.n(this, i17, bluetoothDevice, dVar));
            }
        }
    }
}
