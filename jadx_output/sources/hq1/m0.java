package hq1;

/* loaded from: classes7.dex */
public class m0 extends android.bluetooth.le.ScanCallback {

    /* renamed from: g, reason: collision with root package name */
    public static hq1.m0 f283160g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f283161a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f283162b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f283163c;

    /* renamed from: d, reason: collision with root package name */
    public final android.bluetooth.BluetoothManager f283164d;

    /* renamed from: e, reason: collision with root package name */
    public android.bluetooth.le.BluetoothLeScanner f283165e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f283166f;

    public m0(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NewBluetoothLEScanner", "No context for scanner");
            return;
        }
        this.f283161a = context;
        this.f283162b = new java.util.ArrayList();
        this.f283163c = false;
        this.f283165e = null;
        this.f283166f = null;
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        this.f283164d = bluetoothManager;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            this.f283165e = adapter.getBluetoothLeScanner();
        }
        this.f283166f = new com.tencent.mm.sdk.platformtools.n3("NewBluetoothLEScannerThread");
    }

    public final boolean a(hq1.l0 l0Var) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NewBluetoothLEScanner", "callback is null");
            return false;
        }
        while (true) {
            arrayList = this.f283162b;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((hq1.l0) arrayList.get(i17)) == l0Var) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return arrayList.add(l0Var);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.NewBluetoothLEScanner", "callback has in queue. pass");
        return true;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.bluetooth.le.ScanResult scanResult = (android.bluetooth.le.ScanResult) it.next();
                scanResult.getDevice().getAddress();
                scanResult.getDevice().getName();
                a42.i.a(scanResult.getScanRecord().getBytes());
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        this.f283166f.post(new hq1.k0(this, i17));
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult scanResult) {
        if (scanResult == null || scanResult.getScanRecord() == null) {
            return;
        }
        scanResult.getDevice().getAddress();
        scanResult.getDevice().getName();
        a42.i.a(scanResult.getScanRecord().getBytes());
        this.f283162b.size();
        this.f283166f.post(new hq1.j0(this, scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes()));
    }
}
