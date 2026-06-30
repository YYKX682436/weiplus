package wj5;

/* loaded from: classes5.dex */
public final class a0 extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yj5.a0 f446775e;

    public a0(yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.a0 processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446775e = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.d17;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.l item = (xj5.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.hjz);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.olw);
        weImageView.s(item.f454910u, item.f454911v);
        textView.setText(item.f454912w);
        long min = java.lang.Math.min(java.lang.Math.max(c01.id.c() - item.f454913x, 0L), 5000L);
        yj5.a0 a0Var = this.f446775e;
        com.tencent.mm.sdk.platformtools.n3 q17 = a0Var.f198580d.q();
        java.lang.Runnable runnable = a0Var.f462705g;
        q17.removeCallbacks(runnable);
        a0Var.f198580d.q().postDelayed(runnable, min);
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
