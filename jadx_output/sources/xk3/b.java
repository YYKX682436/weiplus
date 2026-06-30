package xk3;

/* loaded from: classes8.dex */
public final class b extends xk3.i {
    public b(vk3.a aVar) {
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
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb);
        imageView.setImageDrawable(null);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.crp);
        imageView.setVisibility(8);
        roundCornerImageView.setVisibility(0);
        wk3.a aVar = wk3.a.f446957a;
        java.lang.String string = item.f428524d.v0().getString(4);
        java.lang.Boolean bool = qp1.w.f365755a;
        java.lang.Integer b17 = qp1.a0.b(string);
        if (b17 == null) {
            b17 = qp1.a0.b(com.eclipsesource.mmv8.Platform.UNKNOWN);
        }
        kotlin.jvm.internal.o.d(b17);
        roundCornerImageView.setImageResource(b17.intValue());
    }

    @Override // xk3.i, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string = item.f428524d.v0().getString(4);
        if (string != null) {
            str = string.toUpperCase();
            kotlin.jvm.internal.o.f(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(context.getResources().getString(com.tencent.mm.R.string.gvc));
        return sb6.toString();
    }
}
