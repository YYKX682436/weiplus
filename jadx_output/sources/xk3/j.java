package xk3;

/* loaded from: classes8.dex */
public final class j extends xk3.i {
    public j(vk3.a aVar) {
        super(com.tencent.mm.R.layout.bxn, aVar);
    }

    @Override // xk3.i, in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        ((android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb)).setImageDrawable(null);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.crp);
        roundCornerImageView.setVisibility(0);
        roundCornerImageView.setImageResource(com.tencent.mm.R.raw.bottomsheet_icon_fav);
    }

    @Override // xk3.i, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        return context.getResources().getString(com.tencent.mm.R.string.gve);
    }
}
