package xk3;

/* loaded from: classes8.dex */
public final class d extends xk3.i {
    public d(vk3.a aVar) {
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
        java.lang.String string;
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb);
        imageView.setImageDrawable(null);
        r45.lr4 v07 = item.f428524d.v0();
        if (v07 == null || (string = v07.getString(5)) == null) {
            return;
        }
        vo0.e.f438468b.c(string, imageView, this.f455041g);
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
        java.lang.String n17 = super.n(context, item);
        boolean z17 = false;
        if (n17 != null) {
            if (n17.length() > 0) {
                z17 = true;
            }
        }
        return z17 ? n17 : context.getResources().getString(com.tencent.mm.R.string.gvi);
    }
}
