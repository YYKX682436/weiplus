package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent f146742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146744f;

    public b9(com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f146742d = getFestivalLuckyMoneyResEvent;
        this.f146743e = luckyMoneyNewDetailUI;
        this.f146744f = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.wf wfVar = this.f146742d.f54395h;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[renderHeaderView] Get res fail & load from url.");
        android.widget.ImageView imageView = this.f146743e.f146204n;
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f146744f;
        com.tencent.mm.plugin.luckymoney.model.m5.b(imageView, e1Var.f145240m, e1Var.Q);
    }
}
