package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class fp extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f132122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kp f132123f;

    public fp(com.tencent.mm.plugin.finder.view.kp kpVar, yz5.l isLast) {
        kotlin.jvm.internal.o.g(isLast, "isLast");
        this.f132123f = kpVar;
        this.f132122e = isLast;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.are;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.view.ep item = (com.tencent.mm.plugin.finder.view.ep) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ezm);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ezj);
        if (i17 == this.f132123f.f132525g.size() - 1) {
            textView.setTextSize(1, 17.0f);
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f491405d03));
        } else {
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            textView.setText(java.lang.String.valueOf(item.f132050d));
        }
        if (((java.lang.Boolean) this.f132122e.invoke(java.lang.Integer.valueOf(i17))).booleanValue()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
