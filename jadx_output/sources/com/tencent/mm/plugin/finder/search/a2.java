package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class a2 implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125615a;

    public a2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125615a = finderFeedSearchUI;
    }

    @Override // cw2.b8
    public boolean a() {
        return true;
    }

    @Override // cw2.b8
    public dw2.b0 b() {
        return new dw2.o();
    }

    @Override // cw2.b8
    public boolean c() {
        return true;
    }

    @Override // cw2.b8
    public androidx.recyclerview.widget.RecyclerView d() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125615a.P;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f125615a.C;
    }
}
