package pr3;

/* loaded from: classes.dex */
public final class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e3j;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        pr3.a item = (pr3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.u6d);
        linearLayout.setVisibility(8);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(item.f357951e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.cd6)).setVisibility(8);
        linearLayout.setVisibility(0);
    }
}
