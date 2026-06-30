package wj5;

/* loaded from: classes5.dex */
public final class z extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446852e;

    public z(yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.v processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446852e = tipsBarContext;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cj8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.j item = (xj5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.hw7);
        frameLayout.removeAllViews();
        s35.b bVar = (s35.b) item.f454907u;
        frameLayout.addView(bVar.f402843h, new android.view.ViewGroup.LayoutParams(-1, -2));
        android.view.View findViewById = bVar.f402843h.findViewById(com.tencent.mm.R.id.bqi);
        com.tencent.mm.ui.tipsbar.d dVar = this.f446852e;
        if (findViewById != null) {
            int i19 = dVar.a() ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = bVar.f402843h.findViewById(com.tencent.mm.R.id.bqj);
        if (findViewById2 == null) {
            return;
        }
        int i27 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
