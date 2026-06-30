package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes.dex */
public final class k extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cz7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.c item = (lj4.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ooa);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(item.f318980d);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
