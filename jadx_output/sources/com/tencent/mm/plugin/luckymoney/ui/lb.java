package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class lb implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147132d;

    public lb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147132d = luckyMoneyNewPrepareUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$initView$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 0) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147132d;
            luckyMoneyNewPrepareUI.hideTenpayKB();
            luckyMoneyNewPrepareUI.hideVKB();
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = luckyMoneyNewPrepareUI.f146245a2;
            if (wcPayKeyboard != null) {
                wcPayKeyboard.i();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$initView$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
