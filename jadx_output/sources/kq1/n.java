package kq1;

/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f311254a;

    /* renamed from: b, reason: collision with root package name */
    public final hq1.j f311255b;

    /* renamed from: c, reason: collision with root package name */
    public final jq1.e f311256c;

    /* renamed from: d, reason: collision with root package name */
    public final kq1.o f311257d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f311258e = new java.util.HashSet();

    public n(android.content.Context context, kq1.o oVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f311254a = null;
        this.f311255b = null;
        this.f311256c = null;
        this.f311257d = null;
        jq1.e eVar = new jq1.e(n3Var);
        this.f311256c = eVar;
        hq1.j jVar = new hq1.j(n3Var.getSerialTag());
        this.f311255b = jVar;
        kq1.e eVar2 = new kq1.e(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------init------");
        iz5.a.d(null, context);
        iz5.a.d(null, eVar2);
        if (!jVar.f283141g) {
            jVar.f283141g = true;
            jVar.f283136b = context;
            jVar.f283135a = eVar2;
            hq1.n nVar = hq1.n.f283167i;
            if (nVar == null) {
                nVar = new hq1.n(com.tencent.mm.sdk.platformtools.x2.f193071a);
                hq1.n.f283167i = nVar;
            }
            jVar.f283142h = nVar;
            if (fp.h.c(21)) {
                hq1.m0 m0Var = hq1.m0.f283160g;
                if (m0Var == null) {
                    m0Var = new hq1.m0(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    hq1.m0.f283160g = m0Var;
                }
                jVar.f283143i = m0Var;
            }
            if (jVar.c()) {
                ((android.bluetooth.BluetoothManager) jVar.f283136b.getSystemService("bluetooth")).getAdapter();
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport!!!");
            }
        }
        kq1.d dVar = new kq1.d(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatManager", "------init------");
        iz5.a.d(null, context);
        iz5.a.d(null, dVar);
        if (!eVar.f301067g) {
            eVar.f301067g = true;
            eVar.f301061a = dVar;
            eVar.f301064d = context;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            eVar.f301064d.registerReceiver(eVar.f301068h, intentFilter);
            eVar.f301062b = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }
        this.f311254a = new kq1.f(u32.i1.a().f424310b.getSerialTag(), this);
        this.f311257d = oVar;
    }

    public static boolean a(kq1.n nVar, int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = nVar.f311254a;
        return n3Var.sendMessage(n3Var.obtainMessage(i17, i18, i19, obj));
    }

    public void b(long j17, long j18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***createSession*** deviceId = " + j17 + "aBluetoothVersion = " + i17);
        if (i17 == 0) {
            hq1.j jVar = this.f311255b;
            if (jVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                return;
            }
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------createSession------ macAddr = %d channelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            iz5.a.g(null, jVar.f283141g);
            if (jVar.c()) {
                iz5.a.g(null, jVar.f283138d.post(new hq1.i(jVar, j17, j18)));
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                return;
            }
        }
        if (i17 != 1) {
            iz5.a.g(null, false);
            return;
        }
        jq1.e eVar = this.f311256c;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return;
        }
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatManager", "createSession");
        iz5.a.g(null, eVar.f301067g);
        if (eVar.a()) {
            iz5.a.g(null, eVar.f301065e.post(new jq1.d(eVar, j17, j18)));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
        }
    }

    public boolean c(int i17, int... iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "---scan--- aBluetoothVersion = " + i17);
        if (i17 == 0) {
            hq1.j jVar = this.f311255b;
            if (jVar != null) {
                return iArr == null ? jVar.d(true, new int[0]) : jVar.d(true, iArr);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        }
        if (i17 != 1) {
            iz5.a.g(null, false);
            return false;
        }
        jq1.e eVar = this.f311256c;
        if (eVar != null) {
            return eVar.b(true);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        return false;
    }
}
