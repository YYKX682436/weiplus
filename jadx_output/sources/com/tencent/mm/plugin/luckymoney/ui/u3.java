package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm3 f147484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f147485f;

    public u3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, r45.vm3 vm3Var, com.tencent.mm.plugin.luckymoney.ui.d4 d4Var) {
        this.f147483d = luckyMoneyDetailUI;
        this.f147484e = vm3Var;
        this.f147485f = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147483d;
        if (!(luckyMoneyDetailUI != null && luckyMoneyDetailUI.isFinishing())) {
            if (!(luckyMoneyDetailUI != null && luckyMoneyDetailUI.isDestroyed())) {
                r45.vm3 vm3Var = this.f147484e;
                if (vm3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doGetExtraInfoCgi] response == null");
                    return;
                }
                r45.nm5 nm5Var = vm3Var.f388358d;
                if (nm5Var != null) {
                    com.tencent.mm.plugin.luckymoney.ui.d4 d4Var = this.f147485f;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2 = this.f147483d;
                    nm5Var.G = vm3Var.f388359e;
                    r45.f34 f34Var = nm5Var.E;
                    if (f34Var != null) {
                        d4Var.P6(f34Var.f373983d, f34Var.f373984e, f34Var.f373985f, nm5Var.f381515x, nm5Var.f381508q, luckyMoneyDetailUI2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doGetExtraInfoCgi] is finishing or destory");
    }
}
