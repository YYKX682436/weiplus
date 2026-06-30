package ri5;

/* loaded from: classes.dex */
public final class m extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cka;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jrw);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jqn);
        android.content.Context context = holder.itemView.getContext();
        if (item.f396128y) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.idk, context.getString(com.tencent.mm.R.string.ffq));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.fts.ui.n3.b(string, textView);
            imageView.setRotation(0.0f);
            return;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.idl);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.plugin.fts.ui.n3.b(string2, textView);
        imageView.setRotation(180.0f);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
