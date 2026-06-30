package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f179373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI f179374e;

    public f1(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f179374e = walletRealNameVerifyUI;
        this.f179373d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify dialog lOk");
        int i18 = com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.f179228w;
        this.f179374e.U6(this.f179373d);
        at4.y0.a(1);
    }
}
