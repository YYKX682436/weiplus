package u23;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f424095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f424096e;

    public m(u23.n nVar, java.util.List list) {
        this.f424095d = nVar;
        this.f424096e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.o oVar = this.f424095d.f424098b;
        if (oVar != null) {
            oVar.b(this.f424096e, false);
        }
    }
}
