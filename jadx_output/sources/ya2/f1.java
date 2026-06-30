package ya2;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ya2.f1 f460479d = new ya2.f1();

    public f1() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < r6) goto L19;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            r45.xa5 r6 = (r45.xa5) r6
            r0 = 9
            java.lang.String r6 = r6.getString(r0)
            if (r6 != 0) goto Lc
            java.lang.String r6 = ""
        Lc:
            r0 = 1
            r1 = 0
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r2 = i95.n0.c(r2)     // Catch: java.lang.Throwable -> L42
            e42.e0 r2 = (e42.e0) r2     // Catch: java.lang.Throwable -> L42
            e42.d0 r3 = e42.d0.clicfg_finder_jump_app_switch     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "{\"com.tencent.phoenix\":{\"minApi\":26}}"
            h62.d r2 = (h62.d) r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r2.Zi(r3, r4, r0)     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L4c
            if (r2 == 0) goto L4c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L4c
            java.lang.String r2 = "minApi"
            int r6 = r6.optInt(r2, r1)     // Catch: java.lang.Throwable -> L42
            if (r6 <= 0) goto L4c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L42
            if (r2 >= r6) goto L4c
            goto L4d
        L42:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "FinderConfig"
            java.lang.String r3 = "SHARE_SDK_SWITCH"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r6, r3, r1)
        L4c:
            r1 = r0
        L4d:
            r6 = r1 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.f1.invoke(java.lang.Object):java.lang.Object");
    }
}
