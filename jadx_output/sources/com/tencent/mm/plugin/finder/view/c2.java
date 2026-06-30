package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f131746e;

    public c2(android.view.View view, com.tencent.mm.plugin.finder.view.g2 g2Var) {
        this.f131745d = view;
        this.f131746e = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f131745d.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f131745d.findViewById(com.tencent.mm.R.id.lkn);
        textView.setTextColor(this.f131746e.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(this.f131746e.f132130b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.f131745d.setBackgroundDrawable(this.f131746e.f132130b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.view.b2 b2Var = new com.tencent.mm.plugin.finder.view.b2(this.f131746e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(b2Var, 200L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
