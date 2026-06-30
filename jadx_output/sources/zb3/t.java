package zb3;

/* loaded from: classes9.dex */
public class t implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f471291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471292b;

    public t(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, android.text.SpannableString spannableString) {
        this.f471292b = snsLuckyMoneyPrepareUI;
        this.f471291a = spannableString;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471292b;
        int input = snsLuckyMoneyPrepareUI.f145756g.getInput();
        double input2 = snsLuckyMoneyPrepareUI.f145757h.getInput();
        snsLuckyMoneyPrepareUI.f145772z = 1;
        snsLuckyMoneyPrepareUI.f145757h.setType(1);
        snsLuckyMoneyPrepareUI.f145757h.setTitle(snsLuckyMoneyPrepareUI.getString(com.tencent.mm.R.string.go8));
        snsLuckyMoneyPrepareUI.f145757h.setShowGroupIcon(true);
        if (input2 > 0.0d && input > 0) {
            snsLuckyMoneyPrepareUI.f145757h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input2 * input));
        }
        snsLuckyMoneyPrepareUI.f145757h.setMaxAmount(snsLuckyMoneyPrepareUI.E.f145183e);
        snsLuckyMoneyPrepareUI.f145764r.setText(this.f471291a);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(snsLuckyMoneyPrepareUI.W6()), 2);
    }
}
