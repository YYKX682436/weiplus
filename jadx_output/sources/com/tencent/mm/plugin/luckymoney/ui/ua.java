package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ua extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.q0 f147494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(com.tencent.mm.plugin.luckymoney.model.q0 q0Var, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f147494d = q0Var;
        this.f147495e = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mm.plugin.luckymoney.model.q0 q0Var = this.f147494d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "jump to action type: %s", java.lang.Integer.valueOf(q0Var.f145553g));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147495e;
        g0Var.d(18890, 12, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.q7()), luckyMoneyNewPrepareUI.T1, luckyMoneyNewPrepareUI.s7(), luckyMoneyNewPrepareUI.p7(), luckyMoneyNewPrepareUI.r7());
        switch (q0Var.f145553g) {
            case 1:
                com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyNewPrepareUI.getContext(), q0Var.f145554h, false);
                return;
            case 2:
                com.tencent.mm.wallet_core.ui.r1.a0(luckyMoneyNewPrepareUI.getContext(), q0Var.f145555i);
                return;
            case 3:
                com.tencent.mm.wallet_core.ui.r1.c0(q0Var.f145555i, q0Var.f145554h, 0, 1100, new com.tencent.mm.plugin.luckymoney.ui.ta(luckyMoneyNewPrepareUI));
                return;
            case 4:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", q0Var.f145555i);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                e1Var.w(context, intent);
                return;
            case 5:
            case 6:
                java.lang.String str = q0Var.f145555i;
                jz5.f0 f0Var = null;
                if (str != null) {
                    qk.c0 c0Var = new qk.c0(str);
                    c0Var.f364198g = 21;
                    com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                    jz5.f0 f0Var2 = jz5.f0.f302826a;
                    if (p6Var != null) {
                        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(luckyMoneyNewPrepareUI.getContext(), c0Var);
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "emoticon liteapp service not found");
                    }
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "emoticon liteapp pid is null");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
