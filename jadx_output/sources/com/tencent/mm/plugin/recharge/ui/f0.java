package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155158d;

    public f0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155158d = phoneRechargeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = this.f155158d.f155104g;
        if (mallFormView.L) {
            mallFormView.getContentEditText().clearFocus();
        } else {
            mallFormView.L = true;
        }
    }
}
