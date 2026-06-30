package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class o extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.u f173245e;

    public o(com.tencent.mm.plugin.textstatus.convert.dowhat.u onItemClickListener) {
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        this.f173245e = onItemClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cz9;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.d item = (lj4.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.onk);
        textView.setText(item.f318981d);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hap);
        bk4.f.V(bk4.i.a(), imageView, item.f318982e, null, null, null, false, false, 124, null);
        imageView.setAlpha(0.8f);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.n(item, this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
