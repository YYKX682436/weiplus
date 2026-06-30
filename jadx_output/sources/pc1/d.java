package pc1;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f353340a;

    /* renamed from: d, reason: collision with root package name */
    public pc1.c f353343d;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f353341b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.util.UUID[] f353342c = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f353344e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f353345f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f353346g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter.LeScanCallback f353347h = new pc1.b(this);

    public d() {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "bluetoothManager is null!");
            return;
        }
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f353340a = adapter;
        if (adapter == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        } else {
            pc1.e.f353350c = adapter.isEnabled();
        }
    }

    public boolean a() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d stop", java.lang.Integer.valueOf(hashCode()));
        synchronized (this) {
            z17 = this.f353344e;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already stop", java.lang.Integer.valueOf(hashCode()));
            return false;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f353341b).clear();
        this.f353340a.stopLeScan(this.f353347h);
        this.f353344e = false;
        return true;
    }
}
