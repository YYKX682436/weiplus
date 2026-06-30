package ub3;

/* loaded from: classes.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426133d;

    public r(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426133d = luckyMoneyF2FQRCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        android.content.Intent intent = new android.content.Intent(this.f426133d, (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.class);
        intent.putExtra("key_from", 2);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426133d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(luckyMoneyF2FQRCodeUI, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyF2FQRCodeUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(luckyMoneyF2FQRCodeUI, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28838, 0, 2, 0, 0, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
