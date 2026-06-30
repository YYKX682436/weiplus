package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes3.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightSettingsUI f149386d;

    public p3(com.tencent.mm.plugin.mmsight.ui.SightSettingsUI sightSettingsUI) {
        this.f149386d = sightSettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f149386d.finish();
        return false;
    }
}
