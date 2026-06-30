package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class p5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129620d;

    public p5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        this.f129620d = finderFansListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129620d.finish();
        return true;
    }
}
