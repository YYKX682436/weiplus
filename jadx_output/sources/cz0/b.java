package cz0;

/* loaded from: classes12.dex */
public abstract class b {
    public static int a(java.io.File file, java.io.File file2, java.io.File file3, int i17) {
        int i18;
        if (file == null || file.length() <= 0) {
            return 3;
        }
        if (file2 == null) {
            return 4;
        }
        int i19 = 2;
        if (file3 == null || file3.length() <= 0) {
            return 2;
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        int length = (int) file3.length();
        byte[] bArr = new byte[length];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file3);
        try {
            cz0.a.c(fileInputStream, bArr, 0, length);
            fileInputStream.close();
            int length2 = (int) file.length();
            byte[] bArr2 = new byte[length2];
            cz0.a.c(bufferedInputStream, bArr2, 0, length2);
            bufferedInputStream.close();
            if (length < 32) {
                throw new java.io.IOException("Header.len < 32");
            }
            if (bArr[0] != 66 || bArr[1] != 83 || bArr[2] != 68 || bArr[3] != 73 || bArr[4] != 70 || bArr[5] != 70 || bArr[6] != 52 || bArr[7] != 48) {
                throw new java.io.IOException("Invalid header signature");
            }
            long a17 = cz0.a.a(bArr, 8);
            long a18 = cz0.a.a(bArr, 16);
            long a19 = cz0.a.a(bArr, 24);
            if (a17 < 0 || a18 < 0 || a19 < 0) {
                throw new java.io.IOException("Invalid header lengths");
            }
            java.io.InputStream b17 = cz0.a.b(bArr, 32L, a17);
            long j17 = a17 + 32;
            java.io.InputStream b18 = cz0.a.b(bArr, j17, a18);
            java.io.InputStream b19 = cz0.a.b(bArr, j17 + a18, -1L);
            byte[] bArr3 = new byte[(int) a19];
            int[] iArr = new int[3];
            byte[] bArr4 = new byte[8];
            int i27 = 0;
            int i28 = 0;
            while (i27 < a19) {
                int i29 = 0;
                while (i29 <= i19) {
                    long j18 = 0;
                    while (j18 < 8) {
                        java.io.InputStream inputStream = b18;
                        java.io.InputStream inputStream2 = b19;
                        int read = b17.read(bArr4, (int) (j18 + 0), (int) (8 - j18));
                        if (read == -1) {
                            throw new java.io.IOException("Bzip2 EOF");
                        }
                        j18 += read;
                        b18 = inputStream;
                        b19 = inputStream2;
                    }
                    iArr[i29] = (int) cz0.a.a(bArr4, 0);
                    i29++;
                    b18 = b18;
                    b19 = b19;
                    i19 = 2;
                }
                java.io.InputStream inputStream3 = b18;
                java.io.InputStream inputStream4 = b19;
                int i37 = iArr[0];
                if (i27 + i37 > a19) {
                    throw new java.io.IOException("Corrupt by wrong patch file.");
                }
                if (!cz0.a.c(inputStream3, bArr3, i27, i37)) {
                    throw new java.io.IOException("Corrupt by wrong patch file.");
                }
                int i38 = 0;
                while (true) {
                    i18 = iArr[0];
                    if (i38 >= i18) {
                        break;
                    }
                    int i39 = i28 + i38;
                    if (i39 >= 0 && i39 < length2) {
                        int i47 = i27 + i38;
                        bArr3[i47] = (byte) (bArr3[i47] + bArr2[i39]);
                    }
                    i38++;
                }
                int i48 = i27 + i18;
                int i49 = i28 + i18;
                int i57 = iArr[1];
                int i58 = length2;
                if (i48 + i57 > a19) {
                    throw new java.io.IOException("Corrupt by wrong patch file.");
                }
                if (!cz0.a.c(inputStream4, bArr3, i48, i57)) {
                    throw new java.io.IOException("Corrupt by wrong patch file.");
                }
                i27 = i48 + iArr[1];
                i28 = i49 + iArr[2];
                b19 = inputStream4;
                b18 = inputStream3;
                length2 = i58;
                i19 = 2;
            }
            b17.close();
            b18.close();
            b19.close();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
            try {
                fileOutputStream.write(bArr3);
                fileOutputStream.close();
                return 1;
            } catch (java.lang.Throwable th6) {
                fileOutputStream.close();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            fileInputStream.close();
            throw th7;
        }
    }
}
