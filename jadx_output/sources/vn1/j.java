package vn1;

/* loaded from: classes7.dex */
public final class j extends android.bluetooth.BluetoothGattServerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438208a;

    public j(vn1.m mVar) {
        this.f438208a = mVar;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice device, int i17, android.bluetooth.BluetoothGattCharacteristic characteristic, boolean z17, boolean z18, int i18, byte[] value) {
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(characteristic, "characteristic");
        kotlin.jvm.internal.o.g(value, "value");
        super.onCharacteristicWriteRequest(device, i17, characteristic, z17, z18, i18, value);
        java.util.UUID uuid = characteristic.getUuid();
        vn1.m mVar = this.f438208a;
        if (kotlin.jvm.internal.o.b(uuid, mVar.f438215c)) {
            java.lang.String address = device.getAddress();
            kotlin.jvm.internal.o.f(address, "getAddress(...)");
            vn1.m.a(mVar, address, value);
            if (!z18 || (bluetoothGattServer = mVar.f438222j) == null) {
                return;
            }
            bluetoothGattServer.sendResponse(device, i17, 0, i18, value);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothDevice device, int i17, int i18) {
        kotlin.jvm.internal.o.g(device, "device");
        super.onConnectionStateChange(device, i17, i18);
        java.lang.String address = device.getAddress();
        vn1.m mVar = this.f438208a;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Server: Central disconnected: " + address);
            mVar.f438225m.remove(address);
            mVar.f438229q.remove(address);
            vn1.a aVar = mVar.f438214b;
            if (aVar != null) {
                kotlin.jvm.internal.o.d(address);
                aVar.c(address);
                return;
            }
            return;
        }
        if (i18 != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Server: Central connected: " + address);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f438225m;
        kotlin.jvm.internal.o.d(address);
        concurrentHashMap.put(address, device);
        vn1.a aVar2 = mVar.f438214b;
        if (aVar2 != null) {
            aVar2.e(address);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onNotificationSent(android.bluetooth.BluetoothDevice bluetoothDevice, int i17) {
        super.onNotificationSent(bluetoothDevice, i17);
        this.f438208a.g();
    }
}
