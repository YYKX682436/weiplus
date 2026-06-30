package u23;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f424093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f424094e;

    public l(u23.n nVar, java.util.List list) {
        this.f424093d = nVar;
        this.f424094e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.o oVar = this.f424093d.f424098b;
        if (oVar != null) {
            oVar.b(this.f424094e, true);
        }
    }
}
