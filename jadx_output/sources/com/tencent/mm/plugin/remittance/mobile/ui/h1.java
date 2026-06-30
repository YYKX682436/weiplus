package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rp6 f156675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156676e;

    public h1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, r45.rp6 rp6Var) {
        this.f156676e = mobileRemittanceUI;
        this.f156675d = rp6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f156675d.f385082f == 1) {
            this.f156676e.finish();
        }
    }
}
