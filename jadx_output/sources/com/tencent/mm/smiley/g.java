package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public class g extends qk.t {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.smiley.g f193253b;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f193254a = false;

    public g() {
        ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.g$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.smiley.g gVar = com.tencent.mm.smiley.g.this;
                if (gVar.f193254a) {
                    return;
                }
                synchronized (gVar) {
                    if (!gVar.f193254a) {
                        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
                        com.tencent.mm.smiley.l0.f193307a.j();
                        gVar.f193254a = true;
                    }
                }
            }
        });
    }

    public static com.tencent.mm.smiley.g b() {
        if (f193253b == null) {
            synchronized (com.tencent.mm.smiley.g.class) {
                f193253b = new com.tencent.mm.smiley.g();
            }
        }
        return f193253b;
    }

    public java.lang.String a(java.lang.String content) {
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.q0 q0Var = com.tencent.mm.smiley.l0.f193307a;
        q0Var.getClass();
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = content.length();
        int i17 = 0;
        boolean z18 = false;
        while (i17 < length) {
            int codePointAt = content.codePointAt(i17);
            com.tencent.mm.smiley.b2 e17 = q0Var.e(codePointAt);
            if (e17 != null) {
                for (int i18 : e17.f193222c) {
                    sb6.appendCodePoint(i18);
                }
                z18 = true;
            } else {
                sb6.appendCodePoint(codePointAt);
            }
            i17 += java.lang.Character.charCount(codePointAt);
        }
        if (!z18) {
            return content;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public com.tencent.mm.smiley.b2 c(java.lang.String str) {
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.l0.f193307a.getClass();
        if (str != null) {
            if (!(str.length() == 0)) {
                com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
                int length = str.length();
                com.tencent.mm.smiley.r rVar = new com.tencent.mm.smiley.r(pVar.f193329e);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                rVar.a(str, 0, length, new com.tencent.mm.smiley.o(h0Var));
                com.tencent.mm.smiley.a1 a1Var = (com.tencent.mm.smiley.a1) h0Var.f310123d;
                if (a1Var != null && (a1Var instanceof com.tencent.mm.smiley.b2)) {
                    return (com.tencent.mm.smiley.b2) a1Var;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = com.tencent.mm.smiley.q0.f193336d
            com.tencent.mm.smiley.q0 r0 = com.tencent.mm.smiley.l0.f193307a
            r0.getClass()
            if (r9 == 0) goto Ldf
            int r1 = r9.length()
            r2 = 0
            if (r1 != 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 == 0) goto L17
            goto Ldf
        L17:
            com.tencent.mm.smiley.p r1 = com.tencent.mm.smiley.m.f193309a
            android.util.SparseArray r3 = r1.f193328d
            int r3 = r3.size()
            if (r3 != 0) goto Lbc
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.x2.e()
            android.content.SharedPreferences r4 = r3.getSharedPreferences(r4, r2)
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.m2.o(r4, r3)
            if (r4 == 0) goto L80
            int r5 = r4.hashCode()
            r6 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r5 == r6) goto L68
            r6 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r5 == r6) goto L4f
            r6 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r5 == r6) goto L45
            goto L80
        L45:
            java.lang.String r5 = "zh_TW"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L59
            goto L80
        L4f:
            java.lang.String r5 = "zh_HK"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L59
            goto L80
        L59:
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2130903080(0x7f030028, float:1.7412968E38)
            java.lang.String[] r4 = r4.getStringArray(r5)
            kotlin.jvm.internal.o.d(r4)
            goto L8e
        L68:
            java.lang.String r5 = "zh_CN"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L80
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2130903078(0x7f030026, float:1.7412964E38)
            java.lang.String[] r4 = r4.getStringArray(r5)
            kotlin.jvm.internal.o.d(r4)
            goto L8e
        L80:
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2130903079(0x7f030027, float:1.7412966E38)
            java.lang.String[] r4 = r4.getStringArray(r5)
            kotlin.jvm.internal.o.d(r4)
        L8e:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2130903077(0x7f030025, float:1.7412962E38)
            java.lang.String[] r3 = r3.getStringArray(r5)
            java.lang.String r5 = "getStringArray(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            android.util.SparseArray r1 = r1.f193328d
            r1.clear()
            r1 = r2
        La4:
            int r5 = r3.length
            if (r1 >= r5) goto Lbc
            int r5 = r4.length
            if (r1 >= r5) goto Lbc
            com.tencent.mm.smiley.p r5 = com.tencent.mm.smiley.m.f193309a
            android.util.SparseArray r5 = r5.f193328d
            r6 = r3[r1]
            char r6 = r6.charAt(r2)
            r7 = r4[r1]
            r5.put(r6, r7)
            int r1 = r1 + 1
            goto La4
        Lbc:
            int r1 = r9.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            kotlin.jvm.internal.f0 r4 = new kotlin.jvm.internal.f0
            r4.<init>()
            com.tencent.mm.smiley.p r5 = com.tencent.mm.smiley.m.f193309a
            com.tencent.mm.smiley.p0 r6 = new com.tencent.mm.smiley.p0
            r6.<init>(r3, r9, r4, r0)
            r5.a(r9, r2, r1, r6)
            int r0 = r4.f310116d
            if (r0 >= r1) goto Ldb
            r3.append(r9, r0, r1)
        Ldb:
            java.lang.String r9 = r3.toString()
        Ldf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.g.d(java.lang.String):java.lang.String");
    }

    public void e(android.text.Spannable spannable, android.graphics.drawable.Drawable drawable, int i17, int i18, boolean z17) {
        if (spannable == null || drawable == null) {
            return;
        }
        int length = spannable.length();
        if (length == 0 || i17 < 0 || i18 < 0 || i18 < i17 || i17 > length || i18 > length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiHelper", "[-] bad args, skip setSpanImg. start:%s, end:%s, len:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(length));
        } else {
            spannable.setSpan(new com.tencent.mm.smiley.r0(drawable, z17, i17, i18), i17, i18, 33);
        }
    }
}
