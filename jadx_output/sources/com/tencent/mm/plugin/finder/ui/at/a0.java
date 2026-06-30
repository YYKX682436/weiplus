package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.at.a0 f128875a = new com.tencent.mm.plugin.finder.ui.at.a0();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:7:0x000c, B:9:0x0017, B:11:0x0024, B:13:0x002a, B:16:0x0036, B:18:0x0050, B:24:0x0071), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto Lc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            return r12
        Lc:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L6c
            int r12 = r0.length()     // Catch: java.lang.Throwable -> L6c
            if (r12 <= 0) goto L89
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6c
            r12.<init>()     // Catch: java.lang.Throwable -> L6c
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r3 = r2
        L22:
            if (r3 >= r1) goto L77
            org.json.JSONObject r4 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L74
            com.tencent.mm.plugin.finder.ui.at.z r5 = new com.tencent.mm.plugin.finder.ui.at.z     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "name"
            java.lang.String r6 = r4.optString(r6)     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L36
            java.lang.String r6 = ""
        L36:
            java.lang.String r7 = "time"
            long r7 = r4.optLong(r7)     // Catch: java.lang.Throwable -> L6c
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L6c
            long r6 = r5.f128919b     // Catch: java.lang.Throwable -> L6c
            long r8 = c01.id.a()     // Catch: java.lang.Throwable -> L6c
            long r8 = r8 - r6
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 / r6
            r6 = 0
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L6e
            java.lang.Class<e42.e0> r6 = e42.e0.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L6c
            e42.e0 r6 = (e42.e0) r6     // Catch: java.lang.Throwable -> L6c
            e42.d0 r7 = e42.d0.clicfg_finder_recent_at_valid_days     // Catch: java.lang.Throwable -> L6c
            h62.d r6 = (h62.d) r6     // Catch: java.lang.Throwable -> L6c
            r10 = 365(0x16d, float:5.11E-43)
            int r6 = r6.Ni(r7, r10)     // Catch: java.lang.Throwable -> L6c
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L6c
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto L6a
            if (r4 <= 0) goto L6a
            goto L6e
        L6a:
            r4 = r2
            goto L6f
        L6c:
            r12 = move-exception
            goto L78
        L6e:
            r4 = 1
        L6f:
            if (r4 == 0) goto L74
            r12.add(r5)     // Catch: java.lang.Throwable -> L6c
        L74:
            int r3 = r3 + 1
            goto L22
        L77:
            return r12
        L78:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r12 = com.tencent.mm.sdk.platformtools.z3.c(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r0 = "Finder.RecentAtLogic"
            java.lang.String r1 = "optListFromJSONStr err! %s"
            com.tencent.mars.xlog.Log.e(r0, r1, r12)
        L89:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.at.a0.a(java.lang.String):java.util.List");
    }
}
