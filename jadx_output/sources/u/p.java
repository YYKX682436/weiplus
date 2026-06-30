package u;

/* loaded from: classes16.dex */
public final class p extends androidx.fragment.app.e2 {
    public final java.util.List G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.FragmentManager fm6, java.util.List fragments) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.G = fragments;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.G.size();
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SVPagerAdapter", "getItem position:" + i17);
        return (androidx.fragment.app.Fragment) this.G.get(i17);
    }
}
