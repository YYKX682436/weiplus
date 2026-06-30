package ir1;

/* loaded from: classes11.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294038d;

    public q1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        this.f294038d = bizFansSettingUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI = this.f294038d;
        if (!bizFansSettingUI.f93971t || bizFansSettingUI.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI.V6(bizFansSettingUI);
    }
}
