package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class oi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132791e;

    public oi(android.view.View view, com.tencent.mm.plugin.finder.view.si siVar) {
        this.f132790d = view;
        this.f132791e = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f132790d.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f132790d.findViewById(com.tencent.mm.R.id.lkn);
        textView.setTextColor(this.f132791e.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(this.f132791e.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.f132790d.setBackgroundDrawable(this.f132791e.f133040b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.view.ni niVar = new com.tencent.mm.plugin.finder.view.ni(this.f132791e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(niVar, 200L, false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(this.f132791e.f133041c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 1);
        java.lang.String string = this.f132791e.f133044f.getString(4);
        if (string == null) {
            string = "";
        }
        lVarArr[2] = new jz5.l("promotion_buffer", string);
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
