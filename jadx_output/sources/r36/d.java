package r36;

/* loaded from: classes16.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final x36.m f369363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369364c;

    /* renamed from: d, reason: collision with root package name */
    public int f369365d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f369362a = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public r36.c[] f369366e = new r36.c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f369367f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f369368g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f369369h = 0;

    public d(int i17, x36.h0 h0Var) {
        this.f369364c = i17;
        this.f369365d = i17;
        this.f369363b = x36.v.b(h0Var);
    }

    public final int a(int i17) {
        int i18;
        int i19 = 0;
        if (i17 > 0) {
            int length = this.f369366e.length;
            while (true) {
                length--;
                i18 = this.f369367f;
                if (length < i18 || i17 <= 0) {
                    break;
                }
                int i27 = this.f369366e[length].f369356c;
                i17 -= i27;
                this.f369369h -= i27;
                this.f369368g--;
                i19++;
            }
            r36.c[] cVarArr = this.f369366e;
            java.lang.System.arraycopy(cVarArr, i18 + 1, cVarArr, i18 + 1 + i19, this.f369368g);
            this.f369367f += i19;
        }
        return i19;
    }

    public final x36.o b(int i17) {
        if (i17 >= 0 && i17 <= r36.f.f369388a.length - 1) {
            return r36.f.f369388a[i17].f369354a;
        }
        int length = this.f369367f + 1 + (i17 - r36.f.f369388a.length);
        if (length >= 0) {
            r36.c[] cVarArr = this.f369366e;
            if (length < cVarArr.length) {
                return cVarArr[length].f369354a;
            }
        }
        throw new java.io.IOException("Header index too large " + (i17 + 1));
    }

    public final void c(int i17, r36.c cVar) {
        ((java.util.ArrayList) this.f369362a).add(cVar);
        int i18 = cVar.f369356c;
        if (i17 != -1) {
            i18 -= this.f369366e[(this.f369367f + 1) + i17].f369356c;
        }
        int i19 = this.f369365d;
        if (i18 > i19) {
            java.util.Arrays.fill(this.f369366e, (java.lang.Object) null);
            this.f369367f = this.f369366e.length - 1;
            this.f369368g = 0;
            this.f369369h = 0;
            return;
        }
        int a17 = a((this.f369369h + i18) - i19);
        if (i17 == -1) {
            int i27 = this.f369368g + 1;
            r36.c[] cVarArr = this.f369366e;
            if (i27 > cVarArr.length) {
                r36.c[] cVarArr2 = new r36.c[cVarArr.length * 2];
                java.lang.System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f369367f = this.f369366e.length - 1;
                this.f369366e = cVarArr2;
            }
            int i28 = this.f369367f;
            this.f369367f = i28 - 1;
            this.f369366e[i28] = cVar;
            this.f369368g++;
        } else {
            this.f369366e[i17 + this.f369367f + 1 + i17 + a17] = cVar;
        }
        this.f369369h += i18;
    }

    public x36.o d() {
        int i17;
        x36.m mVar = this.f369363b;
        int readByte = ((x36.b0) mVar).readByte() & 255;
        boolean z17 = (readByte & 128) == 128;
        int e17 = e(readByte, 127);
        if (!z17) {
            return ((x36.b0) mVar).H(e17);
        }
        r36.j0 j0Var = r36.j0.f369431d;
        long j17 = e17;
        x36.b0 b0Var = (x36.b0) mVar;
        b0Var.c1(j17);
        byte[] k17 = b0Var.f451654d.k(j17);
        j0Var.getClass();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        r36.i0 i0Var = j0Var.f369432a;
        r36.i0 i0Var2 = i0Var;
        int i18 = 0;
        int i19 = 0;
        for (byte b17 : k17) {
            i18 = (i18 << 8) | (b17 & 255);
            i19 += 8;
            while (i19 >= 8) {
                int i27 = i19 - 8;
                i0Var2 = i0Var2.f369423a[(i18 >>> i27) & 255];
                if (i0Var2.f369423a == null) {
                    byteArrayOutputStream.write(i0Var2.f369424b);
                    i19 -= i0Var2.f369425c;
                    i0Var2 = i0Var;
                } else {
                    i19 = i27;
                }
            }
        }
        while (i19 > 0) {
            r36.i0 i0Var3 = i0Var2.f369423a[(i18 << (8 - i19)) & 255];
            if (i0Var3.f369423a != null || (i17 = i0Var3.f369425c) > i19) {
                break;
            }
            byteArrayOutputStream.write(i0Var3.f369424b);
            i19 -= i17;
            i0Var2 = i0Var;
        }
        return x36.o.p(byteArrayOutputStream.toByteArray());
    }

    public int e(int i17, int i18) {
        int i19 = i17 & i18;
        if (i19 < i18) {
            return i19;
        }
        int i27 = 0;
        while (true) {
            int readByte = ((x36.b0) this.f369363b).readByte() & 255;
            if ((readByte & 128) == 0) {
                return i18 + (readByte << i27);
            }
            i18 += (readByte & 127) << i27;
            i27 += 7;
        }
    }
}
