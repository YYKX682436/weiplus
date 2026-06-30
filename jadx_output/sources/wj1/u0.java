package wj1;

/* loaded from: classes14.dex */
public class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag f446637d;

    public u0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f446637d = appBrandIDCardVerifyPwdFrag;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = this.f446637d;
        if (appBrandIDCardVerifyPwdFrag.f89561q.getText().toString().length() > 0) {
            appBrandIDCardVerifyPwdFrag.f89560p.setEnabled(true);
        } else {
            appBrandIDCardVerifyPwdFrag.f89560p.setEnabled(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
