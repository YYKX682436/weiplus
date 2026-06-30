package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public abstract class o {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r11, byte[] r12) {
        /*
            java.lang.String r0 = "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d"
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.CrashFileOperatioin"
            if (r12 == 0) goto Lba
            int r3 = r12.length
            if (r3 != 0) goto Ld
            goto Lba
        Ld:
            r3 = 1
            r4 = 0
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r6.<init>(r11, r3)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r5 = r12.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r6.write(r12, r4, r5)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r6.close()     // Catch: java.io.IOException -> L1d
            goto L3b
        L1d:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r3, r1, r5)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = r3.getMessage()
            int r12 = r12.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r11 = new java.lang.Object[]{r1, r3, r11, r12}
            com.tencent.mars.xlog.Log.w(r2, r0, r11)
        L3b:
            return r4
        L3c:
            r3 = move-exception
            r5 = r6
            goto L95
        L3f:
            r5 = move-exception
            goto L47
        L41:
            r3 = move-exception
            goto L95
        L43:
            r6 = move-exception
            r10 = r6
            r6 = r5
            r5 = r10
        L47:
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r5, r1, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r9 = r5.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L3c
            r8[r4] = r9     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L3c
            r8[r3] = r5     // Catch: java.lang.Throwable -> L3c
            r3 = 2
            r8[r3] = r11     // Catch: java.lang.Throwable -> L3c
            int r3 = r12.length     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3c
            r5 = 3
            r8[r5] = r3     // Catch: java.lang.Throwable -> L3c
            com.tencent.mars.xlog.Log.w(r2, r7, r8)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L93
            r6.close()     // Catch: java.io.IOException -> L75
            goto L93
        L75:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r3, r1, r4)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = r3.getMessage()
            int r12 = r12.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r11 = new java.lang.Object[]{r1, r3, r11, r12}
            com.tencent.mars.xlog.Log.w(r2, r0, r11)
        L93:
            r11 = -1
            return r11
        L95:
            if (r5 == 0) goto Lb9
            r5.close()     // Catch: java.io.IOException -> L9b
            goto Lb9
        L9b:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r5, r1, r4)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r4 = r5.getMessage()
            int r12 = r12.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r11 = new java.lang.Object[]{r1, r4, r11, r12}
            com.tencent.mars.xlog.Log.w(r2, r0, r11)
        Lb9:
            throw r3
        Lba:
            r11 = -2
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sandbox.monitor.o.a(java.lang.String, byte[]):int");
    }

    public static boolean b(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                return file.delete();
            }
        }
        return true;
    }

    public static final boolean c(java.lang.String str) {
        return str != null && new java.io.File(str).exists();
    }

    public static java.lang.String d(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (str == null) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
            long j17 = 102400;
            try {
                if (j17 > file.length()) {
                    j17 = file.length();
                }
                java.lang.String c17 = kk.k.c(fileInputStream, (int) j17);
                fileInputStream.close();
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused) {
                }
                return c17;
            } catch (java.lang.Exception unused2) {
                if (fileInputStream == null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (java.io.IOException unused3) {
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                fileInputStream2 = fileInputStream;
                th = th6;
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

    public static int e(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.RandomAccessFile] */
    public static byte[] f(java.lang.String str, int i17, int i18) {
        byte[] bArr;
        ?? r57;
        java.lang.Throwable th6;
        java.lang.String str2 = "";
        byte[] bArr2 = null;
        bArr2 = null;
        java.io.RandomAccessFile randomAccessFile = null;
        if (str == null) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        int i19 = i18;
        if (i18 == -1) {
            i19 = (int) file.length();
        }
        if (i17 < 0 || i19 <= 0) {
            return null;
        }
        int i27 = i17 + i19;
        int i28 = i19;
        if (i27 > ((int) file.length())) {
            i28 = ((int) file.length()) - i17;
        }
        int i29 = 0;
        i29 = 0;
        i29 = 0;
        r4 = 0;
        int i37 = 0;
        try {
            try {
                r57 = new java.io.RandomAccessFile(str, "r");
            } catch (java.lang.Throwable th7) {
                r57 = bArr2;
                th6 = th7;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
            bArr = null;
        }
        try {
            bArr2 = new byte[i28];
            r57.seek(i17);
            r57.readFully(bArr2);
            try {
                r57.close();
                str = str;
                i17 = i17;
                i28 = i28;
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashFileOperatioin", e18, "", new java.lang.Object[0]);
                str2 = e18.getClass().getSimpleName();
                ?? message = e18.getMessage();
                ?? valueOf = java.lang.Integer.valueOf(i17);
                ?? valueOf2 = java.lang.Integer.valueOf(i28);
                ?? r112 = {str2, message, str, valueOf, valueOf2};
                com.tencent.mars.xlog.Log.w("MicroMsg.CrashFileOperatioin", "file op readFromFileV2 close e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d", r112);
                i29 = message;
                str = r112;
                i17 = valueOf;
                i28 = valueOf2;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            bArr = bArr2;
            randomAccessFile = r57;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashFileOperatioin", e, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.CrashFileOperatioin", "file op readFromFileV2 e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d", e.getClass().getSimpleName(), e.getMessage(), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i28));
            java.lang.String str3 = str;
            int i38 = i17;
            int i39 = i28;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    str3 = str;
                    i38 = i17;
                    i39 = i28;
                } catch (java.io.IOException e27) {
                    ?? r47 = new java.lang.Object[0];
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashFileOperatioin", e27, "", r47);
                    str2 = e27.getClass().getSimpleName();
                    java.lang.String message2 = e27.getMessage();
                    ?? valueOf3 = java.lang.Integer.valueOf(i17);
                    ?? valueOf4 = java.lang.Integer.valueOf(i28);
                    ?? r113 = {str2, message2, str, valueOf3, valueOf4};
                    com.tencent.mars.xlog.Log.w("MicroMsg.CrashFileOperatioin", "file op readFromFileV2 close e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d", r113);
                    i37 = r47;
                    str3 = r113;
                    i38 = valueOf3;
                    i39 = valueOf4;
                }
            }
            bArr2 = bArr;
            i29 = i37;
            str = str3;
            i17 = i38;
            i28 = i39;
            return bArr2;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            if (r57 != 0) {
                try {
                    r57.close();
                } catch (java.io.IOException e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashFileOperatioin", e28, str2, new java.lang.Object[i29]);
                    com.tencent.mars.xlog.Log.w("MicroMsg.CrashFileOperatioin", "file op readFromFileV2 close e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d", e28.getClass().getSimpleName(), e28.getMessage(), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i28));
                }
            }
            throw th6;
        }
        return bArr2;
    }
}
