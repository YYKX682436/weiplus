package k9;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f305491h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f305492i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f305493j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f305494a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f305495b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Canvas f305496c;

    /* renamed from: d, reason: collision with root package name */
    public final k9.c f305497d;

    /* renamed from: e, reason: collision with root package name */
    public final k9.b f305498e;

    /* renamed from: f, reason: collision with root package name */
    public final k9.i f305499f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f305500g;

    public j(int i17, int i18) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f305494a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f305495b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f305496c = new android.graphics.Canvas();
        this.f305497d = new k9.c(719, 575, 0, 719, 0, 575);
        this.f305498e = new k9.b(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f305499f = new k9.i(i17, i18);
    }

    public static int[] a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i17 = 1; i17 < 16; i17++) {
            if (i17 < 8) {
                iArr[i17] = c(255, (i17 & 1) != 0 ? 255 : 0, (i17 & 2) != 0 ? 255 : 0, (i17 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i17] = c(255, (i17 & 1) != 0 ? 127 : 0, (i17 & 2) != 0 ? 127 : 0, (i17 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i17 = 0; i17 < 256; i17++) {
            if (i17 < 8) {
                iArr[i17] = c(63, (i17 & 1) != 0 ? 255 : 0, (i17 & 2) != 0 ? 255 : 0, (i17 & 4) == 0 ? 0 : 255);
            } else {
                int i18 = i17 & 136;
                if (i18 == 0) {
                    iArr[i17] = c(255, ((i17 & 1) != 0 ? 85 : 0) + ((i17 & 16) != 0 ? 170 : 0), ((i17 & 2) != 0 ? 85 : 0) + ((i17 & 32) != 0 ? 170 : 0), ((i17 & 4) == 0 ? 0 : 85) + ((i17 & 64) == 0 ? 0 : 170));
                } else if (i18 == 8) {
                    iArr[i17] = c(127, ((i17 & 1) != 0 ? 85 : 0) + ((i17 & 16) != 0 ? 170 : 0), ((i17 & 2) != 0 ? 85 : 0) + ((i17 & 32) != 0 ? 170 : 0), ((i17 & 4) == 0 ? 0 : 85) + ((i17 & 64) == 0 ? 0 : 170));
                } else if (i18 == 128) {
                    iArr[i17] = c(255, ((i17 & 1) != 0 ? 43 : 0) + 127 + ((i17 & 16) != 0 ? 85 : 0), ((i17 & 2) != 0 ? 43 : 0) + 127 + ((i17 & 32) != 0 ? 85 : 0), ((i17 & 4) == 0 ? 0 : 43) + 127 + ((i17 & 64) == 0 ? 0 : 85));
                } else if (i18 == 136) {
                    iArr[i17] = c(255, ((i17 & 1) != 0 ? 43 : 0) + ((i17 & 16) != 0 ? 85 : 0), ((i17 & 2) != 0 ? 43 : 0) + ((i17 & 32) != 0 ? 85 : 0), ((i17 & 4) == 0 ? 0 : 43) + ((i17 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int c(int i17, int i18, int i19, int i27) {
        return (i17 << 24) | (i18 << 16) | (i19 << 8) | i27;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8 A[LOOP:3: B:88:0x0155->B:98:0x01e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.j.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static k9.b e(t9.o oVar, int i17) {
        int d17;
        int d18;
        int i18;
        int i19;
        int i27 = 8;
        int d19 = oVar.d(8);
        oVar.f(8);
        int i28 = i17 - 2;
        int i29 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] a17 = a();
        int[] b17 = b();
        while (i28 > 0) {
            int d27 = oVar.d(i27);
            int d28 = oVar.d(i27);
            int i37 = i28 - 2;
            int[] iArr2 = (d28 & 128) != 0 ? iArr : (d28 & 64) != 0 ? a17 : b17;
            if ((d28 & 1) != 0) {
                i18 = oVar.d(i27);
                i19 = oVar.d(i27);
                d17 = oVar.d(i27);
                d18 = oVar.d(i27);
                i28 = i37 - 4;
            } else {
                int d29 = oVar.d(6) << 2;
                int d37 = oVar.d(4) << 4;
                i28 = i37 - 2;
                d17 = oVar.d(4) << 4;
                d18 = oVar.d(2) << 6;
                i18 = d29;
                i19 = d37;
            }
            if (i18 == 0) {
                i19 = i29;
                d17 = i19;
                d18 = 255;
            }
            int i38 = d19;
            double d38 = i18;
            double d39 = i19 - 128;
            double d47 = d17 - 128;
            int i39 = t9.d0.f416498a;
            iArr2[d27] = c((byte) (255 - (d18 & 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d38 + (1.402d * d39)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) ((d38 - (0.34414d * d47)) - (d39 * 0.71414d)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d38 + (d47 * 1.772d)), 255)));
            b17 = b17;
            i29 = 0;
            d19 = i38;
            i27 = 8;
        }
        return new k9.b(d19, iArr, a17, b17);
    }

    public static k9.d f(t9.o oVar) {
        byte[] bArr;
        int d17 = oVar.d(16);
        oVar.f(4);
        int d18 = oVar.d(2);
        boolean c17 = oVar.c();
        oVar.f(1);
        byte[] bArr2 = null;
        if (d18 == 1) {
            oVar.f(oVar.d(8) * 16);
        } else if (d18 == 0) {
            int d19 = oVar.d(16);
            int d27 = oVar.d(16);
            if (d19 > 0) {
                bArr2 = new byte[d19];
                t9.a.d(oVar.f416538c == 0);
                java.lang.System.arraycopy(oVar.f416536a, oVar.f416537b, bArr2, 0, d19);
                oVar.f416537b += d19;
                oVar.a();
            }
            if (d27 > 0) {
                bArr = new byte[d27];
                t9.a.d(oVar.f416538c == 0);
                java.lang.System.arraycopy(oVar.f416536a, oVar.f416537b, bArr, 0, d27);
                oVar.f416537b += d27;
                oVar.a();
                return new k9.d(d17, c17, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new k9.d(d17, c17, bArr2, bArr);
    }
}
