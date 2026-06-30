package iz3;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f296088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f296089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry3.q f296090f;

    public n(iz3.s sVar, long j17, ry3.q qVar) {
        this.f296088d = sVar;
        this.f296089e = j17;
        this.f296090f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        iz3.s sVar = this.f296088d;
        java.util.HashMap hashMap = sVar.f296098d;
        long j17 = this.f296089e;
        iz3.j jVar = (iz3.j) hashMap.remove(java.lang.Long.valueOf(j17));
        ry3.q qVar = this.f296090f;
        if (jVar != null) {
            ry3.p pVar = jVar.f296084a;
            if (pVar == null || (str = pVar.f401531e) == null) {
                str = "";
            }
            qVar.f401548f = str;
        }
        ry3.r rVar = (ry3.r) sVar.f296099e.remove(java.lang.Long.valueOf(j17));
        if (rVar != null) {
            rVar.a(j17, qVar);
        }
    }
}
