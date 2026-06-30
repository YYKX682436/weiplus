package hw0;

/* loaded from: classes5.dex */
public final class s implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.p f285480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw0.z f285481e;

    public s(hw0.p pVar, hw0.z zVar) {
        this.f285480d = pVar;
        this.f285481e = zVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        bu0.a u76;
        kw0.e eVar = (kw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f285480d.setFancyTextUiState(eVar);
        hw0.z zVar = this.f285481e;
        zVar.getClass();
        kw0.k kVar = eVar.f312803c;
        if (((kVar instanceof kw0.h) || (kVar instanceof kw0.j)) && (u76 = zVar.u7()) != null) {
            kw0.a b17 = fv0.e.b(eVar);
            if (zu0.i.f475676f == (b17 != null ? b17.f312789b : null)) {
                java.lang.String str = b17.f312788a.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                if (!u76.c(str)) {
                    return;
                } else {
                    zVar.s7();
                }
            }
            zVar.G7();
        }
    }
}
