package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class tk implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI f161581a;

    public tk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI) {
        this.f161581a = settingsPersonalInfoUI;
    }

    @Override // wd0.p1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPersonalInfoUI", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPersonalInfoUI", "changeSwitchWechatForStatus2CommonTips onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + c01.z1.i());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21650, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_webview", false);
        intent.putExtra("isWecoinAuth", true);
        j45.l.k(this.f161581a.getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }
}
