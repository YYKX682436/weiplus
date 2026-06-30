package xl1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew f455106d;

    public g(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f455106d = editVerifyCodeViewNew;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew = this.f455106d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) editVerifyCodeViewNew.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            editVerifyCodeViewNew.f92111e.requestFocus();
            inputMethodManager.showSoftInput(editVerifyCodeViewNew.f92111e, 0);
        }
    }
}
