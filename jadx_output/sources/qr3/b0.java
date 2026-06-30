package qr3;

/* loaded from: classes9.dex */
public class b0 implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f366078a;

    public b0(android.app.Activity activity) {
        this.f366078a = new java.lang.ref.WeakReference(activity);
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI;
        java.lang.ref.WeakReference weakReference = this.f366078a;
        if (weakReference.get() == null || (newBizInfoSettingUI = (com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI) weakReference.get()) == null || newBizInfoSettingUI.isFinishing() || newBizInfoSettingUI.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "initSubscribeMsgEntry getSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ((com.tencent.mm.ui.base.preference.h0) newBizInfoSettingUI.f154174d).m("contact_info_subscribe_msg", true);
    }

    @Override // e31.l
    public void e(java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI;
        java.lang.ref.WeakReference weakReference = this.f366078a;
        if (weakReference.get() == null || (newBizInfoSettingUI = (com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI) weakReference.get()) == null || newBizInfoSettingUI.isFinishing() || newBizInfoSettingUI.isDestroyed()) {
            return;
        }
        boolean z17 = subscribeMsgRequestResult.f71791q;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoSettingUI", "initSubscribeMsgEntry getSubscribeMsgList onSuccess size: %d, showEntry: %b", java.lang.Integer.valueOf(subscribeMsgRequestResult.f71785h.size()), java.lang.Boolean.valueOf(subscribeMsgRequestResult.f71790p));
        ((com.tencent.mm.ui.base.preference.h0) newBizInfoSettingUI.f154174d).m("contact_info_subscribe_msg", !z17);
        newBizInfoSettingUI.f154187t = subscribeMsgRequestResult;
    }
}
