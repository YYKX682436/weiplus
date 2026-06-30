package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ej implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb3.b f146878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146879e;

    public ej(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, yb3.b bVar) {
        this.f146879e = luckyMoneyNotHookReceiveUI;
        this.f146878d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f146879e.doSceneProgress(this.f146878d, false);
    }
}
