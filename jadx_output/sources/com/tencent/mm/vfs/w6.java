package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class w6 {
    public static java.io.RandomAccessFile A(com.tencent.mm.vfs.z7 z7Var, boolean z17) {
        java.lang.String r17 = com.tencent.mm.vfs.e8.r(z7Var, z17);
        if (r17 != null) {
            return new java.io.RandomAccessFile(r17, z17 ? "rw" : "r");
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }

    public static java.io.RandomAccessFile B(java.lang.String str, boolean z17) {
        return A(com.tencent.mm.vfs.z7.a(str), z17);
    }

    public static java.io.InputStream C(com.tencent.mm.vfs.r6 r6Var) {
        return D(r6Var.f213166d, r6Var.M());
    }

    public static java.io.InputStream D(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, z2Var);
        if (m17.a()) {
            return m17.f213266a.a(m17.f213267b);
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }

    public static java.io.InputStream E(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            throw new java.io.FileNotFoundException("path is empty");
        }
        return D(com.tencent.mm.vfs.z7.a(str), null);
    }

    public static java.nio.channels.ReadableByteChannel F(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, z2Var);
        if (m17.a()) {
            return m17.f213266a.s(m17.f213267b);
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }

    public static java.nio.channels.ReadableByteChannel G(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            throw new java.io.FileNotFoundException("path is empty");
        }
        return F(com.tencent.mm.vfs.z7.a(str), null);
    }

    public static java.io.OutputStream H(com.tencent.mm.vfs.r6 r6Var) {
        return I(r6Var.f213166d, r6Var.M(), false);
    }

    public static java.io.OutputStream I(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var, boolean z17) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, z2Var);
        if (m17.a()) {
            return m17.f213266a.c(m17.f213267b, z17);
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }

    public static java.io.OutputStream J(java.lang.String str) {
        return K(str, false);
    }

    public static java.io.OutputStream K(java.lang.String str, boolean z17) {
        if (str == null || str.isEmpty()) {
            throw new java.io.FileNotFoundException("path is empty");
        }
        return I(com.tencent.mm.vfs.z7.a(str), null, z17);
    }

    public static java.nio.channels.WritableByteChannel L(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var, boolean z17) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, z2Var);
        if (m17.a()) {
            return m17.f213266a.h(m17.f213267b, z17);
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }

    public static java.lang.String M(java.lang.String str) {
        java.io.InputStreamReader inputStreamReader;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new java.io.InputStreamReader(E(str));
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            char[] cArr = new char[512];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    com.tencent.mm.vfs.e8.d(inputStreamReader);
                    return sb6.toString();
                }
                sb6.append(cArr, 0, read);
            }
        } catch (java.io.IOException e18) {
            e = e18;
            inputStreamReader2 = inputStreamReader;
            com.tencent.stubs.logger.Log.e("MicroMsg.VFSFileOp", "readFileAsString(\"%s\" failed: %s", str, e.getMessage());
            throw e;
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStreamReader2 = inputStreamReader;
            com.tencent.mm.vfs.e8.d(inputStreamReader2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static byte[] N(java.lang.String str, int i17, int i18) {
        java.io.InputStream inputStream;
        java.io.Closeable closeable = null;
        if (str == null) {
            return null;
        }
        ?? r17 = (i18 < 0 || i18 > 8388608) ? 4096 : i18;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(r17);
        try {
            try {
                inputStream = E(str);
                for (long j17 = i17; j17 > 0; j17 -= inputStream.skip(j17)) {
                    try {
                    } catch (java.io.IOException e17) {
                        e = e17;
                        com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", "readFromFile failed: " + str + ", " + e.getMessage());
                        com.tencent.mm.vfs.e8.d(inputStream);
                        return null;
                    }
                }
                byte[] bArr = new byte[1024];
                if (i18 < 0) {
                    i18 = Integer.MAX_VALUE;
                }
                while (true) {
                    int read = inputStream.read(bArr, 0, java.lang.Math.min(i18, 1024));
                    if (read == -1 || i18 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    i18 -= read;
                }
                com.tencent.mm.vfs.e8.d(inputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused) {
                }
                int length = byteArray.length;
                return byteArray;
            } catch (java.lang.Throwable th6) {
                th = th6;
                closeable = r17;
                com.tencent.mm.vfs.e8.d(closeable);
                throw th;
            }
        } catch (java.io.IOException e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.vfs.e8.d(closeable);
            throw th;
        }
    }

    public static boolean O(com.tencent.mm.vfs.z2 z2Var, com.tencent.mm.vfs.z2 z2Var2, boolean z17) {
        if (!z2Var.a() || !z2Var2.a()) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String str = z2Var.f213267b;
        int length = str.length();
        java.lang.Iterable p17 = com.tencent.mm.vfs.e8.p(z2Var.f213266a, str, false, !z17 ? null : new com.tencent.mm.vfs.v6(length, z2Var2, hashSet));
        if (p17 == null) {
            return false;
        }
        com.tencent.mm.vfs.q2 q2Var = z2Var2.f213266a;
        java.lang.String str2 = z2Var2.f213267b;
        q2Var.r(str2);
        hashSet.add(str2);
        java.util.Iterator it = ((pm5.b) p17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
            java.lang.String substring = x1Var.f213231a.substring(length);
            if (!substring.startsWith("/")) {
                substring = "/".concat(substring);
            }
            java.lang.String str3 = str2 + substring;
            if (!x1Var.f213236f) {
                int lastIndexOf = str3.lastIndexOf(47);
                if (lastIndexOf > 0) {
                    java.lang.String substring2 = str3.substring(0, lastIndexOf);
                    if (hashSet.add(substring2)) {
                        q2Var.r(substring2);
                    }
                }
                java.lang.String str4 = x1Var.f213231a;
                com.tencent.mm.vfs.q2 q2Var2 = x1Var.f213237g;
                if (z17) {
                    try {
                        if (!q2Var.t(str3, q2Var2, str4)) {
                            q2Var.i(str3, q2Var2, str4, false);
                            x1Var.a();
                        }
                    } catch (java.io.IOException e17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to ");
                        sb6.append(z17 ? "move" : "copy");
                        sb6.append(" files.");
                        com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e17, sb6.toString());
                        return false;
                    }
                } else {
                    q2Var.i(str3, q2Var2, str4, false);
                }
            } else if (hashSet.add(str3)) {
                q2Var.r(str3);
            }
        }
        return true;
    }

    public static boolean P(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return x(str + str2, str + str3, true);
    }

    public static int Q(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipInputStream zipInputStream;
        java.util.zip.ZipInputStream zipInputStream2 = null;
        try {
            try {
                zipInputStream = new java.util.zip.ZipInputStream(E(str));
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.io.FileNotFoundException e17) {
            e = e17;
        } catch (java.io.IOException e18) {
            e = e18;
        }
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            byte[] bArr = new byte[4096];
            while (true) {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    com.tencent.mm.vfs.e8.d(zipInputStream);
                    return 0;
                }
                java.lang.String name = nextEntry.getName();
                if (!name.contains("../") && !name.contains("..\\")) {
                    if (nextEntry.isDirectory()) {
                        java.lang.String substring = name.substring(0, name.length() - 1);
                        if (hashSet.add(substring)) {
                            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2 + "/" + substring);
                            java.lang.String str3 = a17.f213279f;
                            if (str3 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                                if (!str3.equals(l17)) {
                                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                            if (m17.a()) {
                                m17.f213266a.r(m17.f213267b);
                            }
                        }
                    } else {
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str2 + "/" + name);
                        java.lang.String str4 = a18.f213279f;
                        if (str4 != null) {
                            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                            if (!str4.equals(l18)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                            }
                        }
                        java.lang.String i17 = com.tencent.mm.vfs.e8.i(name);
                        if (i17 != null && hashSet.add(i17)) {
                            com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(str2 + "/" + i17);
                            java.lang.String str5 = a19.f213279f;
                            if (str5 != null) {
                                java.lang.String l19 = com.tencent.mm.vfs.e8.l(str5, false, false);
                                if (!str5.equals(l19)) {
                                    a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
                            if (m18.a()) {
                                m18.f213266a.r(m18.f213267b);
                            }
                        }
                        java.io.OutputStream I = I(a18, com.tencent.mm.vfs.a3.f212781a.m(a18, null), false);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            I.write(bArr, 0, read);
                        }
                        I.close();
                    }
                }
            }
        } catch (java.io.FileNotFoundException e19) {
            e = e19;
            zipInputStream2 = zipInputStream;
            com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e, "");
            com.tencent.mm.vfs.e8.d(zipInputStream2);
            return -1;
        } catch (java.io.IOException e27) {
            e = e27;
            zipInputStream2 = zipInputStream;
            com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e, "");
            com.tencent.mm.vfs.e8.d(zipInputStream2);
            return -2;
        } catch (java.lang.Throwable th7) {
            th = th7;
            zipInputStream2 = zipInputStream;
            com.tencent.mm.vfs.e8.d(zipInputStream2);
            throw th;
        }
    }

    public static int R(java.lang.String str, byte[] bArr) {
        return S(str, bArr, 0, bArr.length);
    }

    public static int S(java.lang.String str, byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return -2;
        }
        if (bArr.length < i17 + i18) {
            return -3;
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = K(str, false);
                outputStream.write(bArr, i17, i18);
                return 0;
            } catch (java.io.IOException e17) {
                com.tencent.stubs.logger.Log.e("MicroMsg.VFSFileOp", "writeFile '%s' Failed: %s", str, e17.getMessage());
                com.tencent.mm.vfs.e8.d(outputStream);
                return -1;
            }
        } finally {
            com.tencent.mm.vfs.e8.d(outputStream);
        }
    }

    public static boolean T(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipOutputStream zipOutputStream;
        com.tencent.mm.vfs.x1 m17;
        int i17;
        java.lang.Iterable<com.tencent.mm.vfs.x1> iterable;
        if (str == null || str.isEmpty()) {
            return false;
        }
        java.util.List singletonList = java.util.Collections.singletonList(str);
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        u(r(str2));
        byte[] bArr = new byte[4096];
        java.io.InputStream inputStream = null;
        try {
            try {
                zipOutputStream = new java.util.zip.ZipOutputStream(K(str2, false));
                try {
                    java.util.Iterator it = singletonList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a((java.lang.String) it.next()), null);
                        boolean a17 = m18.a();
                        com.tencent.mm.vfs.q2 q2Var = m18.f213266a;
                        java.lang.String str3 = m18.f213267b;
                        if (a17 && (m17 = q2Var.m(str3)) != null) {
                            if (m17.f213236f) {
                                i17 = str3.length() + (1 ^ str3.endsWith("/"));
                                iterable = com.tencent.mm.vfs.e8.o(q2Var, str3);
                                if (iterable == null) {
                                }
                            } else {
                                int lastIndexOf = str3.lastIndexOf(47) + 1;
                                java.util.List singletonList2 = java.util.Collections.singletonList(m17);
                                i17 = lastIndexOf;
                                iterable = singletonList2;
                            }
                            for (com.tencent.mm.vfs.x1 x1Var : iterable) {
                                boolean z17 = x1Var.f213236f;
                                java.lang.String str4 = x1Var.f213231a;
                                if (!z17) {
                                    java.lang.String substring = str4.length() < i17 ? x1Var.f213232b : str4.substring(i17);
                                    java.io.InputStream a18 = x1Var.f213237g.a(str4);
                                    try {
                                        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(substring));
                                        while (true) {
                                            int read = a18.read(bArr);
                                            if (read < 0) {
                                                break;
                                            }
                                            zipOutputStream.write(bArr, 0, read);
                                        }
                                        a18.close();
                                        zipOutputStream.closeEntry();
                                    } catch (java.io.IOException e17) {
                                        e = e17;
                                        inputStream = a18;
                                        com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e, "Failed to write ZipFile");
                                        com.tencent.mm.vfs.e8.d(inputStream);
                                        com.tencent.mm.vfs.e8.d(zipOutputStream);
                                        return false;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        inputStream = a18;
                                        com.tencent.mm.vfs.e8.d(inputStream);
                                        com.tencent.mm.vfs.e8.d(zipOutputStream);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    com.tencent.mm.vfs.e8.d(zipOutputStream);
                    return true;
                } catch (java.io.IOException e18) {
                    e = e18;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.io.IOException e19) {
            e = e19;
            zipOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            zipOutputStream = null;
        }
    }

    public static int a(java.lang.String str, byte[] bArr) {
        int length = bArr.length;
        if (bArr.length == 0 || bArr.length < 0 + length) {
            return -2;
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = K(str, true);
                outputStream.write(bArr, 0, length);
                return 0;
            } catch (java.lang.Exception e17) {
                com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e17, "");
                com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", e17.getClass().getSimpleName(), e17.getMessage(), str, java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(length));
                com.tencent.mm.vfs.e8.d(outputStream);
                return -1;
            }
        } finally {
            com.tencent.mm.vfs.e8.d(outputStream);
        }
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        return O(b3Var.m(a17, null), b3Var.m(com.tencent.mm.vfs.z7.a(str2), null), false);
    }

    public static long c(java.lang.String str, java.lang.String str2) {
        return d(str, str2, false);
    }

    public static long d(java.lang.String str, java.lang.String str2, boolean z17) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str.equals(str2)) {
            return -1L;
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(com.tencent.mm.vfs.z7.a(str), null);
        com.tencent.mm.vfs.z2 m18 = b3Var.m(com.tencent.mm.vfs.z7.a(str2), null);
        if (m17.a() && m18.a()) {
            try {
                return m18.f213266a.i(m18.f213267b, m17.f213266a, m17.f213267b, z17);
            } catch (java.io.IOException e17) {
                com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", "Failed to copy file " + str + " -> " + str2 + ": " + e17.getMessage());
            }
        }
        return -1L;
    }

    public static boolean e(java.lang.String str) {
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                if (!r6Var.k()) {
                    return false;
                }
            }
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean f(java.lang.String str) {
        return g(str, true);
    }

    public static boolean g(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m17.a()) {
            return m17.f213266a.e(m17.f213267b, z17);
        }
        return false;
    }

    public static boolean h(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return m17.a() && m17.f213266a.d(m17.f213267b);
    }

    public static java.lang.String i(java.lang.String str, boolean z17) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return com.tencent.mm.vfs.e8.r(com.tencent.mm.vfs.z7.a(str), z17);
    }

    public static boolean j(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public static long k(java.lang.String str) {
        com.tencent.mm.vfs.x1 m17;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            return m17.f213233c;
        }
        return 0L;
    }

    public static long l(java.lang.String str) {
        com.tencent.mm.vfs.x1 m17;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            return m17.f213235e;
        }
        return 0L;
    }

    public static com.tencent.mm.vfs.x1 m(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m17.a()) {
            return m17.f213266a.m(m17.f213267b);
        }
        return null;
    }

    public static java.lang.String n(java.lang.String str) {
        if (str != null && str.length() > 0) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str3 = a17.f213279f;
            int lastIndexOf = str3.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            int lastIndexOf2 = str3.lastIndexOf(46);
            if (lastIndexOf2 > 0 && lastIndexOf2 != str3.length() - 1) {
                return str3.substring(lastIndexOf2 + 1);
            }
        }
        return "";
    }

    public static byte[] o(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        if (str == null) {
            return null;
        }
        try {
            inputStream = E(str);
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        byte[] digest = messageDigest.digest();
                        com.tencent.mm.vfs.e8.d(inputStream);
                        return digest;
                    }
                    messageDigest.update(bArr, 0, read);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mm.vfs.e8.d(inputStream);
                return null;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.tencent.mm.vfs.e8.d(inputStream);
                throw th6;
            }
        } catch (java.lang.Exception unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }

    public static java.lang.String p(java.lang.String str) {
        byte[] o17 = o(str);
        if (o17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
        for (byte b17 : o17) {
            sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
        }
        return sb6.toString();
    }

    public static java.lang.String q(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str3.lastIndexOf(46);
        return lastIndexOf2 < 0 ? str : lastIndexOf2 == 0 ? "" : str3.substring(0, lastIndexOf2);
    }

    public static java.lang.String r(java.lang.String str) {
        return new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).n().r();
    }

    public static java.lang.Iterable s(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (!m17.a()) {
            return null;
        }
        java.lang.String str2 = m17.f213267b;
        com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
        return z17 ? com.tencent.mm.vfs.e8.o(q2Var, str2) : q2Var.list(str2);
    }

    public static void t(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(com.tencent.mm.vfs.z7.a(str), null);
        if (m17.a()) {
            com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
            if ((q2Var.o() & 2) == 0) {
                return;
            }
            java.lang.String str2 = m17.f213267b;
            if (q2Var.D(str2, true) == null) {
                return;
            }
            try {
                q2Var.c(str2 + "/.nomedia", false).close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean u(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        return r6Var.J() || r6Var.y();
    }

    public static boolean v(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        com.tencent.mm.vfs.z2 m18 = b3Var.m(com.tencent.mm.vfs.z7.a(str2), null);
        if (!m17.a() || !m18.a() || m17.equals(m18)) {
            return false;
        }
        try {
            if (m18.f213266a.t(m18.f213267b, m17.f213266a, m17.f213267b)) {
                return true;
            }
            if (O(m17, m18, true)) {
                return g(str, false);
            }
            return false;
        } catch (java.io.IOException e17) {
            com.tencent.stubs.logger.Log.e("MicroMsg.VFSFileOp", "Cannot move dir: " + str + " -> " + str2, e17);
            return false;
        }
    }

    public static boolean w(java.lang.String str, java.lang.String str2) {
        return x(str, str2, true);
    }

    public static boolean x(java.lang.String str, java.lang.String str2, boolean z17) {
        if (str != null && str2 != null && str.length() != 0 && str2.length() != 0) {
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(com.tencent.mm.vfs.z7.a(str), null);
            com.tencent.mm.vfs.z2 m18 = b3Var.m(com.tencent.mm.vfs.z7.a(str2), null);
            boolean a17 = m17.a();
            java.lang.String str3 = m17.f213267b;
            com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
            if (a17) {
                boolean a18 = m18.a();
                java.lang.String str4 = m18.f213267b;
                com.tencent.mm.vfs.q2 q2Var2 = m18.f213266a;
                if (a18) {
                    try {
                        boolean t17 = q2Var2.t(str4, q2Var, str3);
                        if (!t17 && z17) {
                            t17 = q2Var2.i(str4, q2Var, str3, false) >= 0;
                            if (t17) {
                                q2Var.d(str3);
                            }
                        }
                        return t17;
                    } catch (java.io.IOException e17) {
                        com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", "Failed to move file " + str + " -> " + str2 + ": " + e17.getMessage());
                    }
                }
            }
        }
        return false;
    }

    public static android.os.ParcelFileDescriptor y(android.net.Uri uri, java.lang.String str) {
        return z(new com.tencent.mm.vfs.z7(uri), null, str);
    }

    public static android.os.ParcelFileDescriptor z(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var, java.lang.String str) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, z2Var);
        if (m17.a()) {
            return m17.f213266a.x(m17.f213267b, str);
        }
        throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
    }
}
