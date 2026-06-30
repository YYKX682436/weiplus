package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class t6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154599d;

    public t6(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154599d = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) this.f154599d.get();
        if (contactWidgetTabBizInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] login event: widget gone, skip");
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] isWaitingRegister=" + contactWidgetTabBizInfo.K + ", publishReturned=" + contactWidgetTabBizInfo.L);
        if (contactWidgetTabBizInfo.K && contactWidgetTabBizInfo.L) {
            if (!(contactInfoUI instanceof android.app.Activity)) {
                contactInfoUI = null;
            }
            if (contactInfoUI == null || contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
                return;
            }
            com.tencent.wechat.iam.biz.g.f217742b.b(new com.tencent.mm.plugin.profile.ui.tab.s6(new java.lang.ref.WeakReference(contactWidgetTabBizInfo)));
        }
    }
}
