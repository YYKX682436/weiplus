package f93;

/* loaded from: classes11.dex */
public final class y0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelCreateUI f260516d;

    public y0(com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI) {
        this.f260516d = contactLabelCreateUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI = this.f260516d;
        if (contactLabelCreateUI.f143218m) {
            return;
        }
        if (editable != null) {
            java.lang.String obj = editable.toString();
            int f17 = com.tencent.mm.ui.tools.v4.f(obj);
            int i17 = contactLabelCreateUI.f143219n;
            if (f17 > i17) {
                int c17 = com.tencent.mm.ui.tools.v4.c(i17, obj);
                int i18 = contactLabelCreateUI.f143219n;
                if ((1 <= c17 && c17 < i18) && c17 < obj.length()) {
                    contactLabelCreateUI.f143218m = true;
                    com.tencent.mm.ui.base.MMClearEditText mMClearEditText = contactLabelCreateUI.f143213e;
                    if (mMClearEditText != null) {
                        java.lang.String substring = obj.substring(0, c17 + 1);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        mMClearEditText.setText(substring);
                    }
                    com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = contactLabelCreateUI.f143213e;
                    if (mMClearEditText2 != null) {
                        if (mMClearEditText2 != null && (text = mMClearEditText2.getText()) != null) {
                            c17 = text.length();
                        }
                        mMClearEditText2.setSelection(c17);
                    }
                    contactLabelCreateUI.f143218m = false;
                }
                android.widget.TextView textView = contactLabelCreateUI.f143214f;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = contactLabelCreateUI.f143214f;
                if (textView2 != null) {
                    textView2.setText(contactLabelCreateUI.getString(com.tencent.mm.R.string.g9t, java.lang.Integer.valueOf(i18 / 2)));
                }
                com.tencent.mm.ui.jk.f209011a.a();
            } else {
                android.widget.TextView textView3 = contactLabelCreateUI.f143214f;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            }
        }
        contactLabelCreateUI.W6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
