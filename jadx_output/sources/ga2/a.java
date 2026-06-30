package ga2;

/* loaded from: classes2.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489062ed5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.width = com.tencent.mm.ui.bh.a(holder.f293121e).f197135a;
        holder.itemView.setLayoutParams(layoutParams);
    }
}
