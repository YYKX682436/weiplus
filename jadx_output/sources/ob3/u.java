package ob3;

/* loaded from: classes9.dex */
public class u implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f344086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344087b;

    public u(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, android.text.SpannableString spannableString) {
        this.f344087b = wxaLuckyMoneyPrepareUI;
        this.f344086a = spannableString;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344087b;
        int input = wxaLuckyMoneyPrepareUI.f145033m.getInput();
        double input2 = wxaLuckyMoneyPrepareUI.f145034n.getInput();
        lb3.i iVar = lb3.i.RANDOM_LUCK;
        wxaLuckyMoneyPrepareUI.f145032i = iVar;
        wxaLuckyMoneyPrepareUI.f145034n.setType(iVar);
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = wxaLuckyMoneyPrepareUI.f145034n;
        lb3.h.GLOBAL.getClass();
        wxaLuckyMoneyMoneyInputView.setMaxAmount(2000.0d);
        wxaLuckyMoneyPrepareUI.f145034n.setTitle(wxaLuckyMoneyPrepareUI.getString(com.tencent.mm.R.string.go8));
        wxaLuckyMoneyPrepareUI.f145034n.setShowGroupIcon(true);
        if (input2 > 0.0d && input > 0) {
            wxaLuckyMoneyPrepareUI.f145034n.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input2 * input));
        }
        wxaLuckyMoneyPrepareUI.f145041u.setText(this.f344086a);
    }
}
