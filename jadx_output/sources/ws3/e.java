package ws3;

/* loaded from: classes9.dex */
public class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f449173d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws3.j f449174e;

    public e(ws3.j jVar) {
        this.f449174e = jVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        ws3.j jVar = this.f449174e;
        int selectionStart = jVar.f449183c.getContentEditText().getSelectionStart();
        java.lang.String str = "";
        if (charSequence2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(charSequence2.replaceAll(" ", ""));
            int length = sb6.length();
            if (length >= 4) {
                sb6.insert(3, ' ');
            }
            if (length >= 8) {
                sb6.insert(8, ' ');
            }
            str = sb6.toString();
            int length2 = str.length();
            int i27 = this.f449173d;
            if (length2 > i27) {
                if ((selectionStart == 4 || selectionStart == 9) && i19 == 1) {
                    selectionStart++;
                } else if ((selectionStart == 4 || selectionStart == 9) && i19 > 1) {
                    selectionStart += i19;
                }
            } else if (length2 < i27 && (selectionStart == 4 || selectionStart == 9)) {
                selectionStart--;
            }
            this.f449173d = length2;
        }
        if (charSequence2.equals(str)) {
            return;
        }
        jVar.f449183c.getContentEditText().setText(str);
        if (selectionStart < this.f449173d) {
            jVar.f449183c.getContentEditText().setSelection(selectionStart);
        } else {
            jVar.f449183c.getContentEditText().setSelection(this.f449173d);
        }
    }
}
