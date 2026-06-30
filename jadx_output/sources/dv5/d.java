package dv5;

/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final dv5.g f244039a;

    public d(dv5.g gVar) {
        this.f244039a = gVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0035. Please report as an issue. */
    public void a(dv5.e eVar) {
        int i17;
        int i18;
        dv5.g gVar = this.f244039a;
        int i19 = 0;
        gVar.f244035a.f267023f = 0;
        gVar.f244036b = 0;
        while (true) {
            int i27 = gVar.f244036b;
            boolean z17 = true;
            if ((i27 < gVar.f244063c.length ? 1 : i19) == 0) {
                return;
            }
            int b17 = gVar.b();
            int i28 = b17 & 255;
            int i29 = (i28 == 0 || i28 == 255) ? b17 : i28;
            int d17 = dv5.b.d(i29);
            switch (d17) {
                case 1:
                    eVar.l(i27, i29, 0, 1, 0, 0L);
                case 2:
                    eVar.l(i27, i29, 0, 1, i27 + ((byte) ((b17 >> 8) & 255)), 0L);
                case 3:
                    eVar.l(i27, i29, 0, 1, 0, (b17 >> 8) & 255);
                case 4:
                    eVar.f(i27, i29, 0, 1, 0, (((b17 >> 12) & 15) << 28) >> 28, (b17 >> 8) & 15);
                case 5:
                    eVar.f(i27, i29, 0, 1, 0, 0L, (b17 >> 8) & 255);
                case 6:
                    eVar.k(i27, i29, 0, 1, 0, 0L, (b17 >> 8) & 15, (b17 >> 12) & 15);
                case 7:
                    eVar.l(i27, i29, 0, 1, i27 + ((short) gVar.b()), (b17 >> 8) & 255);
                case 8:
                    eVar.f(i27, i29, gVar.b(), dv5.b.e(i29), 0, 0L, (b17 >> 8) & 255);
                case 9:
                    i17 = i19;
                    eVar.f(i27, i29, 0, 1, 0, ((short) gVar.b()) << (i29 != 21 ? '0' : (char) 16), (b17 >> 8) & 255);
                    i19 = i17;
                case 10:
                    eVar.f(i27, i29, 0, 1, 0, (short) gVar.b(), (b17 >> 8) & 255);
                case 11:
                    eVar.f(i27, i29, 0, 1, i27 + ((short) gVar.b()), 0L, (b17 >> 8) & 255);
                case 12:
                    eVar.k(i27, i29, 0, 1, 0, (byte) ((r1 >> 8) & 255), (b17 >> 8) & 255, gVar.b() & 255);
                case 13:
                    eVar.k(i27, i29, gVar.b(), dv5.b.e(i29), 0, 0L, (b17 >> 8) & 15, (b17 >> 12) & 15);
                case 14:
                    eVar.k(i27, i29, 0, 1, 0, (short) gVar.b(), (b17 >> 8) & 15, (b17 >> 12) & 15);
                case 15:
                    eVar.k(i27, i29, 0, 1, i27 + ((short) gVar.b()), 0L, (b17 >> 8) & 15, (b17 >> 12) & 15);
                case 16:
                    eVar.k(i27, i29, 0, 1, 0, 0L, (b17 >> 8) & 255, gVar.b());
                case 17:
                    i17 = i19;
                    int b18 = gVar.b();
                    eVar.j(i27, i29, 0, 1, 0, 0L, (b17 >> 8) & 255, b18 & 255, (b18 >> 8) & 255);
                    i19 = i17;
                case 18:
                    eVar.l(i27, i29, 0, 1, i27 + gVar.c(), (b17 >> 8) & 255);
                case 19:
                    eVar.f(i27, i29, gVar.c(), dv5.b.e(i29), 0, 0L, (b17 >> 8) & 255);
                case 20:
                    eVar.f(i27, i29, 0, 1, 0, gVar.c(), (b17 >> 8) & 255);
                case 21:
                    i17 = i19;
                    int i37 = (b17 >> 8) & 255;
                    int c17 = i27 + gVar.c();
                    if (i29 == 43 || i29 == 44) {
                        gVar.f244035a.f(c17 + 1, i27);
                    }
                    eVar.f(i27, i29, 0, 1, c17, 0L, i37);
                    i19 = i17;
                    break;
                case 22:
                    eVar.k(i27, i29, 0, 1, 0, (b17 >> 8) & 255, gVar.b(), gVar.b());
                case 23:
                    int i38 = (b17 >> 8) & 15;
                    int i39 = (b17 >> 12) & 15;
                    int b19 = gVar.b();
                    int b27 = gVar.b();
                    int i47 = b27 & 15;
                    int i48 = (b27 >> 4) & 15;
                    int i49 = (b27 >> 8) & 15;
                    int i57 = (b27 >> 12) & 15;
                    int e17 = dv5.b.e(i29);
                    if (i39 == 0) {
                        eVar.l(i27, i29, b19, e17, 0, 0L);
                    } else if (i39 == 1) {
                        eVar.f(i27, i29, b19, e17, 0, 0L, i47);
                    } else if (i39 == 2) {
                        eVar.k(i27, i29, b19, e17, 0, 0L, i47, i48);
                    } else if (i39 == 3) {
                        eVar.j(i27, i29, b19, e17, 0, 0L, i47, i48, i49);
                    } else if (i39 == 4) {
                        eVar.c(i27, i29, b19, e17, 0, 0L, i47, i48, i49, i57);
                    } else {
                        if (i39 != 5) {
                            char[] cArr = new char[1];
                            cArr[i19] = java.lang.Character.forDigit(i39 & 15, 16);
                            throw new av5.z("bogus registerCount: ".concat(new java.lang.String(cArr)));
                        }
                        i17 = i19;
                        eVar.b(i27, i29, b19, e17, 0, 0L, i47, i48, i49, i57, i38);
                        i19 = i17;
                    }
                case 24:
                    eVar.h(i27, i29, gVar.b(), dv5.b.e(i29), 0, 0L, gVar.b(), (b17 >> 8) & 255);
                case 25:
                    eVar.f(i27, i29, 0, 1, 0, gVar.d(), (b17 >> 8) & 255);
                case 26:
                    if (i29 != 250) {
                        throw new java.lang.UnsupportedOperationException(java.lang.String.valueOf(i29));
                    }
                    int i58 = (b17 >> 8) & 15;
                    i18 = (b17 >> 12) & 15;
                    int b28 = gVar.b();
                    int b29 = gVar.b();
                    int i59 = b29 & 15;
                    int i66 = (b29 >> 4) & 15;
                    int i67 = (b29 >> 8) & 15;
                    int i68 = (b29 >> 12) & 15;
                    int b37 = gVar.b();
                    int e18 = dv5.b.e(i29);
                    if (i18 >= 1 && i18 <= 5) {
                        eVar.d(i27, i29, b28, e18, b37, java.util.Arrays.copyOfRange(new int[]{i59, i66, i67, i68, i58}, i19, i18));
                    }
                    break;
                case 27:
                    if (i29 != 251) {
                        throw new java.lang.UnsupportedOperationException(java.lang.String.valueOf(i29));
                    }
                    eVar.e(i27, i29, gVar.b(), dv5.b.e(i29), gVar.b(), (b17 >> 8) & 255, gVar.b());
                case 28:
                    int a17 = gVar.a();
                    int b38 = gVar.b();
                    int c18 = gVar.c();
                    int[] iArr = new int[b38];
                    for (int i69 = i19; i69 < b38; i69++) {
                        iArr[i69] = gVar.c() + a17;
                    }
                    eVar.g(i27, b17, c18, iArr);
                case 29:
                    int a18 = gVar.a();
                    int b39 = gVar.b();
                    int[] iArr2 = new int[b39];
                    int[] iArr3 = new int[b39];
                    for (int i76 = i19; i76 < b39; i76++) {
                        iArr2[i76] = gVar.c();
                    }
                    for (int i77 = i19; i77 < b39; i77++) {
                        iArr3[i77] = gVar.c() + a18;
                    }
                    eVar.i(i27, b17, iArr2, iArr3);
                case 30:
                    int b47 = gVar.b();
                    int c19 = gVar.c();
                    if (b47 == 1) {
                        byte[] bArr = new byte[c19];
                        int i78 = i19;
                        int i79 = i78;
                        while (i78 < c19) {
                            if (z17) {
                                i79 = gVar.b();
                            }
                            bArr[i78] = (byte) (i79 & 255);
                            i79 >>= 8;
                            i78++;
                            z17 = !z17;
                        }
                        eVar.a(i27, b17, bArr, c19, 1);
                    } else if (b47 == 2) {
                        short[] sArr = new short[c19];
                        for (int i86 = i19; i86 < c19; i86++) {
                            sArr[i86] = (short) gVar.b();
                        }
                        eVar.a(i27, b17, sArr, c19, 2);
                    } else if (b47 == 4) {
                        int[] iArr4 = new int[c19];
                        for (int i87 = i19; i87 < c19; i87++) {
                            iArr4[i87] = gVar.c();
                        }
                        eVar.a(i27, b17, iArr4, c19, 4);
                    } else {
                        if (b47 != 8) {
                            throw new av5.z("bogus element_width: ".concat(ev5.a.b(b47)));
                        }
                        long[] jArr = new long[c19];
                        for (int i88 = i19; i88 < c19; i88++) {
                            jArr[i88] = gVar.d();
                        }
                        eVar.a(i27, b17, jArr, c19, 8);
                    }
                default:
                    throw new av5.z("Unknown instruction format: " + d17);
            }
        }
        char[] cArr2 = new char[1];
        cArr2[i19] = java.lang.Character.forDigit(i18 & 15, 16);
        throw new av5.z("bogus registerCount: ".concat(new java.lang.String(cArr2)));
    }
}
