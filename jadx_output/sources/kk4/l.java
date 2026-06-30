package kk4;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck4.b f308558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck4.b f308559f;

    public l(kk4.v vVar, ck4.b bVar, ck4.b bVar2) {
        this.f308557d = vVar;
        this.f308558e = bVar;
        this.f308559f = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.v vVar = this.f308557d;
        if (vVar.f308585j) {
            vVar.getClass();
            nk4.s sVar = this.f308557d.f308588m;
            if (sVar != null) {
                ck4.b bVar = this.f308558e;
                if (!(bVar instanceof ck4.b)) {
                    bVar = null;
                }
                ((kw2.m0) sVar).D(new nk4.f(bVar != null ? bVar.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), this.f308557d.S, null));
            }
            ((ku5.t0) ku5.t0.f312615d).k(new kk4.k(this.f308559f), 20L);
            this.f308557d.R = null;
        }
    }
}
