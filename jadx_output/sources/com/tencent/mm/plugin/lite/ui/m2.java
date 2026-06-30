package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f144444e;

    public m2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI, int i17) {
        this.f144443d = wxaLiteAppSheetUI;
        this.f144444e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144443d;
        if (i17 == 26) {
            kd.c.e(wxaLiteAppSheetUI.f144353d, "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i18 = this.f144444e;
        wxaLiteAppSheetUI.f144365s = i18;
        if (i18 == 0) {
            wxaLiteAppSheetUI.setRequestedOrientation(1);
            return;
        }
        if (i18 == wxaLiteAppSheetUI.f144362p) {
            if (android.provider.Settings.System.getInt(wxaLiteAppSheetUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                wxaLiteAppSheetUI.setRequestedOrientation(10);
                return;
            } else {
                wxaLiteAppSheetUI.setRequestedOrientation(1);
                return;
            }
        }
        if (i18 == wxaLiteAppSheetUI.f144363q) {
            wxaLiteAppSheetUI.setRequestedOrientation(1);
        } else if (i18 == wxaLiteAppSheetUI.f144364r) {
            wxaLiteAppSheetUI.setRequestedOrientation(6);
        }
    }
}
