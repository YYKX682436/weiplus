package rw3;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f400641e = {l75.n0.getCreateSQLs(rw3.a.f400640p, "DelayTransferRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f400642f = {"*", "rowid"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f400643d;

    public b(l75.k0 k0Var) {
        super(k0Var, rw3.a.f400640p, "DelayTransferRecord", null);
        this.f400643d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r13 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rw3.a y0(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r13)
            r1 = 0
            java.lang.String r2 = "MicroMsg.AARecordStorage"
            if (r0 == 0) goto Lf
            java.lang.String r13 = "empty transferId"
            com.tencent.mars.xlog.Log.i(r2, r13)
            return r1
        Lf:
            l75.k0 r3 = r12.f400643d
            java.lang.String r4 = "DelayTransferRecord"
            java.lang.String[] r5 = rw3.b.f400642f
            java.lang.String r6 = "transferId=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r13 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L36
            rw3.a r0 = new rw3.a     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r0.convertFrom(r13)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r13.close()
            return r0
        L36:
            r13.close()
            goto L48
        L3a:
            r0 = move-exception
            goto L49
        L3c:
            r0 = move-exception
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3a
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L3a
            if (r13 == 0) goto L48
            goto L36
        L48:
            return r1
        L49:
            if (r13 == 0) goto L4e
            r13.close()
        L4e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rw3.b.y0(java.lang.String):rw3.a");
    }
}
