package vn1;

/* loaded from: classes7.dex */
public final class k extends android.bluetooth.le.ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438209a;

    public k(vn1.m mVar) {
        this.f438209a = mVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "BLE scan failed with error code: " + i17);
        vn1.m mVar = this.f438209a;
        mVar.f438230r = false;
        vn1.a aVar = mVar.f438214b;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        super.onScanResult(i17, result);
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "BLE scan result: " + result);
        android.bluetooth.BluetoothDevice device = result.getDevice();
        java.lang.String address = device.getAddress();
        java.lang.String name = device.getName();
        if (name == null) {
            name = "Unknown Device";
        }
        vn1.m mVar = this.f438209a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f438216d;
        kotlin.jvm.internal.o.d(address);
        concurrentHashMap.put(address, device);
        int rssi = result.getRssi();
        vn1.a aVar = mVar.f438214b;
        if (aVar != null) {
            aVar.d(address, name, rssi);
        }
    }
}
