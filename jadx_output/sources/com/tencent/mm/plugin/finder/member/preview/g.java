package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class g implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f121222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121223c;

    public g(com.tencent.mm.plugin.finder.member.preview.k kVar, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        this.f121221a = kVar;
        this.f121222b = recyclerView;
        this.f121223c = finderRefreshLayout;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121221a;
        java.lang.String finderAuthorUsername = kVar.f121243h;
        androidx.recyclerview.widget.f2 adapter = this.f121222b.getAdapter();
        kVar.getClass();
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout refreshLayout = this.f121223c;
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        pm0.v.T(new ho2.a(null, finderAuthorUsername, "", kVar.f121249q, null, 0).l(), new com.tencent.mm.plugin.finder.member.preview.j(kVar, adapter, refreshLayout, finderAuthorUsername));
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121221a;
        java.lang.String finderAuthorUsername = kVar.f121243h;
        androidx.recyclerview.widget.f2 adapter = this.f121222b.getAdapter();
        kVar.getClass();
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout refreshLayout = this.f121223c;
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        pm0.v.T(new ho2.a(null, finderAuthorUsername, "", kVar.f121249q, kVar.f121241f, 2).l(), new com.tencent.mm.plugin.finder.member.preview.i(kVar, adapter, refreshLayout, finderAuthorUsername));
        return true;
    }
}
