package hq1;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f283151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq1.m f283152i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hq1.n f283153j;

    public k(hq1.n nVar, boolean z17, hq1.m mVar) {
        this.f283153j = nVar;
        this.f283151h = z17;
        this.f283152i = mVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        boolean hasSystemFeature;
        hq1.n nVar = this.f283153j;
        android.content.Context context = nVar.f283168d;
        boolean z17 = false;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "not found context");
            hasSystemFeature = false;
        } else {
            hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        }
        if (hasSystemFeature) {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = nVar.f283171g;
            if (bluetoothAdapter == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "not found BluetoothAdapter");
            } else {
                java.util.ArrayList arrayList = nVar.f283169e;
                boolean z18 = this.f283151h;
                hq1.m mVar = this.f283152i;
                if (z18) {
                    if (nVar.f283170f) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "ble has scan. just add callback and return");
                        nVar.a(mVar);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BluetoothLEScaner", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                        android.bluetooth.BluetoothAdapter bluetoothAdapter2 = nVar.f283171g;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(nVar);
                        java.util.Collections.reverse(arrayList2);
                        boolean booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList2.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                        if (booleanValue) {
                            nVar.f283170f = true;
                            nVar.a(mVar);
                        } else if (arrayList.size() <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed and callbacklist size is 0,start retry,and bluetooth state is(12 is on ,10 is off): " + bluetoothAdapter.getState());
                            for (int i17 = 0; !booleanValue && i17 < 3; i17++) {
                                bluetoothAdapter.stopLeScan(nVar);
                                nVar.f283170f = false;
                                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed,retry no " + i17 + " time");
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BluetoothLEScaner", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                                android.bluetooth.BluetoothAdapter bluetoothAdapter3 = nVar.f283171g;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(nVar);
                                java.util.Collections.reverse(arrayList3);
                                booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter3, arrayList3.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                                if (booleanValue) {
                                    nVar.f283170f = true;
                                    nVar.a(mVar);
                                }
                            }
                        } else if (bluetoothAdapter.getState() == 12) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed when bluetooth state is on.");
                            nVar.f283170f = true;
                            nVar.a(mVar);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed");
                        }
                        z17 = booleanValue;
                    }
                } else if (nVar.f283170f) {
                    if (mVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
                    } else {
                        arrayList.remove(mVar);
                    }
                    if (mVar != null) {
                        mVar.a();
                    }
                    if (arrayList.size() <= 0) {
                        bluetoothAdapter.stopLeScan(nVar);
                        nVar.f283170f = false;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "scan haven't started. just return, callback size = %d", java.lang.Integer.valueOf(arrayList.size()));
                }
                z17 = true;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "this phone is not support BLE");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
