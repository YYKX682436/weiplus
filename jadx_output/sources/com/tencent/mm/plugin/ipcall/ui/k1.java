package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142887d;

    public k1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        this.f142887d = iPCallCountryCodeSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142887d.finish();
        return false;
    }
}
