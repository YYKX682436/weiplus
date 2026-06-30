package z7;

/* loaded from: classes16.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Reader f470478a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f470479b;

    /* renamed from: c, reason: collision with root package name */
    public int f470480c;

    /* renamed from: d, reason: collision with root package name */
    public int f470481d;

    /* renamed from: e, reason: collision with root package name */
    public int f470482e;

    /* renamed from: f, reason: collision with root package name */
    public int f470483f;

    /* renamed from: g, reason: collision with root package name */
    public int f470484g;

    /* renamed from: h, reason: collision with root package name */
    public int f470485h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.StringBuilder f470486i;

    /* renamed from: j, reason: collision with root package name */
    public int f470487j;

    public j(java.lang.String str) {
        java.io.StringReader stringReader = new java.io.StringReader(str);
        int max = java.lang.Math.max(10, java.lang.Math.min(1024, str.length()));
        this.f470478a = stringReader;
        this.f470479b = new char[max];
        this.f470483f = 1;
        this.f470487j = -1;
    }

    public final java.lang.String a() {
        java.lang.String str;
        int i17 = this.f470485h == -1 ? this.f470481d : this.f470481d - 1;
        int length = this.f470486i.length();
        char[] cArr = this.f470479b;
        if (length > 0) {
            java.lang.StringBuilder sb6 = this.f470486i;
            int i18 = this.f470487j;
            sb6.append(cArr, i18, i17 - i18);
            str = this.f470486i.toString();
            this.f470486i.setLength(0);
        } else {
            int i19 = this.f470487j;
            str = new java.lang.String(cArr, i19, i17 - i19);
        }
        this.f470487j = -1;
        return str;
    }

    public final z7.n b(java.lang.String str) {
        int i17 = this.f470480c + this.f470481d;
        int i18 = i17 - this.f470484g;
        if (!(this.f470485h == -1)) {
            i17--;
        }
        return new z7.n(str, i17, this.f470483f, i18 - 1);
    }

    public final z7.n c(java.lang.String str) {
        if (this.f470485h == -1) {
            return b("Unexpected end of input");
        }
        return b("Expected " + str);
    }

    public final void d() {
        int i17 = this.f470481d;
        int i18 = this.f470482e;
        char[] cArr = this.f470479b;
        if (i17 == i18) {
            int i19 = this.f470487j;
            if (i19 != -1) {
                this.f470486i.append(cArr, i19, i18 - i19);
                this.f470487j = 0;
            }
            this.f470480c += this.f470482e;
            int read = this.f470478a.read(cArr, 0, cArr.length);
            this.f470482e = read;
            this.f470481d = 0;
            if (read == -1) {
                this.f470485h = -1;
                return;
            }
        }
        if (this.f470485h == 10) {
            this.f470483f++;
            this.f470484g = this.f470480c + this.f470481d;
        }
        int i27 = this.f470481d;
        this.f470481d = i27 + 1;
        this.f470485h = cArr[i27];
    }

    public final boolean e(char c17) {
        if (this.f470485h != c17) {
            return false;
        }
        d();
        return true;
    }

    public final boolean f() {
        int i17 = this.f470485h;
        if (!(i17 >= 48 && i17 <= 57)) {
            return false;
        }
        d();
        return true;
    }

    public final void g(char c17) {
        if (e(c17)) {
            return;
        }
        throw c("'" + c17 + "'");
    }

    public final java.lang.String h() {
        d();
        k();
        while (true) {
            int i17 = this.f470485h;
            if (i17 == 34) {
                java.lang.String a17 = a();
                d();
                return a17;
            }
            if (i17 == 92) {
                int i18 = i17 == -1 ? this.f470481d : this.f470481d - 1;
                java.lang.StringBuilder sb6 = this.f470486i;
                int i19 = this.f470487j;
                sb6.append(this.f470479b, i19, i18 - i19);
                this.f470487j = -1;
                d();
                int i27 = this.f470485h;
                if (i27 == 34 || i27 == 47 || i27 == 92) {
                    this.f470486i.append((char) i27);
                } else if (i27 == 98) {
                    this.f470486i.append('\b');
                } else if (i27 == 102) {
                    this.f470486i.append('\f');
                } else if (i27 == 110) {
                    this.f470486i.append('\n');
                } else if (i27 == 114) {
                    this.f470486i.append('\r');
                } else if (i27 == 116) {
                    this.f470486i.append('\t');
                } else {
                    if (i27 != 117) {
                        throw c("valid escape sequence");
                    }
                    char[] cArr = new char[4];
                    for (int i28 = 0; i28 < 4; i28++) {
                        d();
                        int i29 = this.f470485h;
                        if (!((i29 >= 48 && i29 <= 57) || (i29 >= 97 && i29 <= 102) || (i29 >= 65 && i29 <= 70))) {
                            throw c("hexadecimal digit");
                        }
                        cArr[i28] = (char) i29;
                    }
                    this.f470486i.append((char) java.lang.Integer.parseInt(new java.lang.String(cArr), 16));
                }
                d();
                k();
            } else {
                if (i17 < 32) {
                    throw c("valid string character");
                }
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (e('}') != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r8.f470485h != 34) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r3 = h();
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (e(':') == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        j();
        r0.h(r3, i());
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (e(',') != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (e('}') == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        throw c("',' or '}'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        throw c("':'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        throw c(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (e(']') != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        j();
        r0.h(i());
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (e(',') != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        if (e(']') == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        throw c("',' or ']'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
    
        if (r0 != 48) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010c, code lost:
    
        if (f() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (e('.') != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011c, code lost:
    
        if (f() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
    
        if (f() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        throw c("digit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        if (e('e') != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
    
        if (e('E') != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
    
        return new z7.e(a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013a, code lost:
    
        if (e('+') != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
    
        e('-');
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        if (f() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
    
        if (f() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015a, code lost:
    
        throw c("digit");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z7.l i() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.j.i():z7.l");
    }

    public final void j() {
        while (true) {
            int i17 = this.f470485h;
            if (!(i17 == 32 || i17 == 9 || i17 == 10 || i17 == 13)) {
                return;
            } else {
                d();
            }
        }
    }

    public final void k() {
        if (this.f470486i == null) {
            this.f470486i = new java.lang.StringBuilder();
        }
        this.f470487j = this.f470481d - 1;
    }
}
