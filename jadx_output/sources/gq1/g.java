package gq1;

/* loaded from: classes13.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274503d;

    public g(gq1.o oVar) {
        this.f274503d = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.Boolean bool;
        gq1.o oVar = this.f274503d;
        if (oVar.f274522f.size() > 0) {
            if (oVar.f274524h != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f274524h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(oVar);
                java.util.Collections.reverse(arrayList);
                bool = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan4SelfAdaption", "()Ljava/lang/Boolean;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
            } else {
                bool = java.lang.Boolean.FALSE;
            }
            bool.booleanValue();
            boolean z17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
            gq1.o.f274519x = z17;
            if (!z17) {
                if (!oVar.f274533t.e()) {
                    oVar.f274533t.d();
                }
                if (!oVar.f274532s.e()) {
                    oVar.f274532s.d();
                }
            }
        }
        return false;
    }
}
