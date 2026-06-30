package xk4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final xk4.a f455064a = new xk4.a();

    public final java.lang.String a(android.text.TextPaint textPaint, java.lang.String str, int i17, int i18) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return str;
        }
        java.lang.String substring = str.substring(0, staticLayout.getLineEnd(0));
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring.concat("...");
    }
}
