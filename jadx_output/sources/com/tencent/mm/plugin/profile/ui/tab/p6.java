package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.h f154514e;

    public p6(java.lang.ref.WeakReference weakReference, com.tencent.wechat.iam.biz.h hVar) {
        this.f154513d = weakReference;
        this.f154514e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = this.f154513d;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) weakReference.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        boolean z17 = false;
        com.tencent.wechat.iam.biz.h hVar = this.f154514e;
        if (hVar != null && hVar.f217748d == 2) {
            z17 = true;
        }
        if (z17) {
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(2).d(new com.tencent.mm.plugin.profile.ui.tab.o6(weakReference));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] showCreatedSheet skip: identity=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f217748d) : null);
        sb6.append(", not Photo");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
    }
}
