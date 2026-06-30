package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class vg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f129959d;

    public vg(com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI) {
        this.f129959d = finderSettingInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129959d.finish();
        return true;
    }
}
