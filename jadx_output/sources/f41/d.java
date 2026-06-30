package f41;

/* loaded from: classes.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eln;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        f41.r0 item = (f41.r0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.k3s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.hc6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.t4l);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.t4k);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.storage.z3 z3Var = item.f259512e;
        ((com.tencent.mm.ui.widget.MMTextView) findViewById).setText(z3Var.g2());
        ((android.widget.TextView) findViewById3).setText(java.lang.String.valueOf(i17 + 1));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) findViewById2, z3Var.d1(), null);
        androidx.recyclerview.widget.f2 f2Var = holder.f293122f;
        boolean z18 = i17 == (f2Var != null ? f2Var.getItemCount() : 0) - 1;
        int i19 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = z18 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        r.b bVar = com.tencent.mm.open_voice_control.card.BaseCard.T1;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bVar.a(itemView);
    }
}
