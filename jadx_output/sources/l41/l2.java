package l41;

/* loaded from: classes4.dex */
public class l2 implements db5.n {
    public l2(l41.q2 q2Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence] */
    @Override // db5.n
    public java.lang.CharSequence a(android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        java.lang.CharSequence ellipsize;
        java.lang.String str2;
        float measureText = textView.getPaint().measureText(" " + str);
        int measuredWidth = (textView.getMeasuredWidth() - textView.getCompoundPaddingRight()) - textView.getCompoundPaddingLeft();
        double d17 = (double) measuredWidth;
        if (measureText >= 0.6d * d17) {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, textView.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
            str2 = android.text.TextUtils.ellipsize(str, textView.getPaint(), (measuredWidth - textView.getPaint().measureText(ellipsize.toString())) - 20.0f, android.text.TextUtils.TruncateAt.END);
        } else {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, textView.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
            str2 = str;
        }
        android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(textView.getContext(), ((java.lang.Object) ellipsize) + " " + ((java.lang.Object) str2));
        android.content.res.ColorStateList e17 = i65.a.e(textView.getContext(), i17);
        i19.setSpan(new android.text.style.TextAppearanceSpan(null, 0, i18, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str2.length(), 33);
        return i19;
    }
}
