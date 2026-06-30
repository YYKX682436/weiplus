package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class y3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f147713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147718f;

    public y3(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147713a = d4Var;
        this.f147714b = str;
        this.f147715c = str2;
        this.f147716d = i17;
        this.f147717e = str3;
        this.f147718f = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowTopLinkArea] click link");
        com.tencent.mm.plugin.luckymoney.ui.d4.O6(this.f147713a, this.f147714b, this.f147715c, this.f147716d, this.f147717e, this.f147718f);
    }
}
