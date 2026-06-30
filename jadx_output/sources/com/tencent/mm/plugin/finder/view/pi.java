package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class pi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132841e;

    public pi(android.view.View view, com.tencent.mm.plugin.finder.view.si siVar) {
        this.f132840d = view;
        this.f132841e = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.jy0> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f132840d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.si siVar = this.f132841e;
        textView.setTextColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(siVar.f133040b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        view2.setBackgroundDrawable(siVar.f133040b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        siVar.f133046h.setVisibility(8);
        android.widget.TextView textView2 = siVar.f133047i;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = siVar.f133048j;
        textView3.setVisibility(0);
        android.content.Context context = siVar.f133040b;
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.cp7));
        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491303cp5));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) siVar.getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById = siVar.getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById2 = siVar.getContentView().findViewById(com.tencent.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) siVar.getContentView().findViewById(com.tencent.mm.R.id.e0j);
        textView4.setVisibility(0);
        siVar.b(textView4);
        flowLayout.removeAllViews();
        r45.qy0 qy0Var = siVar.f133044f;
        if (qy0Var != null && (list = qy0Var.getList(1)) != null) {
            for (r45.jy0 jy0Var : list) {
                java.lang.String string = jy0Var.getString(1);
                if (string == null) {
                    string = "";
                }
                android.view.View a17 = siVar.a(string, -1);
                flowLayout.addView(a17);
                a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.qi(a17, siVar, jy0Var, textView4));
            }
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.view.ri(siVar));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(siVar.f133041c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 2);
        java.lang.String string2 = siVar.f133044f.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        lVarArr[2] = new jz5.l("promotion_buffer", string2);
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
