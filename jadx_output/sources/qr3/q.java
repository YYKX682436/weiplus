package qr3;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.plugin.profile.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366110a;

    public q(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366110a = newBizInfoSettingUI;
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "handleBlockLikeClick: onFailure");
        this.f366110a.runOnUiThread(new java.lang.Runnable() { // from class: qr3.q$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.V6(qr3.q.this.f366110a);
            }
        });
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void onSuccess(int i17) {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366110a;
        newBizInfoSettingUI.f154185r = i17;
        newBizInfoSettingUI.runOnUiThread(new java.lang.Runnable() { // from class: qr3.q$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.V6(qr3.q.this.f366110a);
            }
        });
    }
}
