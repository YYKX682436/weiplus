package ov0;

/* loaded from: classes5.dex */
public final class r implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ov0.t f349145a;

    public r(ov0.t tVar) {
        this.f349145a = tVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        androidx.viewpager.widget.ViewPager viewPager;
        androidx.viewpager.widget.ViewPager viewPager2;
        ov0.t tVar;
        ov0.t tVar2 = this.f349145a;
        sw0.c cVar = (sw0.c) kz5.n0.a0(tVar2.f349152y0, i17);
        if (cVar != null) {
            ov0.e eVar = cVar.f413420b;
            tVar2.f349151x1 = eVar;
            ov0.f fVar = tVar2.f349149p1;
            if (fVar != null) {
                int ordinal = eVar.ordinal();
                ov0.i0 i0Var = ((ov0.h0) fVar).f349133a;
                if (ordinal == 0) {
                    ov0.t tVar3 = (ov0.t) i0Var.f69240i;
                    if (tVar3 != null) {
                        tVar3.O();
                    }
                } else if (ordinal == 1 && (tVar = (ov0.t) i0Var.f69240i) != null) {
                    tVar.P();
                }
            }
            viewPager = tVar2.getViewPager();
            if (viewPager.getCurrentItem() != i17) {
                viewPager2 = tVar2.getViewPager();
                viewPager2.setCurrentItem(i17, false);
            }
        }
    }

    @Override // jx0.m
    public void b(int i17) {
    }
}
