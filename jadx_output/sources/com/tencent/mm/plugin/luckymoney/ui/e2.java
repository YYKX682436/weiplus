package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent f146857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146859f;

    public e2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f146859f = luckyMoneyDetailUI;
        this.f146857d = getFestivalLuckyMoneyResEvent;
        this.f146858e = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f146857d.f54395h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
        android.widget.ImageView imageView = this.f146859f.f146080n;
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f146858e;
        com.tencent.mm.plugin.luckymoney.model.m5.b(imageView, e1Var.f145240m, e1Var.Q);
    }
}
