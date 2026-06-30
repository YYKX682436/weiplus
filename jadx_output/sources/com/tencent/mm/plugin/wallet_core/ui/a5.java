package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class a5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI f180137e;

    public a5(com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI, java.lang.String str) {
        this.f180137e = walletMixOrderInfoUI;
        this.f180136d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.f180004v;
        this.f180137e.V6(this.f180136d);
    }
}
