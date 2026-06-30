package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class tn extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200023e;

    public tn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f200023e = hoVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488444th;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.ui.chatting.component.mg item = (com.tencent.mm.ui.chatting.component.mg) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.obc);
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200023e;
        textView.setText(hoVar.f198580d.g().getString(item.f199507e));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.nh8);
        java.util.Map map = com.tencent.mm.ui.chatting.component.ho.E;
        int i19 = item.f199506d == hoVar.n0() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.itemView.setOnClickListener(new com.tencent.mm.ui.chatting.component.sn(hoVar, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
