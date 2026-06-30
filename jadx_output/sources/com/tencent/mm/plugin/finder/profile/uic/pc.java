package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class pc implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.xc f124124d;

    public pc(com.tencent.mm.plugin.finder.profile.uic.xc xcVar) {
        this.f124124d = xcVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.profile.uic.pc pcVar;
        java.lang.Integer num;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Post Template [SHOW NEW] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i("FinderProfilePostUIC", sb6.toString());
        r45.f03 f03Var = z9Var.f105328b;
        android.view.View view = null;
        if (f03Var != null) {
            num = java.lang.Integer.valueOf(f03Var.f373887d);
            pcVar = this;
        } else {
            pcVar = this;
            num = null;
        }
        com.tencent.mm.plugin.finder.profile.uic.xc xcVar = pcVar.f124124d;
        if (num != null && num.intValue() == 6) {
            view = xcVar.f124360o;
        } else if (num != null && num.intValue() == 1) {
            view = xcVar.f124361p;
        }
        if ((z9Var.f105327a) && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
            if (I0 == null || L0 == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
            return;
        }
        android.view.View view3 = xcVar.f124361p;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = xcVar.f124360o;
        if (view4 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$postRedDotsObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
