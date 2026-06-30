package ir1;

/* loaded from: classes11.dex */
public final class h2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f293980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f293981e;

    public h2(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI, java.lang.String str) {
        this.f293980d = bizFansSettingUI;
        this.f293981e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.f93957v;
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI = this.f293980d;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI.f93964m).getValue()).S(bizFansSettingUI.Z6());
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizFansSettingUI.f93965n).getValue()).S(bizFansSettingUI.a7());
        bizFansSettingUI.c7(bizFansSettingUI.Y6(), this.f293981e);
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.V6(bizFansSettingUI);
    }
}
