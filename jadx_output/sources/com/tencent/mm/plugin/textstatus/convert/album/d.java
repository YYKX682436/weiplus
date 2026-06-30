package com.tencent.mm.plugin.textstatus.convert.album;

/* loaded from: classes11.dex */
public final class d extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.album.b f173217e;

    public d(com.tencent.mm.plugin.textstatus.convert.album.b onItemClickListener) {
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        this.f173217e = onItemClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.czk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        fj4.c item = (fj4.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487432om4);
        com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout textStatusCircleIconLayout = (com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout) holder.p(com.tencent.mm.R.id.f485298h75);
        textView.setText(item.f263230g);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        java.util.List list2 = item.f263228e;
        boolean z18 = list2 == null || list2.isEmpty();
        android.content.Context context = holder.f293121e;
        if (z18) {
            textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f479232tk));
            textStatusCircleIconLayout.setVisibility(4);
        } else {
            textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478719fa));
            textStatusCircleIconLayout.setVisibility(0);
            textStatusCircleIconLayout.b(item.f263228e, item.f263229f);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.album.c(this, holder, item));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
