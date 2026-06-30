package lf3;

/* loaded from: classes12.dex */
public final class b0 extends com.tencent.mm.xcompat.viewpager2.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf3.c0 f318308a;

    public b0(lf3.c0 c0Var) {
        this.f318308a = c0Var;
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void a(int i17) {
        this.f318308a.f318313g.onPageScrollStateChanged(i17);
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void b(int i17, float f17, int i18) {
        this.f318308a.f318313g.onPageScrolled(i17, f17, i18);
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void c(int i17) {
        this.f318308a.f318313g.onPageSelected(i17);
    }
}
