package p16;

/* loaded from: classes16.dex */
public class f0 extends p16.g {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f351281e;

    /* renamed from: f, reason: collision with root package name */
    public int f351282f = 0;

    public f0(byte[] bArr) {
        this.f351281e = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p16.g) || size() != ((p16.g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p16.f0) {
            return t((p16.f0) obj, 0, size());
        }
        if (obj instanceof p16.o0) {
            return obj.equals(this);
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 49);
        sb6.append("Has a new type of ByteString been created? Found ");
        sb6.append(valueOf);
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    @Override // p16.g
    public void h(byte[] bArr, int i17, int i18, int i19) {
        java.lang.System.arraycopy(this.f351281e, i17, bArr, i18, i19);
    }

    public int hashCode() {
        int i17 = this.f351282f;
        if (i17 == 0) {
            int size = size();
            i17 = n(size, 0, size);
            if (i17 == 0) {
                i17 = 1;
            }
            this.f351282f = i17;
        }
        return i17;
    }

    @Override // p16.g
    public int j() {
        return 0;
    }

    @Override // p16.g
    public boolean k() {
        return true;
    }

    @Override // p16.g
    public boolean l() {
        byte[] bArr = this.f351281e;
        return p16.b1.b(bArr, 0, bArr.length + 0) == 0;
    }

    @Override // p16.g
    public int n(int i17, int i18, int i19) {
        int u17 = u() + i18;
        for (int i27 = u17; i27 < u17 + i19; i27++) {
            i17 = (i17 * 31) + this.f351281e[i27];
        }
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r1[r11] > (-65)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0095, code lost:
    
        if (r1[r11] > (-65)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1[r11] > (-65)) goto L62;
     */
    @Override // p16.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int o(int r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r11
            byte[] r1 = r9.f351281e
            if (r10 == 0) goto L9c
            if (r11 < r12) goto Lb
            goto La0
        Lb:
            byte r2 = (byte) r10
            r3 = -65
            r4 = -1
            r5 = -32
            if (r2 >= r5) goto L1f
            r10 = -62
            if (r2 < r10) goto L9a
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L1f:
            r6 = -16
            r7 = -12
            if (r2 >= r6) goto L54
            int r10 = r10 >> 8
            int r10 = ~r10
            byte r10 = (byte) r10
            if (r10 != 0) goto L3f
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r10 < r12) goto L3c
            if (r2 > r7) goto L9a
            if (r11 <= r3) goto L37
            goto L9a
        L37:
            int r10 = r11 << 8
        L39:
            r10 = r10 ^ r2
            goto La0
        L3c:
            r8 = r11
            r11 = r10
            r10 = r8
        L3f:
            if (r10 > r3) goto L9a
            r0 = -96
            if (r2 != r5) goto L47
            if (r10 < r0) goto L9a
        L47:
            r5 = -19
            if (r2 != r5) goto L4d
            if (r10 >= r0) goto L9a
        L4d:
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L54:
            int r5 = r10 >> 8
            int r5 = ~r5
            byte r5 = (byte) r5
            if (r5 != 0) goto L6a
            int r10 = r11 + 1
            r5 = r1[r11]
            if (r10 < r12) goto L68
            if (r2 > r7) goto L9a
            if (r5 <= r3) goto L65
            goto L9a
        L65:
            int r10 = r5 << 8
            goto L39
        L68:
            r11 = r10
            goto L6d
        L6a:
            int r10 = r10 >> 16
            byte r0 = (byte) r10
        L6d:
            if (r0 != 0) goto L84
            int r10 = r11 + 1
            r0 = r1[r11]
            if (r10 < r12) goto L83
            if (r2 > r7) goto L9a
            if (r5 > r3) goto L9a
            if (r0 <= r3) goto L7c
            goto L9a
        L7c:
            int r10 = r5 << 8
            r10 = r10 ^ r2
            int r11 = r0 << 16
            r10 = r10 ^ r11
            goto La0
        L83:
            r11 = r10
        L84:
            if (r5 > r3) goto L9a
            int r10 = r2 << 28
            int r5 = r5 + 112
            int r10 = r10 + r5
            int r10 = r10 >> 30
            if (r10 != 0) goto L9a
            if (r0 > r3) goto L9a
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L98:
            r11 = r10
            goto L9c
        L9a:
            r10 = r4
            goto La0
        L9c:
            int r10 = p16.b1.b(r1, r11, r12)
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p16.f0.o(int, int, int):int");
    }

    @Override // p16.g
    public int p() {
        return this.f351282f;
    }

    @Override // p16.g
    public java.lang.String r(java.lang.String str) {
        return new java.lang.String(this.f351281e, u(), size(), str);
    }

    @Override // p16.g
    public void s(java.io.OutputStream outputStream, int i17, int i18) {
        outputStream.write(this.f351281e, u() + i17, i18);
    }

    @Override // p16.g
    public int size() {
        return this.f351281e.length;
    }

    public boolean t(p16.f0 f0Var, int i17, int i18) {
        if (i18 > f0Var.size()) {
            int size = size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(i18);
            sb6.append(size);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i17 + i18 <= f0Var.size()) {
            int u17 = u() + i18;
            int u18 = u();
            int u19 = f0Var.u() + i17;
            while (u18 < u17) {
                if (this.f351281e[u18] != f0Var.f351281e[u19]) {
                    return false;
                }
                u18++;
                u19++;
            }
            return true;
        }
        int size2 = f0Var.size();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(59);
        sb7.append("Ran off end of other: ");
        sb7.append(i17);
        sb7.append(", ");
        sb7.append(i18);
        sb7.append(", ");
        sb7.append(size2);
        throw new java.lang.IllegalArgumentException(sb7.toString());
    }

    public int u() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public p16.e iterator() {
        return new p16.e0(this, null);
    }
}
