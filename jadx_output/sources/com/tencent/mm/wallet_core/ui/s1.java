package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f214231e;

    public s1(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f214230d = walletBaseUI;
        this.f214231e = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.v1.a(this.f214230d);
        com.tencent.mm.modelbase.m1 m1Var = this.f214231e;
        if (m1Var == null || m1Var.getReqResp() == null) {
            return;
        }
        com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent = new com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent();
        walletErrorCodeDialogClickEvent.f54954g.f6806a = m1Var.getReqResp().getUri();
        walletErrorCodeDialogClickEvent.e();
    }
}
