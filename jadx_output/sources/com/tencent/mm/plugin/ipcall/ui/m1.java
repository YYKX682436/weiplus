package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class m1 implements com.tencent.mm.plugin.ipcall.ui.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142939a;

    public m1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        this.f142939a = iPCallCountryCodeSelectUI;
    }

    public void a(java.lang.String str) {
        char charAt = str.charAt(0);
        boolean equals = "↑".equals(str);
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142939a;
        if (equals) {
            iPCallCountryCodeSelectUI.f142578d.setSelection(0);
            return;
        }
        int[] iArr = iPCallCountryCodeSelectUI.f142579e.f142847h;
        if (iArr == null) {
            return;
        }
        for (int i17 = 0; i17 < iArr.length; i17++) {
            if (iArr[i17] == charAt) {
                android.widget.ListView listView = iPCallCountryCodeSelectUI.f142578d;
                listView.setSelection(i17 + listView.getHeaderViewsCount());
                return;
            }
        }
    }
}
