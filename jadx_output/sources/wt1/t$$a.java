package wt1;

/* loaded from: classes13.dex */
public final /* synthetic */ class t$$a implements wt1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt1.t f449353a;

    public final void a(boolean z17) {
        wt1.t tVar = this.f449353a;
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "onRequestPermissionResult, granted: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "[BluetoothTrace] start scan");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardLbsOrBluetooth", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
            android.bluetooth.BluetoothAdapter bluetoothAdapter = tVar.f449345b;
            android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback = tVar.f449351h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(leScanCallback);
            java.util.Collections.reverse(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "startLeScan isOK:%b", java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/card/mgr/CardLbsOrBluetoothInfoManager$BluetoothHelper", "lambda$startScanBluetooth$0", "(Z)V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue()));
            tVar.f449344a = true;
        }
    }
}
