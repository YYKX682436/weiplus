package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class yh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f133395e;

    public yh(android.view.View view, com.tencent.mm.plugin.finder.view.ei eiVar) {
        this.f133394d = view;
        this.f133395e = eiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f133394d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f133395e;
        textView.setTextColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        view2.setBackgroundDrawable(eiVar.f132007b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        eiVar.f132012g.setVisibility(8);
        android.widget.TextView textView2 = eiVar.f132013h;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = eiVar.f132014i;
        textView3.setVisibility(0);
        android.content.Context context = eiVar.f132007b;
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.oy6));
        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f493760oy4));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) eiVar.getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById = eiVar.getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById2 = eiVar.getContentView().findViewById(com.tencent.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) eiVar.getContentView().findViewById(com.tencent.mm.R.id.e0j);
        if (textView4 != null) {
            textView4.setText(context.getResources().getString(com.tencent.mm.R.string.oxz));
            textView4.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk));
            textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.aby));
            textView4.setVisibility(0);
            textView4.setOnClickListener(new com.tencent.mm.plugin.finder.view.ci(eiVar, textView4));
        }
        flowLayout.removeAllViews();
        for (r45.rw4 rw4Var : eiVar.f132016k) {
            java.lang.String string = rw4Var.getString(1);
            if (string == null) {
                string = "";
            }
            android.view.View a17 = eiVar.a(string, -1);
            flowLayout.addView(a17);
            a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.di(a17, eiVar, rw4Var));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
