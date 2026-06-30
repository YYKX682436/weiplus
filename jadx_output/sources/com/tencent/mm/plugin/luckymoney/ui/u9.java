package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class u9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm3 f147492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147493f;

    public u9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, r45.vm3 vm3Var, com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f147491d = luckyMoneyNewDetailUI;
        this.f147492e = vm3Var;
        this.f147493f = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147491d;
        if (!(luckyMoneyNewDetailUI != null && luckyMoneyNewDetailUI.isFinishing())) {
            if (!(luckyMoneyNewDetailUI != null && luckyMoneyNewDetailUI.isDestroyed())) {
                r45.vm3 vm3Var = this.f147492e;
                if (vm3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doGetExtraInfoCgi] response == null");
                    return;
                }
                r45.nm5 nm5Var = vm3Var.f388358d;
                if (nm5Var != null) {
                    com.tencent.mm.plugin.luckymoney.ui.fa faVar = this.f147493f;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI2 = this.f147491d;
                    nm5Var.G = vm3Var.f388359e;
                    r45.f34 f34Var = nm5Var.E;
                    if (f34Var != null) {
                        faVar.P6(f34Var.f373983d, f34Var.f373984e, f34Var.f373985f, nm5Var.f381515x, nm5Var.f381508q, luckyMoneyNewDetailUI2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doGetExtraInfoCgi] is finishing or destory");
    }
}
