package wz4;

/* loaded from: classes8.dex */
public class b extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static wz4.b f450794f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f450796d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f450793e = {l75.n0.getCreateSQLs(wz4.a.B, "WePkgDiffPackage")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f450795g = new java.lang.Object();

    public b(l75.k0 k0Var) {
        super(k0Var, wz4.a.B, "WePkgDiffPackage", dm.jc.f237911p);
        this.f450796d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if ((r1.f450796d != null) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wz4.b z0() {
        /*
            wz4.b r0 = wz4.b.f450794f
            if (r0 != 0) goto L26
            java.lang.Object r0 = wz4.b.f450795g
            monitor-enter(r0)
            wz4.b r1 = wz4.b.f450794f     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            l75.k0 r1 = r1.f450796d     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L21
        L14:
            wz4.b r1 = new wz4.b     // Catch: java.lang.Throwable -> L23
            gm0.b0 r2 = gm0.j1.u()     // Catch: java.lang.Throwable -> L23
            l75.k0 r2 = r2.f273153f     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            wz4.b.f450794f = r1     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
        L26:
            wz4.b r0 = wz4.b.f450794f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz4.b.z0():wz4.b");
    }

    public boolean d(java.lang.String str) {
        if (!(this.f450796d != null) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return execSQL("WePkgDiffPackage", java.lang.String.format("delete from %s where %s=%s", "WePkgDiffPackage", "pkgId", "'" + str + "'"));
    }

    public wz4.a y0(java.lang.String str) {
        if (!(this.f450796d != null) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor rawQuery = rawQuery(java.lang.String.format("select * from %s where %s=%s", "WePkgDiffPackage", "pkgId", "'" + str + "'"), new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        wz4.a aVar = new wz4.a();
        aVar.convertFrom(rawQuery);
        rawQuery.close();
        return aVar;
    }
}
