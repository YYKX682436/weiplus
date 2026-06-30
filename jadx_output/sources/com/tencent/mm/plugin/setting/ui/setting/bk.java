package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class bk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI f160876d;

    public bk(com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI settingsPermissionIndexUI) {
        this.f160876d = settingsPermissionIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f160876d.finish();
        return true;
    }
}
