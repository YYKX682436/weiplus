package pd2;

/* loaded from: classes2.dex */
public class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ajn;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.dzu);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.dzy);
        int h17 = item.h();
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (h17 == 4) {
            textView.setVisibility(0);
            r45.mb4 mb4Var3 = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
            long integer = mb4Var3 != null ? mb4Var3.getInteger(3) : 0;
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(integer / 60), java.lang.Long.valueOf(integer % 60)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
            if (!z17 && (mb4Var2 = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList())) != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var2.getString(16))) {
                    mn2.c1 c1Var = new mn2.c1(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                    vo0.d e17 = g1Var.e();
                    kotlin.jvm.internal.o.d(imageView);
                    e17.c(c1Var, imageView, g1Var.h(mn2.f1.f329954e));
                } else {
                    mn2.r3 r3Var = new mn2.r3(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null);
                    vo0.d e18 = g1Var.e();
                    kotlin.jvm.internal.o.d(imageView);
                    e18.c(r3Var, imageView, g1Var.h(mn2.f1.f329954e));
                }
            }
        } else {
            textView.setVisibility(8);
            if (!z17 && (mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList())) != null) {
                vo0.d e19 = g1Var.e();
                mn2.c1 c1Var2 = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                kotlin.jvm.internal.o.d(imageView);
                e19.c(c1Var2, imageView, g1Var.h(mn2.f1.f329954e));
            }
        }
        pd2.d dVar = pd2.d.f353545a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, false);
    }
}
