package hw0;

/* loaded from: classes5.dex */
public final class d implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hw0.g f285455a;

    public d(hw0.g gVar) {
        this.f285455a = gVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        androidx.viewpager.widget.ViewPager viewPager;
        hw0.g gVar = this.f285455a;
        kw0.d dVar = (kw0.d) kz5.n0.a0(gVar.D, i17);
        if (dVar != null) {
            hw0.a aVar = gVar.C;
            if (aVar != null) {
                hw0.n nVar = ((hw0.m) aVar).f285468a;
                kw0.c cVar = dVar.f312799b;
                nVar.f285471p = cVar;
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    yy0.m7 m7Var = (yy0.m7) nVar.R6().O6();
                    kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i3(m7Var, null), 3, null);
                } else if (ordinal == 1) {
                    yy0.m7 m7Var2 = (yy0.m7) nVar.R6().O6();
                    kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.j3(m7Var2, null), 3, null);
                }
            }
            viewPager = gVar.getViewPager();
            viewPager.setCurrentItem(i17, false);
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}
