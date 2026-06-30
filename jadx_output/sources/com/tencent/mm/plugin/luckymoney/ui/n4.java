package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class n4 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f147218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f147219b;

    public n4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f147219b = luckyMoneyHistoryEnvelopeUI;
        this.f147218a = u3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        java.util.ArrayList arrayList;
        r45.co3 co3Var = (r45.co3) obj;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f147219b;
        if (luckyMoneyHistoryEnvelopeUI.isFinishing() || luckyMoneyHistoryEnvelopeUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "activity has destroyed");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f147218a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        luckyMoneyHistoryEnvelopeUI.f146133t.N(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source net callback");
        if (i17 != 0 || i18 != 0 || co3Var == null) {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyHistoryEnvelopeUI.getContext(), "");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(co3Var.f371703d));
        if (co3Var.f371703d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(co3Var.f371704e);
            return;
        }
        luckyMoneyHistoryEnvelopeUI.f146139z = co3Var.f371707h == 1;
        luckyMoneyHistoryEnvelopeUI.A = co3Var.f371706g;
        java.util.List list = luckyMoneyHistoryEnvelopeUI.f146137x;
        java.util.LinkedList linkedList = co3Var.f371709m;
        ((java.util.ArrayList) list).addAll(linkedList);
        java.util.Iterator it = co3Var.f371705f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = luckyMoneyHistoryEnvelopeUI.f146136w;
            if (!hasNext) {
                break;
            }
            r45.wv3 wv3Var = (r45.wv3) it.next();
            if (wv3Var.f389503i == 1 || wv3Var.f389507p == 1 || linkedList.contains(wv3Var.f389500f)) {
                com.tencent.mm.plugin.luckymoney.ui.i5 i5Var = new com.tencent.mm.plugin.luckymoney.ui.i5(luckyMoneyHistoryEnvelopeUI);
                i5Var.f147015d = wv3Var;
                arrayList.add(i5Var);
                luckyMoneyHistoryEnvelopeUI.f146135v.notifyDataSetChanged();
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(co3Var.f371713q)) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.u5 u5Var = new com.tencent.mm.plugin.luckymoney.ui.u5(luckyMoneyHistoryEnvelopeUI);
        u5Var.f147487d = co3Var.f371713q;
        arrayList.add(u5Var);
    }
}
