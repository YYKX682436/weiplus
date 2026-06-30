package qd2;

/* loaded from: classes8.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(android.content.Context context, java.lang.String str, int i17) {
        java.lang.String string = context.getResources().getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return str.length() == 0 ? string : "、".concat(string);
    }

    public final java.lang.String b(android.content.Context context, java.lang.String text, java.lang.String regex) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List<com.tencent.mm.smiley.r0> C0;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(regex, "regex");
        ((com.tencent.mm.feature.emoji.gb) ((com.tencent.mm.feature.emoji.api.c7) i95.n0.c(com.tencent.mm.feature.emoji.api.c7.class))).getClass();
        android.text.SpannableString Ri = com.tencent.mm.smiley.x1.Di().Ri(text, true);
        com.tencent.mm.smiley.r0[] r0VarArr = (com.tencent.mm.smiley.r0[]) Ri.getSpans(0, Ri.length(), com.tencent.mm.smiley.r0.class);
        kotlin.jvm.internal.o.d(r0VarArr);
        java.lang.String str3 = "";
        if (!(r0VarArr.length == 0)) {
            str2 = "" + a(context, "", com.tencent.mm.R.string.evu);
            if (r0VarArr.length == 0) {
                C0 = kz5.p0.f313996d;
            } else {
                C0 = kz5.z.C0(r0VarArr);
                java.util.Collections.reverse(C0);
            }
            for (com.tencent.mm.smiley.r0 r0Var : C0) {
                int i19 = r0Var.f193353g;
                if (i19 >= 0 && i19 < text.length() && (i18 = r0Var.f193354h) > (i17 = r0Var.f193353g) && i18 <= text.length()) {
                    text = r26.n0.b0(text, i17, i18, "").toString();
                }
            }
            str = text;
        } else {
            str = text;
            str2 = "";
        }
        if (r26.n0.D(str, "\n", false, 2, null)) {
            str2 = str2 + a(context, str2, com.tencent.mm.R.string.evv);
            str = r26.i0.v(str, "\n", "", false, 4, null);
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(regex).matcher(str);
        while (matcher.find()) {
            str3 = str3 + matcher.group();
        }
        if (str3.length() > 0) {
            str2 = str2.length() == 0 ? str2 + (char) 12300 + str3 + (char) 12301 : str2 + "、「" + str3 + (char) 12301;
        }
        if (str2.length() == 0) {
            return str2;
        }
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.evw, str2);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
