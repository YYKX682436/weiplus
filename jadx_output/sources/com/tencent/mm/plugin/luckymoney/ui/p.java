package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI f147296d;

    public p(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI) {
        this.f147296d = luckyMoneyBeforeDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI = this.f147296d;
        android.content.Intent intent = luckyMoneyBeforeDetailUI.getIntent().getIntExtra("key_swipe", 0) == 1 ? ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(luckyMoneyBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewSwipeDetailUI.class) : new android.content.Intent(luckyMoneyBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySwipeDetailUI.class) : ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(luckyMoneyBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.class) : new android.content.Intent(luckyMoneyBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.class);
        intent.putExtra("key_from_username", luckyMoneyBeforeDetailUI.f145980n);
        intent.putExtras(luckyMoneyBeforeDetailUI.getIntent());
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI2 = this.f147296d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyBeforeDetailUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBeforeDetailUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyBeforeDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.luckymoney.ui.o(this), 500L);
    }
}
