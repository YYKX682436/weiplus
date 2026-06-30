package ob3;

/* loaded from: classes5.dex */
public class x implements android.text.TextWatcher {
    public x(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 3) {
            editable.delete(indexOf + 3, length);
            return;
        }
        if (indexOf > 6) {
            editable.delete(6, indexOf);
        } else {
            if (indexOf != -1 || length <= 6) {
                return;
            }
            editable.delete(6, length);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
