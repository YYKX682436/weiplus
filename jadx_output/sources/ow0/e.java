package ow0;

/* loaded from: classes5.dex */
public final class e implements jx0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow0.g f349299a;

    public e(ow0.g gVar) {
        this.f349299a = gVar;
    }

    @Override // jx0.m
    public void a(int i17) {
        androidx.viewpager.widget.ViewPager viewPager;
        ow0.g gVar = this.f349299a;
        sw0.n nVar = (sw0.n) kz5.n0.a0(gVar.F, i17);
        if (nVar != null) {
            ow0.b bVar = gVar.D;
            if (bVar != null) {
                ow0.a0 a0Var = ((ow0.t) bVar).f349350a;
                ((du0.o) ((jz5.n) a0Var.f349281o).getValue()).U6(false);
                int ordinal = nVar.f413444b.ordinal();
                if (ordinal == 0) {
                    a0Var.I7();
                } else if (ordinal == 1) {
                    a0Var.D7();
                } else if (ordinal == 2) {
                    a0Var.F7();
                } else if (ordinal == 3) {
                    a0Var.B7();
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
