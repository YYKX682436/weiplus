package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class hg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI f161112d;

    public hg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI settingsManageFindMoreV2UI) {
        this.f161112d = settingsManageFindMoreV2UI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f161112d.finish();
        return true;
    }
}
