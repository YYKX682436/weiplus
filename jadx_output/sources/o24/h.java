package o24;

/* loaded from: classes.dex */
public final class h implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342461a;

    public h(android.content.Context context) {
        this.f342461a = context;
    }

    @Override // wd0.p1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingActivityWeCoin", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingActivityWeCoin", "changeSwitchWechatForStatus2CommonTips onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + c01.z1.i());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21650, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_webview", false);
        intent.putExtra("isWecoinAuth", true);
        j45.l.k(this.f342461a, "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }
}
