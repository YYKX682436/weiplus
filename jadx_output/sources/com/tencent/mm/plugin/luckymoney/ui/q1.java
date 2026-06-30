package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.s1 f147337e;

    public q1(com.tencent.mm.plugin.luckymoney.ui.s1 s1Var, android.view.View view) {
        this.f147337e = s1Var;
        this.f147336d = view;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.ui.s1 s1Var = this.f147337e;
        java.lang.String string = s1Var.f147398d.getString(com.tencent.mm.R.string.gnk);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = s1Var.f147398d;
        int i17 = luckyMoneyDetailUI.f146059f2.f145156g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 0) {
            string = luckyMoneyDetailUI.getString(com.tencent.mm.R.string.gkp);
        } else {
            g4Var.a(1, com.tencent.mm.R.string.gm6);
        }
        g4Var.f(2, string);
        if (com.tencent.mm.sdk.platformtools.t8.C0(this.f147336d.getTag(), "nodelete")) {
            return;
        }
        g4Var.d(3, s1Var.f147398d.getResources().getColor(com.tencent.mm.R.color.f479364xj), s1Var.f147398d.getContext().getString(com.tencent.mm.R.string.gjr));
    }
}
