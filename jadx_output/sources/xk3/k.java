package xk3;

/* loaded from: classes8.dex */
public final class k extends xk3.i {
    public k(vk3.a aVar) {
        super(com.tencent.mm.R.layout.bxn, aVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb);
        jz5.f0 f0Var = null;
        roundCornerImageView.setImageDrawable(null);
        r45.lr4 v07 = item.f428524d.v0();
        if (v07 != null && (string = v07.getString(5)) != null) {
            vo0.e.f438468b.c(string, roundCornerImageView, this.f455041g);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView2 = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.crp);
            roundCornerImageView2.setVisibility(0);
            roundCornerImageView2.setImageResource(com.tencent.mm.R.raw.float_ball_icon_search_default);
        }
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String string = item.f428524d.v0().getString(0);
        return string == null ? context.getResources().getString(com.tencent.mm.R.string.o9w) : string;
    }
}
