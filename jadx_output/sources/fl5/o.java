package fl5;

/* loaded from: classes5.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final qa5.c f263956d = new qa5.c();

    /* renamed from: e, reason: collision with root package name */
    public boolean f263957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Character f263958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.api.MMFlexEditText f263959g;

    public o(com.tencent.mm.ui.widget.cedit.api.MMFlexEditText mMFlexEditText) {
        this.f263959g = mMFlexEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f263959g.getSizeAnimController().cancel();
        if (editable instanceof android.text.SpannableStringBuilder) {
            if (!this.f263957e) {
                if (editable.length() > 0) {
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) editable;
                    if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.append((char) 8203);
                        return;
                    }
                    return;
                }
                return;
            }
            java.lang.Character ch6 = this.f263958f;
            if (ch6 != null && ch6.charValue() == 8203) {
                if (editable.length() > 0) {
                    android.text.SpannableStringBuilder spannableStringBuilder2 = (android.text.SpannableStringBuilder) editable;
                    if (spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean z17 = i18 > i19;
        this.f263957e = z17;
        if (!z17 || charSequence == null) {
            return;
        }
        this.f263958f = java.lang.Character.valueOf(charSequence.charAt(i17));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            qa5.c cVar = this.f263956d;
            if (spannableStringBuilder.getSpanStart(cVar) == -1) {
                spannableStringBuilder.removeSpan(cVar);
                spannableStringBuilder.setSpan(cVar, 0, charSequence.length(), 18);
            }
        }
    }
}
