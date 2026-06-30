package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f117964a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f117965b;

    public c5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f117964a = context;
    }

    public final void a(boolean z17, java.util.List anchorVideoLevels, int i17) {
        int dimensionPixelOffset;
        kotlin.jvm.internal.o.g(anchorVideoLevels, "anchorVideoLevels");
        android.content.Context context = this.f117964a;
        com.tencent.mm.plugin.finder.live.widget.io ioVar = new com.tencent.mm.plugin.finder.live.widget.io(context, 0, true, true);
        ioVar.j(com.tencent.mm.R.layout.b0d);
        if (context.getResources().getConfiguration().orientation == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = ioVar.f212027f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = com.tencent.mm.ui.bl.b(context).y;
                layoutParams.height = -1;
            }
            ioVar.A = com.tencent.mm.ui.bl.b(context).y;
            ioVar.m(java.lang.Boolean.TRUE);
        }
        ioVar.f212027f.findViewById(com.tencent.mm.R.id.cru).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.a5(ioVar));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ioVar.f212027f.findViewById(com.tencent.mm.R.id.crw);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.live.widget.y4(anchorVideoLevels, i17, new com.tencent.mm.plugin.finder.live.widget.b5(this, ioVar)));
        android.view.ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        if (z17) {
            recyclerView.getLayoutParams().height = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y - recyclerView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7);
            dimensionPixelOffset = recyclerView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        } else {
            dimensionPixelOffset = recyclerView.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj) + com.tencent.mm.ui.bl.c(recyclerView.getContext());
        }
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        ioVar.s();
    }
}
