package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ic implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147023d;

    public ic(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147023d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147023d;
        if (luckyMoneyNewPrepareUI.isFinishing() || luckyMoneyNewPrepareUI.isDestroyed()) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[refreshViewByConfigAndSourceMac] isFinishing() || isDestroyed()");
            return;
        }
        luckyMoneyNewPrepareUI.t7(false);
        java.lang.String stringExtra = luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            hb3.o.Ni().Di().g();
        } else if (luckyMoneyNewPrepareUI.Y == 3) {
            hb3.o.Ni().Bi().g();
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                hb3.o.Ni().wi().g();
            }
        }
        luckyMoneyNewPrepareUI.y7();
        if (c01.e2.S(luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username"))) {
            luckyMoneyNewPrepareUI.f146268p0 = hb3.o.Ni().Di().c();
        } else if (luckyMoneyNewPrepareUI.Y == 3) {
            luckyMoneyNewPrepareUI.f146268p0 = hb3.o.Ni().Bi().c();
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                luckyMoneyNewPrepareUI.f146268p0 = hb3.o.Ni().wi().c();
            }
        }
        luckyMoneyNewPrepareUI.h7();
        com.tencent.mm.plugin.luckymoney.model.m mVar = luckyMoneyNewPrepareUI.f146268p0;
        if (mVar == null) {
            luckyMoneyNewPrepareUI.z7(null);
            return;
        }
        r45.wv3 wv3Var = mVar.f145435a;
        if (wv3Var != null) {
            luckyMoneyNewPrepareUI.Q1 = wv3Var != null ? wv3Var.f389516y : 0;
            java.lang.String str3 = "";
            if (wv3Var == null || (str = wv3Var.f389514w) == null) {
                str = "";
            }
            luckyMoneyNewPrepareUI.R1 = str;
            if (wv3Var != null && (str2 = wv3Var.f389515x) != null) {
                str3 = str2;
            }
            luckyMoneyNewPrepareUI.S1 = str3;
        }
        luckyMoneyNewPrepareUI.z7(wv3Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 10);
    }
}
