package kt5;

/* loaded from: classes13.dex */
public abstract class e {
    public static int a(byte[] bArr, int i17, char c17) {
        int i18;
        int i19 = i17 - 1;
        while (true) {
            i18 = i19 + 1;
            if (i19 >= bArr.length) {
                return 0;
            }
            if (i18 == bArr.length || bArr[i18] == c17) {
                break;
            }
            i19 = i18;
        }
        return i18;
    }

    public static java.lang.String b(int i17) {
        byte[] c17;
        try {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            byte[] c18 = kt5.a.c(java.lang.String.format(locale, "/proc/%d/cmdline", java.lang.Integer.valueOf(i17)), 100);
            java.lang.String str = c18 != null ? new java.lang.String(c18, 0, a(c18, 0, (char) 0)) : "";
            if (!android.text.TextUtils.isEmpty(str) || (c17 = kt5.a.c(java.lang.String.format(locale, "/proc/%d/status", java.lang.Integer.valueOf(i17)), 150)) == null) {
                return str;
            }
            int a17 = a(c17, 7, '\n');
            return a17 == 0 ? "" : new java.lang.String(c17, 6, a17 - 6);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(4:2|3|4|5)|(3:10|(1:12)(2:14|(11:16|17|18|19|(1:21)(1:36)|22|23|24|25|26|(1:33)(2:30|31)))|13)|41|22|23|24|25|26|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kt5.d c(int r15) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = -1
            java.lang.String r4 = b(r15)     // Catch: java.lang.Exception -> L74
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = "/proc/%d/status"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L75
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> L75
            r7[r0] = r8     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            r6 = 150(0x96, float:2.1E-43)
            byte[] r5 = kt5.a.c(r5, r6)     // Catch: java.lang.Exception -> L75
            if (r5 == 0) goto L6f
            r6 = 7
            r7 = 10
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L2a
            goto L6f
        L2a:
            int r6 = r6 + r1
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            int r6 = r6 + r1
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            int r6 = r6 + r1
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L3c
            goto L45
        L3c:
            int r8 = r6 + 7
            int r6 = r6 + r1
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L46
        L45:
            goto L6f
        L46:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> L75
            int r10 = r6 - r8
            r9.<init>(r5, r8, r10)     // Catch: java.lang.Exception -> L75
            int r8 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L75
            int r6 = r6 + r1
            int r6 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L76
            if (r6 != 0) goto L5a
            r5 = r3
            goto L71
        L5a:
            int r6 = r6 + 6
            int r7 = r6 + 1
            r9 = 9
            int r7 = a(r5, r7, r9)     // Catch: java.lang.Exception -> L76
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> L76
            int r7 = r7 - r6
            r9.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L76
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L76
            goto L71
        L6f:
            r5 = r3
            r8 = r5
        L71:
            r12 = r4
            r13 = r5
            goto L78
        L74:
            r4 = r2
        L75:
            r8 = r3
        L76:
            r13 = r3
            r12 = r4
        L78:
            r11 = r8
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L98
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = "/proc/%d/attr/current"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L98
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> L98
            r1[r0] = r7     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = java.lang.String.format(r5, r6, r1)     // Catch: java.lang.Exception -> L98
            byte[] r0 = kt5.a.b(r0)     // Catch: java.lang.Exception -> L98
            r4.<init>(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Exception -> L98
            r14 = r0
            goto L99
        L98:
            r14 = r2
        L99:
            if (r12 == 0) goto La8
            if (r11 == r3) goto La8
            if (r13 != r3) goto La0
            goto La8
        La0:
            kt5.d r0 = new kt5.d
            r9 = r0
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kt5.e.c(int):kt5.d");
    }
}
