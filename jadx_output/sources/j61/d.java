package j61;

/* loaded from: classes4.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f297875e = {l75.n0.getCreateSQLs(j61.c.f297874t, "AARecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f297876f = {"*", "rowid"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f297877g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f297878d;

    public d(l75.k0 k0Var) {
        super(k0Var, j61.c.f297874t, "AARecord", null);
        this.f297878d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(j61.c cVar) {
        if (cVar != null) {
            java.util.Map map = f297877g;
            if (((java.util.HashMap) map).containsKey(cVar.field_billNo)) {
                ((java.util.HashMap) map).put(cVar.field_billNo, cVar);
            }
        }
        return super.insert(cVar);
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean replace(j61.c cVar) {
        if (cVar != null) {
            java.util.Map map = f297877g;
            if (((java.util.HashMap) map).containsKey(cVar.field_billNo)) {
                ((java.util.HashMap) map).put(cVar.field_billNo, cVar);
            }
        }
        return super.replace(cVar);
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean delete(j61.c cVar, java.lang.String... strArr) {
        if (cVar != null) {
            java.util.Map map = f297877g;
            if (((java.util.HashMap) map).containsKey(cVar.field_billNo)) {
                ((java.util.HashMap) map).remove(cVar.field_billNo);
            }
        }
        return super.delete(cVar, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r12 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j61.c z0(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            l75.k0 r2 = r11.f297878d
            java.lang.String r3 = "AARecord"
            java.lang.String[] r4 = j61.d.f297876f
            java.lang.String r5 = "billNo=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r12 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r0 == 0) goto L2e
            j61.c r0 = new j61.c     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0.convertFrom(r12)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r12.close()
            return r0
        L2e:
            r12.close()
            goto L49
        L32:
            r0 = move-exception
            goto L4a
        L34:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.AARecordStorage"
            java.lang.String r3 = "getRecordByBillno error: %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L32
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L32
            com.tencent.mars.xlog.Log.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            if (r12 == 0) goto L49
            goto L2e
        L49:
            return r1
        L4a:
            if (r12 == 0) goto L4f
            r12.close()
        L4f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j61.d.z0(java.lang.String):j61.c");
    }
}
