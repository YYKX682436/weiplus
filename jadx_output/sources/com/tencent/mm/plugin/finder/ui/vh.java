package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class vh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI f129960d;

    public vh(com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI finderSettingPrivacyUI) {
        this.f129960d = finderSettingPrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129960d.finish();
        return true;
    }
}
