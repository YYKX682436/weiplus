package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class op implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter f147295a;

    public op(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter) {
        this.f147295a = luckyMoneyWishFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            this.f147295a.f146681p.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCommentFooter", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f147295a;
        luckyMoneyWishFooter.f146681p.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        luckyMoneyWishFooter.f146681p.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
