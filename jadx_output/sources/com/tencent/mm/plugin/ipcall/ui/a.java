package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f142741a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f142742b;

    /* renamed from: c, reason: collision with root package name */
    public int f142743c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142744d;

    public a(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f142741a = str;
        this.f142742b = str2;
        this.f142743c = i17;
        this.f142744d = str3;
    }

    public int a() {
        if (this.f142743c == 0) {
            return 0;
        }
        java.lang.String[] strArr = com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar.f142566r;
        for (int i17 = 0; i17 < 26; i17++) {
            if (strArr[i17].equals(java.lang.String.valueOf((char) this.f142743c))) {
                return this.f142743c;
            }
        }
        return "#".charAt(0);
    }
}
