package nl5;

/* loaded from: classes15.dex */
public class t implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.edittext.PasterEditText f338376d;

    public t(com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText) {
        this.f338376d = pasterEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = this.f338376d;
        if (pasterEditText.f212076d) {
            pasterEditText.f212076d = false;
            pasterEditText.f212081i = pasterEditText.f212078f;
            pasterEditText.f212080h = pasterEditText.f212079g;
            java.util.Iterator it = pasterEditText.f212086q.iterator();
            while (it.hasNext()) {
                ((nl5.u) it.next()).a(editable, pasterEditText.f212079g, pasterEditText.f212077e, pasterEditText.f212078f);
            }
        }
        int length = editable.length() - pasterEditText.f212083n.length();
        if (!pasterEditText.f212082m && length >= 10) {
            pasterEditText.f212082m = true;
        }
        if (length >= 10) {
            ((java.util.ArrayList) pasterEditText.f212084o).add(java.lang.Integer.valueOf(length));
        }
        pasterEditText.f212083n = editable.toString();
        java.util.Iterator it6 = pasterEditText.f212085p.iterator();
        while (it6.hasNext()) {
            ((android.text.TextWatcher) it6.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Iterator it = this.f338376d.f212085p.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i17, i18, i19);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = this.f338376d;
        pasterEditText.f212077e = i17;
        pasterEditText.f212078f = i19;
        pasterEditText.f212079g = charSequence.subSequence(i17, i17 + i19);
        java.util.Iterator it = pasterEditText.f212085p.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i17, i18, i19);
        }
    }
}
