package w51;

/* loaded from: classes15.dex */
public class j implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w51.n f442984a;

    public j(w51.n nVar) {
        this.f442984a = nVar;
    }

    @Override // q51.b
    public void onItemSelected(int i17) {
        int i18 = i17 + 1;
        w51.n nVar = this.f442984a;
        int i19 = nVar.f442999k;
        int i27 = nVar.f443000l;
        w51.n nVar2 = this.f442984a;
        if (i19 == i27) {
            int i28 = nVar.f443001m;
            int i29 = (i18 + i28) - 1;
            int i37 = nVar.f443002n;
            if (i28 == i37) {
                w51.n.a(nVar, nVar.f443009u, i29, nVar.f443003o, nVar.f443004p, nVar.f443013y, nVar.f443014z);
            } else if (i28 == i29) {
                w51.n.a(nVar, nVar.f443009u, i29, nVar.f443003o, 31, nVar.f443013y, nVar.f443014z);
            } else if (i37 == i29) {
                w51.n.a(nVar, nVar.f443009u, i29, 1, nVar.f443004p, nVar.f443013y, nVar.f443014z);
            } else {
                w51.n.a(nVar, nVar.f443009u, i29, 1, 31, nVar.f443013y, nVar.f443014z);
            }
        } else {
            int i38 = nVar.f443009u;
            if (i38 == i19) {
                int i39 = nVar.f443001m;
                int i47 = (i18 + i39) - 1;
                if (i47 == i39) {
                    w51.n.a(nVar, i38, i47, nVar.f443003o, 31, nVar.f443013y, nVar.f443014z);
                } else {
                    w51.n.a(nVar, i38, i47, 1, 31, nVar.f443013y, nVar.f443014z);
                }
            } else if (i38 != i27) {
                w51.n.a(nVar, i38, i18, 1, 31, nVar.f443013y, nVar.f443014z);
            } else if (i18 == nVar.f443002n) {
                w51.n.a(nVar, i38, nVar.f442991c.getCurrentItem() + 1, 1, nVar2.f443004p, nVar2.f443013y, nVar2.f443014z);
            } else {
                w51.n.a(nVar, i38, nVar.f442991c.getCurrentItem() + 1, 1, 31, nVar2.f443013y, nVar2.f443014z);
            }
        }
        v51.a aVar = nVar2.f443012x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}
