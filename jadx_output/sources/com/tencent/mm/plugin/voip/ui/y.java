package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class y extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f177025e;

    public y(yz5.p onClickDelete) {
        kotlin.jvm.internal.o.g(onClickDelete, "onClickDelete");
        this.f177025e = onClickDelete;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cge;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.voip.ui.w item = (com.tencent.mm.plugin.voip.ui.w) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i19 = item.f177013d;
        sb6.append(i19 != 2 ? i19 != 4 ? i19 != 8 ? i19 != 16 ? i19 != 32 ? "未知编码" : "Vcodec混分软编" : "Vcodec2软编" : "264硬编" : "265硬编" : "Vcodec软编");
        sb6.append("  ");
        int i27 = item.f177014e;
        sb6.append(i27 != 4 ? i27 != 6 ? i27 != 8 ? i27 != 10 ? i27 != 12 ? "未知分辨率" : "1920p" : "1280p" : "640p" : "480p" : "320p");
        sb6.append("  ");
        sb6.append(item.f177019m);
        sb6.append("kbps  ");
        sb6.append(item.f177015f);
        sb6.append("fps  ");
        sb6.append(item.f177017h);
        sb6.append((char) 31186);
        holder.s(com.tencent.mm.R.id.o3b, sb6.toString());
        holder.p(com.tencent.mm.R.id.f484039ct2).setOnClickListener(new com.tencent.mm.plugin.voip.ui.x(this, holder, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
