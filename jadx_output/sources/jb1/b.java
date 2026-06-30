package jb1;

/* loaded from: classes7.dex */
public final class b extends android.bluetooth.BluetoothGattServerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f298695a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f298696b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public jb1.a0 f298697c;

    public final boolean a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "deviceNotExist: device == null");
            return true;
        }
        java.util.HashSet hashSet = this.f298695a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((android.bluetooth.BluetoothDevice) it.next()).getAddress());
        }
        if (arrayList.contains(bluetoothDevice.getAddress())) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "deviceNotExist: is not contain device");
        return true;
    }

    public final jb1.a0 b() {
        jb1.a0 a0Var = this.f298697c;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.o.o("server");
        throw null;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicReadRequest(android.bluetooth.BluetoothDevice device, int i17, int i18, android.bluetooth.BluetoothGattCharacteristic characteristic) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        boolean z17;
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(characteristic, "characteristic");
        super.onCharacteristicReadRequest(device, i17, i18, characteristic);
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "Device tried to read characteristic: " + characteristic.getUuid());
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "Value: " + java.util.Arrays.toString(characteristic.getValue()));
        if (!qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: no permission");
            return;
        }
        if (a(device)) {
            return;
        }
        if (i18 != 0) {
            try {
                b().a().sendResponse(device, i17, 7, i18, characteristic.getValue());
                return;
            } catch (java.lang.SecurityException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: no permission");
                return;
            }
        }
        int c17 = qb1.a.c();
        while (true) {
            concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f298696b;
            if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(c17))) {
                break;
            } else {
                c17 = qb1.a.c();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: callbackId = %d", java.lang.Integer.valueOf(c17));
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = b().f298690c;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
        java.lang.String address = device.getAddress();
        kotlin.jvm.internal.o.f(address, "getAddress(...)");
        int i19 = b().f298691d;
        java.lang.String uuid = characteristic.getService().getUuid().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String uuid2 = characteristic.getUuid().toString();
        kotlin.jvm.internal.o.f(uuid2, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnCharacteristicReadRequest: serverID = " + i19 + ", serviceUUID = " + uuid + ",\" +\n        \" characteristicUUID = " + uuid2 + ", callbackId = " + c17);
        try {
            jb1.v vVar = new jb1.v();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("serverId", i19);
            jSONObject.put("serviceId", uuid);
            jSONObject.put("characteristicId", uuid2);
            jSONObject.put("callbackId", c17);
            jSONObject.put("deviceId", address);
            vVar.r(jSONObject.toString());
            vVar.p(lVar);
            vVar.m();
            z17 = true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "OnCharacteristicReadRequest: fail", e17);
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: pendingWriteReqList ret = " + ((jb1.x) concurrentHashMap.put(java.lang.Integer.valueOf(c17), new jb1.x(device, i17, i18))) + " id = " + c17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.bluetooth.BluetoothGattServerCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice r17, int r18, android.bluetooth.BluetoothGattCharacteristic r19, boolean r20, boolean r21, int r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.b.onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice, int, android.bluetooth.BluetoothGattCharacteristic, boolean, boolean, int, byte[]):void");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothDevice device, int i17, int i18) {
        kotlin.jvm.internal.o.g(device, "device");
        super.onConnectionStateChange(device, i17, i18);
        java.util.HashSet hashSet = this.f298695a;
        if (i17 != 0) {
            hashSet.remove(device);
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.GattServerCallbackImpl", "Error when connecting: " + i17);
            return;
        }
        if (i18 == 0) {
            hashSet.remove(device);
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = b().f298690c;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("component");
                throw null;
            }
            java.lang.String address = device.getAddress();
            kotlin.jvm.internal.o.f(address, "getAddress(...)");
            jb1.a.a(lVar, address, java.lang.String.valueOf(b().f298691d), false);
            b().f298688a = jb1.e0.f298711e;
            return;
        }
        if (i18 != 2) {
            return;
        }
        hashSet.add(device);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = b().f298690c;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
        java.lang.String address2 = device.getAddress();
        kotlin.jvm.internal.o.f(address2, "getAddress(...)");
        jb1.a.a(lVar2, address2, java.lang.String.valueOf(b().f298691d), true);
        b().f298688a = jb1.e0.f298712f;
        device.getAddress();
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorReadRequest(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, int i18, android.bluetooth.BluetoothGattDescriptor descriptor) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        super.onDescriptorReadRequest(bluetoothDevice, i17, i18, descriptor);
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "Device tried to read descriptor: " + descriptor.getUuid());
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "Value: " + java.util.Arrays.toString(descriptor.getValue()));
        if (!qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BLE.GattServerCallbackImpl", "onDescriptorReadRequest: no permission");
            return;
        }
        try {
            if (i18 != 0) {
                b().a().sendResponse(bluetoothDevice, i17, 7, i18, null);
            } else {
                b().a().sendResponse(bluetoothDevice, i17, 0, i18, descriptor.getValue());
            }
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.GattServerCallbackImpl", "onDescriptorReadRequest: " + e17.getMessage());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorWriteRequest(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, android.bluetooth.BluetoothGattDescriptor descriptor, boolean z17, boolean z18, int i18, byte[] value) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        kotlin.jvm.internal.o.g(value, "value");
        super.onDescriptorWriteRequest(bluetoothDevice, i17, descriptor, z17, z18, i18, value);
        if (!qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BLE.GattServerCallbackImpl", "onDescriptorWriteRequest: android.permission.BLUETOOTH_CONNECT is not granted");
            return;
        }
        try {
            java.util.Objects.toString(descriptor.getUuid());
            java.util.Arrays.toString(value);
            if (z18) {
                b().a().sendResponse(bluetoothDevice, i17, 0, 0, null);
            }
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.GattServerCallbackImpl", "onDescriptorWriteRequest: " + e17.getMessage());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onNotificationSent(android.bluetooth.BluetoothDevice bluetoothDevice, int i17) {
        super.onNotificationSent(bluetoothDevice, i17);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onServiceAdded(int i17, android.bluetooth.BluetoothGattService bluetoothGattService) {
        yz5.l lVar;
        java.util.Timer timer;
        super.onServiceAdded(i17, bluetoothGattService);
        if (bluetoothGattService == null || bluetoothGattService.getUuid() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.GattServerCallbackImpl", "onServiceAdded: " + bluetoothGattService.getUuid());
        jb1.a0 b17 = b();
        java.util.UUID uuid = bluetoothGattService.getUuid();
        kotlin.jvm.internal.o.f(uuid, "getUuid(...)");
        java.util.HashMap hashMap = (java.util.HashMap) b17.f298693f;
        jz5.l lVar2 = (jz5.l) hashMap.get(uuid);
        if (lVar2 != null && (timer = (java.util.Timer) lVar2.f302834e) != null) {
            timer.cancel();
        }
        jz5.l lVar3 = (jz5.l) hashMap.get(uuid);
        if (lVar3 != null && (lVar = (yz5.l) lVar3.f302833d) != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        hashMap.remove(uuid);
    }
}
