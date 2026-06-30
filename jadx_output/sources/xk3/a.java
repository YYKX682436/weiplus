package xk3;

/* loaded from: classes8.dex */
public final class a extends xk3.i {

    /* renamed from: i, reason: collision with root package name */
    public final int f455019i;

    public a(vk3.a aVar) {
        super(com.tencent.mm.R.layout.bxn, aVar);
        this.f455019i = 4;
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
        java.lang.String str;
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jvj);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = item.f428524d;
        r45.lr4 v07 = multiTaskInfo.v0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(multiTaskInfo.v0().getString(8))) {
            wk3.a aVar = wk3.a.f446957a;
            kotlin.jvm.internal.o.d(textView);
            if (v07 == null || (str = v07.getString(0)) == null) {
                str = "";
            }
            textView.setText(aVar.c(textView, str, this.f455019i));
        }
        jz5.f0 f0Var = null;
        imageView.setImageDrawable(null);
        r45.lr4 v08 = multiTaskInfo.v0();
        if (v08 != null && (string = v08.getString(5)) != null) {
            vo0.e.f438468b.c(string, imageView, this.f455041g);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.crp);
            roundCornerImageView.setVisibility(0);
            roundCornerImageView.setImageResource(com.tencent.mm.R.raw.spannable_app_brand_link_logo);
        }
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
        return z17 ? n17 : context.getResources().getString(com.tencent.mm.R.string.gvb);
    }
}
