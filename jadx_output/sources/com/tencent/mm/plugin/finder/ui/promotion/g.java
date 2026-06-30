package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f129659e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129660f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f129661g = new com.tencent.mm.plugin.finder.ui.promotion.f();

    public g(int i17, java.lang.String str) {
        this.f129659e = i17;
        this.f129660f = str;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.du8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.ui.promotion.e item = (com.tencent.mm.plugin.finder.ui.promotion.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.s1k);
        int i19 = this.f129659e;
        if (i19 != 0) {
            imageView.getLayoutParams().width = i19;
            imageView.getLayoutParams().height = i19;
        }
        r45.eb1 eb1Var = item.f129658d;
        boolean z18 = eb1Var.getBoolean(2);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (!z18 || hc2.l.g(this.f129660f)) {
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(eb1Var.getString(0), null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
            return;
        }
        vo0.d b17 = g1Var.b();
        mn2.e0 e0Var = new mn2.e0(eb1Var.getString(0), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        b17.c(e0Var, imageView, g1Var.h(mn2.f1.f329957h));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.s1k);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(this.f129661g);
    }
}
