package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154532d;

    public r5(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.profile.ui.tab.s5 s5Var) {
        this.f154532d = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = this.f154532d;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) weakReference.get();
        if (contactWidgetTabBizInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] publishResult: widget gone");
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        contactWidgetTabBizInfo.L = true;
        com.tencent.wechat.iam.biz.g.f217742b.b(new com.tencent.mm.plugin.profile.ui.tab.q5(weakReference));
    }
}
