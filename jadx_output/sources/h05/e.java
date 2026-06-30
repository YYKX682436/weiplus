package h05;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI f277931d;

    public e(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI) {
        this.f277931d = wxGamePushSettingUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            r45.vq3 vq3Var = (r45.vq3) oVar.f70711b.f70700a;
            if (vq3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxGamePushSettingUI", "GetUserSwitchResponse failed, response is null!");
            } else {
                com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI = this.f277931d;
                wxGamePushSettingUI.f188561h.setVisibility(4);
                r45.ki6 ki6Var = vq3Var.f388448d;
                if (ki6Var != null && ki6Var.f378725d.size() > 0) {
                    wxGamePushSettingUI.f188558e = vq3Var.f388448d;
                    wxGamePushSettingUI.runOnUiThread(new h05.d(this));
                }
            }
        }
        return 0;
    }
}
