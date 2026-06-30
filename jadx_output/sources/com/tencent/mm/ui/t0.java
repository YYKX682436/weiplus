package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI f209866d;

    public t0(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI) {
        this.f209866d = appBrandNotifySettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f209866d.finish();
        return false;
    }
}
