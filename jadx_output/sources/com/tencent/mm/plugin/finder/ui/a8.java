package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class a8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI f128853d;

    public a8(com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI finderLikedFeedUI) {
        this.f128853d = finderLikedFeedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI.E;
        this.f128853d.d7();
        return true;
    }
}
