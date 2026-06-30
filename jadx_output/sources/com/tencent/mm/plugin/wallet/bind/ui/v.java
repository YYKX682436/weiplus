package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178646d;

    public v(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
        this.f178646d = walletBankcardManageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI = this.f178646d;
        if (id6 == com.tencent.mm.R.id.f487656pc1) {
            at4.n a17 = at4.n.a();
            if (a17.b()) {
                db5.e1.s(walletBankcardManageUI, a17.f13902b, walletBankcardManageUI.getString(com.tencent.mm.R.string.f490573yv));
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.tencent.mm.wallet_core.ui.r1.q0(19, 1);
                walletBankcardManageUI.U6(null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 2);
            }
        } else if (view.getId() == com.tencent.mm.R.id.pc6) {
            java.lang.Object tag = view.getTag();
            long time = new java.util.Date().getTime();
            view.setTag(java.lang.Long.valueOf(time));
            if (tag != null && time - ((java.lang.Long) tag).longValue() < 1000) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            intent.putExtra("rawUrl", walletBankcardManageUI.f178562t.field_loan_jump_url);
            com.tencent.mm.wallet_core.ui.r1.T(walletBankcardManageUI.getContext(), intent);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, java.lang.Integer.valueOf(walletBankcardManageUI.f178562t.field_red_dot_index));
            com.tencent.mm.wallet_core.ui.r1.q0(6, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
