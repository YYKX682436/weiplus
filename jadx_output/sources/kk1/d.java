package kk1;

/* loaded from: classes12.dex */
public abstract class d {
    public static java.lang.CharSequence a(java.lang.String str, boolean z17, kk1.c cVar) {
        android.text.Spanned fromHtml = android.text.Html.fromHtml(str, new kk1.a(), new kk1.b(cVar, z17));
        if (!(fromHtml instanceof android.text.Spannable)) {
            return fromHtml;
        }
        android.text.Spannable spannable = (android.text.Spannable) fromHtml;
        android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannable.getSpans(0, fromHtml.length(), android.text.style.URLSpan.class);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(fromHtml);
        for (android.text.style.URLSpan uRLSpan : uRLSpanArr) {
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan(uRLSpan.getURL(), cVar, z17), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
        }
        return spannableStringBuilder;
    }
}
