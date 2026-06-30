package pg5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static pg5.c f354252a;

    public static java.lang.CharSequence a(android.content.Context context, java.lang.CharSequence charSequence) {
        pg5.c cVar = f354252a;
        if (cVar == null) {
            return charSequence;
        }
        ((com.tencent.mm.feature.emoji.f1) cVar).getClass();
        return com.tencent.mm.smiley.x1.Di().Ri(charSequence, true);
    }

    public static java.lang.CharSequence b(java.lang.CharSequence charSequence, boolean z17) {
        pg5.c cVar = f354252a;
        if (cVar == null) {
            return charSequence;
        }
        ((com.tencent.mm.feature.emoji.f1) cVar).getClass();
        return com.tencent.mm.smiley.x1.Di().Ri(charSequence, z17);
    }

    public static pg5.b c(android.view.View view, pg5.a aVar) {
        pg5.b bVar;
        if (f354252a == null) {
            return null;
        }
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        Di.getClass();
        com.tencent.mm.smiley.g b17 = com.tencent.mm.smiley.g.b();
        b17.getClass();
        java.lang.CharSequence charSequence = aVar.f354242a;
        int i17 = aVar.f354245d;
        int i18 = aVar.f354246e;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt(0);
        android.text.Spannable spannableString = aVar.f354247f ? charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : charSequence instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) charSequence : new android.text.SpannableString(charSequence) : null;
        int length = charSequence.length();
        int i19 = aVar.f354244c;
        int i27 = aVar.f354243b;
        if (length == 0) {
            bVar = new pg5.b(null, pInt.value);
        } else if (spannableString == null) {
            bVar = new pg5.b(null, pInt.value);
        } else {
            if (aVar.f354248g) {
                for (com.tencent.mm.smiley.r0 r0Var : (com.tencent.mm.smiley.r0[]) spannableString.getSpans(0, charSequence.length(), com.tencent.mm.smiley.r0.class)) {
                    spannableString.removeSpan(r0Var);
                }
            }
            com.tencent.mm.smiley.i iVar = new com.tencent.mm.smiley.i(b17, new com.tencent.mm.pointers.PInt(0), i18, pInt, i17, spannableString, aVar);
            com.tencent.mm.smiley.f0 f0Var = com.tencent.mm.smiley.e0.f193238a;
            f0Var.getClass();
            new com.tencent.mm.smiley.r(f0Var.f193250a).a(spannableString, i27, i19, iVar);
            bVar = new pg5.b(spannableString, pInt.value);
        }
        Di.wi(bVar.f354250a, i27, i19, aVar.f354245d);
        return bVar;
    }

    public static int d(android.content.Context context, java.lang.String str, int i17) {
        pg5.c cVar = f354252a;
        if (cVar == null) {
            return i17;
        }
        ((com.tencent.mm.feature.emoji.f1) cVar).getClass();
        com.tencent.mm.smiley.x1.Di().getClass();
        com.tencent.mm.smiley.m1 m1Var = com.tencent.mm.smiley.t1.a().f193394k;
        com.tencent.mm.smiley.r rVar = new com.tencent.mm.smiley.r(m1Var.f193313a);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17;
        int i18 = m1Var.f193314b;
        rVar.a(str, i17 - i18, i18 + i17, new com.tencent.mm.smiley.k1(i17, f0Var));
        return f0Var.f310116d;
    }
}
