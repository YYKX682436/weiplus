package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f134989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f134990e;

    public kt(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f134989d = ptVar;
        this.f134990e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f134989d;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f134990e;
        com.tencent.mm.plugin.finder.viewmodel.component.pt.b7(ptVar, null, recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null, null, 5, null);
    }
}
