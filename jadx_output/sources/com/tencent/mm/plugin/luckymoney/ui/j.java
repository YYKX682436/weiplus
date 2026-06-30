package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f147037d;

    public j(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView) {
        this.f147037d = luckyMoneyAutoScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f147037d;
        luckyMoneyAutoScrollView.f145961n.setVisibility(0);
        luckyMoneyAutoScrollView.f145962o.setVisibility(0);
        luckyMoneyAutoScrollView.f145963p.setVisibility(0);
        luckyMoneyAutoScrollView.f145958h.b();
        luckyMoneyAutoScrollView.f145959i.b();
        luckyMoneyAutoScrollView.f145960m.b();
    }
}
