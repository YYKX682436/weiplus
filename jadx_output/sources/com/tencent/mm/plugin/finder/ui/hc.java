package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f129324d;

    public hc(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        this.f129324d = finderPostAtUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f129324d.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.tencent.mm.plugin.finder.ui.ac) adapter).notifyDataSetChanged();
    }
}
