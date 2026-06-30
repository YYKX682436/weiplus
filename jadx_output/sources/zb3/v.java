package zb3;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471294d;

    public v(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471294d = snsLuckyMoneyPrepareUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        long D0;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.I;
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471294d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(snsLuckyMoneyPrepareUI.W6()), 4);
        if (snsLuckyMoneyPrepareUI.f145757h.c() != 0) {
            db5.t7.makeText(snsLuckyMoneyPrepareUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
        } else {
            int input = snsLuckyMoneyPrepareUI.f145756g.getInput();
            double input2 = snsLuckyMoneyPrepareUI.f145757h.getInput();
            if (snsLuckyMoneyPrepareUI.f145772z == 1) {
                long D02 = com.tencent.mm.wallet_core.ui.r1.D0(input2);
                gm0.j1.i();
                gm0.j1.u().c().w(356354, java.lang.Integer.valueOf(input));
                j17 = 0;
                D0 = D02;
            } else {
                D0 = com.tencent.mm.wallet_core.ui.r1.D0(input * input2);
                long D03 = com.tencent.mm.wallet_core.ui.r1.D0(input2);
                gm0.j1.i();
                gm0.j1.u().c().w(356353, java.lang.Integer.valueOf(input));
                j17 = D03;
            }
            java.lang.String input3 = snsLuckyMoneyPrepareUI.f145758i.getInput();
            if (com.tencent.mm.sdk.platformtools.t8.K0(input3)) {
                input3 = snsLuckyMoneyPrepareUI.getString(com.tencent.mm.R.string.gjq);
            }
            java.lang.String str = input3;
            java.lang.String stringExtra = snsLuckyMoneyPrepareUI.getIntent().getStringExtra("key_username");
            snsLuckyMoneyPrepareUI.doSceneProgress((!snsLuckyMoneyPrepareUI.D || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) ? new com.tencent.mm.plugin.luckymoney.model.h6(input, D0, j17, snsLuckyMoneyPrepareUI.f145772z, str, com.tencent.mm.plugin.luckymoney.model.m5.l(), null, null, c01.z1.r(), c01.z1.l(), snsLuckyMoneyPrepareUI.A, "") : new com.tencent.mm.plugin.luckymoney.model.h6(input, D0, j17, snsLuckyMoneyPrepareUI.f145772z, str, com.tencent.mm.plugin.luckymoney.model.m5.l(), stringExtra, com.tencent.mm.plugin.luckymoney.model.m5.m(stringExtra), c01.z1.r(), c01.z1.l(), snsLuckyMoneyPrepareUI.A, ""), false);
            android.app.Dialog dialog = snsLuckyMoneyPrepareUI.f145765s;
            if (dialog != null) {
                dialog.show();
            } else {
                snsLuckyMoneyPrepareUI.f145765s = com.tencent.mm.wallet_core.ui.b2.h(snsLuckyMoneyPrepareUI.getContext(), true, new zb3.u(this));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
