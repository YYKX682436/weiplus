package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132809e;

    public p2(android.view.View view, com.tencent.mm.plugin.finder.view.s2 s2Var) {
        this.f132808d = view;
        this.f132809e = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f132808d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.s2 s2Var = this.f132809e;
        textView.setTextColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        view2.setBackgroundDrawable(s2Var.f132994b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        s2Var.f133003k.setVisibility(8);
        android.widget.TextView textView2 = s2Var.f133004l;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = s2Var.f133005m;
        textView3.setVisibility(0);
        android.content.Context context = s2Var.f132994b;
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.cp7));
        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491303cp5));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) s2Var.getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById = s2Var.getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById2 = s2Var.getContentView().findViewById(com.tencent.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) s2Var.getContentView().findViewById(com.tencent.mm.R.id.e0j);
        textView4.setVisibility(0);
        s2Var.b(textView4);
        flowLayout.removeAllViews();
        for (java.lang.Object obj : s2Var.f132997e) {
            r45.jy0 jy0Var = obj instanceof r45.jy0 ? (r45.jy0) obj : null;
            if (jy0Var == null || (str = jy0Var.getString(1)) == null) {
                r45.ot0 ot0Var = obj instanceof r45.ot0 ? (r45.ot0) obj : null;
                java.lang.String string = ot0Var != null ? ot0Var.getString(1) : null;
                str = string == null ? "" : string;
            }
            android.view.View a17 = s2Var.a(str, -1);
            flowLayout.addView(a17);
            a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.q2(a17, s2Var, obj, textView4));
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.view.r2(s2Var));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
