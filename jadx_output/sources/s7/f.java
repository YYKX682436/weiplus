package s7;

/* loaded from: classes16.dex */
public class f extends s7.p3 {
    public f(java.lang.String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public final int r(int i17) {
        if (i17 >= 48 && i17 <= 57) {
            return i17 - 48;
        }
        int i18 = 65;
        if (i17 < 65 || i17 > 70) {
            i18 = 97;
            if (i17 < 97 || i17 > 102) {
                return -1;
            }
        }
        return (i17 - i18) + 10;
    }

    public java.lang.String s() {
        int r17;
        if (f()) {
            return null;
        }
        char charAt = this.f403770a.charAt(this.f403771b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f403771b++;
        int intValue = h().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = h().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = h().intValue();
                    } else {
                        int r18 = r(intValue);
                        if (r18 != -1) {
                            for (int i17 = 1; i17 <= 5 && (r17 = r((intValue = h().intValue()))) != -1; i17++) {
                                r18 = (r18 * 16) + r17;
                            }
                            sb6.append((char) r18);
                        }
                    }
                }
            }
            sb6.append((char) intValue);
            intValue = h().intValue();
        }
        return sb6.toString();
    }

    public java.lang.String t() {
        int i17;
        int i18;
        boolean f17 = f();
        java.lang.String str = this.f403770a;
        if (f17) {
            i18 = this.f403771b;
        } else {
            int i19 = this.f403771b;
            int charAt = str.charAt(i19);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i17 = i19;
            } else {
                int a17 = a();
                while (true) {
                    if ((a17 < 65 || a17 > 90) && ((a17 < 97 || a17 > 122) && !((a17 >= 48 && a17 <= 57) || a17 == 45 || a17 == 95))) {
                        break;
                    }
                    a17 = a();
                }
                i17 = this.f403771b;
            }
            this.f403771b = i19;
            i18 = i17;
        }
        int i27 = this.f403771b;
        if (i18 == i27) {
            return null;
        }
        java.lang.String substring = str.substring(i27, i18);
        this.f403771b = i18;
        return substring;
    }

    public java.lang.String u() {
        if (f()) {
            return null;
        }
        int i17 = this.f403771b;
        java.lang.String str = this.f403770a;
        int charAt = str.charAt(i17);
        int i18 = i17;
        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33) {
            if (charAt == 10 || charAt == 13) {
                break;
            }
            if (!g(charAt)) {
                i18 = this.f403771b + 1;
            }
            charAt = a();
        }
        if (this.f403771b > i17) {
            return str.substring(i17, i18);
        }
        this.f403771b = i17;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0485, code lost:
    
        r2 = r4.f403840a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0487, code lost:
    
        if (r2 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x048f, code lost:
    
        if (((java.util.ArrayList) r2).isEmpty() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0492, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0495, code lost:
    
        if (r3 != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0497, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x049a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0494, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0182. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0431  */
    /* JADX WARN: Type inference failed for: r11v18, types: [s7.p] */
    /* JADX WARN: Type inference failed for: r11v19, types: [s7.j] */
    /* JADX WARN: Type inference failed for: r11v32, types: [s7.j] */
    /* JADX WARN: Type inference failed for: r11v33, types: [s7.j] */
    /* JADX WARN: Type inference failed for: r11v34, types: [s7.j] */
    /* JADX WARN: Type inference failed for: r11v35, types: [s7.j] */
    /* JADX WARN: Type inference failed for: r11v36, types: [s7.o] */
    /* JADX WARN: Type inference failed for: r11v37, types: [s7.o] */
    /* JADX WARN: Type inference failed for: r11v38, types: [s7.k] */
    /* JADX WARN: Type inference failed for: r11v40, types: [s7.m] */
    /* JADX WARN: Type inference failed for: r11v46, types: [s7.n] */
    /* JADX WARN: Type inference failed for: r11v50, types: [s7.n] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String, s7.b] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List v() {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f.v():java.util.List");
    }
}
