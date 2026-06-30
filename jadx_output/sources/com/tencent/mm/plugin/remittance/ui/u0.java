package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157965d;

    public u0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157965d = remittanceBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.a.k(this.f157965d, "order", "ShowOrdersInfoProcess", null, null);
    }
}
