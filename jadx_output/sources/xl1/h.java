package xl1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew f455107d;

    public h(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f455107d = editVerifyCodeViewNew;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew = this.f455107d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) editVerifyCodeViewNew.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editVerifyCodeViewNew.f92111e.getWindowToken(), 0);
        }
    }
}
