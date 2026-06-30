package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f147090d;

    public k(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView) {
        this.f147090d = luckyMoneyAutoScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f147090d;
        luckyMoneyAutoScrollView.f145961n.setVisibility(8);
        luckyMoneyAutoScrollView.f145962o.setVisibility(8);
        luckyMoneyAutoScrollView.f145963p.setVisibility(8);
        luckyMoneyAutoScrollView.f145958h.setVisibility(8);
        luckyMoneyAutoScrollView.f145959i.setVisibility(8);
        luckyMoneyAutoScrollView.f145960m.setVisibility(8);
        luckyMoneyAutoScrollView.f145964q.setVisibility(0);
        luckyMoneyAutoScrollView.f145965r.setVisibility(0);
        luckyMoneyAutoScrollView.f145966s.setVisibility(0);
        com.tencent.mm.plugin.luckymoney.ui.l lVar = luckyMoneyAutoScrollView.f145971x;
        if (lVar != null) {
            lVar.a();
        }
    }
}
