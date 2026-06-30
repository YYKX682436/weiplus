package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class fp implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight f146919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146920b;

    public fp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight luckyMoneySpareActivityEight, java.lang.String str) {
        this.f146919a = luckyMoneySpareActivityEight;
        this.f146920b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[showAlert] click to finish");
        this.f146919a.U6(this.f146920b);
    }
}
