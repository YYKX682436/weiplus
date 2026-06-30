package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class xj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147695e;

    public xj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, r45.wv3 wv3Var) {
        this.f147695e = luckyMoneyNotHookReceiveUI;
        this.f147694d = wv3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147695e;
        luckyMoneyNotHookReceiveUI.I = luckyMoneyNotHookReceiveUI.f146483v.getWidth();
        luckyMoneyNotHookReceiveUI.H = ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).rj(10, this.f147694d, luckyMoneyNotHookReceiveUI.f146467J, luckyMoneyNotHookReceiveUI.K, luckyMoneyNotHookReceiveUI.G, luckyMoneyNotHookReceiveUI.f146483v.getWidth(), 0, luckyMoneyNotHookReceiveUI.f146488y, (int) ((luckyMoneyNotHookReceiveUI.f146488y.getHeight() / 1200.0f) * (com.tencent.mm.sdk.platformtools.t8.K0(this.f147694d.f389501g.f390494x) ^ true ? 50.0f : 48.0f)));
    }
}
