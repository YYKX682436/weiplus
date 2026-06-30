package k65;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final k65.l f304617a = new k65.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f304618b = new java.lang.Object();

    public static final void f(java.lang.String versionDir, boolean z17) {
        java.lang.String g17;
        java.lang.String valueOf;
        com.tencent.mm.vfs.r6 c17;
        kotlin.jvm.internal.o.g(versionDir, "versionDir");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            synchronized (f304618b) {
                try {
                    com.tencent.mm.vfs.r6 r6Var = j65.b.f297918g;
                    if (!r6Var.m()) {
                        r6Var.J();
                    }
                    k65.l lVar = f304617a;
                    g17 = lVar.g(versionDir);
                    valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    c17 = lVar.c(g17);
                } finally {
                }
                if (z17 || !c17.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseStringConstant", "touchUncompressedCacheDir: " + valueOf + " versionKey: " + g17);
                    java.lang.String o17 = c17.o();
                    java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                    kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                    byte[] bytes = valueOf.getBytes(UTF_8);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: all -> 0x017c, TryCatch #0 {all -> 0x017c, blocks: (B:3:0x0005, B:7:0x000c, B:11:0x001e, B:13:0x0026, B:18:0x0035, B:22:0x0048, B:28:0x0059, B:30:0x005f, B:33:0x0066, B:34:0x0094, B:39:0x00b4, B:42:0x00a1, B:44:0x00ab, B:17:0x00d3, B:50:0x00d8, B:52:0x00e2, B:55:0x00ed, B:57:0x00f1, B:62:0x00fc, B:64:0x010b, B:67:0x0112, B:68:0x013d, B:73:0x015d, B:76:0x014a, B:78:0x0154), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #0 {all -> 0x017c, blocks: (B:3:0x0005, B:7:0x000c, B:11:0x001e, B:13:0x0026, B:18:0x0035, B:22:0x0048, B:28:0x0059, B:30:0x005f, B:33:0x0066, B:34:0x0094, B:39:0x00b4, B:42:0x00a1, B:44:0x00ab, B:17:0x00d3, B:50:0x00d8, B:52:0x00e2, B:55:0x00ed, B:57:0x00f1, B:62:0x00fc, B:64:0x010b, B:67:0x0112, B:68:0x013d, B:73:0x015d, B:76:0x014a, B:78:0x0154), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.vfs.r6 r23) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k65.l.a(com.tencent.mm.vfs.r6):void");
    }

    public final com.tencent.mm.vfs.r6 b() {
        return new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), "mmstr_uncompressed_last_used_meta");
    }

    public final com.tencent.mm.vfs.r6 c(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = j65.b.f297918g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mm_base_string_resource_");
        k65.k[] kVarArr = k65.k.f304616d;
        sb7.append(str);
        sb6.append(sb7.toString());
        sb6.append(".mmstr_last_used");
        return new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
    }

    public final long d(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String name = r6Var.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        com.tencent.mm.vfs.r6 c17 = c(name);
        if (c17.m()) {
            return e(c17);
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(b(), name);
        if (r6Var2.m()) {
            return e(r6Var2);
        }
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var, ".mmstr_version_last_used");
        if (r6Var3.m()) {
            return e(r6Var3);
        }
        return -1L;
    }

    public final long e(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String obj;
        java.lang.Long j17;
        try {
            java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(C, java.nio.charset.StandardCharsets.UTF_8));
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    long longValue = (readLine == null || (obj = r26.n0.u0(readLine).toString()) == null || (j17 = r26.h0.j(obj)) == null) ? -1L : j17.longValue();
                    vz5.b.a(bufferedReader, null);
                    vz5.b.a(C, null);
                    return longValue;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMBaseStringConstant", th6, "readLastUsedMsFromFile", new java.lang.Object[0]);
            return -1L;
        }
    }

    public final java.lang.String g(java.lang.String str) {
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
        kotlin.jvm.internal.o.f(str3, "getName(...)");
        return str3;
    }
}
