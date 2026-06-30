package j61;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f297871e = {l75.n0.getCreateSQLs(j61.a.f297870t, "AAPayRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f297872f = {"*", "rowid"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f297873d;

    public b(l75.k0 k0Var) {
        super(k0Var, j61.a.f297870t, "AAPayRecord", null);
        this.f297873d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r12 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j61.a y0(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            l75.k0 r2 = r11.f297873d
            java.lang.String r3 = "AAPayRecord"
            java.lang.String[] r4 = j61.b.f297872f
            java.lang.String r5 = "payMsgId=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r12 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r0 == 0) goto L2f
            j61.a r0 = new j61.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.convertFrom(r12)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r12.close()
            return r0
        L2f:
            r12.close()
            goto L4a
        L33:
            r0 = move-exception
            goto L4b
        L35:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.AAPayRecordStorage"
            java.lang.String r3 = "getByPayMsgId error: %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L33
            com.tencent.mars.xlog.Log.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            if (r12 == 0) goto L4a
            goto L2f
        L4a:
            return r1
        L4b:
            if (r12 == 0) goto L50
            r12.close()
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j61.b.y0(java.lang.String):j61.a");
    }
}
