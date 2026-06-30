package nx1;

/* loaded from: classes12.dex */
public class s implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText f341321d;

    public s(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText) {
        this.f341321d = wXRTEditText;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = this.f341321d;
        java.lang.String str = wXRTEditText.f96609z;
        if (str == null) {
            str = "";
        }
        if (wXRTEditText.B != 0) {
            wXRTEditText.f96609z = "";
        }
        if (!wXRTEditText.f96603v && wXRTEditText.getSelection().f341315d == this.f341321d.getSelection().f341316e && (((!str.endsWith("\n") && str.concat("\n").equals(obj)) || (str.endsWith("\n") && !str.endsWith("\n\n") && str.equals(obj))) && ((android.text.style.ParagraphStyle[]) this.f341321d.getText().getSpans(str.length(), str.length(), android.text.style.ParagraphStyle.class)).length > 0)) {
            int selectionStart = this.f341321d.getSelectionStart();
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f341321d;
            wXRTEditText2.f96603v = true;
            wXRTEditText2.getText().append((java.lang.CharSequence) "\n");
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText3 = this.f341321d;
            wXRTEditText3.f96603v = false;
            wXRTEditText3.setSelection(selectionStart);
        }
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText4 = this.f341321d;
        if (wXRTEditText4.f96599r != null && !wXRTEditText4.f96603v && !str.equals(obj)) {
            android.text.Spannable v17 = this.f341321d.v();
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText5 = this.f341321d;
            wXRTEditText5.f96609z = obj;
            ((nx1.z) wXRTEditText5.f96599r).e(wXRTEditText5.C, wXRTEditText5.A, v17, wXRTEditText5.f96604w, wXRTEditText5.f96605x, wXRTEditText5.getSelectionStart(), this.f341321d.getSelectionEnd());
        }
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText6 = this.f341321d;
        wXRTEditText6.I = true;
        wXRTEditText6.getClass();
        this.f341321d.setParagraphsAreUp2Date(false);
        this.f341321d.t();
    }

    @Override // android.text.TextWatcher
    public synchronized void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = this.f341321d;
        java.lang.String str = wXRTEditText.f96607y;
        if (str == null) {
            str = "";
        }
        if (!wXRTEditText.f96603v && !charSequence.toString().equals(str)) {
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f341321d;
            wXRTEditText2.f96604w = wXRTEditText2.getSelectionStart();
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText3 = this.f341321d;
            wXRTEditText3.f96605x = wXRTEditText3.getSelectionEnd();
            this.f341321d.f96607y = charSequence.toString();
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText4 = this.f341321d;
            wXRTEditText4.f96609z = wXRTEditText4.f96607y;
            wXRTEditText4.A = wXRTEditText4.v();
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f341321d.I = true;
    }
}
