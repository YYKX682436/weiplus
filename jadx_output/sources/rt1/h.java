package rt1;

/* loaded from: classes7.dex */
public final class h implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f399415d;

    public h(rt1.l lVar) {
        this.f399415d = lVar;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.Character B0;
        boolean z17 = false;
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        android.widget.TextView[] textViewArr = this.f399415d.f399449f;
        if (textViewArr == null) {
            kotlin.jvm.internal.o.o("charViews");
            throw null;
        }
        android.widget.TextView textView = textViewArr[6];
        kotlin.jvm.internal.o.d(textView);
        java.lang.CharSequence text = textView.getText();
        if (text != null && (B0 = r26.p0.B0(text)) != null) {
            char charValue = B0.charValue();
            if (19968 <= charValue && charValue < 40892) {
                z17 = true;
            }
        }
        return z17 ? "" : charSequence;
    }
}
