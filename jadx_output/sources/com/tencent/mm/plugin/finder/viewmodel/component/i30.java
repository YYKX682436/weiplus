package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i30 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134692d;

    public i30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134692d = f50Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.f03 f03Var;
        r45.f03 f03Var2;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[wxMessageEntrance] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        sb6.append(" ctrlType=");
        sb6.append((z9Var == null || (jbVar = z9Var.f105329c) == null) ? null : java.lang.Integer.valueOf(jbVar.getType()));
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        java.lang.String str = (z9Var == null || (f03Var2 = z9Var.f105328b) == null) ? null : f03Var2.f373906z;
        if (!(str == null || str.length() == 0)) {
            if (!kotlin.jvm.internal.o.b((z9Var == null || (f03Var = z9Var.f105328b) == null) ? null : f03Var.f373906z, g92.b.f269769e.T0())) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("return show this reddot ");
                sb7.append(z9Var != null ? z9Var.f105329c : null);
                com.tencent.mars.xlog.Log.w("Finder.SelfUIC", sb7.toString());
                return;
            }
        }
        boolean z17 = z9Var != null && z9Var.f105327a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134692d;
        if (!z17) {
            android.view.View findViewById = f50Var.k7().findViewById(com.tencent.mm.R.id.qci);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.f03 f03Var3 = z9Var.f105328b;
        int i17 = f03Var3 != null ? f03Var3.f373888e : 0;
        if (i17 <= 0) {
            android.view.View findViewById2 = f50Var.k7().findViewById(com.tencent.mm.R.id.qci);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        i95.m c17 = i95.n0.c(uh4.c0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((uh4.c0) c17).isTeenMode()) {
            android.view.View k76 = f50Var.k7();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(k76, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(k76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View k77 = f50Var.k7();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(k77, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k77.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(k77, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$18", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) f50Var.k7().findViewById(com.tencent.mm.R.id.qci);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i17));
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(f50Var.getActivity(), i17));
            textView.setTextSize(0, i65.a.f(f50Var.getActivity(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(f50Var.getActivity()));
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_wx_private_msg_entrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("finder_wx_private_msg_entrance");
        if (I0 == null || L0 == null) {
            return;
        }
        java.lang.String str2 = L0.field_ctrInfo.f388490h;
        if (str2 == null) {
            str2 = "";
        }
        if (kotlin.jvm.internal.o.b(str2, f50Var.M)) {
            return;
        }
        f50Var.M = str2;
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
    }
}
