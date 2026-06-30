package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class g4 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI f178184a;

    public g4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI) {
        this.f178184a = walletLqtPlanBeforeHomeUI;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index cache callback");
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.m85 m85Var = (r45.m85) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index response callback");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI = this.f178184a;
        if (m85Var != null) {
            int i19 = m85Var.f380238d;
            if (i19 == 0) {
                java.util.LinkedList linkedList = m85Var.f380240f;
                if (linkedList == null || linkedList.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanAddUI");
                    android.content.Intent intent = new android.content.Intent(walletLqtPlanBeforeHomeUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.class);
                    if (m85Var.f380246o == 1) {
                        intent.putExtra("key_plan_go_scene_ui", 1);
                    } else {
                        intent.putExtra("key_plan_go_scene_ui", 2);
                    }
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI2 = this.f178184a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(walletLqtPlanBeforeHomeUI2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtPlanBeforeHomeUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(walletLqtPlanBeforeHomeUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanHomeUI");
                    android.content.Intent intent2 = new android.content.Intent(walletLqtPlanBeforeHomeUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.class);
                    intent2.putExtra("key_plan_go_scene_ui", 3);
                    intent2.putExtra("key_plan_index_resp", com.tencent.mm.plugin.wallet.balance.model.lqt.r.s(m85Var));
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI walletLqtPlanBeforeHomeUI3 = this.f178184a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(walletLqtPlanBeforeHomeUI3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    walletLqtPlanBeforeHomeUI3.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(walletLqtPlanBeforeHomeUI3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                at4.j0.c(i19, m85Var.f380239e).a(walletLqtPlanBeforeHomeUI, true);
            }
        } else {
            at4.j0.b(-1, -1).a(walletLqtPlanBeforeHomeUI, true);
        }
        walletLqtPlanBeforeHomeUI.finish();
    }
}
