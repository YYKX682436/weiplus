package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class p0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f121869e;

    public p0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f121869e = context;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.i item = (vp2.i) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.m8y);
        if (wxRecyclerView.getItemDecorationCount() > 0) {
            wxRecyclerView.T0(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i19 = 0; i19 < 6; i19++) {
            arrayList.add(new vp2.h());
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        wxRecyclerView.setAdapter(new up2.f(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory((com.tencent.mm.ui.MMActivity) context, false, false, 0, false, 16, null), arrayList));
        wxRecyclerView.N(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.o0(this, arrayList));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(0);
        wxRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
