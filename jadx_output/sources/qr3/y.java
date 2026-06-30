package qr3;

/* loaded from: classes9.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366124d;

    public y(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366124d = newBizInfoSettingUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366124d;
        if (newBizInfoSettingUI.isFinishing()) {
            return;
        }
        xp1.c.c(newBizInfoSettingUI, newBizInfoSettingUI.f154175e.d1(), true);
        xp1.c.l(newBizInfoSettingUI);
    }
}
