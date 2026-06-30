package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class f7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect f157713d;

    public f7(com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect remittanceOSRedirect) {
        this.f157713d = remittanceOSRedirect;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157713d.finish();
    }
}
