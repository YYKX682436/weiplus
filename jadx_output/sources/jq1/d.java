package jq1;

/* loaded from: classes13.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f301056d;

    /* renamed from: e, reason: collision with root package name */
    public final long f301057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq1.e f301058f;

    public d(jq1.e eVar, long j17, long j18) {
        this.f301058f = eVar;
        this.f301056d = 0L;
        this.f301057e = 0L;
        this.f301056d = j17;
        this.f301057e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f301056d;
        jq1.e eVar = this.f301058f;
        eVar.getClass();
        jq1.f fVar = new jq1.f(j17);
        java.util.HashMap hashMap = eVar.f301063c;
        jq1.f fVar2 = (jq1.f) hashMap.remove(java.lang.Long.valueOf(j17));
        if (fVar2 != null) {
            fVar2.a();
        }
        hashMap.put(java.lang.Long.valueOf(j17), fVar);
        jq1.c cVar = eVar.f301061a;
        if (cVar != null) {
            long j18 = this.f301056d;
            long j19 = this.f301057e;
            kq1.d dVar = (kq1.d) cVar;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSessionCreate*** sessionID = " + j17 + " deviceID = " + j18);
            iz5.a.g(null, kq1.n.a(dVar.f311239a, 6, 1, 0, new kq1.g(j17, j18, j19)));
        }
    }
}
