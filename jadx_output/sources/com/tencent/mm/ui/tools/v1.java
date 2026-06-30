package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CountryCodeUI f210834d;

    public v1(com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI) {
        this.f210834d = countryCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI = this.f210834d;
        countryCodeUI.hideVKB();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", countryCodeUI.f209989h);
        intent.putExtra("couttry_code", countryCodeUI.f209990i);
        intent.putExtra("iso_code", countryCodeUI.f209991m);
        countryCodeUI.setResult(100, intent);
        countryCodeUI.finish();
        return true;
    }
}
