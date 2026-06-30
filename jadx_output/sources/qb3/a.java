package qb3;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView f361322d;

    public a(com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView wxaLuckyMoneyTextInputView) {
        this.f361322d = wxaLuckyMoneyTextInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView wxaLuckyMoneyTextInputView = this.f361322d;
        com.tencent.mm.plugin.luckymoney.ui.ik ikVar = wxaLuckyMoneyTextInputView.f145063f;
        if (ikVar != null) {
            ikVar.D4(true, wxaLuckyMoneyTextInputView.getInputViewId());
        }
    }
}
