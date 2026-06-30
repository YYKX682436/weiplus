package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        super(0);
        this.f134538d = finderHomeUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f134538d;
        boolean isFinishing = finderHomeUIC.getActivity().isFinishing();
        boolean isDestroyed = finderHomeUIC.getActivity().isDestroyed();
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "initOtherTabFragment: isActivityFinishing=" + isFinishing + " isActivityDestroyed=" + isDestroyed);
        if (!isFinishing && !isDestroyed) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment activeFragment = finderHomeUIC.getActiveFragment();
            cq.k1.a();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wg).getValue()).r()).booleanValue()) {
                java.util.ArrayList fragments = finderHomeUIC.getFragments();
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : fragments) {
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
                    if ((kotlin.jvm.internal.o.b(finderHomeTabFragment, activeFragment) || (finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment)) ? false : true) {
                        arrayList.add(obj);
                    }
                }
            } else {
                java.util.ArrayList fragments2 = finderHomeUIC.getFragments();
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : fragments2) {
                    if (!kotlin.jvm.internal.o.b((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj2, activeFragment)) {
                        arrayList.add(obj2);
                    }
                }
            }
            androidx.viewpager.widget.a adapter = finderHomeUIC.X6().f434697b.getAdapter();
            tw2.f fVar = adapter instanceof tw2.f ? (tw2.f) adapter : null;
            if (fVar != null) {
                com.tencent.mars.xlog.Log.i("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentSize=" + arrayList.size());
                if (!arrayList.isEmpty()) {
                    androidx.fragment.app.FragmentManager fragmentManager = fVar.f422467i;
                    if (fragmentManager.isStateSaved()) {
                        com.tencent.mars.xlog.Log.w("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentManager is save state");
                    } else {
                        try {
                            androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
                            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                            for (androidx.fragment.app.Fragment fragment : arrayList) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append("setFragmentMaxLifeToResume: tabType=");
                                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
                                sb6.append(finderHomeTabFragment2 != null ? java.lang.Integer.valueOf(finderHomeTabFragment2.f129265p) : null);
                                sb6.append(", attachedFragmentManager=");
                                sb6.append(fragment.getFragmentManager());
                                sb6.append(", currentFragmentManager=");
                                sb6.append(fragmentManager);
                                com.tencent.mars.xlog.Log.i("FinderFragmentPagerAdapter", sb6.toString());
                                beginTransaction.m(fragment, androidx.lifecycle.n.RESUMED);
                            }
                            beginTransaction.d();
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("FinderFragmentPagerAdapter", th6, "setFragmentMaxLifeToResume: ", new java.lang.Object[0]);
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.O6(finderHomeUIC);
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.Q6(finderHomeUIC);
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.P6(finderHomeUIC);
        }
        return jz5.f0.f302826a;
    }
}
