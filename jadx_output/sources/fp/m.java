package fp;

/* loaded from: classes12.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f265208a;

    public static java.io.File a() {
        wo.o oVar = wo.v1.f447833m;
        return com.tencent.mm.sdk.platformtools.t8.K0(oVar.B) ? android.os.Environment.getDataDirectory() : new java.io.File(oVar.B);
    }

    public static java.io.File b() {
        wo.o oVar = wo.v1.f447833m;
        return com.tencent.mm.sdk.platformtools.t8.K0(oVar.f447768z) ? android.os.Environment.getExternalStorageDirectory() : new java.io.File(oVar.f447768z);
    }

    public static java.lang.String c() {
        wo.o oVar = wo.v1.f447833m;
        return com.tencent.mm.sdk.platformtools.t8.K0(oVar.C) ? android.os.Environment.getExternalStorageState() : oVar.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d() {
        /*
            java.lang.Boolean r0 = fp.m.f265208a
            if (r0 != 0) goto L51
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.File r3 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r4 = "build.prop"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
            r0.load(r1)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
            java.lang.String r2 = "ro.miui.ui.version.name"
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
            fp.m.f265208a = r0     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4a
        L2a:
            r1.close()     // Catch: java.lang.Exception -> L51
            goto L51
        L2e:
            r0 = move-exception
            goto L39
        L30:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L4b
        L35:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L39:
            java.lang.String r2 = "MicroMsg.Environment"
            java.lang.String r3 = "** failed to fetch miui prop, assume we are not on miui. **"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4a
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4a
            fp.m.f265208a = r0     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L51
            goto L2a
        L4a:
            r0 = move-exception
        L4b:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Exception -> L50
        L50:
            throw r0
        L51:
            java.lang.Boolean r0 = fp.m.f265208a
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.m.d():boolean");
    }

    public static boolean e() {
        return false;
    }
}
