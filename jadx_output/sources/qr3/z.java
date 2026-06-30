package qr3;

/* loaded from: classes9.dex */
public class z implements com.tencent.mm.plugin.profile.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366125a;

    public z(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366125a = newBizInfoSettingUI;
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "handleBlockFinderClick: onFailure");
        int i17 = com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.f154173y;
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366125a;
        newBizInfoSettingUI.getClass();
        newBizInfoSettingUI.runOnUiThread(new qr3.p$$a(newBizInfoSettingUI));
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void onSuccess(int i17) {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366125a;
        newBizInfoSettingUI.f154184q = i17;
        newBizInfoSettingUI.runOnUiThread(new qr3.p$$a(newBizInfoSettingUI));
    }
}
