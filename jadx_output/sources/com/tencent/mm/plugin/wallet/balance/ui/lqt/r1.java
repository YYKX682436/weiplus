package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class r1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.s1 f178349d;

    public r1(com.tencent.mm.plugin.wallet.balance.ui.lqt.s1 s1Var) {
        this.f178349d = s1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.s1 s1Var = this.f178349d;
        s1Var.f178363d.f178371d.Z = false;
        s1Var.f178363d.f178371d.startActivityForResult(new android.content.Intent(s1Var.f178363d.f178371d, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI.class), 123);
    }
}
