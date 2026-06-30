package gr2;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr2.p0 f274803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i17, gr2.p0 p0Var) {
        super(0);
        this.f274802d = i17;
        this.f274803e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentItem pos: ");
        int i17 = this.f274802d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.ThemeLivingViewPagerConvert", sb6.toString());
        gr2.p0 p0Var = this.f274803e;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = p0Var.f274810f;
        zq2.c cVar = p0Var.f274811g;
        if (finderViewPager != null && cVar != null) {
            finderViewPager.setCurrentItem(i17);
        }
        return jz5.f0.f302826a;
    }
}
