package db5;

/* loaded from: classes.dex */
public class e2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormMobileInputView f228323d;

    public e2(com.tencent.mm.ui.base.MMFormMobileInputView mMFormMobileInputView) {
        this.f228323d = mMFormMobileInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.base.MMFormMobileInputView mMFormMobileInputView = this.f228323d;
        java.lang.String obj = mMFormMobileInputView.f197362d.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            mMFormMobileInputView.f197362d.setText("+");
            android.widget.EditText editText = mMFormMobileInputView.f197362d;
            editText.setSelection(editText.getText().toString().length());
        } else if (!obj.contains("+")) {
            mMFormMobileInputView.f197362d.setText("+".concat(obj));
            android.widget.EditText editText2 = mMFormMobileInputView.f197362d;
            editText2.setSelection(editText2.getText().toString().length());
        } else if (obj.length() > 1) {
            java.lang.String substring = obj.substring(1);
            if (substring.length() > 4) {
                mMFormMobileInputView.f197362d.setText(substring.substring(0, 4));
                return;
            }
        }
        mMFormMobileInputView.getClass();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
