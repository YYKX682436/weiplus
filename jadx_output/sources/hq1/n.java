package hq1;

/* loaded from: classes7.dex */
public class n implements android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: i, reason: collision with root package name */
    public static hq1.n f283167i;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283168d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f283169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f283170f;

    /* renamed from: g, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f283171g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f283172h;

    public n(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "no context for scaner");
            return;
        }
        this.f283168d = context;
        this.f283169e = new java.util.ArrayList();
        this.f283170f = false;
        this.f283171g = null;
        this.f283172h = null;
        this.f283171g = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f283172h = new com.tencent.mm.sdk.platformtools.n3("BluetoothLEScanerThread");
    }

    public final boolean a(hq1.m mVar) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
            return false;
        }
        while (true) {
            arrayList = this.f283169e;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((hq1.m) arrayList.get(i17)) == mVar) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return arrayList.add(mVar);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "callback has in queue. pass");
        return true;
    }

    public boolean b(boolean z17, hq1.m mVar) {
        java.lang.Boolean bool = (java.lang.Boolean) new hq1.k(this, z17, mVar).a(this.f283172h);
        iz5.a.g(null, bool != null);
        return bool.booleanValue();
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        bluetoothDevice.getAddress();
        bluetoothDevice.getName();
        a42.i.a(bArr);
        this.f283169e.size();
        this.f283172h.post(new hq1.l(this, bluetoothDevice, i17, bArr));
    }
}
