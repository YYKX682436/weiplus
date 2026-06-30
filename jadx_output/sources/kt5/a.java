package kt5;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f312048a = {Byte.MAX_VALUE, 69, 76, 70};

    public static boolean a(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        byte[] bArr = new byte[4];
        java.io.FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new java.io.FileInputStream(str);
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            if (fileInputStream.read(bArr, 0, 4) != 4) {
                throw new java.io.IOException("Read bytes less than 4");
            }
            int i17 = 0;
            while (true) {
                byte[] bArr2 = f312048a;
                if (i17 >= 4) {
                    kt5.b.a(fileInputStream);
                    return true;
                }
                if (bArr2[i17] != bArr[i17]) {
                    kt5.b.a(fileInputStream);
                    return false;
                }
                i17++;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            kt5.b.a(fileInputStream2);
            throw th;
        }
    }

    public static byte[] b(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th6;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        try {
            fileInputStream = new java.io.FileInputStream(str);
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream(fileInputStream.available());
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (-1 == read) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray == null) {
                        byteArray = "".getBytes();
                    }
                    kt5.b.a(fileInputStream);
                    kt5.b.a(byteArrayOutputStream);
                    return byteArray;
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    kt5.b.a(fileInputStream);
                    kt5.b.a(byteArrayOutputStream);
                    throw th6;
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                byteArrayOutputStream = null;
            }
        } catch (java.lang.Throwable th9) {
            fileInputStream = null;
            th6 = th9;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] c(java.lang.String str, int i17) {
        java.io.FileInputStream fileInputStream;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.lang.Throwable unused) {
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[i17];
            int i18 = 0;
            do {
                int read = fileInputStream.read(bArr, i18, i17 - i18);
                if (read == -1) {
                    break;
                }
                i18 += read;
            } while (i18 < i17);
            if (i18 == 0) {
                kt5.b.a(fileInputStream);
                return null;
            }
            if (i18 < i17) {
                byte[] bArr2 = new byte[i18];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, i18);
                bArr = bArr2;
            }
            kt5.b.a(fileInputStream);
            return bArr;
        } catch (java.lang.Throwable unused2) {
            kt5.b.a(fileInputStream);
            return null;
        }
    }
}
