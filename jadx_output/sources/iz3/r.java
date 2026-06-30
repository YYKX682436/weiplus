package iz3;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f296094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f296095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry3.q f296097g;

    public r(iz3.s sVar, long j17, yz5.l lVar, ry3.q qVar) {
        this.f296094d = sVar;
        this.f296095e = j17;
        this.f296096f = lVar;
        this.f296097g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        iz3.s sVar = this.f296094d;
        java.util.HashMap hashMap = sVar.f296098d;
        long j17 = this.f296095e;
        iz3.j jVar = (iz3.j) hashMap.remove(java.lang.Long.valueOf(j17));
        ry3.q qVar = this.f296097g;
        if (jVar != null) {
            ry3.p pVar = jVar.f296084a;
            if (pVar == null || (str = pVar.f401531e) == null) {
                str = "";
            }
            qVar.f401548f = str;
        } else {
            jVar = null;
        }
        this.f296096f.invoke(jVar);
        ry3.r rVar = (ry3.r) sVar.f296099e.remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageSceneUploader", "onScanSuccess session: %d, callback: %s", java.lang.Long.valueOf(j17), rVar);
        if (rVar != null) {
            rVar.a(j17, qVar);
        }
    }
}
