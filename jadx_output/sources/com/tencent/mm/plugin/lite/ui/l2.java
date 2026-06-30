package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class l2 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI, android.os.Handler handler) {
        super(handler);
        this.f144434a = wxaLiteAppSheetUI;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144434a;
        if (wxaLiteAppSheetUI.f144365s == wxaLiteAppSheetUI.f144362p) {
            if (android.provider.Settings.System.getInt(wxaLiteAppSheetUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                wxaLiteAppSheetUI.setRequestedOrientation(10);
            } else {
                wxaLiteAppSheetUI.setRequestedOrientation(1);
            }
        }
    }
}
