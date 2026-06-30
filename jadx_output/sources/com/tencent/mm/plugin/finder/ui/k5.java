package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class k5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderExposeUI f129413d;

    public k5(com.tencent.mm.plugin.finder.ui.FinderExposeUI finderExposeUI) {
        this.f129413d = finderExposeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129413d.finish();
        return false;
    }
}
