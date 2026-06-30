package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class v7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f129945d;

    public v7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f129945d = finderKitUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129945d.finish();
        return false;
    }
}
