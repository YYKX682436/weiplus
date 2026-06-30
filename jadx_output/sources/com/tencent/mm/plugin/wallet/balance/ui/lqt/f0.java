package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI f178167b;

    public f0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI walletLqtBeforeSaveUI, android.app.Dialog dialog) {
        this.f178167b = walletLqtBeforeSaveUI;
        this.f178166a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        this.f178166a.dismiss();
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI walletLqtBeforeSaveUI = this.f178167b;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.zg5 zg5Var = (r45.zg5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f392009d), zg5Var.f392010e);
            if (zg5Var.f392009d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(zg5Var.f392036z1);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                java.util.LinkedList linkedList = zg5Var.f392022q;
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.if0 if0Var = (r45.if0) it.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376981d) && !com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376983f)) {
                            arrayList.add(java.lang.String.format("%s||%s", if0Var.f376981d, if0Var.f376983f));
                        }
                    }
                }
                ((com.tencent.mm.plugin.wallet.balance.model.lqt.z0) new em5.i().a(walletLqtBeforeSaveUI.getContext(), com.tencent.mm.plugin.wallet.balance.model.lqt.z0.class)).f177758e.b(zg5Var.C, 1);
                android.content.Intent intent = new android.content.Intent(walletLqtBeforeSaveUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
                intent.putExtra("lqt_save_fund_code", zg5Var.f392023r);
                intent.putExtra("lqt_save_fetch_mode", 1);
                intent.putExtra("lqt_is_show_protocol", zg5Var.f392018o == 1);
                intent.putExtra("lqt_is_agree_protocol", zg5Var.f392019p == 1);
                intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                intent.putExtra("lqt_profile_wording", zg5Var.f392035z);
                intent.putExtra("lqt_account_type", zg5Var.C);
                intent.putExtra("lqt_fund_spid", zg5Var.D);
                if (!((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(walletLqtBeforeSaveUI.getContext(), intent, new com.tencent.mm.plugin.wallet.balance.ui.lqt.e0(this))) {
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI walletLqtBeforeSaveUI2 = this.f178167b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(walletLqtBeforeSaveUI2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtBeforeSaveUI2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(walletLqtBeforeSaveUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                walletLqtBeforeSaveUI.setResult(-1);
            }
        }
        walletLqtBeforeSaveUI.finish();
        return null;
    }
}
