package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class q0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e5c;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Integer num;
        com.tencent.mm.pluginsdk.ui.otherway.w data = (com.tencent.mm.pluginsdk.ui.otherway.w) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        com.tencent.mm.pluginsdk.model.o0 o0Var = data.f191017g;
        if (o0Var != null && (num = o0Var.f189392d) != null) {
            int intValue = num.intValue();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6y);
            if (weImageView != null) {
                weImageView.setImageResource(intValue);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
        if (textView == null) {
            return;
        }
        textView.setText(data.a());
    }
}
