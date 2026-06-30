package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178225b;

    public j4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, android.app.Dialog dialog) {
        this.f178225b = walletLqtPlanDetailUI;
        this.f178224a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.jg5 jg5Var = (r45.jg5) obj;
        java.lang.String str = jg5Var.f377797f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f178225b;
        walletLqtPlanDetailUI.f178005f = str;
        java.util.LinkedList linkedList = jg5Var.f377798g;
        if (linkedList.size() != 0) {
            java.util.List list = walletLqtPlanDetailUI.f178006g;
            ((java.util.ArrayList) list).addAll(linkedList);
            walletLqtPlanDetailUI.B = false;
            java.lang.String str2 = walletLqtPlanDetailUI.f178005f;
            if (str2 != null) {
                walletLqtPlanDetailUI.f178013q.setText(str2);
            }
            if (list != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.isEmpty()) {
                    walletLqtPlanDetailUI.A += arrayList.size();
                    walletLqtPlanDetailUI.f178008i.notifyDataSetChanged();
                }
            }
        } else {
            walletLqtPlanDetailUI.B = true;
        }
        if (walletLqtPlanDetailUI.C && linkedList.size() == 0) {
            walletLqtPlanDetailUI.f178014r.setText(walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.kq8));
            walletLqtPlanDetailUI.f178014r.setVisibility(0);
            walletLqtPlanDetailUI.f178016t.setVisibility(8);
            android.view.View view = walletLqtPlanDetailUI.f178020x;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            walletLqtPlanDetailUI.C = false;
        } else {
            walletLqtPlanDetailUI.f178015s.setVisibility(0);
            walletLqtPlanDetailUI.f178016t.setVisibility(0);
            android.view.View view2 = walletLqtPlanDetailUI.f178020x;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            walletLqtPlanDetailUI.f178014r.setVisibility(8);
            walletLqtPlanDetailUI.C = false;
        }
        this.f178224a.dismiss();
        return null;
    }
}
