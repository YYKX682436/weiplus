package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class d1 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f125653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125654d;

    public d1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f125651a = finderFeedSearchUI;
        this.f125652b = baseFinderFeed;
        this.f125653c = k0Var;
        this.f125654d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        if (h4Var != null) {
            o25.y1 y1Var = this.f125651a.f125552x0;
            if (y1Var == null) {
                kotlin.jvm.internal.o.o("quickMenuHelper");
                throw null;
            }
            kotlin.jvm.internal.o.f(this.f125654d.f293121e, "getContext(...)");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f125652b;
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.widget.dialog.k0 sheet = this.f125653c;
            kotlin.jvm.internal.o.g(sheet, "sheet");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "getMoreMenuItemLongSelectedListener :" + obj);
    }
}
