package mb1;

/* loaded from: classes7.dex */
public class d extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325299n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f325300o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f325301p = "LE";

    /* renamed from: q, reason: collision with root package name */
    public long f325302q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f325303r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f325304s = true;

    public d(java.lang.String str) {
        this.f325299n = str;
    }

    @Override // ob1.c, lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.toString() : "";
        objArr[1] = ob1.h.a(i17);
        objArr[2] = i18 == 2 ? "CONNECTED" : "DISCONNECTED";
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange]gatt:%s gattStatus:%s, newState:%s", objArr);
        this.f343986a.f317717e = bluetoothGatt;
        if (i18 != 2) {
            if (i18 == 0) {
                this.f343989d.post(new mb1.c(this, i17));
            }
        } else {
            if (bluetoothGatt == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] gatt is null", new java.lang.Object[0]);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] discoverServicesDelayMills: " + this.f325302q, new java.lang.Object[0]);
            this.f343989d.postDelayed(new mb1.b(this, bluetoothGatt, i17), this.f325302q);
        }
    }

    @Override // ob1.c, lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "[onServicesDiscovered] status:%s", a17);
        this.f343986a.f317717e = bluetoothGatt;
        if (i17 == 0) {
            p(ob1.m.f344018e);
        } else {
            p(new ob1.m(10008, "fail:not found service, " + ("status: " + a17), jc1.c.f298880d, null));
        }
        m();
        lb1.k kVar = this.f343986a;
        kVar.getClass();
        if (bluetoothGatt != null && i17 == 0) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            ob1.k kVar2 = kVar.f317720h;
            if (kVar2 == null) {
                com.tencent.mars.xlog.Log.w(kVar.f317713a, "notifyConnectionStateChange, onBleConnectionStateChange is null", new java.lang.Object[0]);
            } else {
                kVar2.a(address, true);
            }
        }
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGatt connectGatt;
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.ConnectAction", "action:%s, bluetoothAdapter is null", this);
            p(ob1.m.f344022i);
            m();
            return;
        }
        java.lang.String str = this.f325299n;
        if (str == null || !android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.ConnectAction", "action:%s, unspecified deviceId", this);
            p(ob1.m.f344034u);
            m();
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.ConnectAction", "bluetooth is not enable.", new java.lang.Object[0]);
            p(ob1.m.f344022i);
            m();
            return;
        }
        if (this.f343986a.f317717e != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.ConnectAction", "already connect, please close", new java.lang.Object[0]);
            p(ob1.m.f344033t);
            m();
            return;
        }
        android.bluetooth.BluetoothDevice remoteDevice = d17.getRemoteDevice(this.f325299n);
        if (remoteDevice == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.ConnectAction", "Device not found, deviceId=%s", this.f325299n);
            p(ob1.m.f344020g);
            m();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "autoConnect:%b transport:%s", java.lang.Boolean.valueOf(this.f325300o), this.f325301p);
        java.lang.String upperCase = this.f325301p.toUpperCase();
        upperCase.getClass();
        char c17 = 65535;
        switch (upperCase.hashCode()) {
            case 2425:
                if (upperCase.equals("LE")) {
                    c17 = 0;
                    break;
                }
                break;
            case 2020783:
                if (upperCase.equals("AUTO")) {
                    c17 = 1;
                    break;
                }
                break;
            case 63463747:
                if (upperCase.equals("BREDR")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                connectGatt = remoteDevice.connectGatt(this.f343986a.f317714b, this.f325300o, new lb1.a(this.f343986a), 2);
                break;
            case 1:
                connectGatt = remoteDevice.connectGatt(this.f343986a.f317714b, this.f325300o, new lb1.a(this.f343986a), 0);
                break;
            case 2:
                connectGatt = remoteDevice.connectGatt(this.f343986a.f317714b, this.f325300o, new lb1.a(this.f343986a), 1);
                break;
            default:
                connectGatt = remoteDevice.connectGatt(this.f343986a.f317714b, this.f325300o, new lb1.a(this.f343986a), 2);
                break;
        }
        if (connectGatt != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "mBluetoothGatt:%s", connectGatt);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this.f325299n;
            objArr[1] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "create a new connection deviceId=%s mainthread:%b", objArr);
            this.f343986a.f317717e = connectGatt;
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = this.f325299n;
        objArr2[1] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
        com.tencent.mars.xlog.Log.e("MicroMsg.Ble.ConnectAction", "Get Gatt fail!, deviceId=%s mainthread:%b", objArr2);
        p(ob1.m.a("gatt is null"));
        m();
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "ConnectAction";
    }

    @Override // ob1.c
    public void o(ob1.m mVar) {
        if (mVar.f344038a != 10012) {
            return;
        }
        this.f343986a.k(false);
    }

    @Override // ob1.c
    public java.lang.String toString() {
        return "ConnectAction#" + this.f343998m + "{deviceId='" + this.f325299n + "', debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
