package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198049d;

    public i(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198049d = brandServiceNotifyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.brandservice.l lVar;
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198049d;
        if (brandServiceNotifyUI.activityHasDestroyed() || brandServiceNotifyUI.isFinishing() || (lVar = brandServiceNotifyUI.f198022f) == null || brandServiceNotifyUI.f198021e == null || lVar.getCount() <= 0) {
            return;
        }
        brandServiceNotifyUI.f198021e.setSelection(0);
    }
}
