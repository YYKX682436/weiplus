package k36;

/* loaded from: classes16.dex */
public abstract class e {
    public static byte[] a(byte[] bArr, int i17, int i18, byte[] bArr2) {
        byte[] bArr3 = new byte[i18];
        java.lang.System.arraycopy(bArr, i17, bArr3, 0, i18);
        k36.a aVar = new k36.a();
        aVar.f303948e = 0;
        aVar.f303947d = 0;
        aVar.f303951h = bArr2;
        byte[] bArr4 = new byte[8];
        if (i18 % 8 == 0 && i18 >= 16) {
            byte[] a17 = aVar.a(bArr3, 0);
            aVar.f303945b = a17;
            int i19 = a17[0] & 7;
            aVar.f303949f = i19;
            int i27 = (i18 - i19) - 10;
            if (i27 >= 0) {
                for (int i28 = 0; i28 < 8; i28++) {
                    bArr4[i28] = 0;
                }
                aVar.f303946c = new byte[i27];
                aVar.f303948e = 0;
                aVar.f303947d = 8;
                aVar.f303953j = 8;
                aVar.f303949f++;
                aVar.f303950g = 1;
                while (true) {
                    int i29 = aVar.f303950g;
                    if (i29 <= 2) {
                        int i37 = aVar.f303949f;
                        if (i37 < 8) {
                            aVar.f303949f = i37 + 1;
                            aVar.f303950g = i29 + 1;
                        }
                        if (aVar.f303949f == 8) {
                            if (!aVar.b(bArr3, 0, i18)) {
                                break;
                            }
                            bArr4 = bArr3;
                        }
                    } else {
                        int i38 = 0;
                        while (true) {
                            if (i27 == 0) {
                                aVar.f303950g = 1;
                                while (aVar.f303950g < 8) {
                                    int i39 = aVar.f303949f;
                                    if (i39 < 8) {
                                        if ((bArr4[(aVar.f303948e + 0) + i39] ^ aVar.f303945b[i39]) == 0) {
                                            aVar.f303949f = i39 + 1;
                                        }
                                    }
                                    if (aVar.f303949f == 8) {
                                        aVar.f303948e = aVar.f303947d;
                                        if (aVar.b(bArr3, 0, i18)) {
                                            bArr4 = bArr3;
                                        }
                                    }
                                    aVar.f303950g++;
                                }
                                return aVar.f303946c;
                            }
                            int i47 = aVar.f303949f;
                            if (i47 < 8) {
                                aVar.f303946c[i38] = (byte) (bArr4[(aVar.f303948e + 0) + i47] ^ aVar.f303945b[i47]);
                                i38++;
                                i27--;
                                aVar.f303949f = i47 + 1;
                            }
                            if (aVar.f303949f == 8) {
                                aVar.f303948e = aVar.f303947d - 8;
                                if (!aVar.b(bArr3, 0, i18)) {
                                    break;
                                }
                                bArr4 = bArr3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr, int i17, int i18, byte[] bArr2) {
        int i19;
        byte[] bArr3 = new byte[i18];
        java.lang.System.arraycopy(bArr, i17, bArr3, 0, i18);
        k36.a aVar = new k36.a();
        byte[] bArr4 = new byte[8];
        aVar.f303944a = bArr4;
        aVar.f303945b = new byte[8];
        aVar.f303949f = 1;
        aVar.f303950g = 0;
        aVar.f303948e = 0;
        aVar.f303947d = 0;
        aVar.f303951h = bArr2;
        aVar.f303952i = true;
        int i27 = (i18 + 10) % 8;
        aVar.f303949f = i27;
        if (i27 != 0) {
            aVar.f303949f = 8 - i27;
        }
        aVar.f303946c = new byte[aVar.f303949f + i18 + 10];
        java.util.Random random = aVar.f303954k;
        bArr4[0] = (byte) ((random.nextInt() & 248) | aVar.f303949f);
        int i28 = 1;
        while (true) {
            i19 = aVar.f303949f;
            if (i28 > i19) {
                break;
            }
            aVar.f303944a[i28] = (byte) (random.nextInt() & 255);
            i28++;
        }
        aVar.f303949f = i19 + 1;
        for (int i29 = 0; i29 < 8; i29++) {
            aVar.f303945b[i29] = 0;
        }
        aVar.f303950g = 1;
        while (aVar.f303950g <= 2) {
            int i37 = aVar.f303949f;
            if (i37 < 8) {
                byte[] bArr5 = aVar.f303944a;
                aVar.f303949f = i37 + 1;
                bArr5[i37] = (byte) (random.nextInt() & 255);
                aVar.f303950g++;
            }
            if (aVar.f303949f == 8) {
                aVar.c();
            }
        }
        int i38 = 0;
        while (i18 > 0) {
            int i39 = aVar.f303949f;
            if (i39 < 8) {
                byte[] bArr6 = aVar.f303944a;
                aVar.f303949f = i39 + 1;
                bArr6[i39] = bArr3[i38];
                i18--;
                i38++;
            }
            if (aVar.f303949f == 8) {
                aVar.c();
            }
        }
        aVar.f303950g = 1;
        while (true) {
            int i47 = aVar.f303950g;
            if (i47 > 7) {
                return aVar.f303946c;
            }
            int i48 = aVar.f303949f;
            if (i48 < 8) {
                byte[] bArr7 = aVar.f303944a;
                aVar.f303949f = i48 + 1;
                bArr7[i48] = 0;
                aVar.f303950g = i47 + 1;
            }
            if (aVar.f303949f == 8) {
                aVar.c();
            }
        }
    }
}
