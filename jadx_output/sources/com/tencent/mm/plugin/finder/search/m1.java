package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class m1 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125771b;

    public m1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f125770a = finderFeedSearchUI;
        this.f125771b = baseFinderFeed;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        androidx.appcompat.app.AppCompatActivity context = this.f125770a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.d(view);
        kotlin.jvm.internal.o.d(menuItem);
        y4Var.W(context, view, i17, menuItem, this.f125771b);
    }
}
