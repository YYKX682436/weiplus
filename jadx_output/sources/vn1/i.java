package vn1;

/* loaded from: classes7.dex */
public final class i extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438207a;

    public i(vn1.m mVar) {
        this.f438207a = mVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
        kotlin.jvm.internal.o.g(gatt, "gatt");
        kotlin.jvm.internal.o.g(characteristic, "characteristic");
        java.util.UUID uuid = characteristic.getUuid();
        vn1.m mVar = this.f438207a;
        if (kotlin.jvm.internal.o.b(uuid, mVar.f438215c)) {
            java.lang.String address = gatt.getDevice().getAddress();
            kotlin.jvm.internal.o.f(address, "getAddress(...)");
            byte[] value = characteristic.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            vn1.m.a(mVar, address, value);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        this.f438207a.g();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt gatt, int i17, int i18) {
        kotlin.jvm.internal.o.g(gatt, "gatt");
        java.lang.String address = gatt.getDevice().getAddress();
        if (i18 != 0) {
            if (i18 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Client: Connected to " + address + ", discovering...");
            gatt.discoverServices();
            return;
        }
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Client: Disconnected from " + address);
        vn1.m mVar = this.f438207a;
        mVar.f438223k.remove(address);
        mVar.f438224l.remove(address);
        mVar.f438229q.remove(address);
        vn1.a aVar = mVar.f438214b;
        if (aVar != null) {
            kotlin.jvm.internal.o.d(address);
            aVar.c(address);
        }
        gatt.close();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        android.bluetooth.BluetoothDevice device;
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i17);
        if (i17 == 0) {
            java.lang.String str = null;
            java.util.UUID uuid = bluetoothGattDescriptor != null ? bluetoothGattDescriptor.getUuid() : null;
            java.util.UUID uuid2 = vn1.m.f438211w;
            if (kotlin.jvm.internal.o.b(uuid, vn1.m.f438212x)) {
                if (bluetoothGatt != null && (device = bluetoothGatt.getDevice()) != null) {
                    str = device.getAddress();
                }
                if (str == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "CCCD written successfully. iOS should now receive didSubscribe.");
                vn1.a aVar = this.f438207a.f438214b;
                if (aVar != null) {
                    aVar.e(str);
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int i17) {
        kotlin.jvm.internal.o.g(gatt, "gatt");
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Client: Services discovered: " + i17);
        if (i17 == 0) {
            java.util.UUID uuid = vn1.m.f438211w;
            android.bluetooth.BluetoothGattService service = gatt.getService(vn1.m.f438211w);
            vn1.m mVar = this.f438207a;
            android.bluetooth.BluetoothGattCharacteristic characteristic = service != null ? service.getCharacteristic(mVar.f438215c) : null;
            if (characteristic != null) {
                java.lang.String address = gatt.getDevice().getAddress();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f438224l;
                kotlin.jvm.internal.o.d(address);
                concurrentHashMap.put(address, characteristic);
                gatt.setCharacteristicNotification(characteristic, true);
                android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(vn1.m.f438212x);
                if (descriptor == null) {
                    com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "Could not find CCCD descriptor for characteristic");
                    return;
                }
                descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Writing CCCD to iOS: " + gatt.writeDescriptor(descriptor));
            }
        }
    }
}
