package xc2;

/* loaded from: classes2.dex */
public final class y0 extends xc2.o {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #2 {Exception -> 0x0054, blocks: (B:40:0x004c, B:18:0x0059), top: B:39:0x004c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #0 {Exception -> 0x0075, blocks: (B:36:0x006e, B:28:0x007a), top: B:35:0x006e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xc2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject n(xc2.p0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "infoEx"
            kotlin.jvm.internal.o.g(r9, r0)
            org.json.JSONObject r9 = super.n(r9)
            if (r9 != 0) goto L10
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
        L10:
            in5.s0 r0 = r8.f453161a
            if (r0 == 0) goto La0
            android.content.Context r0 = r0.f293121e
            if (r0 == 0) goto La0
            java.lang.Class<c61.yb> r1 = c61.yb.class
            i95.m r1 = i95.n0.c(r1)
            c61.yb r1 = (c61.yb) r1
            c61.p2 r1 = (c61.p2) r1
            zy2.ra r0 = r1.Sj(r0)
            if (r0 == 0) goto L36
            com.tencent.mm.plugin.finder.viewmodel.component.ny r0 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r0
            r45.qt2 r0 = r0.V6()
            r1 = 17
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L38
        L36:
            java.lang.String r0 = "{}"
        L38:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8c
            r1.<init>(r0)     // Catch: org.json.JSONException -> L8c
            java.lang.String r0 = "clientReportInfo"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L8c
            java.lang.String r1 = ""
            java.lang.String r2 = "profile_finder_username"
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L56
            boolean r6 = r0.has(r2)     // Catch: java.lang.Exception -> L54
            if (r6 != r3) goto L56
            r6 = r3
            goto L57
        L54:
            r6 = move-exception
            goto L5e
        L56:
            r6 = r4
        L57:
            if (r6 == 0) goto L67
            java.lang.String r5 = r0.getString(r2)     // Catch: java.lang.Exception -> L54
            goto L67
        L5e:
            java.lang.String r7 = "safeGetString"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: org.json.JSONException -> L8c
            com.tencent.mm.sdk.platformtools.Log.a(r7, r1, r6)     // Catch: org.json.JSONException -> L8c
        L67:
            r9.put(r2, r5)     // Catch: org.json.JSONException -> L8c
            java.lang.String r2 = "profile_tab_type"
            if (r0 == 0) goto L77
            boolean r5 = r0.has(r2)     // Catch: java.lang.Exception -> L75
            if (r5 != r3) goto L77
            goto L78
        L75:
            r0 = move-exception
            goto L7f
        L77:
            r3 = r4
        L78:
            if (r3 == 0) goto L88
            int r4 = r0.getInt(r2)     // Catch: java.lang.Exception -> L75
            goto L88
        L7f:
            java.lang.String r3 = "safeGetInt"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: org.json.JSONException -> L8c
            com.tencent.mm.sdk.platformtools.Log.a(r3, r1, r0)     // Catch: org.json.JSONException -> L8c
        L88:
            r9.put(r2, r4)     // Catch: org.json.JSONException -> L8c
            goto La0
        L8c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handle error:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FinderPromotionTagJumperEventHandler"
            com.tencent.mars.xlog.Log.e(r1, r0)
        La0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.y0.n(xc2.p0):org.json.JSONObject");
    }
}
