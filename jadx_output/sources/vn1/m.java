package vn1;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.UUID f438211w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.UUID f438212x;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f438213a;

    /* renamed from: b, reason: collision with root package name */
    public vn1.a f438214b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.UUID f438215c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f438216d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f438217e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f438218f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f438219g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f438220h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f438221i;

    /* renamed from: j, reason: collision with root package name */
    public android.bluetooth.BluetoothGattServer f438222j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f438223k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f438224l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f438225m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f438226n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f438227o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f438228p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f438229q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f438230r;

    /* renamed from: s, reason: collision with root package name */
    public final vn1.c f438231s;

    /* renamed from: t, reason: collision with root package name */
    public final vn1.k f438232t;

    /* renamed from: u, reason: collision with root package name */
    public final vn1.j f438233u;

    /* renamed from: v, reason: collision with root package name */
    public final vn1.i f438234v;

    static {
        java.util.UUID fromString = java.util.UUID.fromString("16E65CF9-F3AB-4470-844C-45C7B5557047");
        kotlin.jvm.internal.o.f(fromString, "fromString(...)");
        f438211w = fromString;
        f438212x = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    }

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f438213a = context;
        this.f438216d = new java.util.concurrent.ConcurrentHashMap();
        this.f438217e = jz5.h.b(new vn1.g(this));
        this.f438218f = jz5.h.b(new vn1.d(this));
        this.f438219g = jz5.h.b(new vn1.e(this));
        this.f438220h = jz5.h.b(new vn1.f(this));
        this.f438221i = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f438223k = new java.util.concurrent.ConcurrentHashMap();
        this.f438224l = new java.util.concurrent.ConcurrentHashMap();
        this.f438225m = new java.util.concurrent.ConcurrentHashMap();
        this.f438226n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f438228p = new java.lang.Object();
        this.f438229q = new java.util.concurrent.ConcurrentHashMap();
        this.f438231s = new vn1.c(this);
        this.f438232t = new vn1.k(this);
        this.f438233u = new vn1.j(this);
        this.f438234v = new vn1.i(this);
    }

    public static final void a(vn1.m mVar, java.lang.String str, byte[] bArr) {
        java.lang.Object putIfAbsent;
        mVar.getClass();
        if (bArr.length == 0) {
            return;
        }
        byte b17 = bArr[0];
        byte[] q17 = kz5.v.q(bArr, 1, bArr.length);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f438229q;
        java.lang.Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new java.io.ByteArrayOutputStream()))) != null) {
            obj = putIfAbsent;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = (java.io.ByteArrayOutputStream) obj;
        try {
            byteArrayOutputStream.write(q17);
            if (b17 == 1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Reassembled message from " + str + ", total size: " + byteArray.length);
                vn1.a aVar = mVar.f438214b;
                if (aVar != null) {
                    aVar.b(str, byteArray);
                }
                byteArrayOutputStream.reset();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "Error assembling packet: " + e17);
            byteArrayOutputStream.reset();
        }
    }

    public final boolean b(byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        for (java.lang.String str : this.f438223k.keySet()) {
            kotlin.jvm.internal.o.d(str);
            h(str, data);
        }
        return !r0.isEmpty();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Cleanup BLE");
        i();
        j();
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.f438222j;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
        this.f438222j = null;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f438223k;
        java.util.Collection<android.bluetooth.BluetoothGatt> values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (android.bluetooth.BluetoothGatt bluetoothGatt : values) {
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
        }
        concurrentHashMap.clear();
        this.f438224l.clear();
        this.f438225m.clear();
        this.f438229q.clear();
        this.f438226n.clear();
    }

    public final boolean d(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Disconnect device ".concat(deviceId));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f438223k;
        android.bluetooth.BluetoothGatt bluetoothGatt = (android.bluetooth.BluetoothGatt) concurrentHashMap.get(deviceId);
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        android.bluetooth.BluetoothGatt bluetoothGatt2 = (android.bluetooth.BluetoothGatt) concurrentHashMap.get(deviceId);
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        concurrentHashMap.remove(deviceId);
        return true;
    }

    public final android.bluetooth.BluetoothAdapter e() {
        return (android.bluetooth.BluetoothAdapter) ((jz5.n) this.f438218f).getValue();
    }

    public final void f(vn1.b bVar) {
        java.lang.String str = bVar.f438196a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f438223k;
        boolean containsKey = concurrentHashMap.containsKey(str);
        boolean z17 = false;
        byte[] bArr = bVar.f438197b;
        if (containsKey) {
            android.bluetooth.BluetoothGatt bluetoothGatt = (android.bluetooth.BluetoothGatt) concurrentHashMap.get(str);
            android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = (android.bluetooth.BluetoothGattCharacteristic) this.f438224l.get(str);
            if (bluetoothGatt != null && bluetoothGattCharacteristic != null) {
                bluetoothGattCharacteristic.setValue(bArr);
                z17 = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f438225m;
            if (concurrentHashMap2.containsKey(str)) {
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) concurrentHashMap2.get(str);
                android.bluetooth.BluetoothGattServer bluetoothGattServer = this.f438222j;
                android.bluetooth.BluetoothGattService service = bluetoothGattServer != null ? bluetoothGattServer.getService(f438211w) : null;
                android.bluetooth.BluetoothGattCharacteristic characteristic = service != null ? service.getCharacteristic(this.f438215c) : null;
                if (bluetoothDevice != null && bluetoothGattServer != null && characteristic != null) {
                    characteristic.setValue(bArr);
                    z17 = bluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, characteristic, false);
                }
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "Failed to initiate write/notify to " + str);
        g();
    }

    public final void g() {
        synchronized (this.f438228p) {
            this.f438226n.poll();
            this.f438227o = false;
        }
        k();
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final boolean h(java.lang.String deviceId, byte[] data) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Request to send message to " + deviceId + ", total size: " + data.length);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (i17 < data.length) {
            int length = data.length - i17;
            if (length > 19) {
                length = 19;
            }
            int i18 = i17 + length;
            byte b17 = i18 >= data.length ? 1 : 0;
            byte[] bArr = new byte[length + 1];
            bArr[0] = b17;
            java.lang.System.arraycopy(data, i17, bArr, 1, length);
            arrayList.add(new vn1.b(deviceId, bArr, b17));
            i17 = i18;
        }
        synchronized (this.f438228p) {
            this.f438226n.addAll(arrayList);
        }
        k();
        return true;
    }

    public final void i() {
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "Stop advertising");
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = (android.bluetooth.le.BluetoothLeAdvertiser) ((jz5.n) this.f438219g).getValue();
        if (bluetoothLeAdvertiser != null) {
            bluetoothLeAdvertiser.stopAdvertising(this.f438231s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1.isEnabled() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            java.lang.String r0 = "MM.BLE.BLEDeviceManager"
            java.lang.String r1 = "Stop scanning"
            com.tencent.mars.xlog.Log.i(r0, r1)
            android.bluetooth.BluetoothAdapter r1 = r5.e()
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = r1.isEnabled()
            r3 = 1
            if (r1 != r3) goto L16
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != 0) goto L21
            java.lang.String r1 = "Bluetooth is not enabled, skip stopScan"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r5.f438230r = r2
            return
        L21:
            jz5.g r1 = r5.f438220h     // Catch: java.lang.Exception -> L33
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Exception -> L33
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L33
            android.bluetooth.le.BluetoothLeScanner r1 = (android.bluetooth.le.BluetoothLeScanner) r1     // Catch: java.lang.Exception -> L33
            if (r1 == 0) goto L49
            vn1.k r3 = r5.f438232t     // Catch: java.lang.Exception -> L33
            r1.stopScan(r3)     // Catch: java.lang.Exception -> L33
            goto L49
        L33:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error stopping scan: "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L49:
            r5.f438230r = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn1.m.j():void");
    }

    public final void k() {
        synchronized (this.f438228p) {
            if (!this.f438227o && (!this.f438226n.isEmpty())) {
                this.f438227o = true;
                vn1.b bVar = (vn1.b) this.f438226n.peek();
                if (bVar != null) {
                    f(bVar);
                } else {
                    this.f438227o = false;
                }
            }
        }
    }
}
