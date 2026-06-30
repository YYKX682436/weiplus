package com.tencent.mm.plugin.finder.view;

/* loaded from: classes12.dex */
public final class cs implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f131862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SignatureEditText f131863e;

    public cs(com.tencent.mm.plugin.finder.view.SignatureEditText signatureEditText) {
        this.f131863e = signatureEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f131862d = charSequence != null ? charSequence.length() : 0;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.text.Editable originText;
        java.lang.String str;
        android.text.Editable originText2;
        com.tencent.mm.plugin.finder.view.SignatureEditText signatureEditText = this.f131863e;
        if (signatureEditText.getAllowEmptyLine()) {
            return;
        }
        if ((charSequence != null ? charSequence.length() : 0) < this.f131862d) {
            int selectionEnd = signatureEditText.getSelectionEnd() - 1 > 0 ? signatureEditText.getSelectionEnd() : 0;
            originText = signatureEditText.getOriginText();
            if (selectionEnd < originText.length()) {
                java.util.Iterator it = r26.n0.Q(originText).iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    str = (java.lang.String) it.next();
                    if (i27 <= selectionEnd && selectionEnd <= str.length() + i27) {
                        break;
                    } else {
                        i27 += str.length() + 1;
                    }
                }
                if (i27 >= originText.length()) {
                    return;
                }
                int length = str.length() + i27;
                int length2 = originText.length() - 1;
                if (length > length2) {
                    length = length2;
                }
                if (r26.n0.u0(str).toString().length() == 0) {
                    originText2 = signatureEditText.getOriginText();
                    signatureEditText.setText(r26.n0.X(originText2, i27, length + 1));
                    int i28 = i27 - 1;
                    signatureEditText.setSelection(i28 > 0 ? i28 : 0);
                }
            }
        }
    }
}
