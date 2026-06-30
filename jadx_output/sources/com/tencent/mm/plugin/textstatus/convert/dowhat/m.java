package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class m extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.u f173242e;

    public m(com.tencent.mm.plugin.textstatus.convert.dowhat.u onItemClickListener) {
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        this.f173242e = onItemClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cz8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.d item = (lj4.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.onk)).setText(item.f318981d);
        bk4.f.V(bk4.i.a(), (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hap), item.f318982e, null, null, null, false, false, 124, null);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.l(item, this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
