package lw0;

/* loaded from: classes5.dex */
public final class b implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw0.c f321529a;

    public b(lw0.c cVar) {
        this.f321529a = cVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        lw0.c cVar = this.f321529a;
        mv0.e eVar = (mv0.e) kz5.n0.a0(cVar.f321530J, i17);
        if (eVar != null) {
            lw0.a aVar = cVar.L;
            if (aVar != null) {
                lw0.l lVar = ((lw0.j) aVar).f321540a;
                mv0.d dVar = eVar.f331539b;
                lVar.f321542o = dVar;
                if (dVar == mv0.d.f331535d) {
                    lVar.s7();
                }
            }
            androidx.viewpager.widget.ViewPager viewPager = cVar.I;
            if (viewPager != null) {
                viewPager.setCurrentItem(i17, false);
            } else {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}
