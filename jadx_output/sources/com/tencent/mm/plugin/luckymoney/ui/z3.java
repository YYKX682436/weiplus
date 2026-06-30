package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class z3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f147757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147762f;

    public z3(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147757a = d4Var;
        this.f147758b = str;
        this.f147759c = str2;
        this.f147760d = i17;
        this.f147761e = str3;
        this.f147762f = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowTopLinkArea] click tail_link");
        com.tencent.mm.plugin.luckymoney.ui.d4.O6(this.f147757a, this.f147758b, this.f147759c, this.f147760d, this.f147761e, this.f147762f);
    }
}
