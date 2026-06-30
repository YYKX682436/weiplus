package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class z implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexBaseUI f148517a;

    public z(com.tencent.mm.plugin.mall.ui.MallIndexBaseUI mallIndexBaseUI) {
        this.f148517a = mallIndexBaseUI;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.mall.ui.MallIndexBaseUI mallIndexBaseUI = this.f148517a;
        if (i18 != 0) {
            if (i18 != 1) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11458, 3);
            h45.a0.k(mallIndexBaseUI, 2);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11458, 2);
        if (c01.z1.I()) {
            com.tencent.mm.wallet_core.a.k(mallIndexBaseUI.getContext(), "wallet_payu", "PayURemittanceProcess", null, null);
        } else {
            com.tencent.mm.wallet_core.a.k(mallIndexBaseUI.getContext(), "remittance", "RemittanceProcess", null, null);
        }
    }
}
