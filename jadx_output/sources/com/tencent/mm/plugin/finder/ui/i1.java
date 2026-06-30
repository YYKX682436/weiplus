package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129345d;

    public i1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        this.f129345d = finderBlackListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129345d.finish();
        return true;
    }
}
