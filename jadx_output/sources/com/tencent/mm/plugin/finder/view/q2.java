package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f132869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f132870g;

    public q2(android.view.View view, com.tencent.mm.plugin.finder.view.s2 s2Var, java.lang.Object obj, android.widget.TextView textView) {
        this.f132867d = view;
        this.f132868e = s2Var;
        this.f132869f = obj;
        this.f132870g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f132867d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.s2 s2Var = this.f132868e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) s2Var.f133006n;
        java.lang.Object obj = this.f132869f;
        if (arrayList2.contains(obj)) {
            textView.setTextColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            weImageView.setIconColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            view2.setBackgroundDrawable(s2Var.f132994b.getResources().getDrawable(com.tencent.mm.R.drawable.f481528vn));
            ((java.util.ArrayList) s2Var.f133006n).remove(obj);
        } else {
            textView.setTextColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            weImageView.setIconColor(s2Var.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            view2.setBackgroundDrawable(s2Var.f132994b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
            ((java.util.ArrayList) s2Var.f133006n).add(obj);
        }
        android.widget.TextView applyBtn = this.f132870g;
        kotlin.jvm.internal.o.f(applyBtn, "$applyBtn");
        s2Var.b(applyBtn);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
