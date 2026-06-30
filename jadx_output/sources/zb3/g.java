package zb3;

/* loaded from: classes.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471269d;

    public g(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471269d = snsLuckyMoneyPrepareUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.I;
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471269d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(snsLuckyMoneyPrepareUI.W6()), 9);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(snsLuckyMoneyPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI.class);
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = this.f471269d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(snsLuckyMoneyPrepareUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        snsLuckyMoneyPrepareUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(snsLuckyMoneyPrepareUI2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
