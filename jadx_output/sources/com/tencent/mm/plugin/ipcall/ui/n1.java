package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142945d;

    public n1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        this.f142945d = iPCallCountryCodeSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142945d;
        iPCallCountryCodeSelectUI.hideVKB();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", iPCallCountryCodeSelectUI.f142582h);
        intent.putExtra("couttry_code", iPCallCountryCodeSelectUI.f142583i);
        iPCallCountryCodeSelectUI.setResult(100, intent);
        iPCallCountryCodeSelectUI.finish();
        return true;
    }
}
