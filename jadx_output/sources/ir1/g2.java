package ir1;

/* loaded from: classes11.dex */
public final class g2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f293976d;

    public g2(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        this.f293976d = bizFansSettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.f93957v;
        this.f293976d.X6().S(!r1.X6().N());
    }
}
