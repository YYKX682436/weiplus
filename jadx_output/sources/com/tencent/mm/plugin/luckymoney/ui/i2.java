package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.j2 f147013e;

    public i2(com.tencent.mm.plugin.luckymoney.ui.j2 j2Var, java.lang.String str) {
        this.f147013e = j2Var;
        this.f147012d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.j2 j2Var = this.f147013e;
        ((java.util.HashSet) j2Var.f147041b.f146093r2).remove(this.f147012d);
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = j2Var.f147040a;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = j2Var.f147040a.Q;
        ((sg3.a) v0Var).getClass();
        e1Var.f145239i = c01.a2.e(str);
        androidx.appcompat.app.AppCompatActivity context = j2Var.f147041b.getContext();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = j2Var.f147041b;
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, luckyMoneyDetailUI.f146083o, luckyMoneyDetailUI.getString(com.tencent.mm.R.string.god, j2Var.f147040a.f145239i));
    }
}
