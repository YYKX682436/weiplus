package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132760e;

    public o2(android.view.View view, com.tencent.mm.plugin.finder.view.s2 s2Var) {
        this.f132759d = view;
        this.f132760e = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f132759d.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f132759d.findViewById(com.tencent.mm.R.id.lkn);
        textView.setTextColor(this.f132760e.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(this.f132760e.f132994b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.f132759d.setBackgroundDrawable(this.f132760e.f132994b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.view.n2 n2Var = new com.tencent.mm.plugin.finder.view.n2(this.f132760e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(n2Var, 200L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
