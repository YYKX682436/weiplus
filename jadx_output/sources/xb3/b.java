package xb3;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI f452894d;

    public b(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI) {
        this.f452894d = luckyMoneyHKBeforeDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean Zi = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi();
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI = this.f452894d;
        android.content.Intent intent = Zi ? new android.content.Intent(luckyMoneyHKBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.class) : new android.content.Intent(luckyMoneyHKBeforeDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.class);
        intent.putExtras(luckyMoneyHKBeforeDetailUI.getIntent());
        intent.putExtra("key_hk_flag", 1);
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI2 = this.f452894d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyHKBeforeDetailUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKBeforeDetailUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyHKBeforeDetailUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.sdk.platformtools.u3.i(new xb3.a(this), 500L);
    }
}
