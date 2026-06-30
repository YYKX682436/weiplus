package u32;

/* loaded from: classes13.dex */
public class p implements kq1.o {

    /* renamed from: f, reason: collision with root package name */
    public static u32.p f424339f;

    /* renamed from: a, reason: collision with root package name */
    public kq1.n f424340a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f424341b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f424342c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f424343d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f424344e = new com.tencent.mm.sdk.platformtools.n3(u32.i1.a().f424310b.getSerialTag());

    public p() {
        this.f424340a = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(android.os.Looper.getMainLooper().getThread().getId()));
        this.f424340a = new kq1.n(com.tencent.mm.sdk.platformtools.x2.f193071a, this, u32.i1.a().f424310b);
    }

    public static boolean a(u32.p pVar, int i17, u32.a1 a1Var, int[] iArr) {
        if (a1Var == null) {
            pVar.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
            throw new java.lang.IllegalArgumentException("scanImp: null == aCallback");
        }
        if (iArr == null ? pVar.f424340a.c(i17, new int[0]) : pVar.f424340a.c(i17, iArr)) {
            pVar.f424341b.add(a1Var);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.scan failed!!!");
        a1Var.a(-1, "scanImp: mBTSDKMrg.scan failed!!!");
        return false;
    }

    public static u32.p b() {
        u32.p pVar = f424339f;
        if (pVar != null) {
            return pVar;
        }
        u32.p pVar2 = new u32.p();
        f424339f = pVar2;
        return pVar2;
    }

    public void c(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + j17 + "Connected = " + z17);
        if (z17) {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothConnectedV2(j17);
        } else {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothDisconnectedV2(j17);
        }
    }

    public void d(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + j17 + "success = " + z17);
        if (z17) {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothSendDataCompletedV2(j17);
        } else {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothErrorV2(j17, 0);
        }
    }
}
