package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class de extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        super(false);
        this.f146840d = luckyMoneyNewReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.V6(this.f146840d);
    }
}
