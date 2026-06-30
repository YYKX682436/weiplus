package t81;

/* loaded from: classes7.dex */
public final class d extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f416355f = {l75.n0.getCreateSQLs(t81.c.Z, "PredownloadCmdGetCodePersistentInfo2"), "DROP TABLE IF EXISTS PredownloadCmdGetCodePersistentInfo"};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f416356e;

    public d(l75.k0 k0Var) {
        super(k0Var, t81.c.Z, "PredownloadCmdGetCodePersistentInfo2", dm.n9.A);
        this.f416356e = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r9.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r0 = new t81.c();
        r0.convertFrom(r9);
        r10.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r9.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D0(java.lang.String r9, java.lang.String... r10) {
        /*
            r8 = this;
            l75.k0 r0 = r8.f416356e
            java.lang.String r1 = "PredownloadCmdGetCodePersistentInfo2"
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r0.E(r1, r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L37
            boolean r10 = r9.isClosed()
            if (r10 == 0) goto L17
            goto L37
        L17:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            boolean r0 = r9.moveToFirst()
            if (r0 == 0) goto L33
        L22:
            t81.c r0 = new t81.c
            r0.<init>()
            r0.convertFrom(r9)
            r10.add(r0)
            boolean r0 = r9.moveToNext()
            if (r0 != 0) goto L22
        L33:
            r9.close()
            return r10
        L37:
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t81.d.D0(java.lang.String, java.lang.String[]):java.util.List");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean update(t81.c cVar, java.lang.String... strArr) {
        boolean update = super.update(cVar, strArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "update(%b) %s", java.lang.Boolean.valueOf(update), cVar);
        return update;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean delete(t81.c cVar, java.lang.String... strArr) {
        boolean delete = super.delete(cVar, strArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "delete(%b) %s", java.lang.Boolean.valueOf(delete), cVar);
        return delete;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(t81.c cVar) {
        boolean insert = super.insert(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "insert(%b) %s", java.lang.Boolean.valueOf(insert), cVar);
        return insert;
    }
}
