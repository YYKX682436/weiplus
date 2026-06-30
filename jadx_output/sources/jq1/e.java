package jq1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.UUID f301059i = java.util.UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.UUID f301060j = java.util.UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: a, reason: collision with root package name */
    public jq1.c f301061a;

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f301062b;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f301064d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f301065e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f301067g = false;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f301068h = new jq1.a(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f301063c = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f301066f = new jq1.b(this);

    public e(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f301065e = new com.tencent.mm.sdk.platformtools.n3(n3Var.getSerialTag());
    }

    public boolean a() {
        iz5.a.g(null, this.f301067g);
        return this.f301062b != null;
    }

    public boolean b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatManager", "scanDevices".concat(z17 ? "true" : "false"));
        iz5.a.g(null, this.f301067g);
        if (!a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return false;
        }
        if (!z17) {
            return c();
        }
        if (this.f301062b.isDiscovering() && !c()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatManager", "[BluetoothTrace] start scan");
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BluetoothChatManager", new java.lang.Throwable(), "[BluetoothTrace] startDiscovery stacktrace", new java.lang.Object[0]);
        if (((java.lang.Boolean) yj0.a.j(this.f301062b, "com/tencent/mm/plugin/bluetooth/sdk/classic/BluetoothChatManager", "scanDevices", "(Z)Z", "android/bluetooth/BluetoothAdapter", "startDiscovery", "()Z")).booleanValue()) {
            this.f301065e.postDelayed(this.f301066f, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.startDiscovery() Failed");
        return false;
    }

    public final boolean c() {
        if (!this.f301062b.isDiscovering()) {
            return true;
        }
        if (this.f301062b.cancelDiscovery()) {
            this.f301065e.removeCallbacks(this.f301066f);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.cancelDiscovery Failed!!!");
        return false;
    }
}
