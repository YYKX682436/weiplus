package pr3;

/* loaded from: classes.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e3j;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        pr3.d item = (pr3.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.u6d);
        kotlin.jvm.internal.o.d(linearLayout);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(item.f357969f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.cd6)).setText(i65.a.r(linearLayout.getContext(), item.f357968e));
        if (item.f357970g) {
            android.view.View view = holder.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            layoutParams.height = -2;
            holder.itemView.setLayoutParams(layoutParams);
            return;
        }
        android.view.View view2 = holder.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams2 = holder.itemView.getLayoutParams();
        layoutParams2.height = 0;
        holder.itemView.setLayoutParams(layoutParams2);
    }
}
