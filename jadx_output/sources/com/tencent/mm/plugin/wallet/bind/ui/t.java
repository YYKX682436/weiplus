package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes3.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.l f178643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178644e;

    public t(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI, at4.l lVar) {
        this.f178644e = walletBankcardManageUI;
        this.f178643d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        at4.l lVar = this.f178643d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar.f13889b)) {
            com.tencent.mm.wallet_core.ui.r1.X(this.f178644e.getContext(), lVar.f13889b, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
