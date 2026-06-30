package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class yh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI f130067d;

    public yh(com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI) {
        this.f130067d = finderSettingProtectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f130067d.finish();
        return true;
    }
}
