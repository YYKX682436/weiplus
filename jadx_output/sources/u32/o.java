package u32;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f424335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f424336e;

    public o(u32.p pVar, long j17) {
        this.f424335d = pVar;
        this.f424336e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        u32.p pVar = this.f424335d;
        long j17 = this.f424336e;
        if (!pVar.f424342c.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "the session not exist");
            return;
        }
        kq1.n nVar = pVar.f424340a;
        int intValue = ((java.lang.Integer) pVar.f424343d.get(java.lang.Long.valueOf(j17))).intValue();
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***Destroy Session*** aSessionId = " + j17 + " aBluetoothVersion" + intValue);
        if (intValue == 0) {
            hq1.j jVar = nVar.f311255b;
            if (jVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------destroySession------ sessionId = %d", java.lang.Long.valueOf(j17));
            iz5.a.g(null, jVar.f283141g);
            if (!jVar.c()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                return;
            }
            hq1.t tVar = (hq1.t) jVar.f283137c.remove(java.lang.String.valueOf(j17));
            if (tVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot find BluetoothLESession by sessionId(%d)", java.lang.Long.valueOf(j17));
                return;
            } else {
                tVar.a();
                return;
            }
        }
        if (intValue != 1) {
            iz5.a.g(null, false);
            return;
        }
        jq1.e eVar = nVar.f311256c;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatManager", "------destroySession------ sessionId = %d", java.lang.Long.valueOf(j17));
        iz5.a.g(null, eVar.f301067g);
        if (!eVar.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return;
        }
        jq1.f fVar = (jq1.f) eVar.f301063c.remove(java.lang.Long.valueOf(j17));
        iz5.a.g(null, fVar != null);
        fVar.a();
    }
}
