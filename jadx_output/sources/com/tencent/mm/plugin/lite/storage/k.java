package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class k extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f144273e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo.B, com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO)};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f144274d;

    public k(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo.B, com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, null);
        this.f144274d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        this.f144274d.l(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, "appId", ((com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo) f0Var).convertTo());
        return true;
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        this.f144274d.m(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, "appId", ((com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo) f0Var).convertTo());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo y0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "LiteAppConfigInfo"
            java.lang.String r2 = "appId"
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r2, r9}
            java.lang.String r1 = "select * from %s where %s='%s'"
            java.lang.String r9 = java.lang.String.format(r1, r9)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            l75.k0 r3 = r8.f144274d     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            r4 = 2
            android.database.Cursor r9 = r3.f(r9, r2, r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            if (r9 == 0) goto L32
            boolean r2 = r9.moveToFirst()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            if (r2 == 0) goto L32
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo r2 = new com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r2.convertFrom(r9)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r9.close()
            return r2
        L30:
            r2 = move-exception
            goto L3f
        L32:
            if (r9 == 0) goto L54
        L34:
            r9.close()
            goto L54
        L38:
            r9 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L56
        L3d:
            r2 = move-exception
            r9 = r0
        L3f:
            java.lang.String r3 = "MicroMsg.LiteAppConfigInfoStorage"
            java.lang.String r4 = "getLiteAppConfigInfo failed. :%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L55
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.z3.c(r2)     // Catch: java.lang.Throwable -> L55
            r5[r1] = r2     // Catch: java.lang.Throwable -> L55
            com.tencent.mars.xlog.Log.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L54
            goto L34
        L54:
            return r0
        L55:
            r0 = move-exception
        L56:
            if (r9 == 0) goto L5b
            r9.close()
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.storage.k.y0(java.lang.String):com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo");
    }
}
