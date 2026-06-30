package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class u6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        super(false);
        this.f178399d = walletLqtSaveFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        r45.kd kdVar;
        int i17;
        java.util.LinkedList linkedList;
        int i18;
        int i19;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178399d;
        long j17 = walletLqtSaveFetchUI.T;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 800) {
            return;
        }
        walletLqtSaveFetchUI.T = android.os.SystemClock.elapsedRealtime();
        int i76 = walletLqtSaveFetchUI.i7(walletLqtSaveFetchUI.f178056h.getText(), "100");
        if (i76 > 0) {
            walletLqtSaveFetchUI.hideWcKb();
            int i27 = walletLqtSaveFetchUI.S;
            int i28 = 1;
            if (i27 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
                if (walletLqtSaveFetchUI.q7(com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.f177683l)) {
                    return;
                }
                com.tencent.mm.plugin.wallet.balance.model.lqt.z2 z2Var = walletLqtSaveFetchUI.f178054f.f177619b;
                int i29 = walletLqtSaveFetchUI.Z;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletLqtSaveFetchUI.U;
                z2Var.getClass();
                ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(i76), java.lang.Integer.valueOf(i29), bankcard)).n(z2Var).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.q6(this, i76))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p6(this));
                return;
            }
            if (i27 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (walletLqtSaveFetchUI.q7(com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.f177684m)) {
                    return;
                }
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletLqtSaveFetchUI.U;
                android.view.ViewGroup viewGroup = null;
                if (bankcard2 == null || bankcard2.v0()) {
                    kdVar = null;
                } else {
                    kdVar = new r45.kd();
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = walletLqtSaveFetchUI.U;
                    kdVar.f378596f = bankcard3.field_bankName;
                    kdVar.f378595e = bankcard3.field_bankcardType;
                    kdVar.f378594d = bankcard3.field_bindSerial;
                    kdVar.f378597g = bankcard3.field_bankcardTail;
                }
                boolean z18 = false;
                int i37 = walletLqtSaveFetchUI.G.getSelectRedeemType() != null ? walletLqtSaveFetchUI.G.getSelectRedeemType().f370896d : 0;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = walletLqtSaveFetchUI.U;
                if (bankcard4 != null && !bankcard4.v0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose bankcard");
                    int i07 = com.tencent.mm.wallet_core.ui.r1.i0(walletLqtSaveFetchUI.f178056h.getText(), "100");
                    int i38 = com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().a().f385297t;
                    if (i38 >= 0 && i07 > i38) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose slow redeem");
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem");
                        r45.ry4 a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().a();
                        if (a17 == null || (linkedList = a17.f385292o) == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem res == null ||  res.redeem_displayed_info == null");
                            return;
                        }
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            r45.pd pdVar = (r45.pd) it.next();
                            if (pdVar.f382952d.equals(walletLqtSaveFetchUI.U.field_bindSerial)) {
                                walletLqtSaveFetchUI.G.b(pdVar.f382953e, z18);
                                r45.u66 u66Var = pdVar.f382954f;
                                walletLqtSaveFetchUI.hideTenpayKB();
                                walletLqtSaveFetchUI.hideWcKb();
                                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(walletLqtSaveFetchUI.getContext(), i28, 3);
                                z2Var2.m(walletLqtSaveFetchUI.getString(com.tencent.mm.R.string.kp_), walletLqtSaveFetchUI.getString(com.tencent.mm.R.string.kpn));
                                com.tencent.mm.plugin.wallet.balance.ui.lqt.n7 n7Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.n7(walletLqtSaveFetchUI, z2Var2);
                                com.tencent.mm.plugin.wallet.balance.ui.lqt.o7 o7Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.o7(walletLqtSaveFetchUI, z2Var2);
                                z2Var2.D = n7Var;
                                z2Var2.E = o7Var;
                                android.view.View inflate = android.view.View.inflate(walletLqtSaveFetchUI.getContext(), com.tencent.mm.R.layout.bte, viewGroup);
                                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd)).setText(u66Var.f387089d);
                                z2Var2.s(inflate);
                                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(walletLqtSaveFetchUI);
                                linearLayout.setOrientation(i28);
                                java.util.LinkedList linkedList2 = u66Var.f387091f;
                                int i39 = com.tencent.mm.R.id.gw8;
                                int i47 = com.tencent.mm.R.layout.btc;
                                if (linkedList2 == null || linkedList2.size() <= 0) {
                                    java.util.Iterator it6 = u66Var.f387090e.iterator();
                                    while (it6.hasNext()) {
                                        r45.if0 if0Var = (r45.if0) it6.next();
                                        if (if0Var != null && if0Var.f376981d != null) {
                                            com.tencent.mm.plugin.wallet.balance.ui.lqt.r7 r7Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.r7(walletLqtSaveFetchUI, if0Var);
                                            android.view.View view2 = (android.widget.LinearLayout) android.view.View.inflate(walletLqtSaveFetchUI, com.tencent.mm.R.layout.btc, null);
                                            walletLqtSaveFetchUI.l7(if0Var.f376981d, if0Var.f376982e, if0Var.f376983f, (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gw8), r7Var);
                                            linearLayout.addView(view2);
                                        }
                                    }
                                    viewGroup = null;
                                } else {
                                    int i48 = z18 ? 1 : 0;
                                    while (i48 < linkedList2.size()) {
                                        r45.if0 if0Var2 = (r45.if0) linkedList2.get(i48);
                                        if (if0Var2 == null) {
                                            i18 = i48;
                                            i19 = i47;
                                        } else {
                                            com.tencent.mm.plugin.wallet.balance.ui.lqt.q7 q7Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.q7(walletLqtSaveFetchUI, if0Var2, z2Var2);
                                            if (i48 < linkedList2.size() - i28) {
                                                android.view.View view3 = (android.widget.LinearLayout) android.view.View.inflate(walletLqtSaveFetchUI, i47, viewGroup);
                                                ((android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.gw9)).setVisibility(8);
                                                android.widget.TextView textView = (android.widget.TextView) view3.findViewById(i39);
                                                java.lang.String str = if0Var2.f376981d;
                                                java.lang.String str2 = if0Var2.f376982e;
                                                java.lang.String str3 = if0Var2.f376983f;
                                                i18 = i48;
                                                i19 = com.tencent.mm.R.layout.btc;
                                                walletLqtSaveFetchUI.l7(str, str2, str3, textView, q7Var);
                                                linearLayout.addView(view3);
                                            } else {
                                                i18 = i48;
                                                i19 = i47;
                                                android.view.View view4 = (android.widget.LinearLayout) android.view.View.inflate(walletLqtSaveFetchUI, com.tencent.mm.R.layout.btd, viewGroup);
                                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                                layoutParams.topMargin = i65.a.b(walletLqtSaveFetchUI, 24);
                                                ((android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.gwb)).setText(if0Var2.f376981d);
                                                android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.gwa);
                                                walletLqtSaveFetchUI.l7("", if0Var2.f376982e, if0Var2.f376983f, textView2, q7Var);
                                                textView2.setAccessibilityDelegate(new com.tencent.mm.wallet_core.e(com.tencent.kinda.gen.TraitsType.BUTTON));
                                                linearLayout.addView(view4, layoutParams);
                                            }
                                        }
                                        i48 = i18 + 1;
                                        i47 = i19;
                                        i28 = 1;
                                        viewGroup = null;
                                        i39 = com.tencent.mm.R.id.gw8;
                                    }
                                }
                                z2Var2.j(linearLayout);
                                z2Var2.C();
                                walletLqtSaveFetchUI.G.setVisibility(4);
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 4);
                                i28 = 1;
                                z18 = false;
                            }
                        }
                        return;
                    }
                    if (i38 >= 0 && i07 < i38) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose fast redeem");
                        i17 = 0;
                        com.tencent.mm.plugin.wallet.balance.model.lqt.x2 x2Var = walletLqtSaveFetchUI.f178054f.f177620c;
                        int i49 = walletLqtSaveFetchUI.Z;
                        x2Var.getClass();
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i76);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i49);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
                        km5.q qVar = new km5.q();
                        qVar.y(valueOf, valueOf2, valueOf3, kdVar);
                        qVar.n(x2Var);
                        ((km5.q) qVar.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t6(this, i76))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s6(this));
                    }
                }
                i17 = i37;
                com.tencent.mm.plugin.wallet.balance.model.lqt.x2 x2Var2 = walletLqtSaveFetchUI.f178054f.f177620c;
                int i492 = walletLqtSaveFetchUI.Z;
                x2Var2.getClass();
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i76);
                java.lang.Integer valueOf22 = java.lang.Integer.valueOf(i492);
                java.lang.Integer valueOf32 = java.lang.Integer.valueOf(i17);
                km5.q qVar2 = new km5.q();
                qVar2.y(valueOf4, valueOf22, valueOf32, kdVar);
                qVar2.n(x2Var2);
                ((km5.q) qVar2.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t6(this, i76))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s6(this));
            }
        }
    }
}
