package xl1;

/* loaded from: classes5.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView f455102d;

    public a(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView editVerifyCodeView) {
        this.f455102d = editVerifyCodeView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null || editable.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", editable.toString());
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView editVerifyCodeView = this.f455102d;
        if (editVerifyCodeView.f92104d.length() < 6) {
            editVerifyCodeView.f92104d.append(editable.toString());
            java.lang.StringBuilder sb6 = editVerifyCodeView.f92104d;
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + ((java.lang.Object) sb6));
            int length = sb7.length();
            if (length > 0 && length <= 6) {
                int i17 = length - 1;
                android.widget.TextView[] textViewArr = editVerifyCodeView.f92106f;
                textViewArr[i17].setVisibility(0);
                textViewArr[i17].setText(java.lang.String.valueOf(sb7.charAt(i17)));
                editVerifyCodeView.f92105e[i17].setVisibility(4);
            }
        }
        editable.delete(0, editable.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
