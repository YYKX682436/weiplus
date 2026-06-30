package hq1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f283129d;

    /* renamed from: e, reason: collision with root package name */
    public final long f283130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hq1.j f283131f;

    public i(hq1.j jVar, long j17, long j18) {
        this.f283131f = jVar;
        this.f283129d = 0L;
        this.f283130e = 0L;
        this.f283129d = j17;
        this.f283130e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.j jVar = this.f283131f;
        android.content.Context context = jVar.f283136b;
        long j17 = this.f283129d;
        hq1.t tVar = new hq1.t(j17, context, jVar);
        long j18 = tVar.f283179a;
        java.lang.String valueOf = java.lang.String.valueOf(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Long.valueOf(j17), valueOf);
        java.util.HashMap hashMap = jVar.f283137c;
        hq1.t tVar2 = (hq1.t) hashMap.remove(valueOf);
        if (tVar2 != null) {
            tVar2.a();
        }
        hashMap.put(valueOf, tVar);
        hq1.h hVar = jVar.f283135a;
        if (hVar != null) {
            long j19 = this.f283129d;
            long j27 = this.f283130e;
            kq1.e eVar = (kq1.e) hVar;
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSessionCreate*** sessionID = " + j18 + " deviceID = " + j19);
            iz5.a.g(null, kq1.n.a(eVar.f311240a, 6, 0, 0, new kq1.g(j18, j19, j27)));
        }
    }
}
