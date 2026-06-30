package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class a3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.d3 f178975d;

    public a3(com.tencent.mm.plugin.wallet.pwd.ui.d3 d3Var) {
        this.f178975d = d3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.U6(this.f178975d.f178989b);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 5);
    }
}
