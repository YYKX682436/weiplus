package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListUI f129937d;

    public v1(com.tencent.mm.plugin.finder.ui.FinderBlockListUI finderBlockListUI) {
        this.f129937d = finderBlockListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129937d.finish();
        return true;
    }
}
