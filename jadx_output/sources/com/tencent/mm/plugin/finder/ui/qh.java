package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class qh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI f129741d;

    public qh(com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
        this.f129741d = finderSettingPersonalizedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129741d.finish();
        return true;
    }
}
