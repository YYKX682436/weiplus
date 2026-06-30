package vm2;

/* loaded from: classes3.dex */
public final class a0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.auc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vm2.b0 item = (vm2.b0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.agj);
        weImageView.setImageResource(item.f438084f);
        weImageView.setIconColor(item.f438086h ? 0 : holder.f293121e.getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setAlpha(item.f438085g ? 0.3f : 1.0f);
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jfc)).setText(item.f438083e);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
