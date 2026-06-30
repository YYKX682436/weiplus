package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderChooseOriginalView f132691d;

    public n3(com.tencent.mm.plugin.finder.view.FinderChooseOriginalView finderChooseOriginalView) {
        this.f132691d = finderChooseOriginalView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ?? r152;
        r45.yn2 yn2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderChooseOriginalView finderChooseOriginalView = this.f132691d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(finderChooseOriginalView.getContext());
        e3Var.f(com.tencent.mm.R.layout.b4s);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmo)).getPaint(), 0.8f);
        android.view.View findViewById = e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmp);
        android.view.View findViewById2 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmn);
        if (finderChooseOriginalView.getFlag() == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            r152 = 0;
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            r152 = 0;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        m92.b I1 = g92.a.I1(g92.b.f269769e, r152, 1, null);
        int integer = (I1 == null || (yn2Var = I1.field_originalInfo) == 0) ? 1 : yn2Var.getInteger(r152);
        int i17 = integer < 0 ? r152 : integer;
        ((android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.kc9)).setText(finderChooseOriginalView.getContext().getString(com.tencent.mm.R.string.et9, java.lang.String.valueOf(i17)));
        if (i17 > 0) {
            e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmb).setOnClickListener(new com.tencent.mm.plugin.finder.view.j3(finderChooseOriginalView, e3Var));
        } else {
            e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmb).setClickable(r152);
            ((android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.kc_)).setTextColor(finderChooseOriginalView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_70));
        }
        e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmq).setOnClickListener(new com.tencent.mm.plugin.finder.view.k3(finderChooseOriginalView, e3Var));
        e3Var.f131959f.findViewById(com.tencent.mm.R.id.kmm).setOnClickListener(new com.tencent.mm.plugin.finder.view.m3(finderChooseOriginalView, e3Var));
        e3Var.i();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
