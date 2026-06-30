package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157731d;

    public h1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157731d = remittanceBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157731d.showNormalStWcKb();
    }
}
