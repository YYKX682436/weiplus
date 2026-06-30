package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class qi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jy0 f132897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f132898g;

    public qi(android.view.View view, com.tencent.mm.plugin.finder.view.si siVar, r45.jy0 jy0Var, android.widget.TextView textView) {
        this.f132895d = view;
        this.f132896e = siVar;
        this.f132897f = jy0Var;
        this.f132898g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f132895d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.si siVar = this.f132896e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) siVar.f133049k;
        r45.jy0 reason = this.f132897f;
        if (arrayList2.contains(reason)) {
            textView.setTextColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            weImageView.setIconColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            view2.setBackgroundDrawable(siVar.f133040b.getResources().getDrawable(com.tencent.mm.R.drawable.f481528vn));
            ((java.util.ArrayList) siVar.f133049k).remove(reason);
        } else {
            textView.setTextColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            weImageView.setIconColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            view2.setBackgroundDrawable(siVar.f133040b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
            java.util.List list = siVar.f133049k;
            kotlin.jvm.internal.o.f(reason, "$reason");
            ((java.util.ArrayList) list).add(reason);
        }
        android.widget.TextView applyBtn = this.f132898g;
        kotlin.jvm.internal.o.f(applyBtn, "$applyBtn");
        siVar.b(applyBtn);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
