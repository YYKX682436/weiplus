package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v6 f180615d;

    public s6(com.tencent.mm.plugin.wallet_core.ui.v6 v6Var) {
        this.f180615d = v6Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.v6 v6Var = this.f180615d;
        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = (com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) ((java.util.ArrayList) v6Var.f180671d.f180066w.f180812d).get(i17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179776i);
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = v6Var.f180671d;
        if (K0) {
            java.lang.String d76 = walletOrderInfoOldUI.d7(promotions.f179779o);
            if ("-1".equals(d76) || "3".equals(d76)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(13472, walletOrderInfoOldUI.f180069z, java.lang.Integer.valueOf(promotions.f179780p), 1, java.lang.Long.valueOf(promotions.f179779o), java.lang.Long.valueOf(promotions.f179787w));
                g0Var.d(13033, 2, "", promotions.f179775h, promotions.f179773f, "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179785u) || com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179786v)) {
                    int i18 = promotions.f179780p;
                    if (i18 == 1) {
                        walletOrderInfoOldUI.getClass();
                        walletOrderInfoOldUI.doSceneForceProgress(new ss4.t(promotions, walletOrderInfoOldUI.getPayReqKey(), walletOrderInfoOldUI.f180065v, promotions.f179787w));
                    } else if (i18 != 2 || com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179775h)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletOrderInfoOldUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                    } else {
                        if (walletOrderInfoOldUI.B.containsKey(promotions.f179779o + "")) {
                            com.tencent.mm.plugin.wallet_core.ui.w6 w6Var = (com.tencent.mm.plugin.wallet_core.ui.w6) walletOrderInfoOldUI.B.get(promotions.f179779o + "");
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "go to new url %s", w6Var.f180764a);
                            walletOrderInfoOldUI.g7();
                            com.tencent.mm.wallet_core.ui.r1.V(walletOrderInfoOldUI, w6Var.f180764a, false);
                            walletOrderInfoOldUI.C = false;
                        } else {
                            java.lang.String str = promotions.f179775h;
                            walletOrderInfoOldUI.f180064u = str;
                            com.tencent.mm.plugin.wallet_core.ui.z6 z6Var = new com.tencent.mm.plugin.wallet_core.ui.z6(walletOrderInfoOldUI, promotions.f179779o + "", promotions.f179781q + "", promotions.f179782r + "", promotions.f179783s + "", walletOrderInfoOldUI.getPayReqKey(), walletOrderInfoOldUI.f180069z, promotions.f179787w);
                            walletOrderInfoOldUI.g7();
                            walletOrderInfoOldUI.A = z6Var;
                            com.tencent.mm.wallet_core.ui.r1.W(walletOrderInfoOldUI, str, false, 1);
                            walletOrderInfoOldUI.C = false;
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "promotion jump tiny app, username: %s, path: %s", promotions.f179785u, promotions.f179786v);
                    com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                    java.lang.String str2 = promotions.f179785u;
                    am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                    nxVar.f7466a = str2;
                    java.lang.String str3 = promotions.f179786v;
                    if (str3 == null) {
                        str3 = "";
                    }
                    nxVar.f7467b = str3;
                    nxVar.f7469d = ad1.d.CTRL_INDEX;
                    nxVar.f7470e = walletOrderInfoOldUI.f180065v;
                    nxVar.f7468c = 0;
                    startAppBrandUIFromOuterEvent.e();
                    g0Var.d(14118, walletOrderInfoOldUI.f180065v, walletOrderInfoOldUI.getPayReqKey(), 2);
                    com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI2 = v6Var.f180671d;
                    walletOrderInfoOldUI2.A = new com.tencent.mm.plugin.wallet_core.ui.z6(walletOrderInfoOldUI2, promotions.f179779o + "", promotions.f179781q + "", promotions.f179782r + "", promotions.f179783s + "", walletOrderInfoOldUI.getPayReqKey(), walletOrderInfoOldUI.f180069z, promotions.f179787w);
                    walletOrderInfoOldUI.C = true;
                }
            }
        } else {
            if (((java.util.HashSet) walletOrderInfoOldUI.f180060q).contains(promotions.f179776i)) {
                ((java.util.HashSet) walletOrderInfoOldUI.f180060q).remove(promotions.f179776i);
            } else {
                ((java.util.HashSet) walletOrderInfoOldUI.f180060q).add(promotions.f179776i);
            }
            walletOrderInfoOldUI.f180058o.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
