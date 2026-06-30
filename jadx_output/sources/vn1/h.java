package vn1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f438205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438206f;

    public h(java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice, vn1.m mVar) {
        this.f438204d = str;
        this.f438205e = bluetoothDevice;
        this.f438206f = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f438204d;
        try {
            com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Initiating connectGatt on Main Thread for " + str);
            int i17 = android.os.Build.VERSION.SDK_INT;
            vn1.m mVar = this.f438206f;
            android.bluetooth.BluetoothGatt connectGatt = i17 >= 26 ? this.f438205e.connectGatt(mVar.f438213a, false, mVar.f438234v, 2, 1, mVar.f438221i) : this.f438205e.connectGatt(mVar.f438213a, false, mVar.f438234v, 2);
            if (connectGatt != null) {
                mVar.f438223k.put(str, connectGatt);
                return;
            }
            com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "connectGatt returned null for " + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MM.BLE.BLEDeviceManager", e17, "Exception during connectGatt: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
