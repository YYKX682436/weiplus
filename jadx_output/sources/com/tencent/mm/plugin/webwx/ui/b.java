package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f187995d;

    public b(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        this.f187995d = extDeviceWXLoginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f187995d.finish();
        return true;
    }
}
