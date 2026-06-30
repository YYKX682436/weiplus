package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class zf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectSexUI f130102d;

    public zf(com.tencent.mm.plugin.finder.ui.FinderSelectSexUI finderSelectSexUI) {
        this.f130102d = finderSelectSexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f130102d.finish();
        return false;
    }
}
