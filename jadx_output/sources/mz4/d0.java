package mz4;

/* loaded from: classes12.dex */
public class d0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f333271d;

    public d0(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        this.f333271d = wXRTEditText;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f333271d;
        java.lang.String str = wXRTEditText.A;
        if (str == null) {
            str = "";
        }
        if (wXRTEditText.C != 0) {
            wXRTEditText.A = "";
        }
        if (!wXRTEditText.f188121w && wXRTEditText.getSelection().f333350d == this.f333271d.getSelection().f333351e && (((!str.endsWith("\n") && str.concat("\n").equals(obj)) || (str.endsWith("\n") && !str.endsWith("\n\n") && str.equals(obj))) && ((android.text.style.ParagraphStyle[]) this.f333271d.getText().getSpans(str.length(), str.length(), android.text.style.ParagraphStyle.class)).length > 0)) {
            int selectionStart = this.f333271d.getSelectionStart();
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f333271d;
            wXRTEditText2.f188121w = true;
            wXRTEditText2.getText().append((java.lang.CharSequence) "\n");
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText3 = this.f333271d;
            wXRTEditText3.f188121w = false;
            wXRTEditText3.setSelection(selectionStart);
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText4 = this.f333271d;
        if (wXRTEditText4.f188116r != null && !wXRTEditText4.f188121w && !str.equals(obj)) {
            android.text.Spannable v17 = this.f333271d.v();
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText5 = this.f333271d;
            wXRTEditText5.A = obj;
            ((mz4.j0) wXRTEditText5.f188116r).h(wXRTEditText5, wXRTEditText5.B, v17, wXRTEditText5.f188122x, wXRTEditText5.f188124y, wXRTEditText5.getSelectionStart(), this.f333271d.getSelectionEnd());
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText6 = this.f333271d;
        wXRTEditText6.I = true;
        wXRTEditText6.getClass();
        this.f333271d.setParagraphsAreUp2Date(false);
        this.f333271d.t();
    }

    @Override // android.text.TextWatcher
    public synchronized void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f333271d;
        java.lang.String str = wXRTEditText.f188126z;
        if (str == null) {
            str = "";
        }
        if (!wXRTEditText.f188121w && !charSequence.toString().equals(str)) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f333271d;
            wXRTEditText2.f188122x = wXRTEditText2.getSelectionStart();
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText3 = this.f333271d;
            wXRTEditText3.f188124y = wXRTEditText3.getSelectionEnd();
            this.f333271d.f188126z = charSequence.toString();
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText4 = this.f333271d;
            wXRTEditText4.A = wXRTEditText4.f188126z;
            wXRTEditText4.B = wXRTEditText4.v();
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f333271d.I = true;
    }
}
