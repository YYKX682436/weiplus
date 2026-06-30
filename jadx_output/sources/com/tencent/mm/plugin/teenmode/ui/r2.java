package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class r2 extends in5.r {
    public r2(com.tencent.mm.plugin.teenmode.ui.w2 w2Var) {
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cm6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.teenmode.ui.p2 item = (com.tencent.mm.plugin.teenmode.ui.p2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.nzp)).setText(item.f173102d.getString(1));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nzp);
        if (textView != null) {
            textView.setTextColor(holder.f293121e.getResources().getColor(item.f173103e ? com.tencent.mm.R.color.Brand_100 : com.tencent.mm.R.color.FG_0));
        }
        holder.p(com.tencent.mm.R.id.nzo).setBackgroundResource(item.f173103e ? com.tencent.mm.R.drawable.f481586xb : com.tencent.mm.R.drawable.f481585xa);
    }
}
