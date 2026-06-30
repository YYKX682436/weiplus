package mb1;

/* loaded from: classes7.dex */
public final class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f325314a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f325315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb1.j f325316c;

    public i(mb1.j jVar, android.content.Context context, android.bluetooth.BluetoothDevice device) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(device, "device");
        this.f325316c = jVar;
        this.f325314a = context;
        this.f325315b = device;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f325315b;
        if (kotlin.jvm.internal.o.b(bluetoothDevice, parcelableExtra)) {
            mb1.j jVar = this.f325316c;
            com.tencent.mars.xlog.Log.i(jVar.f325321r, "onReceive, intent: " + intent, new java.lang.Object[0]);
            if (!kotlin.jvm.internal.o.b("android.bluetooth.device.action.PAIRING_REQUEST", intent.getAction())) {
                if (kotlin.jvm.internal.o.b("android.bluetooth.device.action.BOND_STATE_CHANGED", intent.getAction())) {
                    if (!intent.hasExtra("android.bluetooth.device.extra.BOND_STATE")) {
                        com.tencent.mars.xlog.Log.w(jVar.f325321r, "Cannot find EXTRA_BOND_STATE", new java.lang.Object[0]);
                        return;
                    }
                    switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) {
                        case 10:
                            com.tencent.mars.xlog.Log.i(jVar.f325321r, "BOND_NONE, reason: " + intent.getIntExtra("android.bluetooth.device.extra.REASON", -1), new java.lang.Object[0]);
                            jVar.p(ob1.m.a(null));
                            jVar.m();
                            return;
                        case 11:
                            com.tencent.mars.xlog.Log.i(jVar.f325321r, "BOND_BONDING", new java.lang.Object[0]);
                            return;
                        case 12:
                            com.tencent.mars.xlog.Log.i(jVar.f325321r, "BOND_BONDED", new java.lang.Object[0]);
                            jVar.p(ob1.m.f344018e);
                            jVar.m();
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            if (!intent.hasExtra("android.bluetooth.device.extra.PAIRING_VARIANT")) {
                com.tencent.mars.xlog.Log.w(jVar.f325321r, "Cannot find EXTRA_PAIRING_VARIANT", new java.lang.Object[0]);
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
            if (intExtra != 0) {
                if (intExtra != 2) {
                    return;
                }
                com.tencent.mars.xlog.Log.i(jVar.f325321r, "PAIRING_VARIANT_PASSKEY_CONFIRMATION", new java.lang.Object[0]);
                return;
            }
            com.tencent.mars.xlog.Log.i(jVar.f325321r, "PAIRING_VARIANT_PIN", new java.lang.Object[0]);
            if (jVar.f325318o == null) {
                jVar.p(ob1.m.f344035v);
                jVar.m();
                return;
            }
            com.tencent.mars.xlog.Log.i(jVar.f325321r, "setPin", new java.lang.Object[0]);
            if (!bluetoothDevice.setPin(jVar.f325318o) || jVar.f325320q) {
                return;
            }
            jVar.p(ob1.m.f344018e);
            jVar.m();
        }
    }
}
