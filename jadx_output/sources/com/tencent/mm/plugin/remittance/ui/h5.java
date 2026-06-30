package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f157749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157750e;

    public h5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, boolean z17) {
        this.f157750e = remittanceDetailUI;
        this.f157749d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        if (this.f157749d) {
            this.f157750e.finish();
        }
    }
}
