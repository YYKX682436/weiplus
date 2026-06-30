package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pz2.a f179028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179029e;

    public l1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI, pz2.a aVar) {
        this.f179029e = walletPasswordSettingUI;
        this.f179028d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "user click the button to set system fingerprint");
        this.f179028d.dc(this.f179029e);
    }
}
