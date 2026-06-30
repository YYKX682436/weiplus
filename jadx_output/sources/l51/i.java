package l51;

/* loaded from: classes12.dex */
public abstract class i {
    static {
        new java.util.HashMap();
        new java.util.ArrayList();
        new java.util.HashMap();
        new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r28, java.util.ArrayList r29, java.util.List r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l51.i.a(java.lang.String, java.util.ArrayList, java.util.List, java.util.List):void");
    }

    public static java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            new java.util.ArrayList();
            java.lang.System.currentTimeMillis();
            h51.h hVar = new h51.h(new java.io.File(str));
            try {
                java.util.List a17 = m51.c.a(hVar);
                hVar.close();
                java.util.ArrayList arrayList = (java.util.ArrayList) a17;
                java.util.HashMap hashMap2 = new java.util.HashMap(arrayList.size());
                try {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i51.a aVar = (i51.a) it.next();
                        java.lang.String str2 = aVar.f288464e;
                        long j17 = aVar.f288467h;
                        long j18 = aVar.f288462c;
                        boolean z17 = false;
                        if (aVar.f288460a == 8 && j18 != aVar.f288463d) {
                            z17 = true;
                        }
                        hashMap2.put(str2, new h51.j(j17, j18, null, z17));
                    }
                    arrayList.clear();
                    return hashMap2;
                } catch (java.lang.Exception unused) {
                    hashMap = hashMap2;
                    return hashMap;
                }
            } finally {
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public static boolean c(java.lang.String str) {
        boolean z17;
        try {
            new java.util.zip.ZipFile(new java.io.File(str));
            z17 = true;
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        com.tencent.stubs.logger.Log.i("HdiffApk-ZipUtils", "isApkZipCanBeUsed = " + z17 + ", zipPath = " + str);
        return z17;
    }

    public static void d(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.stubs.logger.Log.i("HdiffApk-ZipUtils", str + ", e = " + th6);
        com.tencent.stubs.logger.Log.printStack(4, "HdiffApk-ZipUtils", th6);
    }

    public static void e(java.lang.String str) {
        try {
            new java.io.File(str.substring(0, str.lastIndexOf(java.io.File.separator))).mkdirs();
            java.io.File file = new java.io.File(str);
            file.delete();
            file.createNewFile();
        } catch (java.lang.Exception e17) {
            d("rebuildFile", e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x030c A[Catch: Exception -> 0x0316, LOOP:7: B:109:0x0306->B:111:0x030c, LOOP_END, TRY_LEAVE, TryCatch #34 {Exception -> 0x0316, blocks: (B:108:0x0302, B:109:0x0306, B:111:0x030c), top: B:107:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c9 A[Catch: Exception -> 0x02d3, LOOP:5: B:70:0x02c3->B:72:0x02c9, LOOP_END, TRY_LEAVE, TryCatch #36 {Exception -> 0x02d3, blocks: (B:69:0x02bf, B:70:0x02c3, B:72:0x02c9, B:217:0x0241, B:218:0x0245, B:220:0x024b), top: B:14:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.lang.String r27, java.util.ArrayList r28, java.lang.String r29, java.util.List r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l51.i.f(java.lang.String, java.util.ArrayList, java.lang.String, java.util.List, java.util.List):void");
    }
}
