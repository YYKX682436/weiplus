package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class up extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f133215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.zp f133216f;

    public up(com.tencent.mm.plugin.finder.view.zp zpVar, yz5.l isLast) {
        kotlin.jvm.internal.o.g(isLast, "isLast");
        this.f133216f = zpVar;
        this.f133215e = isLast;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.apm;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Integer num;
        java.lang.Integer num2;
        com.tencent.mm.plugin.finder.view.tp item = (com.tencent.mm.plugin.finder.view.tp) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ezm);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ezj);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ezn);
        if (i17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            num = 8;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            num2 = 0;
        } else {
            num = 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            num2 = 0;
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 == this.f133216f.f133487d.size() - 1) {
            textView.setTextSize(1, 17.0f);
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.d8n));
        } else {
            textView.setTextSize(1, 20.0f);
            textView.setText(java.lang.String.valueOf(item.f133146d));
        }
        if (((java.lang.Boolean) this.f133215e.invoke(java.lang.Integer.valueOf(i17))).booleanValue()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(num2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(num);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ezm);
        kotlin.jvm.internal.o.d(textView);
        hc2.o.a(textView, false);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }
}
