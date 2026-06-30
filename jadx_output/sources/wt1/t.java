package wt1;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f449345b;

    /* renamed from: e, reason: collision with root package name */
    public android.content.BroadcastReceiver f449348e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wt1.p f449352i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f449344a = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f449346c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f449347d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final long f449349f = 3000;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f449350g = new wt1.u(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter.LeScanCallback f449351h = new wt1.w(this);

    public t(wt1.p pVar, wt1.q qVar) {
        this.f449352i = pVar;
    }

    public wt1.x a() {
        wt1.x xVar = new wt1.x("", -100, "", null);
        java.util.Map map = this.f449347d;
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            return xVar;
        }
        for (wt1.x xVar2 : ((java.util.concurrent.ConcurrentHashMap) map).values()) {
            if (xVar.f449363b < xVar2.f449363b) {
                xVar = xVar2;
            }
        }
        return xVar;
    }

    public void b() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (this.f449344a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "already start");
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f449347d).clear();
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            this.f449346c = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothManager is null");
            return;
        }
        this.f449346c = true;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f449345b = adapter;
        if (adapter == null || !adapter.isEnabled()) {
            this.f449346c = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
            return;
        }
        wt1.p pVar = this.f449352i;
        final wt1.t$$a t__a = new wt1.t$$a(this);
        pVar.getClass();
        if (i17 < 31) {
            t__a.a(true);
            return;
        }
        if (((tb0.j) i95.n0.c(tb0.j.class)) == null) {
            t__a.a(false);
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = pVar.f449319d;
        if (mMActivity == null) {
            t__a.a(false);
            return;
        }
        final java.lang.String[] strArr = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
        if (j35.u.h(mMActivity, strArr)) {
            t__a.a(true);
        } else {
            j35.u.j(mMActivity, 144, new j35.b0() { // from class: wt1.p$$a
                @Override // j35.b0
                public final void onRequestPermissionsResult(int i18, java.lang.String[] strArr2, int[] iArr) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "onRequestPermissionsResult, requestCode: %d, requestPermissions: %s, grantResults: %s", java.lang.Integer.valueOf(i18), java.util.Arrays.toString(strArr2), java.util.Arrays.toString(iArr));
                    if (144 != i18) {
                        return;
                    }
                    wt1.y yVar = wt1.y.this;
                    if (strArr2 == null) {
                        ((wt1.t$$a) yVar).a(false);
                        return;
                    }
                    java.util.List asList = java.util.Arrays.asList(strArr2);
                    for (java.lang.String str : strArr) {
                        int indexOf = asList.indexOf(str);
                        if (-1 == indexOf || iArr[indexOf] != 0) {
                            ((wt1.t$$a) yVar).a(false);
                            return;
                        }
                    }
                    ((wt1.t$$a) yVar).a(true);
                }
            }, strArr, "", "");
        }
    }

    public void c() {
        if (!this.f449344a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "not start");
            return;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f449345b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            this.f449346c = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
        } else {
            this.f449346c = true;
            this.f449345b.stopLeScan(this.f449351h);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "stopLeScan");
            this.f449344a = false;
        }
    }
}
