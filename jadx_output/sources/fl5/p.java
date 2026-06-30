package fl5;

/* loaded from: classes15.dex */
public class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact f263960d;

    public p(com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact pasterEditTextCompact) {
        this.f263960d = pasterEditTextCompact;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact pasterEditTextCompact = this.f263960d;
        if (pasterEditTextCompact.f211566v2) {
            pasterEditTextCompact.f211566v2 = false;
            pasterEditTextCompact.A2 = pasterEditTextCompact.f211568x2;
            pasterEditTextCompact.f211570z2 = pasterEditTextCompact.f211569y2;
            java.util.Iterator it = pasterEditTextCompact.F2.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                java.lang.CharSequence charSequence = pasterEditTextCompact.f211569y2;
                int i17 = pasterEditTextCompact.f211567w2;
                int i18 = pasterEditTextCompact.f211568x2;
                throw null;
            }
        }
        int length = editable.length() - pasterEditTextCompact.C2.length();
        if (!pasterEditTextCompact.B2 && length >= 10) {
            pasterEditTextCompact.B2 = true;
        }
        if (length >= 10) {
            pasterEditTextCompact.D2.add(java.lang.Integer.valueOf(length));
        }
        pasterEditTextCompact.C2 = editable.toString();
        java.util.Iterator it6 = pasterEditTextCompact.E2.iterator();
        while (it6.hasNext()) {
            ((android.text.TextWatcher) it6.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Iterator it = this.f263960d.E2.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i17, i18, i19);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact pasterEditTextCompact = this.f263960d;
        pasterEditTextCompact.f211567w2 = i17;
        pasterEditTextCompact.f211568x2 = i19;
        pasterEditTextCompact.f211569y2 = charSequence.subSequence(i17, i17 + i19);
        java.util.Iterator it = pasterEditTextCompact.E2.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i17, i18, i19);
        }
    }
}
