package jb;

/* loaded from: classes16.dex */
public class b implements java.io.Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f298640v = ")]}'\n".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.io.Reader f298641d;

    /* renamed from: o, reason: collision with root package name */
    public long f298649o;

    /* renamed from: p, reason: collision with root package name */
    public int f298650p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298651q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f298652r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String[] f298654t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f298655u;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298642e = false;

    /* renamed from: f, reason: collision with root package name */
    public final char[] f298643f = new char[1024];

    /* renamed from: g, reason: collision with root package name */
    public int f298644g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f298645h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f298646i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f298647m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f298648n = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f298653s = 0 + 1;

    static {
        com.google.gson.internal.t.f44824a = new jb.a();
    }

    public b(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.f298652r = iArr;
        iArr[0] = 6;
        this.f298654t = new java.lang.String[32];
        this.f298655u = new int[32];
        if (reader == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        this.f298641d = reader;
    }

    public java.lang.String A() {
        java.lang.String F;
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 14) {
            F = J();
        } else if (i17 == 12) {
            F = F('\'');
        } else {
            if (i17 != 13) {
                throw new java.lang.IllegalStateException("Expected a name but was " + K() + q());
            }
            F = F('\"');
        }
        this.f298648n = 0;
        this.f298654t[this.f298653s - 1] = F;
        return F;
    }

    public final int C(boolean z17) {
        int i17 = this.f298644g;
        int i18 = this.f298645h;
        while (true) {
            boolean z18 = true;
            if (i17 == i18) {
                this.f298644g = i17;
                if (!k(1)) {
                    if (!z17) {
                        return -1;
                    }
                    throw new java.io.EOFException("End of input" + q());
                }
                i17 = this.f298644g;
                i18 = this.f298645h;
            }
            int i19 = i17 + 1;
            char[] cArr = this.f298643f;
            char c17 = cArr[i17];
            if (c17 == '\n') {
                this.f298646i++;
                this.f298647m = i19;
            } else if (c17 != ' ' && c17 != '\r' && c17 != '\t') {
                if (c17 == '/') {
                    this.f298644g = i19;
                    if (i19 == i18) {
                        this.f298644g = i19 - 1;
                        boolean k17 = k(2);
                        this.f298644g++;
                        if (!k17) {
                            return c17;
                        }
                    }
                    c();
                    int i27 = this.f298644g;
                    char c18 = cArr[i27];
                    if (c18 == '*') {
                        this.f298644g = i27 + 1;
                        while (true) {
                            if (this.f298644g + 2 > this.f298645h && !k(2)) {
                                z18 = false;
                                break;
                            }
                            int i28 = this.f298644g;
                            if (cArr[i28] != '\n') {
                                for (int i29 = 0; i29 < 2; i29++) {
                                    if (cArr[this.f298644g + i29] != "*/".charAt(i29)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f298646i++;
                            this.f298647m = i28 + 1;
                            this.f298644g++;
                        }
                        if (!z18) {
                            R("Unterminated comment");
                            throw null;
                        }
                        i17 = this.f298644g + 2;
                        i18 = this.f298645h;
                    } else {
                        if (c18 != '/') {
                            return c17;
                        }
                        this.f298644g = i27 + 1;
                        P();
                        i17 = this.f298644g;
                        i18 = this.f298645h;
                    }
                } else {
                    if (c17 != '#') {
                        this.f298644g = i19;
                        return c17;
                    }
                    this.f298644g = i19;
                    c();
                    P();
                    i17 = this.f298644g;
                    i18 = this.f298645h;
                }
            }
            i17 = i19;
        }
    }

    public void D() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 != 7) {
            throw new java.lang.IllegalStateException("Expected null but was " + K() + q());
        }
        this.f298648n = 0;
        int[] iArr = this.f298655u;
        int i18 = this.f298653s - 1;
        iArr[i18] = iArr[i18] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f298644g = r8;
        r8 = (r8 - r3) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r8 + 1) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f298644g = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String F(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f298644g
            int r3 = r10.f298645h
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r10.f298643f
            if (r2 >= r4) goto L5d
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.f298644g = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L50
            r10.f298644g = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L41
            int r1 = r8 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L41:
            r1.append(r7, r3, r8)
            char r2 = r10.N()
            r1.append(r2)
            int r2 = r10.f298644g
            int r3 = r10.f298645h
            goto L6
        L50:
            r5 = 10
            if (r2 != r5) goto L5b
            int r2 = r10.f298646i
            int r2 = r2 + r6
            r10.f298646i = r2
            r10.f298647m = r8
        L5b:
            r2 = r8
            goto L8
        L5d:
            if (r1 != 0) goto L6d
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6d:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.f298644g = r2
            boolean r2 = r10.k(r6)
            if (r2 == 0) goto L7b
            goto L2
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.R(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.b.F(char):java.lang.String");
    }

    public java.lang.String I() {
        java.lang.String str;
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 10) {
            str = J();
        } else if (i17 == 8) {
            str = F('\'');
        } else if (i17 == 9) {
            str = F('\"');
        } else if (i17 == 11) {
            str = this.f298651q;
            this.f298651q = null;
        } else if (i17 == 15) {
            str = java.lang.Long.toString(this.f298649o);
        } else {
            if (i17 != 16) {
                throw new java.lang.IllegalStateException("Expected a string but was " + K() + q());
            }
            str = new java.lang.String(this.f298643f, this.f298644g, this.f298650p);
            this.f298644g += this.f298650p;
        }
        this.f298648n = 0;
        int[] iArr = this.f298655u;
        int i18 = this.f298653s - 1;
        iArr[i18] = iArr[i18] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f298644g
            int r4 = r3 + r2
            int r5 = r7.f298645h
            char[] r6 = r7.f298643f
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.k(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f298644g
            r0.append(r6, r3, r2)
            int r3 = r7.f298644g
            int r3 = r3 + r2
            r7.f298644g = r3
            r2 = 1
            boolean r2 = r7.k(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f298644g
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f298644g
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f298644g
            int r2 = r2 + r1
            r7.f298644g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.b.J():java.lang.String");
    }

    public jb.c K() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        switch (i17) {
            case 1:
                return jb.c.BEGIN_OBJECT;
            case 2:
                return jb.c.END_OBJECT;
            case 3:
                return jb.c.BEGIN_ARRAY;
            case 4:
                return jb.c.END_ARRAY;
            case 5:
            case 6:
                return jb.c.BOOLEAN;
            case 7:
                return jb.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return jb.c.STRING;
            case 12:
            case 13:
            case 14:
                return jb.c.NAME;
            case 15:
            case 16:
                return jb.c.NUMBER;
            case 17:
                return jb.c.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public final void M(int i17) {
        int i18 = this.f298653s;
        int[] iArr = this.f298652r;
        if (i18 == iArr.length) {
            int i19 = i18 * 2;
            this.f298652r = java.util.Arrays.copyOf(iArr, i19);
            this.f298655u = java.util.Arrays.copyOf(this.f298655u, i19);
            this.f298654t = (java.lang.String[]) java.util.Arrays.copyOf(this.f298654t, i19);
        }
        int[] iArr2 = this.f298652r;
        int i27 = this.f298653s;
        this.f298653s = i27 + 1;
        iArr2[i27] = i17;
    }

    public final char N() {
        int i17;
        int i18;
        if (this.f298644g == this.f298645h && !k(1)) {
            R("Unterminated escape sequence");
            throw null;
        }
        int i19 = this.f298644g;
        int i27 = i19 + 1;
        this.f298644g = i27;
        char[] cArr = this.f298643f;
        char c17 = cArr[i19];
        if (c17 == '\n') {
            this.f298646i++;
            this.f298647m = i27;
        } else if (c17 != '\"' && c17 != '\'' && c17 != '/' && c17 != '\\') {
            if (c17 == 'b') {
                return '\b';
            }
            if (c17 == 'f') {
                return '\f';
            }
            if (c17 == 'n') {
                return '\n';
            }
            if (c17 == 'r') {
                return '\r';
            }
            if (c17 == 't') {
                return '\t';
            }
            if (c17 != 'u') {
                R("Invalid escape sequence");
                throw null;
            }
            if (i27 + 4 > this.f298645h && !k(4)) {
                R("Unterminated escape sequence");
                throw null;
            }
            int i28 = this.f298644g;
            int i29 = i28 + 4;
            char c18 = 0;
            while (i28 < i29) {
                char c19 = cArr[i28];
                char c27 = (char) (c18 << 4);
                if (c19 < '0' || c19 > '9') {
                    if (c19 >= 'a' && c19 <= 'f') {
                        i17 = c19 - 'a';
                    } else {
                        if (c19 < 'A' || c19 > 'F') {
                            throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(cArr, this.f298644g, 4)));
                        }
                        i17 = c19 - 'A';
                    }
                    i18 = i17 + 10;
                } else {
                    i18 = c19 - '0';
                }
                c18 = (char) (c27 + i18);
                i28++;
            }
            this.f298644g += 4;
            return c18;
        }
        return c17;
    }

    public final void O(char c17) {
        do {
            int i17 = this.f298644g;
            int i18 = this.f298645h;
            while (i17 < i18) {
                int i19 = i17 + 1;
                char c18 = this.f298643f[i17];
                if (c18 == c17) {
                    this.f298644g = i19;
                    return;
                }
                if (c18 == '\\') {
                    this.f298644g = i19;
                    N();
                    i17 = this.f298644g;
                    i18 = this.f298645h;
                } else {
                    if (c18 == '\n') {
                        this.f298646i++;
                        this.f298647m = i19;
                    }
                    i17 = i19;
                }
            }
            this.f298644g = i17;
        } while (k(1));
        R("Unterminated string");
        throw null;
    }

    public final void P() {
        char c17;
        do {
            if (this.f298644g >= this.f298645h && !k(1)) {
                return;
            }
            int i17 = this.f298644g;
            int i18 = i17 + 1;
            this.f298644g = i18;
            c17 = this.f298643f[i17];
            if (c17 == '\n') {
                this.f298646i++;
                this.f298647m = i18;
                return;
            }
        } while (c17 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009b. Please report as an issue. */
    public void Q() {
        int i17 = 0;
        do {
            int i18 = this.f298648n;
            if (i18 == 0) {
                i18 = f();
            }
            if (i18 == 3) {
                M(1);
            } else if (i18 == 1) {
                M(3);
            } else {
                if (i18 == 4) {
                    this.f298653s--;
                } else if (i18 == 2) {
                    this.f298653s--;
                } else {
                    if (i18 == 14 || i18 == 10) {
                        do {
                            int i19 = 0;
                            while (true) {
                                int i27 = this.f298644g + i19;
                                if (i27 < this.f298645h) {
                                    char c17 = this.f298643f[i27];
                                    if (c17 != '\t' && c17 != '\n' && c17 != '\f' && c17 != '\r' && c17 != ' ') {
                                        if (c17 != '#') {
                                            if (c17 != ',') {
                                                if (c17 != '/' && c17 != '=') {
                                                    if (c17 != '{' && c17 != '}' && c17 != ':') {
                                                        if (c17 != ';') {
                                                            switch (c17) {
                                                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
                                                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i19++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f298644g = i27;
                                }
                            }
                            c();
                            this.f298644g += i19;
                        } while (k(1));
                    } else if (i18 == 8 || i18 == 12) {
                        O('\'');
                    } else if (i18 == 9 || i18 == 13) {
                        O('\"');
                    } else if (i18 == 16) {
                        this.f298644g += this.f298650p;
                    }
                    this.f298648n = 0;
                }
                i17--;
                this.f298648n = 0;
            }
            i17++;
            this.f298648n = 0;
        } while (i17 != 0);
        int[] iArr = this.f298655u;
        int i28 = this.f298653s;
        int i29 = i28 - 1;
        iArr[i29] = iArr[i29] + 1;
        this.f298654t[i28 - 1] = "null";
    }

    public final java.io.IOException R(java.lang.String str) {
        throw new jb.e(str + q());
    }

    public void a() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 3) {
            M(1);
            this.f298655u[this.f298653s - 1] = 0;
            this.f298648n = 0;
        } else {
            throw new java.lang.IllegalStateException("Expected BEGIN_ARRAY but was " + K() + q());
        }
    }

    public void b() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 1) {
            M(3);
            this.f298648n = 0;
        } else {
            throw new java.lang.IllegalStateException("Expected BEGIN_OBJECT but was " + K() + q());
        }
    }

    public final void c() {
        if (this.f298642e) {
            return;
        }
        R("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f298648n = 0;
        this.f298652r[0] = 8;
        this.f298653s = 1;
        this.f298641d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020e, code lost:
    
        if (p(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0210, code lost:
    
        if (r9 != 2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0212, code lost:
    
        if (r15 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0218, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021a, code lost:
    
        if (r16 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021e, code lost:
    
        if (r10 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0220, code lost:
    
        if (r16 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0222, code lost:
    
        if (r16 == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0225, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0226, code lost:
    
        r20.f298649o = r10;
        r20.f298644g += r19;
        r4 = 15;
        r20.f298648n = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0233, code lost:
    
        if (r9 == 2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0236, code lost:
    
        if (r9 == 4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0239, code lost:
    
        if (r9 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023b, code lost:
    
        r20.f298650p = r19;
        r4 = 16;
        r20.f298648n = 16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d7  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f() {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.b.f():int");
    }

    public void i() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 != 4) {
            throw new java.lang.IllegalStateException("Expected END_ARRAY but was " + K() + q());
        }
        int i18 = this.f298653s - 1;
        this.f298653s = i18;
        int[] iArr = this.f298655u;
        int i19 = i18 - 1;
        iArr[i19] = iArr[i19] + 1;
        this.f298648n = 0;
    }

    public void j() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 != 2) {
            throw new java.lang.IllegalStateException("Expected END_OBJECT but was " + K() + q());
        }
        int i18 = this.f298653s - 1;
        this.f298653s = i18;
        this.f298654t[i18] = null;
        int[] iArr = this.f298655u;
        int i19 = i18 - 1;
        iArr[i19] = iArr[i19] + 1;
        this.f298648n = 0;
    }

    public final boolean k(int i17) {
        int i18;
        int i19;
        int i27 = this.f298647m;
        int i28 = this.f298644g;
        this.f298647m = i27 - i28;
        int i29 = this.f298645h;
        char[] cArr = this.f298643f;
        if (i29 != i28) {
            int i37 = i29 - i28;
            this.f298645h = i37;
            java.lang.System.arraycopy(cArr, i28, cArr, 0, i37);
        } else {
            this.f298645h = 0;
        }
        this.f298644g = 0;
        do {
            int i38 = this.f298645h;
            int read = this.f298641d.read(cArr, i38, cArr.length - i38);
            if (read == -1) {
                return false;
            }
            i18 = this.f298645h + read;
            this.f298645h = i18;
            if (this.f298646i == 0 && (i19 = this.f298647m) == 0 && i18 > 0 && cArr[0] == 65279) {
                this.f298644g++;
                this.f298647m = i19 + 1;
                i17++;
            }
        } while (i18 < i17);
        return true;
    }

    public boolean l() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        return (i17 == 2 || i17 == 4) ? false : true;
    }

    public final boolean p(char c17) {
        if (c17 == '\t' || c17 == '\n' || c17 == '\f' || c17 == '\r' || c17 == ' ') {
            return false;
        }
        if (c17 != '#') {
            if (c17 == ',') {
                return false;
            }
            if (c17 != '/' && c17 != '=') {
                if (c17 == '{' || c17 == '}' || c17 == ':') {
                    return false;
                }
                if (c17 != ';') {
                    switch (c17) {
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public java.lang.String q() {
        int i17 = this.f298646i + 1;
        int i18 = (this.f298644g - this.f298647m) + 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" at line ");
        sb6.append(i17);
        sb6.append(" column ");
        sb6.append(i18);
        sb6.append(" path ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("$");
        int i19 = this.f298653s;
        for (int i27 = 0; i27 < i19; i27++) {
            int i28 = this.f298652r[i27];
            if (i28 == 1 || i28 == 2) {
                sb7.append('[');
                sb7.append(this.f298655u[i27]);
                sb7.append(']');
            } else if (i28 == 3 || i28 == 4 || i28 == 5) {
                sb7.append('.');
                java.lang.String str = this.f298654t[i27];
                if (str != null) {
                    sb7.append(str);
                }
            }
        }
        sb6.append(sb7.toString());
        return sb6.toString();
    }

    public java.lang.String toString() {
        return jb.b.class.getSimpleName() + q();
    }

    public boolean v() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 5) {
            this.f298648n = 0;
            int[] iArr = this.f298655u;
            int i18 = this.f298653s - 1;
            iArr[i18] = iArr[i18] + 1;
            return true;
        }
        if (i17 != 6) {
            throw new java.lang.IllegalStateException("Expected a boolean but was " + K() + q());
        }
        this.f298648n = 0;
        int[] iArr2 = this.f298655u;
        int i19 = this.f298653s - 1;
        iArr2[i19] = iArr2[i19] + 1;
        return false;
    }

    public double w() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 15) {
            this.f298648n = 0;
            int[] iArr = this.f298655u;
            int i18 = this.f298653s - 1;
            iArr[i18] = iArr[i18] + 1;
            return this.f298649o;
        }
        if (i17 == 16) {
            this.f298651q = new java.lang.String(this.f298643f, this.f298644g, this.f298650p);
            this.f298644g += this.f298650p;
        } else if (i17 == 8 || i17 == 9) {
            this.f298651q = F(i17 == 8 ? '\'' : '\"');
        } else if (i17 == 10) {
            this.f298651q = J();
        } else if (i17 != 11) {
            throw new java.lang.IllegalStateException("Expected a double but was " + K() + q());
        }
        this.f298648n = 11;
        double parseDouble = java.lang.Double.parseDouble(this.f298651q);
        if (!this.f298642e && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
            throw new jb.e("JSON forbids NaN and infinities: " + parseDouble + q());
        }
        this.f298651q = null;
        this.f298648n = 0;
        int[] iArr2 = this.f298655u;
        int i19 = this.f298653s - 1;
        iArr2[i19] = iArr2[i19] + 1;
        return parseDouble;
    }

    public int x() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 15) {
            long j17 = this.f298649o;
            int i18 = (int) j17;
            if (j17 != i18) {
                throw new java.lang.NumberFormatException("Expected an int but was " + this.f298649o + q());
            }
            this.f298648n = 0;
            int[] iArr = this.f298655u;
            int i19 = this.f298653s - 1;
            iArr[i19] = iArr[i19] + 1;
            return i18;
        }
        if (i17 == 16) {
            this.f298651q = new java.lang.String(this.f298643f, this.f298644g, this.f298650p);
            this.f298644g += this.f298650p;
        } else {
            if (i17 != 8 && i17 != 9 && i17 != 10) {
                throw new java.lang.IllegalStateException("Expected an int but was " + K() + q());
            }
            if (i17 == 10) {
                this.f298651q = J();
            } else {
                this.f298651q = F(i17 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = java.lang.Integer.parseInt(this.f298651q);
                this.f298648n = 0;
                int[] iArr2 = this.f298655u;
                int i27 = this.f298653s - 1;
                iArr2[i27] = iArr2[i27] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.f298648n = 11;
        double parseDouble = java.lang.Double.parseDouble(this.f298651q);
        int i28 = (int) parseDouble;
        if (i28 != parseDouble) {
            throw new java.lang.NumberFormatException("Expected an int but was " + this.f298651q + q());
        }
        this.f298651q = null;
        this.f298648n = 0;
        int[] iArr3 = this.f298655u;
        int i29 = this.f298653s - 1;
        iArr3[i29] = iArr3[i29] + 1;
        return i28;
    }

    public long z() {
        int i17 = this.f298648n;
        if (i17 == 0) {
            i17 = f();
        }
        if (i17 == 15) {
            this.f298648n = 0;
            int[] iArr = this.f298655u;
            int i18 = this.f298653s - 1;
            iArr[i18] = iArr[i18] + 1;
            return this.f298649o;
        }
        if (i17 == 16) {
            this.f298651q = new java.lang.String(this.f298643f, this.f298644g, this.f298650p);
            this.f298644g += this.f298650p;
        } else {
            if (i17 != 8 && i17 != 9 && i17 != 10) {
                throw new java.lang.IllegalStateException("Expected a long but was " + K() + q());
            }
            if (i17 == 10) {
                this.f298651q = J();
            } else {
                this.f298651q = F(i17 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = java.lang.Long.parseLong(this.f298651q);
                this.f298648n = 0;
                int[] iArr2 = this.f298655u;
                int i19 = this.f298653s - 1;
                iArr2[i19] = iArr2[i19] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.f298648n = 11;
        double parseDouble = java.lang.Double.parseDouble(this.f298651q);
        long j17 = (long) parseDouble;
        if (j17 != parseDouble) {
            throw new java.lang.NumberFormatException("Expected a long but was " + this.f298651q + q());
        }
        this.f298651q = null;
        this.f298648n = 0;
        int[] iArr3 = this.f298655u;
        int i27 = this.f298653s - 1;
        iArr3[i27] = iArr3[i27] + 1;
        return j17;
    }
}
