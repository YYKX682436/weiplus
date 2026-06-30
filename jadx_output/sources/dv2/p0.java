package dv2;

/* loaded from: classes2.dex */
public final class p0 extends zx2.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.t0 f243927a;

    public p0(dv2.t0 t0Var) {
        this.f243927a = t0Var;
    }

    @Override // zx2.y, zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        super.a(context, tab);
        int i17 = tab.f477040a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabSelected: index=");
        sb6.append(i17);
        sb6.append(", fragments size=");
        dv2.t0 t0Var = this.f243927a;
        sb6.append(t0Var.Y6().size());
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", sb6.toString());
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) kz5.n0.a0(t0Var.Y6(), i17);
            com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "Fragment at index " + i17 + ": " + finderHomeTabFragment);
            if (!(finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Fragment is not FinderPostPlaySquareContainerFragment: ");
                sb7.append(finderHomeTabFragment != null ? finderHomeTabFragment.getClass().getSimpleName() : null);
                com.tencent.mars.xlog.Log.e("Finder.FinderTabViewAction", sb7.toString());
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "Calling reloadData on second tab");
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment = (com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment) finderHomeTabFragment;
                finderPostPlaySquareContainerFragment.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.zh(finderPostPlaySquareContainerFragment));
            }
        }
    }
}
