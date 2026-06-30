package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f154628f;

    public v6(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, boolean z17) {
        this.f154626d = weakReference;
        this.f154627e = weakReference2;
        this.f154628f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f154626d.get();
        if (u3Var != null) {
            if (!u3Var.isShowing()) {
                u3Var = null;
            }
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) this.f154627e.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] switchToPhoto result: ");
        boolean z17 = this.f154628f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
        if (z17) {
            db5.t7.i(contactInfoUI, contactInfoUI.getString(com.tencent.mm.R.string.o8f), com.tencent.mm.R.raw.icons_filled_done);
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = contactWidgetTabBizInfo.f154220y;
            if (m0Var != null) {
                m0Var.h();
            }
        }
    }
}
