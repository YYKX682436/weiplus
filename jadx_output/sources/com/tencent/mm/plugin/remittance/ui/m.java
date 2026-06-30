package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI f157813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI) {
        super(false);
        this.f157813d = personalPayRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI = this.f157813d;
        personalPayRemittanceUI.f157111p.B();
        personalPayRemittanceUI.f157111p = null;
        personalPayRemittanceUI.f157113r = true;
        personalPayRemittanceUI.V6(com.tencent.mm.ui.s2.CANCEL, "");
    }
}
