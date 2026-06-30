package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154534e;

    public r6(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f154533d = weakReference;
        this.f154534e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = this.f154533d;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) weakReference.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        if (!this.f154534e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] showCreatedSheet skip: hasPhotoLogged=false");
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = contactWidgetTabBizInfo.f154220y;
        if (m0Var != null) {
            m0Var.h();
        }
        com.tencent.wechat.iam.biz.g.f217742b.a(new com.tencent.mm.plugin.profile.ui.tab.q6(weakReference));
    }
}
