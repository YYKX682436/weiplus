package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class jg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingDataPermissionUI f129399d;

    public jg(com.tencent.mm.plugin.finder.ui.FinderSettingDataPermissionUI finderSettingDataPermissionUI) {
        this.f129399d = finderSettingDataPermissionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129399d.finish();
        return true;
    }
}
