package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class s80 extends com.tencent.mm.plugin.finder.live.widget.e0 {

    /* renamed from: b2, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f119740b2;

    /* renamed from: c2, reason: collision with root package name */
    public final java.util.List f119741c2;

    /* renamed from: d2, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.n80 f119742d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119741c2 = new java.util.ArrayList();
        this.f119742d2 = new com.tencent.mm.plugin.finder.live.widget.n80(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9n;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        df2.ox oxVar;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAssistantMoreActionPanel", "initContentView");
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        Y(com.tencent.mm.R.color.f478490b);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.stq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f119740b2 = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 5));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f119740b2;
        pk2.o9 o9Var = null;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("gridRv");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.n80 n80Var = this.f119742d2;
        recyclerView2.setAdapter(n80Var);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f119740b2;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("gridRv");
            throw null;
        }
        recyclerView3.setOverScrollMode(2);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f119740b2;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("gridRv");
            throw null;
        }
        recyclerView4.N(new com.tencent.mm.plugin.finder.live.widget.o80(context));
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (oxVar = (df2.ox) k0Var.getController(df2.ox.class)) != null) {
            o9Var = oxVar.f231016q;
        }
        java.util.List list = this.f119741c2;
        if (o9Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveAssistantMoreActionPanel", "loadItems: helper is null, skip building items");
            ((java.util.ArrayList) list).clear();
            n80Var.notifyDataSetChanged();
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.add(new com.tencent.mm.plugin.finder.live.widget.l80(com.tencent.mm.R.string.dwo, com.tencent.mm.R.raw.icons_outlined_live_chats, new com.tencent.mm.plugin.finder.live.widget.q80(this, o9Var)));
        arrayList.add(new com.tencent.mm.plugin.finder.live.widget.l80(com.tencent.mm.R.string.dxw, com.tencent.mm.R.raw.icons_outlined_more2, new com.tencent.mm.plugin.finder.live.widget.r80(this, o9Var)));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAssistantMoreActionPanel", "loadItems: visible=" + arrayList.size());
        n80Var.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }
}
