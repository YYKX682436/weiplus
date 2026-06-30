package zi1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xi1.o f473091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi1.b f473092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xi1.n f473093f;

    public a(xi1.o oVar, zi1.b bVar, xi1.n nVar) {
        this.f473091d = oVar;
        this.f473092e = bVar;
        this.f473093f = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.o oVar = xi1.o.PORTRAIT;
        xi1.n nVar = this.f473093f;
        zi1.b bVar = this.f473092e;
        xi1.o oVar2 = this.f473091d;
        if (oVar2 == oVar) {
            bVar.f473095a.setSoftOrientation("portrait");
            if (nVar != null) {
                nVar.e(bVar.a(), bVar.a() == oVar2);
                return;
            }
            return;
        }
        int i17 = zi1.b.f473094b;
        xi1.o[] oVarArr = xi1.o.f454710n;
        if (kz5.z.G(oVarArr, oVar2)) {
            bVar.f473095a.setSoftOrientation("landscape");
            if (nVar != null) {
                nVar.e(bVar.a(), kz5.z.G(oVarArr, bVar.a()));
                return;
            }
            return;
        }
        if (oVar2 == xi1.o.UNSPECIFIED) {
            bVar.f473095a.setSoftOrientation("auto");
            if (nVar != null) {
                nVar.e(bVar.a(), true);
                return;
            }
            return;
        }
        bVar.f473095a.setSoftOrientation("portrait");
        if (nVar != null) {
            nVar.e(bVar.a(), bVar.a() == oVar2);
        }
    }
}
