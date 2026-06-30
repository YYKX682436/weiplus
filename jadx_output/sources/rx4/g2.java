package rx4;

/* loaded from: classes8.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(rx4.h2 h2Var) {
        super(0);
        this.f401157d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ScrollView scrollView;
        rx4.h2 h2Var = this.f401157d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) h2Var.findViewById(com.tencent.mm.R.id.cg7);
        if (frameLayout != null && (scrollView = h2Var.f401174p) != null) {
            float f17 = h2Var.getActivity().getResources().getDisplayMetrics().density;
            java.lang.String str = h2Var.f401165d;
            com.tencent.mars.xlog.Log.i(str, "hitest upgradeToNewLayout: replacing legacy layout with new layout");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) h2Var.getActivity().findViewById(com.tencent.mm.R.id.jlt);
            if (viewGroup != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup.getChildAt(i17);
                    sb6.append("[" + i17 + ']' + childAt.getClass().getSimpleName() + "(id=" + childAt.getId() + ",vis=" + childAt.getVisibility() + ") ");
                }
                com.tencent.mars.xlog.Log.i(str, "hitest upgradeToNewLayout: mm_content_fl childCount=" + viewGroup.getChildCount() + ", children=" + ((java.lang.Object) sb6));
            }
            frameLayout.removeView(scrollView);
            android.view.View inflate = android.view.LayoutInflater.from(h2Var.getActivity()).inflate(com.tencent.mm.R.layout.dun, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            android.widget.ScrollView scrollView2 = (android.widget.ScrollView) inflate;
            frameLayout.addView(scrollView2);
            scrollView2.getViewTreeObserver().addOnScrollChangedListener(new rx4.c2(h2Var, scrollView2));
            scrollView2.getViewTreeObserver().addOnGlobalLayoutListener(new rx4.d2(h2Var, scrollView2, f17));
            scrollView2.setOnTouchListener(new rx4.e2(h2Var));
            h2Var.f401174p = scrollView2;
            pm0.v.X(new rx4.b1(h2Var));
            h2Var.f401184z = 0;
            scrollView2.post(new rx4.f2(h2Var, scrollView2, f17));
            com.tencent.mars.xlog.Log.i(str, "hitest upgradeToNewLayout: re-render history and recommend after layout replacement");
            pf5.u uVar = pf5.u.f353936a;
            rx4.e0 e0Var = (rx4.e0) uVar.b(h2Var.getContext()).a(rx4.e0.class);
            e0Var.T6();
            pm0.v.X(new rx4.d0(e0Var, true));
            rx4.u0 u0Var = (rx4.u0) uVar.b(h2Var.getContext()).a(rx4.u0.class);
            u0Var.getClass();
            pm0.v.X(new rx4.t0(u0Var));
            androidx.lifecycle.c1 a17 = uVar.b(h2Var.getContext()).a(rx4.k0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rx4.k0 k0Var = (rx4.k0) a17;
            androidx.lifecycle.c1 a18 = uVar.b(h2Var.getContext()).a(rx4.s.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            rx4.s sVar = (rx4.s) a18;
            rx4.l lVar = k0Var.f401213h;
            rx4.d dVar = sVar.f401262g;
            if (lVar != null || dVar != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest upgradeToNewLayout: re-render hotspot/drama, hasHotspot=");
                sb7.append(lVar != null);
                sb7.append(", hasDrama=");
                sb7.append(dVar != null);
                sb7.append(", isTabModeActive=");
                sb7.append(h2Var.F);
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
                if (h2Var.F) {
                    k0Var.V6(lVar, k0Var.f401211f, true);
                    sVar.a(dVar, sVar.f401261f);
                    pm0.v.X(new rx4.b2(h2Var, lVar, dVar));
                } else if (lVar != null) {
                    k0Var.V6(lVar, k0Var.f401211f, false);
                    android.view.View findViewById = h2Var.findViewById(com.tencent.mm.R.id.vbs);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$upgradeToNewLayout$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$upgradeToNewLayout$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            h2Var.z7();
        }
        return jz5.f0.f302826a;
    }
}
