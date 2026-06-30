package wu2;

/* loaded from: classes2.dex */
public final class r implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment f449700d;

    public r(com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment finderLbsSameCityTabFragment) {
        this.f449700d = finderLbsSameCityTabFragment;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        if (obj != null) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment finderLbsSameCityTabFragment = this.f449700d;
            if (finderLbsSameCityTabFragment.mo133getLifecycle().b().a(androidx.lifecycle.n.RESUMED)) {
                com.tencent.mm.plugin.finder.feed.ct ctVar = ((com.tencent.mm.plugin.finder.viewmodel.component.t80) finderLbsSameCityTabFragment.j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).f135995e;
                if (ctVar != null) {
                    com.tencent.mm.plugin.finder.feed.ct.i(ctVar, 150L, false, false, null, 12, null);
                } else {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
            }
        }
    }
}
