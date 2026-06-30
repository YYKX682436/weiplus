package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125626e;

    public b1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f125625d = finderFeedSearchUI;
        this.f125626e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125625d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125626e;
        if (com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.c7(finderFeedSearchUI, baseFinderFeed)) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.h(context, g4Var, baseFinderFeed);
    }
}
