package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class x2 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f161722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI, com.tencent.mm.ui.MMActivity mMActivity) {
        super(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C, 8);
        this.f161723b = selfQRCodeUI;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null || i17 != 8) {
            return;
        }
        java.lang.String str2 = this.f161722a;
        if (str2 == null || !str.equalsIgnoreCase(str2)) {
            this.f161722a = str;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C + str);
            com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161723b;
            com.tencent.mm.sdk.platformtools.i1.b(selfQRCodeUI.getContext(), r6Var);
            selfQRCodeUI.getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 14L, 1L, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI$ScreenshotObserver", "Send event to listener.");
        }
    }
}
