package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ok implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderUnOpenUI f129608d;

    public ok(com.tencent.mm.plugin.finder.ui.FinderUnOpenUI finderUnOpenUI) {
        this.f129608d = finderUnOpenUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129608d.finish();
        return false;
    }
}
