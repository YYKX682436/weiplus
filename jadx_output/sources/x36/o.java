package x36;

/* loaded from: classes16.dex */
public class o implements java.io.Serializable, java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public transient int f451697d;

    /* renamed from: e, reason: collision with root package name */
    public transient java.lang.String f451698e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f451699f;

    /* renamed from: h, reason: collision with root package name */
    public static final x36.n f451696h = new x36.n(null);

    /* renamed from: g, reason: collision with root package name */
    public static final x36.o f451695g = new x36.o(new byte[0]);

    public o(byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f451699f = data;
    }

    public static final x36.o i(java.lang.String decodeBase64) {
        int i17;
        int i18;
        char charAt;
        kotlin.jvm.internal.o.g(decodeBase64, "$this$decodeBase64");
        byte[] bArr = x36.a.f451652a;
        int length = decodeBase64.length();
        while (length > 0 && ((charAt = decodeBase64.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length = i18;
        }
        int i19 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i19];
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (true) {
            if (i27 < length) {
                char charAt2 = decodeBase64.charAt(i27);
                if ('A' <= charAt2 && 'Z' >= charAt2) {
                    i17 = charAt2 - 'A';
                } else if ('a' <= charAt2 && 'z' >= charAt2) {
                    i17 = charAt2 - 'G';
                } else if ('0' <= charAt2 && '9' >= charAt2) {
                    i17 = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i17 = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i17 = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        break;
                    }
                    i27++;
                }
                i29 = (i29 << 6) | i17;
                i28++;
                if (i28 % 4 == 0) {
                    int i38 = i37 + 1;
                    bArr2[i37] = (byte) (i29 >> 16);
                    int i39 = i38 + 1;
                    bArr2[i38] = (byte) (i29 >> 8);
                    bArr2[i39] = (byte) i29;
                    i37 = i39 + 1;
                }
                i27++;
            } else {
                int i47 = i28 % 4;
                if (i47 != 1) {
                    if (i47 == 2) {
                        bArr2[i37] = (byte) ((i29 << 12) >> 16);
                        i37++;
                    } else if (i47 == 3) {
                        int i48 = i29 << 6;
                        int i49 = i37 + 1;
                        bArr2[i37] = (byte) (i48 >> 16);
                        i37 = i49 + 1;
                        bArr2[i49] = (byte) (i48 >> 8);
                    }
                    if (i37 != i19) {
                        bArr2 = java.util.Arrays.copyOf(bArr2, i37);
                        kotlin.jvm.internal.o.f(bArr2, "java.util.Arrays.copyOf(this, newSize)");
                    }
                }
            }
        }
        bArr2 = null;
        if (bArr2 != null) {
            return new x36.o(bArr2);
        }
        return null;
    }

    public static final x36.o j(java.lang.String decodeHex) {
        kotlin.jvm.internal.o.g(decodeHex, "$this$decodeHex");
        if (!(decodeHex.length() % 2 == 0)) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(decodeHex).toString());
        }
        int length = decodeHex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) ((y36.b.a(decodeHex.charAt(i18)) << 4) + y36.b.a(decodeHex.charAt(i18 + 1)));
        }
        return new x36.o(bArr);
    }

    public static final x36.o p(byte... data) {
        kotlin.jvm.internal.o.g(data, "data");
        byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new x36.o(copyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            x36.o r8 = (x36.o) r8
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.g(r8, r0)
            int r0 = r7.l()
            int r1 = r8.l()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.o(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.o(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.o.compareTo(java.lang.Object):int");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x36.o) {
            x36.o oVar = (x36.o) obj;
            int l17 = oVar.l();
            byte[] bArr = this.f451699f;
            if (l17 == bArr.length && oVar.s(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String h() {
        byte[] map = x36.a.f451652a;
        byte[] encodeBase64 = this.f451699f;
        kotlin.jvm.internal.o.g(encodeBase64, "$this$encodeBase64");
        kotlin.jvm.internal.o.g(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = i17 + 1;
            byte b17 = encodeBase64[i17];
            int i27 = i19 + 1;
            byte b18 = encodeBase64[i19];
            int i28 = i27 + 1;
            byte b19 = encodeBase64[i27];
            int i29 = i18 + 1;
            bArr[i18] = map[(b17 & 255) >> 2];
            int i37 = i29 + 1;
            bArr[i29] = map[((b17 & 3) << 4) | ((b18 & 255) >> 4)];
            int i38 = i37 + 1;
            bArr[i37] = map[((b18 & 15) << 2) | ((b19 & 255) >> 6)];
            i18 = i38 + 1;
            bArr[i38] = map[b19 & 63];
            i17 = i28;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b27 = encodeBase64[i17];
            int i39 = i18 + 1;
            bArr[i18] = map[(b27 & 255) >> 2];
            int i47 = i39 + 1;
            bArr[i39] = map[(b27 & 3) << 4];
            byte b28 = (byte) 61;
            bArr[i47] = b28;
            bArr[i47 + 1] = b28;
        } else if (length2 == 2) {
            int i48 = i17 + 1;
            byte b29 = encodeBase64[i17];
            byte b37 = encodeBase64[i48];
            int i49 = i18 + 1;
            bArr[i18] = map[(b29 & 255) >> 2];
            int i57 = i49 + 1;
            bArr[i49] = map[((b29 & 3) << 4) | ((b37 & 255) >> 4)];
            bArr[i57] = map[(b37 & 15) << 2];
            bArr[i57 + 1] = (byte) 61;
        }
        return new java.lang.String(bArr, r26.c.f368865a);
    }

    public int hashCode() {
        int i17 = this.f451697d;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = java.util.Arrays.hashCode(this.f451699f);
        this.f451697d = hashCode;
        return hashCode;
    }

    public x36.o k(java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f451699f, 0, l());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.o.f(digestBytes, "digestBytes");
        return new x36.o(digestBytes);
    }

    public int l() {
        return this.f451699f.length;
    }

    public java.lang.String m() {
        byte[] bArr = this.f451699f;
        char[] cArr = new char[bArr.length * 2];
        int i17 = 0;
        for (byte b17 : bArr) {
            int i18 = i17 + 1;
            char[] cArr2 = y36.b.f459271a;
            cArr[i17] = cArr2[(b17 >> 4) & 15];
            i17 = i18 + 1;
            cArr[i18] = cArr2[b17 & 15];
        }
        return new java.lang.String(cArr);
    }

    public byte[] n() {
        return this.f451699f;
    }

    public byte o(int i17) {
        return this.f451699f[i17];
    }

    public boolean r(int i17, x36.o other, int i18, int i19) {
        kotlin.jvm.internal.o.g(other, "other");
        return other.s(i18, this.f451699f, i17, i19);
    }

    public boolean s(int i17, byte[] other, int i18, int i19) {
        kotlin.jvm.internal.o.g(other, "other");
        if (i17 >= 0) {
            byte[] bArr = this.f451699f;
            if (i17 <= bArr.length - i19 && i18 >= 0 && i18 <= other.length - i19 && x36.b.a(bArr, i17, other, i18, i19)) {
                return true;
            }
        }
        return false;
    }

    public x36.o t() {
        byte b17;
        int i17 = 0;
        while (true) {
            byte[] bArr = this.f451699f;
            if (i17 >= bArr.length) {
                return this;
            }
            byte b18 = bArr[i17];
            byte b19 = (byte) 65;
            if (b18 >= b19 && b18 <= (b17 = (byte) 90)) {
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i17] = (byte) (b18 + 32);
                for (int i18 = i17 + 1; i18 < copyOf.length; i18++) {
                    byte b27 = copyOf[i18];
                    if (b27 >= b19 && b27 <= b17) {
                        copyOf[i18] = (byte) (b27 + 32);
                    }
                }
                return new x36.o(copyOf);
            }
            i17++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016b, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015a, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e5, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x011e, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0115, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0103, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00f4, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00e3, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00a5, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x009a, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x008b, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e8, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b0, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a1, code lost:
    
        if (r6 == 64) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
    
        if (r6 == 64) goto L212;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.o.toString():java.lang.String");
    }

    public java.lang.String u() {
        java.lang.String str = this.f451698e;
        if (str != null) {
            return str;
        }
        byte[] toUtf8String = n();
        kotlin.jvm.internal.o.g(toUtf8String, "$this$toUtf8String");
        java.lang.String str2 = new java.lang.String(toUtf8String, r26.c.f368865a);
        this.f451698e = str2;
        return str2;
    }

    public void w(x36.k buffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        buffer.A(this.f451699f, i17, i18);
    }
}
