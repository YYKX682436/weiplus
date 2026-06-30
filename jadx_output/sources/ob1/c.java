package ob1;

/* loaded from: classes7.dex */
public abstract class c implements lb1.l {

    /* renamed from: a, reason: collision with root package name */
    public lb1.k f343986a;

    /* renamed from: b, reason: collision with root package name */
    public lb1.d f343987b;

    /* renamed from: c, reason: collision with root package name */
    public ob1.d f343988c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f343989d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f343990e = new ob1.a(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f343991f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343992g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f343993h;

    /* renamed from: i, reason: collision with root package name */
    public long f343994i;

    /* renamed from: j, reason: collision with root package name */
    public final long f343995j;

    /* renamed from: k, reason: collision with root package name */
    public ob1.m f343996k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f343997l;

    /* renamed from: m, reason: collision with root package name */
    public final int f343998m;

    public c() {
        kb1.b.a().getClass();
        this.f343991f = false;
        kb1.b.a().getClass();
        this.f343992g = true;
        kb1.b.a().getClass();
        this.f343993h = true;
        kb1.b.a().getClass();
        this.f343994i = 33000L;
        kb1.b.a().getClass();
        this.f343995j = 10;
        this.f343997l = false;
        this.f343998m = hashCode();
    }

    @Override // lb1.l
    public void a(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void b(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
    }

    @Override // lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
    }

    @Override // lb1.l
    public void d(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @Override // lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
    }

    @Override // lb1.l
    public void f(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
    }

    @Override // lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
    }

    @Override // lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
    }

    public void k() {
        iz5.a.d(null, this.f343986a);
        iz5.a.d(null, this.f343987b);
        iz5.a.d(null, this.f343988c);
        this.f343989d.postDelayed(this.f343990e, this.f343994i);
        l();
    }

    public abstract void l();

    public void m() {
        this.f343989d.removeCallbacks(this.f343990e);
        this.f343997l = true;
        o(this.f343996k);
        lb1.d dVar = this.f343987b;
        java.lang.Object obj = this.f343996k;
        dVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this;
        if (obj == null) {
            obj = "";
        }
        objArr[1] = obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback action:%s result:%s", objArr);
        if (this.f343993h) {
            dVar.k();
            return;
        }
        java.util.List list = dVar.f317702c;
        if (list != null) {
            ((java.util.ArrayList) list).remove(this);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback, runActions is null", new java.lang.Object[0]);
        }
    }

    public abstract java.lang.String n();

    public void o(ob1.m mVar) {
    }

    public void p(ob1.m mVar) {
        this.f343996k = mVar;
        if (this.f343992g) {
            this.f343989d.post(new ob1.b(this, mVar));
        } else {
            this.f343988c.a(mVar);
        }
    }

    public java.lang.String toString() {
        return "Action#" + this.f343998m + "{action='" + n() + "', debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
