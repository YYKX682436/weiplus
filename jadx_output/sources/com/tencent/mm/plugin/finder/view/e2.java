package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f131954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jy0 f131955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f131956g;

    public e2(android.view.View view, com.tencent.mm.plugin.finder.view.g2 g2Var, r45.jy0 jy0Var, android.widget.TextView textView) {
        this.f131953d = view;
        this.f131954e = g2Var;
        this.f131955f = jy0Var;
        this.f131956g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f131953d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.g2 g2Var = this.f131954e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) g2Var.f132141m;
        r45.jy0 reason = this.f131955f;
        if (arrayList2.contains(reason)) {
            textView.setTextColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            weImageView.setIconColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            view2.setBackgroundDrawable(g2Var.f132130b.getResources().getDrawable(com.tencent.mm.R.drawable.f481528vn));
            ((java.util.ArrayList) g2Var.f132141m).remove(reason);
        } else {
            textView.setTextColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            weImageView.setIconColor(g2Var.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            view2.setBackgroundDrawable(g2Var.f132130b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
            java.util.List list = g2Var.f132141m;
            kotlin.jvm.internal.o.f(reason, "$reason");
            ((java.util.ArrayList) list).add(reason);
        }
        android.widget.TextView applyBtn = this.f131956g;
        kotlin.jvm.internal.o.f(applyBtn, "$applyBtn");
        g2Var.b(applyBtn);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
