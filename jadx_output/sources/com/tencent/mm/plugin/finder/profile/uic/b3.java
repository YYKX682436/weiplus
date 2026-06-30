package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f123550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        super(0);
        this.f123550d = j3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f123550d;
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileDraftUIC", "onFetchEnd : " + j3Var.O6().getDataListJustForAdapter().size());
        if (j3Var.O6().f107584h == com.tencent.mm.plugin.finder.feed.model.f6.f107858f) {
            j3Var.Q6();
        } else {
            android.view.View f213435x = j3Var.P6().getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById = f213435x.findViewById(com.tencent.mm.R.id.ili);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = f213435x.findViewById(com.tencent.mm.R.id.ilg);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
