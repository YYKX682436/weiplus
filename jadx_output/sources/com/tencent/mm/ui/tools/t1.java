package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class t1 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CountryCodeUI f210750d;

    public t1(com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI) {
        this.f210750d = countryCodeUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        char charAt = str.charAt(0);
        com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI = this.f210750d;
        if (countryCodeUI.getString(com.tencent.mm.R.string.ibx).equals(str)) {
            countryCodeUI.f209985d.setSelection(0);
            return;
        }
        int[] iArr = countryCodeUI.f209986e.f210633h;
        if (iArr == null) {
            return;
        }
        for (int i17 = 0; i17 < iArr.length; i17++) {
            if (iArr[i17] == charAt) {
                android.widget.ListView listView = countryCodeUI.f209985d;
                listView.setSelection(i17 + listView.getHeaderViewsCount());
                return;
            }
        }
    }
}
