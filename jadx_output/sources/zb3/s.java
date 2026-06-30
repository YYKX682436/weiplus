package zb3;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f471289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471290b;

    public s(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, android.text.SpannableString spannableString) {
        this.f471290b = snsLuckyMoneyPrepareUI;
        this.f471289a = spannableString;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471290b;
        int input = snsLuckyMoneyPrepareUI.f145756g.getInput();
        double input2 = snsLuckyMoneyPrepareUI.f145757h.getInput();
        snsLuckyMoneyPrepareUI.f145772z = 0;
        snsLuckyMoneyPrepareUI.f145757h.setType(0);
        snsLuckyMoneyPrepareUI.f145757h.setShowGroupIcon(false);
        snsLuckyMoneyPrepareUI.f145757h.setTitle(snsLuckyMoneyPrepareUI.getString(com.tencent.mm.R.string.go9));
        if (input2 > 0.0d && input > 0) {
            snsLuckyMoneyPrepareUI.f145757h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input2 / input));
        }
        snsLuckyMoneyPrepareUI.f145757h.setMaxAmount(snsLuckyMoneyPrepareUI.E.f145186h);
        snsLuckyMoneyPrepareUI.f145764r.setText(this.f471289a);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(snsLuckyMoneyPrepareUI.W6()), 3);
    }
}
