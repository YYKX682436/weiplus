package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class c0 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156656d;

    public c0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f156656d = mobileRemitNumberInputUI;
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156656d;
        mobileRemitNumberInputUI.f156588t = i17;
        if (!z17) {
            mobileRemitNumberInputUI.f156588t = 0;
        }
        mobileRemitNumberInputUI.V6(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
    }
}
