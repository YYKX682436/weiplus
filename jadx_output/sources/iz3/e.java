package iz3;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f296073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry3.r f296074e;

    public e(iz3.j jVar, ry3.r rVar) {
        this.f296073d = jVar;
        this.f296074e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.p pVar;
        iz3.f fVar = iz3.f.f296075a;
        ry3.r rVar = this.f296074e;
        iz3.j jVar = this.f296073d;
        if (jVar == null || (pVar = jVar.f296084a) == null) {
            return;
        }
        long j17 = pVar.f401527a;
        int i17 = pVar.f401533g;
        hz3.a0 lVar = (i17 == 3 || i17 == 4) ? new hz3.l() : (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 9) ? new hz3.y() : new hz3.p();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiImageCDNUploader", "uploadImage-cdn requestType: %s, strategy: %s", java.lang.Integer.valueOf(i17), lVar.name());
        lVar.a(pVar, new iz3.d(j17, pVar, rVar, jVar));
    }
}
