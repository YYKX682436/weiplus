package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f131874e;

    public d2(android.view.View view, com.tencent.mm.plugin.finder.view.g2 g2Var) {
        this.f131873d = view;
        this.f131874e = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.jy0> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f131873d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.g2 g2Var = this.f131874e;
        textView.setTextColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        view2.setBackgroundDrawable(g2Var.f132130b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        g2Var.f132138j.setVisibility(8);
        android.widget.TextView textView2 = g2Var.f132139k;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = g2Var.f132140l;
        textView3.setVisibility(0);
        android.content.Context context = g2Var.f132130b;
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.cp7));
        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491303cp5));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) g2Var.getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById = g2Var.getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById2 = g2Var.getContentView().findViewById(com.tencent.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) g2Var.getContentView().findViewById(com.tencent.mm.R.id.e0j);
        textView4.setVisibility(0);
        g2Var.b(textView4);
        flowLayout.removeAllViews();
        r45.ky0 ky0Var = g2Var.f132135g;
        if (ky0Var != null && (list = ky0Var.getList(6)) != null) {
            for (r45.jy0 jy0Var : list) {
                java.lang.String string = jy0Var.getString(1);
                if (string == null) {
                    string = "";
                }
                android.view.View a17 = g2Var.a(string, -1);
                flowLayout.addView(a17);
                a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.e2(a17, g2Var, jy0Var, textView4));
            }
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.view.f2(g2Var));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
