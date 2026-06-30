package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class p7 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210638d;

    public p7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210638d = newCountryCodeUI;
    }

    @Override // db5.o9
    public void O4(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mm.ui.tools.NewCountryCodeUI.T6(this.f210638d, str.charAt(0), false);
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        if (str == null) {
            return;
        }
        char charAt = str.charAt(0);
        boolean b17 = kotlin.jvm.internal.o.b("🔍", str);
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210638d;
        if (!b17) {
            newCountryCodeUI.f210130x = str;
            com.tencent.mm.ui.tools.NewCountryCodeUI.T6(newCountryCodeUI, charAt, true);
        } else {
            android.widget.ListView listView = newCountryCodeUI.f210113d;
            if (listView != null) {
                listView.setSelection(0);
            }
        }
    }
}
