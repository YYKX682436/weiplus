package uk;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public uk.a f428481a;

    /* renamed from: b, reason: collision with root package name */
    public final uk.c f428482b;

    public b(uk.c cVar) {
        this.f428482b = null;
        this.f428482b = cVar;
    }

    public static boolean a(java.lang.String str) {
        uk.c cVar;
        java.io.FileInputStream fileInputStream;
        if (str == null) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return false;
        }
        uk.b b17 = b(str);
        if (b17 == null || (cVar = b17.f428482b) == null) {
            return true;
        }
        try {
            byte[] bArr = {0, 0};
            java.io.File file2 = new java.io.File(str);
            if (file2.exists()) {
                java.lang.String str2 = cVar.f428483d;
                int length = (int) ((file.length() - (b17.f428481a.f428480a + 8)) - 2);
                java.lang.String str3 = null;
                str3 = null;
                str3 = null;
                str3 = null;
                java.io.FileInputStream fileInputStream2 = null;
                str3 = null;
                if (file2.exists() && length > 0) {
                    try {
                        fileInputStream = new java.io.FileInputStream(file2);
                        try {
                            java.lang.String c17 = uk.k.c(fileInputStream, 102400, 0, length, bArr);
                            fileInputStream.close();
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            str3 = c17;
                        } catch (java.lang.Exception unused2) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                            return str2.equalsIgnoreCase(str3);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception unused5) {
                        fileInputStream = null;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                return str2.equalsIgnoreCase(str3);
            }
        } catch (java.lang.Exception unused6) {
        }
        return false;
    }

    public static uk.b b(java.lang.String str) {
        uk.a a17;
        int i17;
        int i18 = 0;
        if (str != null) {
            try {
                java.io.File file = new java.io.File(str);
                if (file.exists()) {
                    i18 = (int) file.length();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (i18 >= 8 && (a17 = uk.a.a(c(str, i18 - 8, 8))) != null && (i17 = a17.f428480a) >= 0) {
            uk.c cVar = new uk.c();
            cVar.parseFrom(c(str, (i18 - i17) - 8, i17));
            uk.b bVar = new uk.b(cVar);
            bVar.f428481a = a17;
            return bVar;
        }
        return null;
    }

    public static byte[] c(java.lang.String str, int i17, int i18) {
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        if (i18 == -1) {
            i18 = (int) file.length();
        }
        if (i17 < 0 || i18 <= 0) {
            return null;
        }
        if (i17 + i18 > ((int) file.length())) {
            i18 = ((int) file.length()) - i17;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
            bArr = new byte[i18];
            randomAccessFile.seek(i17);
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            return bArr;
        } catch (java.lang.Exception unused) {
            return bArr;
        }
    }
}
