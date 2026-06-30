package com.tencent.mm.ui.base.preference;

/* loaded from: classes5.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.AutoHintSizeEditText f197790d;

    public a(com.tencent.mm.ui.base.preference.AutoHintSizeEditText autoHintSizeEditText) {
        this.f197790d = autoHintSizeEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.base.preference.AutoHintSizeEditText autoHintSizeEditText = this.f197790d;
        java.lang.CharSequence hint = autoHintSizeEditText.getHint();
        int width = (autoHintSizeEditText.getWidth() - autoHintSizeEditText.getPaddingLeft()) - autoHintSizeEditText.getPaddingRight();
        int i17 = com.tencent.mm.ui.base.preference.AutoHintSizeEditText.f197744i;
        autoHintSizeEditText.a(editable, hint, width);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
