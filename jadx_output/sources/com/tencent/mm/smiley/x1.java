package com.tencent.mm.smiley;

@j95.b
/* loaded from: classes12.dex */
public class x1 extends i95.w implements com.tencent.mm.pluginsdk.ui.span.r, com.tencent.mm.feature.emoji.api.b7 {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.smiley.x1 f193406e;

    /* renamed from: d, reason: collision with root package name */
    public final int f193407d = 300;

    private x1() {
    }

    public static com.tencent.mm.smiley.x1 Di() {
        if (f193406e == null) {
            f193406e = new com.tencent.mm.smiley.x1();
        }
        return f193406e;
    }

    public boolean Ai(java.lang.CharSequence charSequence) {
        com.tencent.mm.smiley.g b17 = com.tencent.mm.smiley.g.b();
        java.lang.String charSequence2 = charSequence.toString();
        b17.getClass();
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.l0.f193307a.getClass();
        if (charSequence2 == null) {
            return false;
        }
        if (charSequence2.length() == 0) {
            return false;
        }
        com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
        int length = charSequence2.length();
        com.tencent.mm.smiley.r rVar = new com.tencent.mm.smiley.r(pVar.f193329e);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        rVar.a(charSequence2, 0, length, new com.tencent.mm.smiley.o(h0Var));
        com.tencent.mm.smiley.a1 a1Var = (com.tencent.mm.smiley.a1) h0Var.f310123d;
        return a1Var != null && (a1Var instanceof com.tencent.mm.smiley.b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.CharSequence r6) {
        /*
            r5 = this;
            com.tencent.mm.smiley.t1 r0 = com.tencent.mm.smiley.t1.a()
            java.lang.String r6 = r6.toString()
            r0.getClass()
            java.lang.String r1 = "source"
            kotlin.jvm.internal.o.g(r6, r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.J0(r6)
            r2 = 0
            if (r1 == 0) goto L19
            goto L3e
        L19:
            com.tencent.mm.smiley.m1 r0 = r0.f193394k
            int r1 = r6.length()
            com.tencent.mm.smiley.r r3 = new com.tencent.mm.smiley.r
            com.tencent.mm.smiley.w1 r0 = r0.f193313a
            r3.<init>(r0)
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            com.tencent.mm.smiley.l1 r4 = new com.tencent.mm.smiley.l1
            r4.<init>(r0)
            r3.a(r6, r2, r1, r4)
            java.lang.Object r6 = r0.f310123d
            com.tencent.mm.smiley.a1 r6 = (com.tencent.mm.smiley.a1) r6
            boolean r0 = r6 instanceof com.tencent.mm.smiley.h1
            if (r0 == 0) goto L3e
            com.tencent.mm.smiley.h1 r6 = (com.tencent.mm.smiley.h1) r6
            goto L3f
        L3e:
            r6 = 0
        L3f:
            if (r6 == 0) goto L42
            r2 = 1
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.x1.Bi(java.lang.CharSequence):boolean");
    }

    public android.text.SpannableString Ni(android.content.Context context, java.lang.CharSequence charSequence) {
        return Ri(charSequence, true);
    }

    public android.text.SpannableString Ri(java.lang.CharSequence charSequence, boolean z17) {
        boolean z18;
        if (charSequence == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            return new android.text.SpannableString("");
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : new android.text.SpannableString(charSequence);
        if (com.tencent.mm.sdk.platformtools.t8.K0(spannableString.toString())) {
            return new android.text.SpannableString("");
        }
        com.tencent.mm.smiley.g b17 = com.tencent.mm.smiley.g.b();
        int i17 = this.f193407d;
        int length = spannableString.length();
        b17.getClass();
        if (spannableString.length() != 0) {
            if (!b17.f193254a) {
                int max = java.lang.Math.max(0, 0);
                int length2 = (length < 0 || length > spannableString.length()) ? spannableString.length() : length;
                while (true) {
                    if (max >= length2) {
                        z18 = false;
                        break;
                    }
                    int codePointAt = java.lang.Character.codePointAt(spannableString, max);
                    if ((codePointAt >= 8986 && codePointAt <= 11093) || (codePointAt >= 126980 && codePointAt <= 129784) || codePointAt == 65039) {
                        z18 = true;
                        break;
                    }
                    max += java.lang.Character.charCount(codePointAt);
                }
                if (z18 && !b17.f193254a) {
                    if (!b17.f193254a) {
                        synchronized (b17) {
                            if (!b17.f193254a) {
                                boolean z19 = com.tencent.mm.smiley.q0.f193336d;
                                com.tencent.mm.smiley.l0.f193307a.j();
                                b17.f193254a = true;
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHelper", "Found emoji code and try to init emoji resources.");
                }
            }
            com.tencent.mm.smiley.j jVar = new com.tencent.mm.smiley.j(b17, new com.tencent.mm.pointers.PInt(0), i17, z17, new com.tencent.mm.smiley.h(b17, spannableString));
            com.tencent.mm.smiley.f0 f0Var = com.tencent.mm.smiley.e0.f193238a;
            f0Var.getClass();
            new com.tencent.mm.smiley.r(f0Var.f193250a).a(spannableString, 0, length, jVar);
        }
        wi(spannableString, 0, spannableString.length(), 1);
        return spannableString;
    }

    public void wi(android.text.Spannable spannable, int i17, int i18, int i19) {
        if (spannable == null || ((al5.w[]) spannable.getSpans(i17, i18, al5.w.class)).length <= 0) {
            return;
        }
        for (java.lang.Object obj : (jg5.b[]) spannable.getSpans(i17, i18, jg5.b.class)) {
            spannable.removeSpan(obj);
        }
        jg5.b bVar = new jg5.b(i17, i18, i19);
        java.lang.CharSequence subSequence = spannable.subSequence(i17, i18);
        kotlin.jvm.internal.o.g(subSequence, "<set-?>");
        bVar.f299664b = subSequence;
        spannable.setSpan(bVar, i17, i18, 33);
    }
}
