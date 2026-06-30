package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class e8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveExceptionUI f129095d;

    public e8(com.tencent.mm.plugin.finder.ui.FinderLiveExceptionUI finderLiveExceptionUI) {
        this.f129095d = finderLiveExceptionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129095d.onBackPressed();
        return true;
    }
}
