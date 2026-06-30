package q35;

/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f359976a = "/storage/emulated/" + (android.os.Process.myUid() / 100000) + "/";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f359977b = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static android.util.Pair a(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.io.OutputStream outputStream;
        java.io.InputStream inputStream;
        android.util.Pair pair;
        ?? r07 = 0;
        r07 = 0;
        if (uri == null) {
            return new android.util.Pair(null, null);
        }
        java.lang.String type = contentResolver.getType(uri);
        java.lang.String d17 = d(type);
        java.lang.String e17 = e(contentResolver, uri);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            e17 = "share_file" + d(type);
        }
        if (!e17.endsWith(d17)) {
            e17 = e17 + "." + d17;
        }
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("fav_share_file_temp");
        if (!h07.m()) {
            h07.J();
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, e17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "copy to file:" + r6Var.o());
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "file exist, delete old");
            r6Var.l();
        }
        try {
            try {
                outputStream = com.tencent.mm.vfs.w6.H(r6Var);
            } catch (java.lang.Throwable th6) {
                th = th6;
                r07 = contentResolver;
            }
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    if (inputStream == null) {
                        pair = new android.util.Pair(null, null);
                    } else {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            outputStream.write(bArr, 0, read);
                        }
                        pair = new android.util.Pair(r6Var.o(), e17);
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new java.lang.Object[0]);
                    pair = new android.util.Pair(null, null);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return pair;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                inputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mm.sdk.platformtools.t8.v1(r07);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                throw th;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            inputStream = null;
            outputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            outputStream = null;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
        return pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream] */
    public static android.util.Pair b(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.io.InputStream inputStream;
        android.util.Pair pair;
        java.io.Closeable closeable;
        ?? r07 = 0;
        r07 = 0;
        if (uri == null) {
            return new android.util.Pair(null, null);
        }
        java.lang.String type = contentResolver.getType(uri);
        java.lang.String d17 = d(type);
        java.lang.String e17 = e(contentResolver, uri);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            e17 = "share_file" + d(type);
        }
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("share_file_temp");
        if (!h07.m()) {
            h07.J();
        }
        ?? r27 = java.lang.System.currentTimeMillis() + d17;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, (java.lang.String) r27);
        try {
            try {
                r27 = com.tencent.mm.vfs.w6.H(r6Var);
            } catch (java.lang.Throwable th6) {
                th = th6;
                r07 = contentResolver;
            }
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    if (inputStream == null) {
                        pair = new android.util.Pair(null, null);
                        closeable = r27;
                    } else {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            r27.write(bArr, 0, read);
                        }
                        pair = new android.util.Pair(r6Var.o(), e17);
                        closeable = r27;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new java.lang.Object[0]);
                    pair = new android.util.Pair(null, null);
                    closeable = r27;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    return pair;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                inputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mm.sdk.platformtools.t8.v1(r07);
                com.tencent.mm.sdk.platformtools.t8.v1(r27);
                throw th;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            inputStream = null;
            r27 = 0;
        } catch (java.lang.Throwable th8) {
            th = th8;
            r27 = 0;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        com.tencent.mm.sdk.platformtools.t8.v1(closeable);
        return pair;
    }

    public static final java.lang.String c(android.content.ContentResolver contentResolver, android.net.Uri uri, int i17) {
        java.io.OutputStream outputStream;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        if (uri == null) {
            return null;
        }
        java.lang.String type = contentResolver.getType(uri);
        java.io.File cacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share_img_tmp_");
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(java.lang.System.currentTimeMillis() + "_" + uri));
        sb6.append(i17);
        sb6.append(d(type));
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(cacheDir, sb6.toString());
        r6Var.l();
        try {
            outputStream = com.tencent.mm.vfs.w6.H(r6Var);
        } catch (java.lang.Exception e17) {
            e = e17;
            inputStream = null;
            outputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            outputStream = null;
        }
        try {
            inputStream = contentResolver.openInputStream(uri);
            if (inputStream != null) {
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                java.lang.String o17 = r6Var.o();
                                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                                return o17;
                            }
                            outputStream.write(bArr, 0, read);
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    inputStream2 = inputStream;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    throw th;
                }
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            throw th;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
        return null;
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String[] split;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if ((extensionFromMimeType == null || extensionFromMimeType.length() == 0) && (split = str.split("/")) != null && split.length > 1) {
            extensionFromMimeType = split[1];
        }
        return "." + extensionFromMimeType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
    
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005f, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008e, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.ContentResolver r17, android.net.Uri r18) {
        /*
            java.lang.String r1 = "/"
            java.lang.String r2 = "MicroMsg.ShareUtil"
            java.lang.String r0 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r17
            r4 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L5d
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            if (r0 == 0) goto L5d
            java.lang.String r0 = r3.getString(r9)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            com.tencent.mm.vfs.z7 r0 = com.tencent.mm.vfs.z7.a(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            java.lang.String r4 = r0.f213279f
            if (r4 == 0) goto L49
            java.lang.String r14 = com.tencent.mm.vfs.e8.l(r4, r9, r9)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            boolean r4 = r4.equals(r14)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            if (r4 != 0) goto L49
            com.tencent.mm.vfs.z7 r4 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            java.lang.String r12 = r0.f213277d     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            java.lang.String r13 = r0.f213278e     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            java.lang.String r15 = r0.f213280g     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            java.lang.String r0 = r0.f213281h     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            r11 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            r0 = r4
            goto L49
        L47:
            r0 = move-exception
            goto L67
        L49:
            java.lang.String r0 = r0.f213279f     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            int r4 = r0.lastIndexOf(r1)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
            if (r4 >= 0) goto L52
            goto L58
        L52:
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5a
        L58:
            r10 = r0
            goto L5d
        L5a:
            r0 = move-exception
            r10 = r3
            goto L8f
        L5d:
            if (r3 == 0) goto L8e
        L5f:
            r3.close()
            goto L8e
        L63:
            r0 = move-exception
            goto L8f
        L65:
            r0 = move-exception
            r3 = r10
        L67:
            java.lang.String r4 = "getFileName"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L5a
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r18.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L83
            java.lang.String r4 = "utf8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L83
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L83
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L83
            int r1 = r1 + (-1)
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L83
            goto L8b
        L83:
            r0 = move-exception
            java.lang.String r1 = "getFileName From Uri"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L5a
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L5a
        L8b:
            if (r3 == 0) goto L8e
            goto L5f
        L8e:
            return r10
        L8f:
            if (r10 == 0) goto L94
            r10.close()
        L94:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q35.e.e(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    public static java.lang.String f(java.lang.String str) {
        java.io.OutputStream outputStream;
        java.io.FileInputStream fileInputStream;
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareUtil", "[-] path is null.");
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareUtil", "[!] only do copy on system below api 29.");
            return str;
        }
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(str);
            try {
                java.io.FileDescriptor fd6 = fileInputStream2.getFD();
                java.lang.reflect.Method declaredMethod = java.io.FileDescriptor.class.getDeclaredMethod("getInt$", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                try {
                    str2 = android.system.Os.readlink("/proc/self/fd/" + ((java.lang.Integer) declaredMethod.invoke(fd6, new java.lang.Object[0])).intValue());
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", th6, "[-] Fail to call readlink.", new java.lang.Object[0]);
                    try {
                        str2 = new java.io.File(str).getCanonicalPath();
                    } catch (java.lang.Throwable unused) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", th6, "[-] Fail to call getCanonicalPath.", new java.lang.Object[0]);
                        str2 = str;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "[+] getPathToSafePlace, oldPath: %s, resolvedPath: %s", str, str2);
                if (!str.equalsIgnoreCase(str2) && !i(str).equalsIgnoreCase(i(str2))) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareUtil", "[!] getPathToSafePlace, oldPath[%s] is not equal to resolvedPath[%s], return null.", str, str2);
                    com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream2);
                    return null;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.S0(str2)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareUtil", "[!] getPathToSafePlace, resolvedPath[%s](orig:%s) is not allowed to be a copy source, return null.", str2, str);
                    com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream2);
                    return null;
                }
                com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h0("cpsafe"), new java.io.File(str2).getName());
                java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            java.lang.String i17 = com.tencent.mm.vfs.w6.i(r6Var.o(), false);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "[+] getPathToSafePlace, copy done, oldPath: %s, returnPath: %s", str, i17);
                            com.tencent.mm.sdk.platformtools.t8.v1(H);
                            com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream2);
                            return i17;
                        }
                        H.write(bArr, 0, read);
                    }
                } catch (java.lang.Throwable th7) {
                    outputStream = H;
                    th = th7;
                    fileInputStream = fileInputStream2;
                    try {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", th, "[-] Failure when check and copy path '%s' to safe place.", str);
                        return null;
                    } finally {
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream);
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                fileInputStream = fileInputStream2;
                outputStream = null;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            outputStream = null;
            fileInputStream = null;
        }
    }

    public static java.lang.String g(android.content.ContentResolver contentResolver, java.lang.String str, android.net.Uri uri, boolean z17) {
        java.io.Closeable closeable;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "getShareFilePath srcPath is exists and canRead, return srcPath:" + str);
            return str;
        }
        if (f359977b == null) {
            boolean z18 = true;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_share_img_use_fileprovider_copy_path, 1) != 1) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (!z65.c.a()) {
                    z18 = false;
                }
            }
            f359977b = java.lang.Boolean.valueOf(z18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "getShareFilePath useCopyFilePath == " + f359977b);
        if (!f359977b.booleanValue()) {
            com.tencent.mm.plugin.base.stub.e0.r(10);
            return str;
        }
        com.tencent.mm.plugin.base.stub.e0.r(11);
        java.io.InputStream inputStream = null;
        java.io.OutputStream outputStream = null;
        inputStream = null;
        try {
            java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
            try {
                if (openInputStream != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.String h17 = h(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareUtil", "getShareFilePath tmpPath == null , use srcPath:" + str);
                        com.tencent.mm.plugin.base.stub.e0.r(12);
                        com.tencent.mm.sdk.platformtools.t8.v1(openInputStream);
                        return str;
                    }
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h17);
                    if (r6Var.m()) {
                        r6Var.l();
                    }
                    outputStream = com.tencent.mm.vfs.w6.K(h17, false);
                    byte[] bArr = new byte[4096];
                    long j17 = 0;
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr);
                        j17 += read;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "getShareFilePath copy cost(ms):" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "  size(KB):" + (((float) j17) / 1024.0f));
                    if (r6Var.m() && r6Var.h()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareUtil", "getShareFilePath tmpFile can use:" + h17);
                        com.tencent.mm.plugin.base.stub.e0.r(13);
                        str = h17;
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ShareUtil", "getShareFilePath tmpFile can not use, use srcPath:" + str);
                        com.tencent.mm.plugin.base.stub.e0.r(14);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareUtil", "getShareFilePath inputStream == null, copy fail, use srcPath:" + str);
                    com.tencent.mm.plugin.base.stub.e0.r(15);
                }
                com.tencent.mm.sdk.platformtools.t8.v1(openInputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            } catch (java.lang.Exception e17) {
                e = e17;
                inputStream = openInputStream;
                closeable = null;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareUtil", e, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareUtil", "getShareFilePath copy exception, use srcPath:" + str);
                    com.tencent.mm.plugin.base.stub.e0.r(16);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    return str;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                inputStream = openInputStream;
                closeable = null;
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            closeable = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            closeable = null;
        }
        return str;
    }

    public static java.lang.String h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        return zo3.p.Vi() + com.tencent.mm.sdk.platformtools.w2.a(str + java.lang.System.currentTimeMillis());
    }

    public static java.lang.String i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        if (str.startsWith("/sdcard/")) {
            return str.substring(8);
        }
        java.lang.String str2 = f359976a;
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }
}
