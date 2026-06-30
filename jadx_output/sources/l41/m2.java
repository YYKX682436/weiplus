package l41;

/* loaded from: classes4.dex */
public class m2 implements db5.n {
    public m2(l41.q2 q2Var) {
    }

    @Override // db5.n
    public java.lang.CharSequence a(android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        android.graphics.drawable.Drawable drawable = textView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(charSequence, textView.getPaint(), ((textView.getMeasuredWidth() - textView.getCompoundPaddingRight()) - textView.getCompoundPaddingLeft()) - (drawable.getIntrinsicWidth() + textView.getPaint().measureText(" ")), android.text.TextUtils.TruncateAt.END);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(ellipsize);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), ellipsize.length(), ellipsize.length() + 1, 33);
        return spannableStringBuilder;
    }
}
