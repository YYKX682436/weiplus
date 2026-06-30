package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121977e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121978f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f121979g;

    public v(java.lang.String themeId, int i17) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        this.f121977e = themeId;
        this.f121978f = i17;
        this.f121979g = "AggregationCardProductItemConvert";
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dvk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.g item = (vp2.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.le1 le1Var = item.f438922e;
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.qnr);
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.qns);
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.qnt);
        android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.s19);
        kotlin.jvm.internal.o.d(findViewById);
        r45.ue1 ue1Var = item.f438921d;
        n(findViewById, ue1Var, 0);
        kotlin.jvm.internal.o.d(findViewById2);
        n(findViewById2, ue1Var, 1);
        kotlin.jvm.internal.o.d(findViewById3);
        n(findViewById3, ue1Var, 2);
        kotlin.jvm.internal.o.d(findViewById4);
        n(findViewById4, ue1Var, 3);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.u(this, le1Var, ue1Var, holder, item));
    }

    public final void n(android.view.View view, r45.ue1 ue1Var, int i17) {
        int a17 = (this.f121978f - i65.a.a(view.getContext(), 40.0f)) / 2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a17;
        layoutParams.height = a17;
        java.util.LinkedList product_item = ue1Var.f387293f;
        kotlin.jvm.internal.o.f(product_item, "product_item");
        r45.te1 te1Var = (r45.te1) kz5.n0.a0(product_item, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind product ");
        sb6.append(te1Var != null ? te1Var.f386345e : null);
        sb6.append(" at index ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(this.f121979g, sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486441l74);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        if (te1Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.lang.String str = te1Var.f386344d;
        if (str == null) {
            str = "";
        }
        wo0.c a18 = d1Var.a(((c61.i8) i5Var).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        kotlin.jvm.internal.o.d(imageView);
        a18.c(imageView);
        textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(te1Var.f386347g)));
    }
}
