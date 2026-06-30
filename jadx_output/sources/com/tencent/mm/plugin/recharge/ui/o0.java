package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155212d;

    public o0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, int i17) {
        this.f155212d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (i17 == -2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17623, java.lang.Integer.valueOf(this.f155212d), 2);
        }
    }
}
