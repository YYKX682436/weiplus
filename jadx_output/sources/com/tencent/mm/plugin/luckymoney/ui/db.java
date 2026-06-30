package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class db extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f146837d = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146837d;
        luckyMoneyNewPrepareUI.hideTenpayKB();
        luckyMoneyNewPrepareUI.hideVKB();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = luckyMoneyNewPrepareUI.f146245a2;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.i();
        }
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(ec3.g1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((ec3.g1) a17).R6(false);
        android.content.Intent intent = new android.content.Intent(luckyMoneyNewPrepareUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI.class);
        intent.putExtra("chatroomName", luckyMoneyNewPrepareUI.E1);
        luckyMoneyNewPrepareUI.startActivityForResult(intent, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.F2);
    }
}
