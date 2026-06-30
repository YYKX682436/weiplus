package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class di implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f129077d;

    public di(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        this.f129077d = finderSettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129077d.finish();
        return false;
    }
}
