package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c20 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133950d;

    public c20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133950d = f50Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        boolean z17 = true;
        boolean z18 = z9Var != null && z9Var.f105327a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f133950d;
        if (z18) {
            java.lang.String e17 = xy2.c.e(f50Var.getActivity());
            if (e17 != null && e17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.view.View findViewById = f50Var.findViewById(com.tencent.mm.R.id.lqo);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                ym5.a1.h(findViewById, new com.tencent.mm.plugin.finder.viewmodel.component.a20(f50Var));
                android.view.View findViewById2 = f50Var.findViewById(com.tencent.mm.R.id.lqo);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = (android.widget.TextView) f50Var.findViewById(com.tencent.mm.R.id.lqp);
                r45.f03 f03Var = z9Var.f105328b;
                if (f03Var == null || (str = f03Var.f373889f) == null) {
                    str = "";
                }
                textView.setText(str);
                f50Var.findViewById(com.tencent.mm.R.id.lqo).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.b20(z9Var, f50Var));
                return;
            }
        }
        android.view.View findViewById3 = f50Var.findViewById(com.tencent.mm.R.id.lqo);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
