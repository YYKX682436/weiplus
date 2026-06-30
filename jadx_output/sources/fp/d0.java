package fp;

/* loaded from: classes12.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f265166a = new java.util.TreeSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f265167b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f265168c = new java.util.HashMap(64);

    /* renamed from: d, reason: collision with root package name */
    public static final fp.y f265169d = new fp.y("load-lib-spin");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f265170e = java.util.regex.Pattern.compile("lib([^\\s/]+?)\\.so");

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.reflect.Method[] f265171f = {null};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Boolean[] f265172g = {null};

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f265173h = {null};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.ThreadLocal f265174i = new java.lang.ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.ThreadLocal f265175j = new java.lang.ThreadLocal();

    public static void a(java.lang.String str, java.lang.UnsatisfiedLinkError unsatisfiedLinkError) {
        java.util.List list = f265167b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.expansions.f0) ((fp.c0) it.next())).getClass();
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            throw unsatisfiedLinkError;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader) {
        java.util.List list = f265167b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((fp.c0) it.next()).getClass();
            }
        }
    }

    public static void c(java.lang.String str) {
        java.util.Set set = f265166a;
        synchronized (set) {
            ((java.util.TreeSet) set).add(str);
            t(2, "MicroMsg.LoadLibrary", "[+] Prior library search path '%s' added.", str);
        }
    }

    public static boolean d(java.lang.String str) {
        boolean z17;
        java.util.Map map = f265168c;
        boolean[] zArr = (boolean[]) ((java.util.HashMap) map).get(str);
        if (zArr == null) {
            synchronized (map) {
                zArr = (boolean[]) ((java.util.HashMap) map).get(str);
                if (zArr == null) {
                    return false;
                }
            }
        }
        synchronized (zArr) {
            z17 = zArr[0];
        }
        return z17;
    }

    public static void e(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
                return;
            }
            if (obj instanceof java.lang.AutoCloseable) {
                ((java.lang.AutoCloseable) obj).close();
            } else if (obj instanceof java.util.zip.ZipFile) {
                ((java.util.zip.ZipFile) obj).close();
            } else {
                if (!(obj instanceof android.net.LocalServerSocket)) {
                    throw new java.lang.IllegalStateException(obj.getClass().getName().concat(" is not closeable."));
                }
                ((android.net.LocalServerSocket) obj).close();
            }
        } catch (java.lang.IllegalStateException e17) {
            throw e17;
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.BufferedInputStream, java.lang.Object, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.io.OutputStream, java.lang.Object, java.io.BufferedOutputStream] */
    public static void f(android.content.Context context, java.lang.String str, java.io.File file) {
        java.io.BufferedInputStream bufferedInputStream;
        java.util.zip.ZipFile zipFile = null;
        try {
            java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(context.getApplicationInfo().sourceDir);
            try {
                java.lang.String l17 = l(context, str);
                if (l17 == null) {
                    throw new java.io.FileNotFoundException("Cannot find " + str + " in apk with best ABI.");
                }
                java.util.zip.ZipEntry entry = zipFile2.getEntry(l17);
                java.io.File file2 = new java.io.File(file, str);
                if (file2.isDirectory()) {
                    t(3, "MicroMsg.LoadLibrary", "[!] Path %s is a directory, remove it first.", file2.getAbsolutePath());
                    file2.delete();
                } else if (file2.canRead()) {
                    long crc = entry.getCrc();
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    byte[] bArr = new byte[4096];
                    try {
                        ?? bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(file2));
                        while (true) {
                            try {
                                int read = bufferedInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    crc32.update(bArr, 0, read);
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                zipFile = bufferedInputStream2;
                                e(zipFile);
                                throw th;
                            }
                        }
                        long value = crc32.getValue();
                        e(bufferedInputStream2);
                        if (value == crc) {
                            t(3, "MicroMsg.LoadLibrary", "[!] CRC check of [%s] in recovery dir was passed, skip extracting.", str);
                            e(zipFile2);
                            return;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                java.io.File file3 = new java.io.File(file2.getAbsolutePath() + ".tmp");
                try {
                    ?? bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file3));
                    try {
                        bufferedInputStream = new java.io.BufferedInputStream(zipFile2.getInputStream(entry));
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read2 = bufferedInputStream.read(bArr2);
                                if (read2 <= 0) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr2, 0, read2);
                                }
                            }
                            e(bufferedOutputStream);
                            e(bufferedInputStream);
                            if (file3.renameTo(file2)) {
                                e(zipFile2);
                                return;
                            }
                            throw new java.io.IOException("Cannot rename " + file3.getAbsolutePath() + " to " + file2.getAbsolutePath());
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            zipFile = bufferedOutputStream;
                            try {
                                file3.delete();
                                throw th;
                            } catch (java.lang.Throwable th9) {
                                e(zipFile);
                                e(bufferedInputStream);
                                throw th9;
                            }
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        bufferedInputStream = null;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    bufferedInputStream = null;
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                zipFile = zipFile2;
                e(zipFile);
                throw th;
            }
        } catch (java.lang.Throwable th13) {
            th = th13;
        }
    }

    public static java.lang.String g(java.lang.String str) {
        return h(str, fp.b0.a());
    }

    public static java.lang.String h(java.lang.String str, fp.b0 b0Var) {
        java.lang.String j17 = j(str);
        if (j17 != null) {
            java.lang.String d17 = b0Var.d(j17);
            t(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, d17);
            return d17;
        }
        java.lang.String i17 = i(str, fp.d0.class.getClassLoader());
        if (i17 != null) {
            java.lang.String d18 = b0Var.d(i17);
            t(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, d18);
            return d18;
        }
        java.lang.String k17 = k(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        if (k17 == null) {
            t(4, "MicroMsg.LoadLibrary", "[-] Fail to find library [%s].", k17);
            return null;
        }
        java.lang.String d19 = b0Var.d(k17);
        t(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, d19);
        return d19;
    }

    public static java.lang.String i(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.lang.reflect.Method[] methodArr = f265171f;
        java.lang.reflect.Method method = methodArr[0];
        if (method == null) {
            synchronized (methodArr) {
                method = methodArr[0];
                if (method == null) {
                    try {
                        method = java.lang.ClassLoader.class.getDeclaredMethod("findLibrary", java.lang.String.class);
                        method.setAccessible(true);
                        methodArr[0] = method;
                    } catch (java.lang.Throwable th6) {
                        u("MicroMsg.LoadLibrary", th6, "[-] Fail to reflect findLibrary method: " + classLoader, new java.lang.Object[0]);
                        return null;
                    }
                }
            }
        }
        try {
            return (java.lang.String) method.invoke(classLoader, str);
        } catch (java.lang.Throwable th7) {
            u("MicroMsg.LoadLibrary", th7, "[-] Fail to find library in classloader: " + classLoader, new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.lang.String m17 = m(str);
        java.util.Set set = f265166a;
        synchronized (set) {
            arrayList = new java.util.ArrayList(set);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.io.File file = new java.io.File((java.lang.String) it.next(), m17);
            if (!file.isDirectory() && file.canRead()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    public static java.lang.String k(android.content.Context context, java.lang.String str) {
        fp.y yVar = f265169d;
        synchronized (yVar) {
            try {
                yVar.a();
                java.io.File file = new java.io.File(context.getDir("recovery_lib", 0), m(str));
                if (file.isDirectory() || !file.canRead()) {
                    yVar.b();
                    return null;
                }
                java.lang.String absolutePath = file.getAbsolutePath();
                yVar.b();
                return absolutePath;
            } catch (java.lang.Throwable th6) {
                f265169d.b();
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String l(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        boolean booleanValue;
        java.util.zip.ZipFile zipFile;
        java.lang.String[] strArr = f265173h;
        synchronized (strArr) {
            java.lang.String str3 = strArr[0];
            if (str3 == null) {
                java.lang.Boolean[] boolArr = f265172g;
                synchronized (boolArr) {
                    java.lang.Boolean bool = boolArr[0];
                    if (bool == null) {
                        bool = java.lang.Boolean.valueOf(android.os.Process.is64Bit());
                        boolArr[0] = bool;
                    }
                    booleanValue = bool.booleanValue();
                }
                java.lang.String[] strArr2 = booleanValue ? android.os.Build.SUPPORTED_64_BIT_ABIS : android.os.Build.SUPPORTED_32_BIT_ABIS;
                str2 = null;
                try {
                    try {
                        zipFile = new java.util.zip.ZipFile(context.getApplicationInfo().sourceDir);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                } catch (java.io.IOException e17) {
                    e = e17;
                }
                try {
                    int length = strArr2.length;
                    int i17 = 0;
                    java.lang.String str4 = null;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        java.lang.String str5 = strArr2[i17];
                        java.lang.String str6 = "lib/" + str5 + "/" + str;
                        if (zipFile.getEntry(str6) != null) {
                            str3 = str5;
                            str4 = str6;
                            break;
                        }
                        i17++;
                        str4 = str6;
                    }
                    if (str3 == null) {
                        t(4, "MicroMsg.LoadLibrary", "[-] ", new java.lang.Object[0]);
                    } else {
                        str2 = str4;
                    }
                    e(zipFile);
                    f265173h[0] = str3;
                } catch (java.io.IOException e18) {
                    e = e18;
                    throw new java.lang.IllegalStateException(e);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str2 = zipFile;
                    e(str2);
                    throw th;
                }
            } else {
                str2 = "lib/" + str3 + "/" + str;
            }
        }
        return str2;
    }

    public static java.lang.String m(java.lang.String str) {
        return com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + str + ".so";
    }

    public static void n(java.lang.String str) {
        r(str, fp.b0.a());
    }

    public static void o(java.lang.String str) {
        r(str, fp.b0.f265163a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(java.lang.String r9, java.lang.ClassLoader r10, fp.b0 r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.d0.p(java.lang.String, java.lang.ClassLoader, fp.b0):void");
    }

    public static void q(java.lang.String str, java.lang.ClassLoader classLoader, fp.b0 b0Var) {
        java.lang.String j17 = j(str);
        if (j17 != null) {
            try {
                t(2, "MicroMsg.LoadLibrary", "[+] Library [%s] was loaded, path: %s, origin: %s", str, b0Var.c(j17), j17);
                b(str, j17, classLoader);
                return;
            } catch (java.lang.UnsatisfiedLinkError e17) {
                try {
                    java.lang.Thread.sleep(50L);
                } catch (java.lang.Throwable unused) {
                }
                try {
                    t(2, "MicroMsg.LoadLibrary", "[+] [RE] Library [%s] was loaded, path: %s, origin: %s", str, b0Var.c(j17), j17);
                } catch (java.lang.UnsatisfiedLinkError unused2) {
                    if (fp.q.f265230a.c()) {
                        t(2, "MicroMsg.LoadLibrary", "[+] Try to load library with expansions", new java.lang.Object[0]);
                        try {
                            if (fp.q.f265230a.b(str)) {
                                return;
                            }
                        } catch (java.lang.Throwable unused3) {
                            u("MicroMsg.LoadLibrary", e17, "[-] Fail to load library with expansions", new java.lang.Object[0]);
                        }
                    }
                }
                b(str, j17, classLoader);
                return;
            }
        }
        t(2, "MicroMsg.LoadLibrary", "[+] Try to load library [%s] with cl: %s", str, classLoader);
        java.lang.String i17 = i(str, classLoader);
        if (i17 != null) {
            try {
                t(2, "MicroMsg.LoadLibrary", "[+] Library [%s] was loaded, path: %s, origin: %s", str, b0Var.c(i17), i17);
                b(str, i17, classLoader);
                return;
            } catch (java.lang.UnsatisfiedLinkError unused4) {
                try {
                    java.lang.Thread.sleep(5L);
                } catch (java.lang.Throwable unused5) {
                }
                try {
                    t(2, "MicroMsg.LoadLibrary", "[+] [RE] Library [%s] was loaded, path: %s, origin: %s", str, b0Var.c(i17), i17);
                    b(str, i17, classLoader);
                    return;
                } catch (java.lang.UnsatisfiedLinkError unused6) {
                }
            }
        } else {
            t(4, "MicroMsg.LoadLibrary", "[-] Fail to find library path", new java.lang.Object[0]);
        }
        t(2, "MicroMsg.LoadLibrary", "[=] Try to load library with other ways", new java.lang.Object[0]);
        t(2, "MicroMsg.LoadLibrary", "[+] Try to load with usual System API", new java.lang.Object[0]);
        try {
            b0Var.b(str);
        } catch (java.lang.Throwable th6) {
            u("MicroMsg.LoadLibrary", th6, "[-] Fail to load with usual System API", new java.lang.Object[0]);
            if (fp.q.f265230a.c()) {
                t(2, "MicroMsg.LoadLibrary", "[+] Try to load library with expansions", new java.lang.Object[0]);
                try {
                    if (fp.q.f265230a.b(str)) {
                        return;
                    }
                } catch (java.lang.Throwable th7) {
                    u("MicroMsg.LoadLibrary", th7, "[-] Fail to load library with expansions", new java.lang.Object[0]);
                }
            }
            p(str, classLoader, b0Var);
        }
    }

    public static void r(java.lang.String str, fp.b0 b0Var) {
        java.lang.ClassLoader classLoader = fp.d0.class.getClassLoader();
        java.util.Map map = f265168c;
        boolean[] zArr = (boolean[]) ((java.util.HashMap) map).get(str);
        if (zArr == null) {
            synchronized (map) {
                zArr = (boolean[]) ((java.util.HashMap) map).get(str);
                if (zArr == null) {
                    zArr = new boolean[]{false};
                    ((java.util.HashMap) map).put(str, zArr);
                }
            }
        }
        synchronized (zArr) {
            if (!zArr[0]) {
                q(str, classLoader, b0Var);
                zArr[0] = true;
            }
        }
    }

    public static void s(java.lang.String str) {
        fp.b0 b0Var = fp.b0.f265163a;
        java.lang.System.load(str);
    }

    public static void t(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.ThreadLocal threadLocal = f265174i;
        java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
        if (bool != null && bool.booleanValue()) {
            if (objArr == null || objArr.length == 0) {
                android.util.Log.println(i17, str, str2);
                return;
            } else {
                android.util.Log.println(i17, str, java.lang.String.format(str2, objArr));
                return;
            }
        }
        threadLocal.set(java.lang.Boolean.TRUE);
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i(str, str2, objArr);
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.w(str, str2, objArr);
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.e(str, str2, objArr);
        }
        threadLocal.set(java.lang.Boolean.FALSE);
    }

    public static void u(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.ThreadLocal threadLocal = f265175j;
        java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            threadLocal.set(java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
            threadLocal.set(java.lang.Boolean.FALSE);
        } else {
            if (objArr == null || objArr.length == 0) {
                return;
            }
            java.lang.String.format(str2, objArr);
        }
    }
}
