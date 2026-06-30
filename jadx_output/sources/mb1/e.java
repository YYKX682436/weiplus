package mb1;

/* loaded from: classes7.dex */
public final class e extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325305n;

    public e(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        this.f325305n = deviceId;
    }

    @Override // ob1.c, lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "[onServicesDiscovered] status:%s", a17);
        if (i17 == 0) {
            p(ob1.m.f344018e);
        } else {
            p(new ob1.m(10008, "fail:not found service, " + ("status: " + a17), jc1.c.f298880d, null));
        }
        m();
    }

    @Override // ob1.c
    public void l() {
        if (qb1.b.d() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "action:%s, bluetoothAdapter is null", this);
            p(ob1.m.f344022i);
            m();
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "action:%s, bluetooth is not enable", this);
            p(ob1.m.f344022i);
            m();
            return;
        }
        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(this.f325305n)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "action:%s, unspecified deviceId", this);
            p(ob1.m.f344034u);
            m();
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f343986a.f317717e;
        if (bluetoothGatt == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f344025l);
            m();
        } else {
            if (bluetoothGatt.discoverServices()) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "action:%s, discoverServices fail", this);
            p(ob1.m.b("discoverServices fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "DiscoverServicesAction";
    }
}
