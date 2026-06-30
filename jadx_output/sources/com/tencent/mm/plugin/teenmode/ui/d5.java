package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class d5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon f172967d;

    public d5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon) {
        this.f172967d = settingsTeenModeMainEmoticon;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f172967d.onBackPressed();
        return true;
    }
}
