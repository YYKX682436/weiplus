package u32;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f424315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f424316e;

    public k(u32.p pVar, int i17) {
        this.f424315d = pVar;
        this.f424316e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean d17;
        kq1.n nVar = this.f424315d.f424340a;
        nVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("***stopScan*** aBluetoothVersion = ");
        int i17 = this.f424316e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", sb6.toString());
        boolean z17 = true;
        if (i17 != 0) {
            if (i17 != 1) {
                iz5.a.g(null, false);
            } else {
                jq1.e eVar = nVar.f311256c;
                if (eVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
                } else {
                    d17 = eVar.b(false);
                }
            }
            d17 = false;
        } else {
            hq1.j jVar = nVar.f311255b;
            if (jVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                d17 = false;
            } else {
                d17 = jVar.d(false, new int[0]);
            }
        }
        if (!d17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.stopScan failed!!!");
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.stopScanImp failed!!!");
    }
}
