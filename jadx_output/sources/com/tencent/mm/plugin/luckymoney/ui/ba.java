package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ba implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f146745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146750f;

    public ba(com.tencent.mm.plugin.luckymoney.ui.fa faVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146745a = faVar;
        this.f146746b = str;
        this.f146747c = str2;
        this.f146748d = i17;
        this.f146749e = str3;
        this.f146750f = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowTopLinkArea] click tail_link");
        com.tencent.mm.plugin.luckymoney.ui.fa.O6(this.f146745a, this.f146746b, this.f146747c, this.f146748d, this.f146749e, this.f146750f);
    }
}
