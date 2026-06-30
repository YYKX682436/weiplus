package ne2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ne2.c f336527a = new ne2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f336528b = jz5.h.b(ne2.b.f336526d);

    public final java.lang.String a(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (i18 == 2) {
            int i19 = i17 % 3600;
            if (i19 == 0) {
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.d8v);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                return format;
            }
            if (i17 > 3600) {
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.d8u);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600), java.lang.Integer.valueOf(i19 / 60)}, 2));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                return format2;
            }
            java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.d8x);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60)}, 1));
            kotlin.jvm.internal.o.f(format3, "format(...)");
            return format3;
        }
        int i27 = i17 % 3600;
        if (i27 == 0) {
            java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.f491536dg0);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600)}, 1));
            kotlin.jvm.internal.o.f(format4, "format(...)");
            return format4;
        }
        if (i17 > 3600) {
            java.lang.String string5 = context.getResources().getString(com.tencent.mm.R.string.dfz);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            java.lang.String format5 = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600), java.lang.Integer.valueOf(i27 / 60)}, 2));
            kotlin.jvm.internal.o.f(format5, "format(...)");
            return format5;
        }
        java.lang.String string6 = context.getResources().getString(com.tencent.mm.R.string.f491537dg1);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        java.lang.String format6 = java.lang.String.format(string6, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60)}, 1));
        kotlin.jvm.internal.o.f(format6, "format(...)");
        return format6;
    }

    public final java.lang.String b(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        int i18 = i17 % 3600;
        if (i18 == 0) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491536dg0);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        if (i17 > 3600) {
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.dfz);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 3600), java.lang.Integer.valueOf(i18 / 60)}, 2));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            return format2;
        }
        java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.f491537dg1);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60)}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        return format3;
    }

    public final void c(android.widget.TextView tv6) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        java.lang.String string = tv6.getContext().getResources().getString(com.tencent.mm.R.string.ehd);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = tv6.getContext().getResources().getString(com.tencent.mm.R.string.eh_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        int L = r26.n0.L(format, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        spannableString.setSpan(new ne2.a(), L, length, 33);
        tv6.setHighlightColor(tv6.getContext().getResources().getColor(android.R.color.transparent));
        tv6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        tv6.setText(spannableString);
    }
}
