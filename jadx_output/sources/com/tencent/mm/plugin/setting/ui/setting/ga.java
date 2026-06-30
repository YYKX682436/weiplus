package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ga implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161072d;

    public ga(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161072d = settingsDelAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f161072d.finish();
        return true;
    }
}
