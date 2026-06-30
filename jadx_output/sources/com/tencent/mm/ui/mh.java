package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class mh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209144d;

    public mh(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI) {
        this.f209144d = serviceNotifySettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f209144d.finish();
        return false;
    }
}
