package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes5.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f142856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f142857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar f142858f;

    public i1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar iPCallCountryCodeScrollbar, int i17, int i18) {
        this.f142858f = iPCallCountryCodeScrollbar;
        this.f142856d = i17;
        this.f142857e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int measureText;
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar iPCallCountryCodeScrollbar = this.f142858f;
        java.lang.String[] strArr = iPCallCountryCodeScrollbar.f142569f;
        if (strArr.length > 0 && (measureText = ((int) iPCallCountryCodeScrollbar.f142577q.measureText(strArr[strArr.length - 1])) + i65.a.b(iPCallCountryCodeScrollbar.getContext(), 8)) > this.f142856d) {
            android.view.ViewGroup.LayoutParams layoutParams = iPCallCountryCodeScrollbar.getLayoutParams();
            layoutParams.width = measureText;
            layoutParams.height = this.f142857e;
            iPCallCountryCodeScrollbar.setLayoutParams(layoutParams);
        }
    }
}
