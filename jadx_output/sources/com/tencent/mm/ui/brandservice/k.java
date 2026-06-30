package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class k implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198051a;

    public k(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198051a = brandServiceNotifyUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198051a;
        if (brandServiceNotifyUI.f198022f.getCount() <= 0) {
            brandServiceNotifyUI.f198020d.setVisibility(0);
            brandServiceNotifyUI.f198021e.setVisibility(8);
        } else {
            brandServiceNotifyUI.f198020d.setVisibility(8);
            brandServiceNotifyUI.f198021e.setVisibility(0);
        }
    }
}
