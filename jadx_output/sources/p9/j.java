package p9;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f352845b = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f352846c = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f352847a = new java.lang.StringBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    public static void a(java.lang.String str, p9.h hVar, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list, java.util.List list2) {
        char c17;
        int i17;
        int i18;
        ?? size;
        int i19 = hVar.f352840b;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = hVar.f352839a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i27 = 0;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c17 = 3;
            }
            c17 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c17 = 6;
            }
            c17 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c17 = 1;
            }
            c17 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c17 = 2;
            }
            c17 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals(org.chromium.base.BaseSwitches.V)) {
                c17 = 5;
            }
            c17 = 65535;
        } else {
            if (str2.equals("u")) {
                c17 = 4;
            }
            c17 = 65535;
        }
        switch (c17) {
            case 0:
            case 2:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i19, length, 33);
                break;
            case 3:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i19, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i19, length, 33);
                break;
            default:
                return;
        }
        list2.clear();
        int size2 = list.size();
        int i28 = 0;
        while (i28 < size2) {
            p9.d dVar = (p9.d) list.get(i28);
            if (dVar.f352811a.isEmpty() && dVar.f352812b.isEmpty() && dVar.f352813c.isEmpty() && dVar.f352814d.isEmpty()) {
                size = str2.isEmpty();
            } else {
                int a17 = p9.d.a(p9.d.a(p9.d.a(i27, dVar.f352811a, str, 1073741824), dVar.f352812b, str2, 2), dVar.f352814d, hVar.f352841c, 4);
                size = (a17 == -1 || !java.util.Arrays.asList(hVar.f352842d).containsAll(dVar.f352813c)) ? 0 : (dVar.f352813c.size() * 4) + a17;
            }
            if (size > 0) {
                list2.add(new p9.i(size, dVar));
            }
            i28++;
            i27 = 0;
        }
        java.util.Collections.sort(list2);
        int size3 = list2.size();
        for (int i29 = 0; i29 < size3; i29++) {
            p9.d dVar2 = ((p9.i) list2.get(i29)).f352844e;
            if (dVar2 != null) {
                int i37 = dVar2.f352822l;
                if (((i37 == -1 && dVar2.f352823m == -1) ? -1 : (i37 == 1 ? (char) 1 : (char) 0) | (dVar2.f352823m == 1 ? (char) 2 : (char) 0)) != -1) {
                    int i38 = dVar2.f352822l;
                    int i39 = (i38 == -1 && dVar2.f352823m == -1) ? -1 : (i38 == 1 ? 1 : 0) | (dVar2.f352823m == 1 ? 2 : 0);
                    i17 = 33;
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(i39), i19, length, 33);
                } else {
                    i17 = 33;
                }
                if (dVar2.f352820j == 1) {
                    spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i19, length, i17);
                }
                if (dVar2.f352821k == 1) {
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i19, length, i17);
                }
                if (dVar2.f352817g) {
                    if (!dVar2.f352817g) {
                        throw new java.lang.IllegalStateException("Font color not defined");
                    }
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(dVar2.f352816f), i19, length, i17);
                }
                if (dVar2.f352819i) {
                    if (!dVar2.f352819i) {
                        throw new java.lang.IllegalStateException("Background color not defined.");
                    }
                    spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(dVar2.f352818h), i19, length, 33);
                }
                if (dVar2.f352815e != null) {
                    i18 = 33;
                    spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(dVar2.f352815e), i19, length, 33);
                } else {
                    i18 = 33;
                }
                int i47 = dVar2.f352824n;
                if (i47 == 1) {
                    spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) 0.0f, true), i19, length, i18);
                } else if (i47 == 2) {
                    spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(0.0f), i19, length, i18);
                } else if (i47 == 3) {
                    spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(0.0f), i19, length, i18);
                }
            }
        }
    }

    public static boolean b(java.lang.String str, java.util.regex.Matcher matcher, t9.p pVar, p9.f fVar, java.lang.StringBuilder sb6, java.util.List list) {
        try {
            fVar.f352826a = p9.l.b(matcher.group(1));
            fVar.f352827b = p9.l.b(matcher.group(2));
            c(matcher.group(3), fVar);
            sb6.setLength(0);
            while (true) {
                java.lang.String d17 = pVar.d();
                if (android.text.TextUtils.isEmpty(d17)) {
                    d(str, sb6.toString(), fVar, list);
                    return true;
                }
                if (sb6.length() > 0) {
                    sb6.append("\n");
                }
                sb6.append(d17.trim());
            }
        } catch (java.lang.NumberFormatException unused) {
            matcher.group();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        if (r3.equals("middle") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r9, p9.f r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.j.c(java.lang.String, p9.f):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
    
        switch(r12) {
            case 0: goto L121;
            case 1: goto L120;
            case 2: goto L119;
            case 3: goto L118;
            default: goto L122;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a4, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a8, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ac, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01af, code lost:
    
        if (r9 != r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b1, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b4, code lost:
    
        r7 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r17, java.lang.String r18, p9.f r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.j.d(java.lang.String, java.lang.String, p9.f, java.util.List):void");
    }

    public static int e(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c17 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c17 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                return Integer.MIN_VALUE;
        }
    }
}
