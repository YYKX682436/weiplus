package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.s f173234e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.t f173235f;

    /* renamed from: g, reason: collision with root package name */
    public final long f173236g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f173237h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f173238i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f173239m;

    public i(com.tencent.mm.plugin.textstatus.convert.dowhat.s onCustomStatusConfirm, com.tencent.mm.plugin.textstatus.convert.dowhat.t onCustomStatusItemClickListener) {
        kotlin.jvm.internal.o.g(onCustomStatusConfirm, "onCustomStatusConfirm");
        kotlin.jvm.internal.o.g(onCustomStatusItemClickListener, "onCustomStatusItemClickListener");
        this.f173234e = onCustomStatusConfirm;
        this.f173235f = onCustomStatusItemClickListener;
        this.f173236g = 300L;
        this.f173237h = new android.view.animation.AccelerateInterpolator();
        this.f173239m = "userdefine";
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489562cz4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.a item = (lj4.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f173238i = (com.tencent.mm.ui.widget.MMEditText) holder.p(com.tencent.mm.R.id.dhq);
        ((android.view.ViewGroup) holder.p(com.tencent.mm.R.id.cpc)).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.e(this, holder));
        holder.p(com.tencent.mm.R.id.ool).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.f(this));
        holder.p(com.tencent.mm.R.id.ole).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.g(this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((com.tencent.mm.plugin.textstatus.ui.r7) this.f173235f).a("ACTION_ENTER");
    }
}
