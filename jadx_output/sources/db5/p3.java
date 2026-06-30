package db5;

/* loaded from: classes11.dex */
public final class p3 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f228465d;

    public p3(com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        this.f228465d = mMLimitedClearEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean z18 = true;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f228465d;
        if (z17) {
            mMLimitedClearEditText.hasFocused = true;
        }
        if (z17 && mMLimitedClearEditText.getHintToText()) {
            java.lang.CharSequence hint = mMLimitedClearEditText.getEditText().getHint();
            if (!(hint == null || r26.n0.N(hint))) {
                android.text.Editable text = mMLimitedClearEditText.getEditText().getText();
                if (text != null && !r26.n0.N(text)) {
                    z18 = false;
                }
                if (z18) {
                    mMLimitedClearEditText.getEditText().setText(mMLimitedClearEditText.getEditText().getHint());
                    mMLimitedClearEditText.getEditText().setHint((java.lang.CharSequence) null);
                }
            }
            com.tencent.mm.ui.base.NestedScrollEditText editText = mMLimitedClearEditText.getEditText();
            android.text.Editable text2 = mMLimitedClearEditText.getEditText().getText();
            editText.setSelection(text2 != null ? text2.length() : 0);
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText.a(mMLimitedClearEditText);
        android.view.View.OnFocusChangeListener onFocusChangeListener = mMLimitedClearEditText.f197463s;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
