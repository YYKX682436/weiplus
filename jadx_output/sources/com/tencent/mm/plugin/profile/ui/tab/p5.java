package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154512e;

    public p5(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f154511d = weakReference;
        this.f154512e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) this.f154511d.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed() || !this.f154512e || (m0Var = contactWidgetTabBizInfo.f154220y) == null) {
            return;
        }
        m0Var.h();
    }
}
