package com.tencent.mm.ui.brandservice;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceTimelineUI f198059d;

    public n(com.tencent.mm.ui.brandservice.BrandServiceTimelineUI brandServiceTimelineUI) {
        this.f198059d = brandServiceTimelineUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e31.k a17;
        com.tencent.mm.ui.brandservice.BrandServiceTimelineUI brandServiceTimelineUI = this.f198059d;
        if (brandServiceTimelineUI.isFinishing() || brandServiceTimelineUI.isDestroyed()) {
            return;
        }
        int i17 = com.tencent.mm.ui.brandservice.r.f198063o;
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.o4.L().getBoolean("brs_timeline_auto_notify_education_has_shown", false) && (a17 = e31.n.f247087a.a("name_biz")) != null) {
            g31.l lVar = (g31.l) a17;
            if (lVar.f268094g) {
                k31.a aVar = lVar.f268088a;
                if (aVar != null ? com.tencent.mm.sdk.platformtools.o4.M(((k31.h) aVar).c()).i("HasReceivedAutoNotifySubscribeMsg", false) : false) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            brandServiceTimelineUI.f198039v = true;
            new com.tencent.mm.ui.brandservice.r(brandServiceTimelineUI).show();
        }
    }
}
