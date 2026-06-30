package jq1;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public android.bluetooth.BluetoothSocket f301076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f301077b;

    /* renamed from: c, reason: collision with root package name */
    public final jq1.f f301078c;

    /* renamed from: d, reason: collision with root package name */
    public final jq1.e f301079d;

    /* renamed from: f, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f301081f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f301080e = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f301082g = new jq1.g(xu5.b.a("BluetoothChatThreads_handlerThread"), this);

    public h(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothDevice bluetoothDevice, boolean z17) {
        this.f301079d = eVar;
        this.f301078c = fVar;
        this.f301077b = z17;
        this.f301081f = bluetoothDevice;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ConnectThread", "------disconnect------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f301082g;
        if (!n3Var.sendMessage(n3Var.obtainMessage(1))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", 1);
        }
        n3Var.quitSafely();
    }
}
