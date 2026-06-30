package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.GetA8KeyRedirectEvent f154949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f154950e;

    public a(com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent, com.tencent.mm.plugin.qrcode.model.n nVar) {
        this.f154949d = getA8KeyRedirectEvent;
        this.f154950e = new java.lang.ref.WeakReference(nVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent;
        am.ef efVar;
        java.lang.ref.WeakReference weakReference = this.f154950e;
        if (weakReference == null || weakReference.get() == null || (getA8KeyRedirectEvent = this.f154949d) == null || (efVar = getA8KeyRedirectEvent.f54377h) == null) {
            return;
        }
        int i17 = efVar.f6554a;
        if (i17 == 1) {
            ((e04.p) ((com.tencent.mm.plugin.qrcode.model.n) weakReference.get())).D(true);
        } else if (i17 == 2) {
            ((e04.p) ((com.tencent.mm.plugin.qrcode.model.n) weakReference.get())).D(false);
        }
    }
}
