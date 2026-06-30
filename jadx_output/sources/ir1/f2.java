package ir1;

/* loaded from: classes11.dex */
public final class f2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f293972d;

    public f2(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        this.f293972d = bizFansSettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.f93957v;
        this.f293972d.b7("biz_fans_receive_on_msg_limited_pref");
    }
}
