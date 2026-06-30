package ti2;

/* loaded from: classes3.dex */
public final class j extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dez;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.f item = (vi2.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        ce2.i iVar = item.f437545d;
        wo0.c a17 = d1Var.a(new mn2.q3(iVar.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.q6q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((wo0.b) a17).c((android.widget.ImageView) findViewById);
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.grl)).setText(iVar.field_name);
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.q6z)).setText(java.lang.String.valueOf((int) iVar.field_price));
    }
}
