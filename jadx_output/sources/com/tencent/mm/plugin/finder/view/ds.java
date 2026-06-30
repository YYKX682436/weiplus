package com.tencent.mm.plugin.finder.view;

/* loaded from: classes12.dex */
public final class ds implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SignatureEditText f131947d;

    public ds(com.tencent.mm.plugin.finder.view.SignatureEditText signatureEditText) {
        this.f131947d = signatureEditText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        android.text.Editable originText;
        android.text.Editable originText2;
        android.text.Editable originText3;
        if (!(keyEvent != null && keyEvent.getKeyCode() == 66)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.SignatureEditText signatureEditText = this.f131947d;
        if (signatureEditText.getAllowEmptyLine()) {
            return false;
        }
        int selectionEnd = signatureEditText.getSelectionEnd();
        originText = signatureEditText.getOriginText();
        if (selectionEnd < originText.length()) {
            if (selectionEnd <= 0) {
                return true;
            }
            return !(signatureEditText.getText().charAt(selectionEnd - 1) != '\n' && signatureEditText.getText().charAt(selectionEnd) != '\n');
        }
        originText2 = signatureEditText.getOriginText();
        if (selectionEnd != originText2.length()) {
            return false;
        }
        originText3 = signatureEditText.getOriginText();
        return r26.n0.u0((java.lang.String) kz5.n0.i0(r26.n0.Q(originText3))).toString().length() == 0;
    }
}
