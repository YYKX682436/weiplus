package uk;

/* loaded from: classes8.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f428498a = {77, 105, 99, 114, 111, 77, 115, 103};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f428499b = {66, 83, 68, 73, 70, 70, 52, 48};

    public static int a(java.io.RandomAccessFile randomAccessFile, int i17, byte[] bArr, int i18, java.io.File file, int i19) {
        boolean z17;
        int i27;
        if (randomAccessFile == null || i17 <= 0) {
            return 3;
        }
        if (file == null) {
            return 4;
        }
        if (bArr == null || i18 <= 0) {
            return 2;
        }
        int i28 = (i17 - i19) - 2;
        if (i28 <= 2) {
            return 3;
        }
        byte b17 = 0;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr, 0, i18));
        byte[] bArr2 = new byte[8];
        dataInputStream.readFully(bArr2);
        if (java.util.Arrays.equals(f428498a, bArr2)) {
            z17 = false;
        } else {
            if (!java.util.Arrays.equals(f428499b, bArr2)) {
                throw new java.io.IOException("Unknown diff file magic: " + java.util.Arrays.toString(bArr2));
            }
            z17 = true;
        }
        long d17 = uk.i.d(dataInputStream, z17);
        long d18 = uk.i.d(dataInputStream, z17);
        int i29 = i28;
        int d19 = (int) uk.i.d(dataInputStream, z17);
        dataInputStream.close();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr, 0, i18);
        byteArrayInputStream.skip(32L);
        try {
            a46.c cVar = a46.c.f1355b;
            java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(cVar.a(byteArrayInputStream));
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(bArr, 0, i18);
            byteArrayInputStream2.skip(d17 + 32);
            try {
                a46.b a17 = cVar.a(byteArrayInputStream2);
                java.io.ByteArrayInputStream byteArrayInputStream3 = new java.io.ByteArrayInputStream(bArr, 0, i18);
                byteArrayInputStream3.skip(d18 + d17 + 32);
                try {
                    a46.b a18 = cVar.a(byteArrayInputStream3);
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    int[] iArr = new int[3];
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < d19) {
                        if (z17) {
                            i27 = 2;
                            for (int i39 = b17; i39 <= 2; i39++) {
                                iArr[i39] = (int) uk.i.d(dataInputStream2, z17);
                            }
                        } else {
                            i27 = 2;
                            for (int i47 = b17; i47 <= 2; i47++) {
                                iArr[i47] = uk.i.c(dataInputStream2, z17);
                            }
                        }
                        int i48 = iArr[b17];
                        if (i37 + i48 > d19) {
                            fileOutputStream.close();
                            return i27;
                        }
                        byte[] bArr3 = new byte[i48];
                        if (!uk.i.b(a17, bArr3, b17, i48)) {
                            fileOutputStream.close();
                            return i27;
                        }
                        int i49 = iArr[b17];
                        byte[] bArr4 = new byte[i49];
                        if (randomAccessFile.read(bArr4, b17, i49) < iArr[b17]) {
                            fileOutputStream.close();
                            return i27;
                        }
                        int i57 = b17;
                        while (i57 < iArr[b17]) {
                            int i58 = i38 + i57;
                            int i59 = i29;
                            if (i58 == i59) {
                                bArr4[i57] = b17;
                                bArr4[i57 + 1] = b17;
                            }
                            if (i58 >= 0 && i58 < i17) {
                                bArr3[i57] = (byte) (bArr3[i57] + bArr4[i57]);
                            }
                            i57++;
                            i29 = i59;
                            b17 = 0;
                        }
                        int i66 = i29;
                        fileOutputStream.write(bArr3);
                        int i67 = iArr[0];
                        int i68 = i37 + i67;
                        int i69 = i38 + i67;
                        int i76 = iArr[1];
                        if (i68 + i76 > d19) {
                            fileOutputStream.close();
                            return 2;
                        }
                        byte[] bArr5 = new byte[i76];
                        if (!uk.i.b(a18, bArr5, 0, i76)) {
                            fileOutputStream.close();
                            return 2;
                        }
                        fileOutputStream.write(bArr5);
                        fileOutputStream.flush();
                        i37 = i68 + iArr[1];
                        i38 = i69 + iArr[2];
                        randomAccessFile.seek(i38);
                        b17 = 0;
                        i29 = i66;
                    }
                    dataInputStream2.close();
                    a17.close();
                    a18.close();
                    randomAccessFile.close();
                    fileOutputStream.close();
                    return 1;
                } catch (a46.a e17) {
                    throw new java.io.IOException(e17);
                }
            } catch (a46.a e18) {
                throw new java.io.IOException(e18);
            }
        } catch (a46.a e19) {
            throw new java.io.IOException(e19);
        }
    }

    public static int b(java.io.RandomAccessFile randomAccessFile, java.io.File file, java.io.File file2, int i17) {
        if (randomAccessFile == null || randomAccessFile.length() <= 0) {
            return 3;
        }
        if (file == null) {
            return 4;
        }
        if (file2 == null || file2.length() <= 0) {
            return 2;
        }
        int length = (int) file2.length();
        byte[] bArr = new byte[length];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
        try {
            uk.i.b(fileInputStream, bArr, 0, length);
            int a17 = a(randomAccessFile, (int) randomAccessFile.length(), bArr, length, file, i17);
            fileInputStream.close();
            return a17;
        } catch (java.lang.Throwable th6) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
