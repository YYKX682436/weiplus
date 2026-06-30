package k93;

/* loaded from: classes8.dex */
public class i implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f305890d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f305891e;

    public i(com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference) {
        this.f305891e = inputClearablePreference;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(charSequence, i17, i18, cArr, 0);
            for (char c17 : this.f305890d) {
                char c18 = cArr[i28];
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    return "";
                }
                if (c18 == c17) {
                    com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = this.f305891e;
                    android.widget.TextView textView = inputClearablePreference.U;
                    if (textView != null) {
                        textView.setText(inputClearablePreference.P);
                        inputClearablePreference.U.setVisibility(0);
                    }
                    return "";
                }
            }
        }
        return null;
    }
}
