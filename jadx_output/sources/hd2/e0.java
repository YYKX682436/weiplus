package hd2;

/* loaded from: classes2.dex */
public final class e0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280469d;

    public e0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280469d = finderProfileCardFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        boolean z17 = z9Var.f105327a;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280469d;
        if (!z17) {
            finderProfileCardFragment.f110057u = null;
            com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment.y0(finderProfileCardFragment, 8, null, null, null, 14, null);
        } else {
            finderProfileCardFragment.f110057u = z9Var;
            r45.f03 f03Var = z9Var.f105328b;
            finderProfileCardFragment.x0(0, f03Var != null ? f03Var.f373889f : null, java.lang.Boolean.TRUE, null);
        }
    }
}
