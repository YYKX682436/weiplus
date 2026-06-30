package jb1;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb1.i f298720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f298721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jb1.i iVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(0);
        this.f298720d = iVar;
        this.f298721e = i17;
        this.f298722f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int c17;
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        java.util.HashMap hashMap = new java.util.HashMap();
        jb1.d0 d0Var = jb1.d0.f298705a;
        boolean z17 = false;
        if (((java.util.concurrent.ConcurrentHashMap) jb1.d0.f298706b).size() + 1 > 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: out of bound");
            qb1.a.a(this.f298720d, this.f298721e, this.f298722f, 10008, "fail: servers count overflow", null, 16, null);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.l component = this.f298722f;
            kotlin.jvm.internal.o.g(component, "component");
            synchronized (d0Var) {
                if (jb1.d0.f298707c == null) {
                    jb1.d0.f298707c = new jb1.b0();
                    com.tencent.mm.plugin.appbrand.x0.a(component.getAppId(), jb1.d0.f298707c);
                }
                if (jb1.d0.f298708d == null) {
                    jb1.d0.f298708d = new jb1.c0(component);
                    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.a(component.getAppId(), jb1.d0.f298708d);
                }
                if (jb1.d0.f298709e) {
                    c17 = -1;
                } else {
                    do {
                        c17 = qb1.a.c();
                    } while (((java.util.concurrent.ConcurrentHashMap) jb1.d0.f298706b).containsKey(java.lang.Integer.valueOf(c17)));
                    jb1.a0 a0Var = new jb1.a0();
                    android.bluetooth.BluetoothManager e17 = qb1.b.e();
                    boolean c18 = qb1.b.c() & true;
                    android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
                    if (d17 != null) {
                        d17.isMultipleAdvertisementSupported();
                        d17.isOffloadedFilteringSupported();
                        d17.isOffloadedScanBatchingSupported();
                        d17.getBluetoothLeAdvertiser();
                        z17 = d17.getBluetoothLeAdvertiser() != null;
                    }
                    if ((!(c18 & z17) || !qb1.b.b()) || e17 == null) {
                        jb1.e0 e0Var = jb1.e0.f298710d;
                    } else {
                        a0Var.f298688a = jb1.e0.f298711e;
                        a0Var.f298690c = component;
                        a0Var.f298691d = c17;
                        jb1.b bVar = new jb1.b();
                        a0Var.f298694g = bVar;
                        try {
                            bluetoothGattServer = e17.openGattServer(com.tencent.mm.sdk.platformtools.x2.f193071a, bVar);
                        } catch (java.lang.SecurityException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.PeripheralBleServer", "openGattServer: " + e18.getMessage());
                            bluetoothGattServer = null;
                        }
                        if (bluetoothGattServer == null) {
                            a0Var.f298688a = jb1.e0.f298714h;
                        } else {
                            a0Var.f298689b = bluetoothGattServer;
                            jb1.b bVar2 = a0Var.f298694g;
                            kotlin.jvm.internal.o.d(bVar2);
                            bVar2.f298697c = a0Var;
                        }
                    }
                    ((java.util.concurrent.ConcurrentHashMap) jb1.d0.f298706b).put(java.lang.Integer.valueOf(c17), a0Var);
                }
            }
            jb1.a0 b17 = jb1.d0.f298705a.b(c17);
            if (b17 == null || b17.f298688a != jb1.e0.f298711e) {
                qb1.a.a(this.f298720d, this.f298721e, this.f298722f, 10001, "fail:not available", null, 16, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: serverId = " + c17);
                hashMap.put("serverId", java.lang.Integer.valueOf(c17));
                qb1.a.b(this.f298720d, this.f298721e, this.f298722f, hashMap);
            }
        }
        return jz5.f0.f302826a;
    }
}
