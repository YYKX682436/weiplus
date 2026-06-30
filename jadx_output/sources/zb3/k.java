package zb3;

/* loaded from: classes4.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471274d;

    public k(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471274d = snsLuckyMoneyPrepareUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.I;
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471274d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(snsLuckyMoneyPrepareUI.W6()), 6);
        com.tencent.mm.plugin.luckymoney.model.m5.o(snsLuckyMoneyPrepareUI, 2, snsLuckyMoneyPrepareUI.f145772z, snsLuckyMoneyPrepareUI.C, false);
        snsLuckyMoneyPrepareUI.f145766t.postDelayed(new zb3.j(this), 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
