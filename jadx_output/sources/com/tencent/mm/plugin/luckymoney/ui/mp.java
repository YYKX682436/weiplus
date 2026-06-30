package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mp extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter f147210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter) {
        super(false);
        this.f147210d = luckyMoneyWishFooter;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state onClick");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f147210d;
        sb6.append(luckyMoneyWishFooter.f146684s);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", sb6.toString());
        if (luckyMoneyWishFooter.f146684s == 0) {
            luckyMoneyWishFooter.setModeClick(true);
            luckyMoneyWishFooter.f146680o.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            luckyMoneyWishFooter.f146684s = 1;
            luckyMoneyWishFooter.f146686u = false;
        } else {
            luckyMoneyWishFooter.setModeClick(false);
            luckyMoneyWishFooter.f146686u = false;
            luckyMoneyWishFooter.f146680o.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            luckyMoneyWishFooter.f146684s = 0;
        }
        luckyMoneyWishFooter.j();
    }
}
