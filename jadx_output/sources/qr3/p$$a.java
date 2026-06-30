package qr3;

/* loaded from: classes9.dex */
public final /* synthetic */ class p$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366109d;

    public /* synthetic */ p$$a(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366109d = newBizInfoSettingUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366109d;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) newBizInfoSettingUI.f154174d).h("contact_info_block_finder");
        if (checkBoxPreference != null) {
            checkBoxPreference.O(newBizInfoSettingUI.f154184q == 1);
        }
    }
}
