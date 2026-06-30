package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class aa implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f146699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146704f;

    public aa(com.tencent.mm.plugin.luckymoney.ui.fa faVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146699a = faVar;
        this.f146700b = str;
        this.f146701c = str2;
        this.f146702d = i17;
        this.f146703e = str3;
        this.f146704f = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowTopLinkArea] click link");
        com.tencent.mm.plugin.luckymoney.ui.fa.O6(this.f146699a, this.f146700b, this.f146701c, this.f146702d, this.f146703e, this.f146704f);
    }
}
