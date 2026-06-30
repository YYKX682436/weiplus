package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle f180297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180298e;

    public h1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI, com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle) {
        this.f180298e = walletBankcardIdUI;
        this.f180297d = realNameBundle;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 2, 0);
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180298e;
        com.tencent.mm.wallet_core.ui.r1.B0(walletBankcardIdUI, (!walletBankcardIdUI.f179867o || (realNameBundle = this.f180297d) == null || com.tencent.mm.sdk.platformtools.t8.K0(realNameBundle.f179423d)) ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q() : realNameBundle.f179423d);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
