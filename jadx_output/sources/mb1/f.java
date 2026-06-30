package mb1;

/* loaded from: classes7.dex */
public final class f extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325306n = "MicroMsg.Ble.Action#" + hashCode();

    @Override // ob1.c, lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.String a17 = ob1.h.a(i18);
        com.tencent.mars.xlog.Log.i(this.f325306n, "onReadRemoteRssi, rssi: %d, statusDesc: %s", java.lang.Integer.valueOf(i17), a17);
        if (i18 != 0) {
            p(ob1.m.a("status: " + a17));
            m();
            return;
        }
        if (kotlin.jvm.internal.o.b(this.f343986a.f317717e, bluetoothGatt)) {
            p(new ob1.m(0, "", jc1.f.f298912a, java.lang.Integer.valueOf(i17)));
            m();
        } else {
            com.tencent.mars.xlog.Log.w(this.f325306n, "bluetoothGatt is not match", new java.lang.Object[0]);
            p(new ob1.m(-1, "fail:internal error", jc1.f.f298915d, null));
            m();
        }
    }

    @Override // ob1.c
    public void l() {
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.w(this.f325306n, "Bluetooth is not enable.", new java.lang.Object[0]);
            p(ob1.m.f344022i);
            m();
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f343986a.f317717e;
        if (bluetoothGatt == null) {
            com.tencent.mars.xlog.Log.w(this.f325306n, "bluetoothGatt is null", new java.lang.Object[0]);
            p(ob1.m.f344025l);
            m();
        } else {
            if (bluetoothGatt.readRemoteRssi()) {
                return;
            }
            p(ob1.m.b("readRemoteRssi fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "GetBLEDeviceRSSIAction";
    }
}
