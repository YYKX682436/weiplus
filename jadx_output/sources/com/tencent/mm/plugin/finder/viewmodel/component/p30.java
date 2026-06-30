package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p30 extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135506d;

    public p30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135506d = f50Var;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        java.lang.String str;
        java.lang.String str2;
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135506d;
        android.view.View findViewById = f50Var.findViewById(com.tencent.mm.R.id.cmn);
        android.view.View findViewById2 = f50Var.findViewById(com.tencent.mm.R.id.cmi);
        android.widget.TextView textView = (android.widget.TextView) f50Var.findViewById(com.tencent.mm.R.id.cmm);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderCreatorEntrance, reddot show:");
        sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f105327a) : null);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        if (!(z9Var != null && z9Var.f105327a)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f50Var.s7();
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreatorCenter");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("CreatorCenter");
        if (L0 == null || (vs2Var = L0.field_ctrInfo) == null || (str = vs2Var.f388490h) == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b(str, f50Var.P)) {
            f50Var.getClass();
            f50Var.P = str;
            if (L0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finderCreatorEntrance, showtype:");
        sb7.append(I0 != null ? java.lang.Integer.valueOf(I0.f373887d) : null);
        sb7.append(",title:");
        sb7.append(I0 != null ? I0.f373889f : null);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb7.toString());
        java.lang.Integer valueOf = I0 != null ? java.lang.Integer.valueOf(I0.f373887d) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (valueOf != null && valueOf.intValue() == 17) {
            textView.setVisibility(0);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str3 = I0.f373889f;
            if (str3 == null) {
                str3 = "";
            }
            textView.setText(str3);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            textView.setVisibility(0);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str4 = I0.f373889f;
            if (str4 == null) {
                str4 = "";
            }
            textView.setText(str4);
        } else {
            textView.setVisibility(8);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$24", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (I0 == null || (str2 = I0.f373889f) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (L0 != null) {
            zy2.fa.K0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), L0, "CreatorCenter", c01.id.c(), false, 8, null);
        }
    }
}
