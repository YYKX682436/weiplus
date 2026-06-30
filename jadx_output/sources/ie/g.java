package ie;

/* loaded from: classes7.dex */
public class g extends android.text.Spannable.Factory {
    public g(com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText) {
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        return new android.text.SpannableStringBuilder(charSequence);
    }
}
