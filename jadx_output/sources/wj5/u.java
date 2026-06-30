package wj5;

/* loaded from: classes9.dex */
public final class u extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446842e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446843f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.s f446844g;

    public u(yb5.d ui6, com.tencent.mm.ui.tipsbar.d shareData, yj5.s processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(shareData, "shareData");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446842e = ui6;
        this.f446843f = shareData;
        this.f446844g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488394s4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.h item = (xj5.h) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.omd);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483487b03);
        com.tencent.mm.ui.anim.content.AnimTextView animTextView = (com.tencent.mm.ui.anim.content.AnimTextView) holder.p(com.tencent.mm.R.id.ole);
        textView.setText(item.f454905u.f376770e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        animTextView.setVisibility(8);
        holder.itemView.setOnClickListener(new wj5.s(item, this, holder));
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        n(itemView, i17, this.f446843f, new wj5.t(this, item));
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
