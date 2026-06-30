package mb3;

/* loaded from: classes9.dex */
public class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView f325355d;

    public b(com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView) {
        this.f325355d = wxaLuckyMoneyMoneyInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = this.f325355d;
        com.tencent.mm.plugin.luckymoney.ui.ik ikVar = wxaLuckyMoneyMoneyInputView.f145009h;
        if (ikVar != null) {
            ikVar.D4(false, wxaLuckyMoneyMoneyInputView.getInputViewId());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
