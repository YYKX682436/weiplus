package hq1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f283179a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f283180b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f283181c;

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothGatt f283182d;

    /* renamed from: e, reason: collision with root package name */
    public final hq1.j f283183e;

    /* renamed from: f, reason: collision with root package name */
    public android.bluetooth.BluetoothGattCharacteristic f283184f;

    /* renamed from: g, reason: collision with root package name */
    public android.bluetooth.BluetoothGattCharacteristic f283185g;

    /* renamed from: h, reason: collision with root package name */
    public final hq1.a f283186h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f283187i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f283188j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f283189k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f283190l;

    /* renamed from: p, reason: collision with root package name */
    public int f283194p;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f283192n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f283193o = false;

    /* renamed from: q, reason: collision with root package name */
    public final android.bluetooth.BluetoothGattCallback f283195q = new hq1.o(this);

    /* renamed from: m, reason: collision with root package name */
    public final hq1.t f283191m = this;

    public t(long j17, android.content.Context context, hq1.j jVar) {
        this.f283183e = jVar;
        this.f283181c = context;
        android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f283179a = j17;
        this.f283194p = 3;
        this.f283180b = adapter.getRemoteDevice(a42.i.f(j17));
        this.f283184f = null;
        this.f283185g = null;
        this.f283186h = new hq1.a(20);
        this.f283187i = new hq1.s(xu5.b.a("BluetoothLESession_handlerThread"), this);
        this.f283188j = new hq1.p(this);
        this.f283189k = new hq1.q(this);
        this.f283190l = new hq1.r(this);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------close------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283187i;
        if (!n3Var.sendMessage(n3Var.obtainMessage(2))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 2);
        }
        n3Var.quitSafely();
    }

    public boolean b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283187i;
        return n3Var.sendMessage(n3Var.obtainMessage(0));
    }

    public final void c() {
        if (this.f283192n.isEmpty()) {
            this.f283193o = false;
            return;
        }
        byte[] bArr = (byte[]) this.f283192n.pop();
        hq1.a aVar = this.f283186h;
        if (bArr == null) {
            aVar.f283077a = null;
            aVar.f283079c = 0;
            aVar.f283078b = 0;
        } else {
            aVar.getClass();
            byte[] bArr2 = new byte[bArr.length];
            aVar.f283077a = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f283079c = bArr.length;
            aVar.f283078b = 0;
        }
        byte[] a17 = this.f283186h.a();
        a42.i.a(a17);
        this.f283185g.setValue(a17);
        this.f283187i.postDelayed(this.f283188j, 5000L);
        if (!this.f283182d.writeCharacteristic(this.f283185g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
        }
        this.f283193o = true;
    }
}
