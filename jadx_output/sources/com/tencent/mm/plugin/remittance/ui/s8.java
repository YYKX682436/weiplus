package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f157937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceUI f157938e;

    public s8(com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI, boolean z17) {
        this.f157938e = remittanceUI;
        this.f157937d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        if (this.f157937d) {
            this.f157938e.finish();
        }
    }
}
