package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.MallEditText f155143d;

    public a(com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText) {
        this.f155143d = mallEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = this.f155143d;
        int selectionStart = mallEditText.f155086g.getSelectionStart();
        java.lang.String str = "";
        if (charSequence2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(charSequence2.replaceAll(" ", ""));
            int length = sb6.length();
            if (length >= 4) {
                sb6.insert(3, ' ');
            }
            if (length >= 8) {
                sb6.insert(8, ' ');
            }
            str = sb6.toString();
            int length2 = str.length();
            int i27 = mallEditText.f155099w;
            if (length2 > i27) {
                if ((selectionStart == 4 || selectionStart == 9) && i19 == 1) {
                    selectionStart++;
                } else if ((selectionStart == 4 || selectionStart == 9) && i19 > 1) {
                    selectionStart += i19;
                }
            } else if (length2 < i27 && (selectionStart == 4 || selectionStart == 9)) {
                selectionStart--;
            }
            mallEditText.f155099w = length2;
        }
        if (charSequence2.equals(str)) {
            mallEditText.b();
            return;
        }
        mallEditText.f155086g.setText(str);
        int i28 = mallEditText.f155099w;
        if (selectionStart < i28) {
            mallEditText.f155086g.setSelection(selectionStart);
        } else {
            mallEditText.f155086g.setSelection(i28);
        }
    }
}
