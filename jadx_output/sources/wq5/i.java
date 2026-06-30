package wq5;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Character f448711a = '&';

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Character f448712b = '\'';

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Character f448713c = '!';

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Character f448714d = '=';

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Character f448715e = '>';

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Character f448716f = '<';

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Character f448717g = '?';

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Character f448718h = '\"';

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Character f448719i = '/';

    public static java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int length = str.length();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (!(i17 < length)) {
                return sb6.toString();
            }
            int codePointAt = str.codePointAt(i17);
            i17 += java.lang.Character.charCount(codePointAt);
            int intValue = java.lang.Integer.valueOf(codePointAt).intValue();
            if (intValue == 34) {
                sb6.append("&quot;");
            } else if (intValue == 60) {
                sb6.append("&lt;");
            } else if (intValue == 62) {
                sb6.append("&gt;");
            } else if (intValue == 38) {
                sb6.append("&amp;");
            } else if (intValue != 39) {
                if ((!java.lang.Character.isISOControl(intValue) || intValue == 9 || intValue == 10 || intValue == 13) && ((intValue >= 32 && intValue <= 55295) || ((intValue >= 57344 && intValue <= 65533) || (intValue >= 65536 && intValue <= 1114111)))) {
                    z17 = false;
                }
                if (z17) {
                    sb6.append("&#x");
                    sb6.append(java.lang.Integer.toHexString(intValue));
                    sb6.append(';');
                } else {
                    sb6.appendCodePoint(intValue);
                }
            } else {
                sb6.append("&apos;");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0195, code lost:
    
        r13 = r17.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x019b, code lost:
    
        if ((r13 instanceof java.lang.String) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x019f, code lost:
    
        if (r20.f448723c == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01a8, code lost:
    
        if ("xsi:nil".equals(r14) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b1, code lost:
    
        if (java.lang.Boolean.parseBoolean((java.lang.String) r13) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b3, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01b5, code lost:
    
        r15 = r20.f448724d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01b7, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01bd, code lost:
    
        if (r15.isEmpty() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01c6, code lost:
    
        if ("xsi:type".equals(r14) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01c8, code lost:
    
        android.support.v4.media.f.a(r15.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01d0, code lost:
    
        if (r12 != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d2, code lost:
    
        r10 = "__attr__" + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01e0, code lost:
    
        if (r20.f448721a == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01e2, code lost:
    
        r13 = (java.lang.String) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01eb, code lost:
    
        r2.a(r10, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01e5, code lost:
    
        r13 = d((java.lang.String) r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f7, code lost:
    
        throw r17.f("Missing value");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00bd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x00e0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(wq5.k r17, wq5.e r18, java.lang.String r19, wq5.j r20) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.i.b(wq5.k, wq5.e, java.lang.String, wq5.j):boolean");
    }

    public static java.lang.Number c(java.lang.String str) {
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
        }
        if (str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str)) {
            try {
                try {
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
                    return (charAt == '-' && java.math.BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? java.lang.Double.valueOf(-0.0d) : bigDecimal;
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } catch (java.lang.NumberFormatException unused2) {
                java.lang.Double valueOf = java.lang.Double.valueOf(str);
                if (!valueOf.isNaN() && !valueOf.isInfinite()) {
                    return valueOf;
                }
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        }
        if (charAt == '0' && str.length() > 1) {
            char charAt2 = str.charAt(1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        } else if (charAt == '-' && str.length() > 2) {
            char charAt3 = str.charAt(1);
            char charAt4 = str.charAt(2);
            if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(str);
        return bigInteger.bitLength() <= 31 ? java.lang.Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? java.lang.Long.valueOf(bigInteger.longValue()) : bigInteger;
    }

    public static java.lang.Object d(java.lang.String str) {
        if ("".equals(str)) {
            return str;
        }
        if ("true".equalsIgnoreCase(str)) {
            return java.lang.Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return java.lang.Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(str)) {
            return wq5.e.f448701c;
        }
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            return str;
        }
        try {
            return c(str);
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    public static java.lang.String e(java.lang.Object obj, java.lang.String str, wq5.j jVar) {
        char c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!(obj instanceof wq5.e)) {
            if (obj != null && ((obj instanceof wq5.a) || obj.getClass().isArray())) {
                wq5.a aVar = obj.getClass().isArray() ? new wq5.a(obj) : (wq5.a) obj;
                int size = aVar.f448699d.size();
                for (int i17 = 0; i17 < size; i17++) {
                    sb6.append(e(aVar.e(i17), str == null ? "__array__" : str, jVar));
                }
                return sb6.toString();
            }
            java.lang.String a17 = obj == null ? "null" : a(obj.toString());
            if (str == null) {
                return "\"" + a17 + "\"";
            }
            if (a17.length() == 0) {
                return "<" + str + "/>";
            }
            return "<" + str + ">" + a17 + "</" + str + ">";
        }
        wq5.e eVar = (wq5.e) obj;
        char c18 = '<';
        if (str != null) {
            sb6.append('<');
            sb6.append(str);
            for (java.lang.String str2 : ((java.util.HashMap) eVar.f448702a).keySet()) {
                if (str2.startsWith("__attr__")) {
                    java.lang.String substring = str2.substring(8);
                    java.lang.Object d17 = eVar.d(str2);
                    if (d17 == null) {
                        d17 = "";
                    }
                    sb6.append(" ");
                    sb6.append(substring);
                    sb6.append(f448714d);
                    sb6.append(" \"");
                    sb6.append(a(d17.toString()));
                    sb6.append("\"");
                }
            }
            sb6.append('>');
        }
        for (java.lang.String str3 : ((java.util.HashMap) eVar.f448702a).keySet()) {
            if (!str3.startsWith("__attr__")) {
                java.lang.Object d18 = eVar.d(str3);
                if (d18 == null) {
                    d18 = "";
                } else if (d18.getClass().isArray()) {
                    d18 = new wq5.a(d18);
                }
                if (str3.equals(jVar.f448722b)) {
                    if (d18 instanceof wq5.a) {
                        wq5.a aVar2 = (wq5.a) d18;
                        int size2 = aVar2.f448699d.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            if (i18 > 0) {
                                sb6.append('\n');
                            }
                            sb6.append(a(aVar2.e(i18).toString()));
                        }
                    } else {
                        sb6.append(a(d18.toString()));
                    }
                } else if (d18 instanceof wq5.a) {
                    wq5.a aVar3 = (wq5.a) d18;
                    int size3 = aVar3.f448699d.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        java.lang.Object e17 = aVar3.e(i19);
                        if (e17 instanceof wq5.a) {
                            sb6.append(c18);
                            sb6.append(str3);
                            sb6.append('>');
                            sb6.append(e(e17, null, jVar));
                            sb6.append("</");
                            sb6.append(str3);
                            sb6.append('>');
                        } else {
                            sb6.append(e(e17, str3, jVar));
                        }
                        i19++;
                        c18 = '<';
                    }
                } else {
                    if ("".equals(d18)) {
                        c17 = '<';
                        sb6.append('<');
                        sb6.append(str3);
                        sb6.append("/>");
                    } else {
                        c17 = '<';
                        sb6.append(e(d18, str3, jVar));
                    }
                    c18 = c17;
                }
                c17 = '<';
                c18 = c17;
            }
        }
        if (str != null) {
            sb6.append("</");
            sb6.append(str);
            sb6.append('>');
        }
        return sb6.toString();
    }
}
