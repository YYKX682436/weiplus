package xq;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f455984d;

    public j(xq.m mVar) {
        this.f455984d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.d dVar;
        xq.m mVar = this.f455984d;
        if (mVar.f456000l) {
            xq.c cVar = mVar.f455999k;
            java.lang.Runnable runnable = mVar.f456003o;
            if (cVar != null && (dVar = cVar.f455973d) != null && dVar.f455974b == -1) {
                ((xq.h) runnable).run();
            }
            pm0.v.C(runnable);
            mVar.b();
            mVar.f455991c = 0L;
            mVar.f455990b = "";
            mVar.f455995g = null;
            xq.f fVar = mVar.f456006r;
            if (fVar != null) {
                xq.p pVar = ((xq.o) fVar).f456008a.f456014f;
            }
            if (fVar != null) {
                xq.n nVar = ((xq.o) fVar).f456008a.f456011c;
                nVar.getClass();
                nVar.f456007a.remove(mVar);
            }
        }
    }
}
