package ym5;

/* loaded from: classes5.dex */
public final class z5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.StickerEditText f463593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463594e;

    public z5(com.tencent.mm.view.StickerEditText stickerEditText, int i17) {
        this.f463593d = stickerEditText;
        this.f463594e = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.view.StickerEditText stickerEditText = this.f463593d;
        int lineCount = stickerEditText.getLineCount();
        int i17 = this.f463594e;
        if (lineCount > i17) {
            java.lang.CharSequence text = stickerEditText.getText();
            if (text == null) {
                text = "";
            }
            int i18 = 0;
            for (int i19 = 0; i19 < text.length(); i19++) {
                if (text.charAt(i19) == '\n') {
                    i18++;
                }
            }
            if (i18 >= i17) {
                stickerEditText.getClass();
                int i27 = -1;
                for (int i28 = 0; i28 < i17; i28++) {
                    i27 = r26.n0.K(text, '\n', i27 + 1, false, 4, null);
                    if (i27 == -1) {
                        break;
                    }
                }
                java.lang.CharSequence subSequence = text.subSequence(0, i27);
                stickerEditText.setText(subSequence);
                stickerEditText.setSelection(subSequence.length());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
