package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ch implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI f128993d;

    public ch(com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI) {
        this.f128993d = finderSettingInteractiveInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f128993d.finish();
        return true;
    }
}
