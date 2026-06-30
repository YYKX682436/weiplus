package ie;

/* loaded from: classes7.dex */
public class f implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f290954d;

    public f(com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f290954d = wAGamePanelInputEditText;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return null;
        }
        return com.tencent.luggage.game.widget.input.WAGamePanelInputEditText.a(this.f290954d, charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableStringBuilder(charSequence.subSequence(i17, i18)));
    }
}
