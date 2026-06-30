package df2;

/* loaded from: classes3.dex */
public final class mz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f230817d;

    public mz(df2.a00 a00Var) {
        this.f230817d = a00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList list;
        r45.bb7 bb7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShopCouponBubbleController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.a00 a00Var = this.f230817d;
        r45.xb2 xb2Var = (r45.xb2) a00Var.f229650o.getValue();
        if (xb2Var != null && (list = xb2Var.getList(1)) != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.W;
            cl0.g gVar = new cl0.g();
            r45.xb2 xb2Var2 = (r45.xb2) a00Var.f229650o.getValue();
            gVar.h("extra_report_json", (xb2Var2 == null || (bb7Var = (r45.bb7) xb2Var2.getCustom(0)) == null) ? null : bb7Var.getString(4));
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
            st2.c cVar = a00Var.f229649n;
            if (cVar != null && !list.isEmpty()) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0 r0Var2 = (ml2.r0) c18;
                ml2.f4 f4Var2 = ml2.f4.X;
                cl0.g gVar2 = new cl0.g();
                r45.qa5 qa5Var = (r45.qa5) kz5.n0.Z(list);
                gVar2.h("extra_report_json", qa5Var != null ? qa5Var.getString(5) : null);
                ml2.r0.Dj(r0Var2, f4Var2, null, null, null, null, null, 0, 0L, gVar2, null, null, null, false, null, 16126, null);
                android.view.View view2 = cVar.f412236a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "show", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "show", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.qa5 data = (r45.qa5) kz5.n0.X(list);
                st2.b bVar = new st2.b(cVar);
                com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponCardView finderLiveShoppingCouponCardView = cVar.f412237b;
                finderLiveShoppingCouponCardView.getClass();
                kotlin.jvm.internal.o.g(data, "data");
                ((android.widget.TextView) finderLiveShoppingCouponCardView.findViewById(com.tencent.mm.R.id.obc)).setText(data.getString(0));
                ((android.widget.TextView) finderLiveShoppingCouponCardView.findViewById(com.tencent.mm.R.id.owj)).setText(data.getString(4));
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) finderLiveShoppingCouponCardView.findViewById(com.tencent.mm.R.id.vaq);
                linearLayout.removeAllViews();
                android.widget.TextView textView = (android.widget.TextView) finderLiveShoppingCouponCardView.findViewById(com.tencent.mm.R.id.vap);
                java.util.LinkedList<java.lang.String> list2 = data.getList(1);
                kotlin.jvm.internal.o.f(list2, "getSub_title(...)");
                for (java.lang.String str : list2) {
                    android.widget.TextView textView2 = new android.widget.TextView(finderLiveShoppingCouponCardView.getContext());
                    textView2.setText(str);
                    textView2.setTextSize(0, textView.getTextSize());
                    textView2.setTextColor(textView.getTextColors().getDefaultColor());
                    linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(-2, -2));
                }
                ((android.widget.TextView) finderLiveShoppingCouponCardView.findViewById(com.tencent.mm.R.id.b2z)).setOnClickListener(new xt2.s3(bVar, data));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShopCouponBubbleController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
