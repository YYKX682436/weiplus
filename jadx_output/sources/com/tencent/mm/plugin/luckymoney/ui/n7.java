package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class n7 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.h5 f147224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147226c;

    public n7(com.tencent.mm.plugin.luckymoney.model.h5 h5Var, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, android.widget.TextView textView) {
        this.f147224a = h5Var;
        this.f147225b = luckyMoneyNewDetailUI;
        this.f147226c = textView;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.luckymoney.model.h5 h5Var = this.f147224a;
            if (h5Var != null) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                com.tencent.mm.plugin.luckymoney.model.h5 h5Var2 = this.f147224a;
                java.lang.String str2 = h5Var2 != null ? h5Var2.f145319n : null;
                ((sg3.a) v0Var).getClass();
                h5Var.f145312d = c01.a2.e(str2);
            }
            com.tencent.mm.plugin.luckymoney.model.h5 h5Var3 = this.f147224a;
            if (h5Var3 != null) {
                h5Var3.f145322q = false;
            }
            ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.plugin.luckymoney.ui.m7(this.f147225b, this.f147224a, this.f147226c, str));
        }
    }
}
