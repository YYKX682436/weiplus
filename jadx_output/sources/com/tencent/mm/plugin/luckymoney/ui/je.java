package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class je implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147057d;

    public je(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147057d = luckyMoneyNewReceiveUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147057d;
        java.util.Set set = luckyMoneyNewReceiveUI.I1;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = luckyMoneyNewReceiveUI.F1;
        kotlin.jvm.internal.m0.a(set).remove(l6Var != null ? l6Var.f145433z : null);
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var2 = luckyMoneyNewReceiveUI.F1;
        if (l6Var2 != null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var3 = luckyMoneyNewReceiveUI.F1;
            java.lang.String str = l6Var3 != null ? l6Var3.f145433z : null;
            ((sg3.a) v0Var).getClass();
            l6Var2.f145422o = c01.a2.e(str);
        }
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewReceiveUI.getContext();
        android.widget.TextView textView = luckyMoneyNewReceiveUI.f146299i;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var4 = luckyMoneyNewReceiveUI.F1;
        objArr[0] = l6Var4 != null ? l6Var4.f145422o : null;
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, textView, luckyMoneyNewReceiveUI.getString(com.tencent.mm.R.string.goe, objArr));
    }
}
