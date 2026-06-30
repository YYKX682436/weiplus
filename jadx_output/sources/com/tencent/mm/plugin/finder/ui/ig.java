package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ig implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfUI f129366d;

    public ig(com.tencent.mm.plugin.finder.ui.FinderSelfUI finderSelfUI) {
        this.f129366d = finderSelfUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129366d.onBackPressed();
        return true;
    }
}
