package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes.dex */
public final class p extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ayx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.a3 item = (so2.a3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.f293125i = item;
        android.content.Context context = holder.f293121e;
        context.getResources();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.isc);
        r45.xc5 xc5Var = item.f410253d;
        textView.setText(xc5Var.getString(2));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z)).setText(k35.m1.g(context.getString(com.tencent.mm.R.string.ejq), xc5Var.getLong(1) * 1000));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isj)).setText(xc5Var.getString(3));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
