package p9;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f352802c = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f352803a = new t9.p();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f352804b = new java.lang.StringBuilder();

    public static java.lang.String a(t9.p pVar, java.lang.StringBuilder sb6) {
        boolean z17 = false;
        sb6.setLength(0);
        int i17 = pVar.f416541b;
        int i18 = pVar.f416542c;
        while (i17 < i18 && !z17) {
            char c17 = (char) pVar.f416540a[i17];
            if ((c17 < 'A' || c17 > 'Z') && ((c17 < 'a' || c17 > 'z') && !((c17 >= '0' && c17 <= '9') || c17 == '#' || c17 == '-' || c17 == '.' || c17 == '_'))) {
                z17 = true;
            } else {
                i17++;
                sb6.append(c17);
            }
        }
        pVar.x(i17 - pVar.f416541b);
        return sb6.toString();
    }

    public static java.lang.String b(t9.p pVar, java.lang.StringBuilder sb6) {
        c(pVar);
        if (pVar.f416542c - pVar.f416541b == 0) {
            return null;
        }
        java.lang.String a17 = a(pVar, sb6);
        if (!"".equals(a17)) {
            return a17;
        }
        return "" + ((char) pVar.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[LOOP:1: B:3:0x0002->B:41:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(t9.p r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f416542c
            int r3 = r8.f416541b
            int r2 = r2 - r3
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L69
            byte[] r1 = r8.f416540a
            r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L27
            r2 = 10
            if (r1 == r2) goto L27
            r2 = 12
            if (r1 == r2) goto L27
            r2 = 13
            if (r1 == r2) goto L27
            r2 = 32
            if (r1 == r2) goto L27
            r1 = r3
            goto L2b
        L27:
            r8.x(r0)
            r1 = r0
        L2b:
            if (r1 != 0) goto L1
            int r1 = r8.f416541b
            int r2 = r8.f416542c
            byte[] r4 = r8.f416540a
            int r5 = r1 + 2
            if (r5 > r2) goto L63
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L63
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L63
        L47:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5b
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L59
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L59
            int r2 = r5 + 1
            r1 = r2
            goto L47
        L59:
            r1 = r5
            goto L47
        L5b:
            int r1 = r8.f416541b
            int r2 = r2 - r1
            r8.x(r2)
            r1 = r0
            goto L64
        L63:
            r1 = r3
        L64:
            if (r1 == 0) goto L67
            goto L1
        L67:
            r1 = r3
            goto L2
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.a.c(t9.p):void");
    }
}
