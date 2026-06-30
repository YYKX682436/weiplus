package jb1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothGattServer f298689b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f298690c;

    /* renamed from: g, reason: collision with root package name */
    public jb1.b f298694g;

    /* renamed from: a, reason: collision with root package name */
    public jb1.e0 f298688a = jb1.e0.f298710d;

    /* renamed from: d, reason: collision with root package name */
    public int f298691d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f298692e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f298693f = new java.util.HashMap();

    public final android.bluetooth.BluetoothGattServer a() {
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.f298689b;
        if (bluetoothGattServer != null) {
            return bluetoothGattServer;
        }
        kotlin.jvm.internal.o.o("gattServer");
        throw null;
    }

    public final void b(java.util.UUID serviceId, java.util.UUID characteristicId, boolean z17, int i17, java.lang.String base64Value) {
        kotlin.jvm.internal.o.g(serviceId, "serviceId");
        kotlin.jvm.internal.o.g(characteristicId, "characteristicId");
        kotlin.jvm.internal.o.g(base64Value, "base64Value");
        if (qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
            try {
                android.bluetooth.BluetoothGattService service = a().getService(serviceId);
                if (service == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: server == null");
                    return;
                }
                android.bluetooth.BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicId);
                if (characteristic == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: characteristic == null");
                    return;
                }
                characteristic.setValue(qb1.b.a(android.util.Base64.decode(base64Value, 2)));
                if (z17) {
                    jb1.b bVar = this.f298694g;
                    kotlin.jvm.internal.o.d(bVar);
                    java.util.Iterator it = bVar.f298695a.iterator();
                    while (it.hasNext()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", java.lang.String.valueOf(a().notifyCharacteristicChanged((android.bluetooth.BluetoothDevice) it.next(), characteristic, false)));
                    }
                } else {
                    jb1.b bVar2 = this.f298694g;
                    kotlin.jvm.internal.o.d(bVar2);
                    java.util.Iterator it6 = bVar2.f298695a.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", java.lang.String.valueOf(a().notifyCharacteristicChanged((android.bluetooth.BluetoothDevice) it6.next(), characteristic, true)));
                    }
                }
                jb1.b bVar3 = this.f298694g;
                kotlin.jvm.internal.o.d(bVar3);
                jb1.x xVar = (jb1.x) ((java.util.concurrent.ConcurrentHashMap) bVar3.f298696b).get(java.lang.Integer.valueOf(i17));
                if (xVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: #" + i17 + " callbackId -> pendingResp is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: device = %s, requestId = %s", xVar.f298747a.toString(), java.lang.String.valueOf(xVar.f298748b));
                if (!a().sendResponse(xVar.f298747a, xVar.f298748b, 0, xVar.f298749c, characteristic.getValue())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BLE.PeripheralBleServer", "sendPendingRespFail");
                }
                jb1.b bVar4 = this.f298694g;
                kotlin.jvm.internal.o.d(bVar4);
                ((java.util.concurrent.ConcurrentHashMap) bVar4.f298696b).remove(java.lang.Integer.valueOf(i17));
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: " + e17.getMessage());
            }
        }
    }

    public final void c() {
        java.util.Map map;
        ((java.util.HashMap) this.f298693f).clear();
        try {
            if (this.f298689b != null) {
                a().close();
            }
        } catch (java.lang.SecurityException unused) {
        }
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 != null) {
            d(d17);
        }
        jb1.b bVar = this.f298694g;
        if (bVar != null && (map = bVar.f298696b) != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        this.f298694g = null;
        this.f298688a = jb1.e0.f298713g;
    }

    public final void d(android.bluetooth.BluetoothAdapter adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = adapter.getBluetoothLeAdvertiser();
        if (bluetoothLeAdvertiser == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList<android.bluetooth.le.AdvertiseCallback> copyOnWriteArrayList = this.f298692e;
        for (android.bluetooth.le.AdvertiseCallback advertiseCallback : copyOnWriteArrayList) {
            try {
                bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BLE.PeripheralBleServer", "stopAdvertising: " + e17.getMessage());
            }
            arrayList.add(advertiseCallback);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.remove((android.bluetooth.le.AdvertiseCallback) it.next());
        }
    }
}
