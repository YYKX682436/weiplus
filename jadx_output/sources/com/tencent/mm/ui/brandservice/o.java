package com.tencent.mm.ui.brandservice;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceTimelineUI f198060d;

    public o(com.tencent.mm.ui.brandservice.BrandServiceTimelineUI brandServiceTimelineUI) {
        this.f198060d = brandServiceTimelineUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.brandservice.BrandServiceTimelineUI brandServiceTimelineUI = this.f198060d;
        if (brandServiceTimelineUI.isFinishing() || brandServiceTimelineUI.isDestroyed()) {
            return;
        }
        brandServiceTimelineUI.f198038u.postDelayed(new com.tencent.mm.ui.brandservice.n(brandServiceTimelineUI), 300L);
    }
}
