package eq1;

/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.b0 f255789a = new eq1.b0();

    public final java.lang.CharSequence a(int i17, android.content.Context context, com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conv, "conv");
        if (!(conv.d2(1073741824) || conv.d2(Integer.MIN_VALUE))) {
            return null;
        }
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.c58);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        if (conv.d2(Integer.MIN_VALUE)) {
            drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.c4k);
            kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        }
        drawable.setBounds(0, 0, i17, i17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        return android.text.TextUtils.concat(spannableString, "", conv.y0());
    }
}
