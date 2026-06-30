package x36;

/* loaded from: classes16.dex */
public final class e0 extends x36.o {

    /* renamed from: i, reason: collision with root package name */
    public final transient byte[][] f451669i;

    /* renamed from: m, reason: collision with root package name */
    public final transient int[] f451670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(byte[][] segments, int[] directory) {
        super(x36.o.f451695g.f451699f);
        kotlin.jvm.internal.o.g(segments, "segments");
        kotlin.jvm.internal.o.g(directory, "directory");
        this.f451669i = segments;
        this.f451670m = directory;
    }

    @Override // x36.o
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x36.o) {
            x36.o oVar = (x36.o) obj;
            if (oVar.l() == l() && r(0, oVar, 0, l())) {
                return true;
            }
        }
        return false;
    }

    @Override // x36.o
    public java.lang.String h() {
        return new x36.o(y()).h();
    }

    @Override // x36.o
    public int hashCode() {
        int i17 = this.f451697d;
        if (i17 != 0) {
            return i17;
        }
        byte[][] bArr = this.f451669i;
        int length = bArr.length;
        int i18 = 0;
        int i19 = 1;
        int i27 = 0;
        while (i18 < length) {
            int[] iArr = this.f451670m;
            int i28 = iArr[length + i18];
            int i29 = iArr[i18];
            byte[] bArr2 = bArr[i18];
            int i37 = (i29 - i27) + i28;
            while (i28 < i37) {
                i19 = (i19 * 31) + bArr2[i28];
                i28++;
            }
            i18++;
            i27 = i29;
        }
        this.f451697d = i19;
        return i19;
    }

    @Override // x36.o
    public x36.o k(java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f451669i;
        int length = bArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int[] iArr = this.f451670m;
            int i19 = iArr[length + i17];
            int i27 = iArr[i17];
            messageDigest.update(bArr[i17], i19, i27 - i18);
            i17++;
            i18 = i27;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.o.f(digestBytes, "digestBytes");
        return new x36.o(digestBytes);
    }

    @Override // x36.o
    public int l() {
        return this.f451670m[this.f451669i.length - 1];
    }

    @Override // x36.o
    public java.lang.String m() {
        return new x36.o(y()).m();
    }

    @Override // x36.o
    public byte[] n() {
        return y();
    }

    @Override // x36.o
    public byte o(int i17) {
        byte[][] bArr = this.f451669i;
        int length = bArr.length - 1;
        int[] iArr = this.f451670m;
        x36.b.b(iArr[length], i17, 1L);
        int a17 = y36.c.a(this, i17);
        return bArr[a17][(i17 - (a17 == 0 ? 0 : iArr[a17 - 1])) + iArr[bArr.length + a17]];
    }

    @Override // x36.o
    public boolean r(int i17, x36.o other, int i18, int i19) {
        kotlin.jvm.internal.o.g(other, "other");
        if (i17 < 0 || i17 > l() - i19) {
            return false;
        }
        int i27 = i19 + i17;
        int a17 = y36.c.a(this, i17);
        while (i17 < i27) {
            int[] iArr = this.f451670m;
            int i28 = a17 == 0 ? 0 : iArr[a17 - 1];
            int i29 = iArr[a17] - i28;
            byte[][] bArr = this.f451669i;
            int i37 = iArr[bArr.length + a17];
            int min = java.lang.Math.min(i27, i29 + i28) - i17;
            if (!other.s(i18, bArr[a17], i37 + (i17 - i28), min)) {
                return false;
            }
            i18 += min;
            i17 += min;
            a17++;
        }
        return true;
    }

    @Override // x36.o
    public boolean s(int i17, byte[] other, int i18, int i19) {
        kotlin.jvm.internal.o.g(other, "other");
        if (i17 < 0 || i17 > l() - i19 || i18 < 0 || i18 > other.length - i19) {
            return false;
        }
        int i27 = i19 + i17;
        int a17 = y36.c.a(this, i17);
        while (i17 < i27) {
            int[] iArr = this.f451670m;
            int i28 = a17 == 0 ? 0 : iArr[a17 - 1];
            int i29 = iArr[a17] - i28;
            byte[][] bArr = this.f451669i;
            int i37 = iArr[bArr.length + a17];
            int min = java.lang.Math.min(i27, i29 + i28) - i17;
            if (!x36.b.a(bArr[a17], i37 + (i17 - i28), other, i18, min)) {
                return false;
            }
            i18 += min;
            i17 += min;
            a17++;
        }
        return true;
    }

    @Override // x36.o
    public x36.o t() {
        return new x36.o(y()).t();
    }

    @Override // x36.o
    public java.lang.String toString() {
        return new x36.o(y()).toString();
    }

    @Override // x36.o
    public void w(x36.k buffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        int i19 = i17 + i18;
        int a17 = y36.c.a(this, i17);
        while (i17 < i19) {
            int[] iArr = this.f451670m;
            int i27 = a17 == 0 ? 0 : iArr[a17 - 1];
            int i28 = iArr[a17] - i27;
            byte[][] bArr = this.f451669i;
            int i29 = iArr[bArr.length + a17];
            int min = java.lang.Math.min(i19, i28 + i27) - i17;
            int i37 = i29 + (i17 - i27);
            x36.c0 c0Var = new x36.c0(bArr[a17], i37, i37 + min, true, false);
            x36.c0 c0Var2 = buffer.f451693d;
            if (c0Var2 == null) {
                c0Var.f451663g = c0Var;
                c0Var.f451662f = c0Var;
                buffer.f451693d = c0Var;
            } else {
                kotlin.jvm.internal.o.d(c0Var2);
                x36.c0 c0Var3 = c0Var2.f451663g;
                kotlin.jvm.internal.o.d(c0Var3);
                c0Var3.b(c0Var);
            }
            i17 += min;
            a17++;
        }
        buffer.f451694e += i18;
    }

    public byte[] y() {
        byte[] bArr = new byte[l()];
        byte[][] bArr2 = this.f451669i;
        int length = bArr2.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            int[] iArr = this.f451670m;
            int i27 = iArr[length + i17];
            int i28 = iArr[i17];
            int i29 = i28 - i18;
            kz5.v.h(bArr2[i17], bArr, i19, i27, i27 + i29);
            i19 += i29;
            i17++;
            i18 = i28;
        }
        return bArr;
    }
}
