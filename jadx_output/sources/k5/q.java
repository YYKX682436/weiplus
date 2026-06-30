package k5;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f304151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k5.r f304152e;

    public q(k5.r rVar, l5.m mVar) {
        this.f304152e = rVar;
        this.f304151d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k5.r rVar = this.f304152e;
        try {
            a5.o oVar = (a5.o) this.f304151d.get();
            if (oVar == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Worker was marked important (%s) but did not provide ForegroundInfo", rVar.f304156f.f297766c));
            }
            a5.a0.c().a(k5.r.f304153m, java.lang.String.format("Updating notification for %s", rVar.f304156f.f297766c), new java.lang.Throwable[0]);
            androidx.work.ListenableWorker listenableWorker = rVar.f304157g;
            listenableWorker.f12462h = true;
            l5.m mVar = rVar.f304154d;
            a5.p pVar = rVar.f304158h;
            android.content.Context context = rVar.f304155e;
            java.util.UUID uuid = listenableWorker.f12459e.f12465a;
            k5.t tVar = (k5.t) pVar;
            tVar.getClass();
            l5.m mVar2 = new l5.m();
            ((m5.c) tVar.f304165a).a(new k5.s(tVar, mVar2, uuid, oVar, context));
            mVar.k(mVar2);
        } catch (java.lang.Throwable th6) {
            rVar.f304154d.j(th6);
        }
    }
}
