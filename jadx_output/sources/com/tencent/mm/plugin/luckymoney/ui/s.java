package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent f147394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f147396f;

    public s(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f147396f = luckyMoneyBusiDetailUI;
        this.f147394d = getFestivalLuckyMoneyResEvent;
        this.f147395e = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f147394d.f54395h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "Get res fail & load from url.");
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f147395e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f145240m)) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.m5.b(this.f147396f.f145989h, e1Var.f145240m, e1Var.Q);
    }
}
