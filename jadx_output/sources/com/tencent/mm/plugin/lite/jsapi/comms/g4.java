package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes9.dex */
public class g4 extends com.tencent.mm.plugin.lite.api.p {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8, org.json.JSONObject r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "invoke openShortLink, appId: %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "LiteAppJsApiOpenShortLink"
            com.tencent.mars.xlog.Log.i(r0, r10, r8)
            if (r9 != 0) goto L15
            com.tencent.mm.plugin.lite.api.o r8 = r7.f143443f
            java.lang.String r9 = "missing parameters"
            r8.a(r9)
            return
        L15:
            java.lang.String r8 = "url"
            java.lang.String r8 = r9.optString(r8)
            r9 = 0
            if (r8 == 0) goto L74
            java.lang.String r10 = r8.trim()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L2a
            goto L74
        L2a:
            java.lang.String r10 = r8.trim()
            java.lang.String r1 = "mp://"
            boolean r2 = r10.startsWith(r1)
            if (r2 == 0) goto L37
            goto L76
        L37:
            java.lang.String r2 = "#小程序://"
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L74
            r2 = r9
            r3 = r2
        L41:
            int r4 = r10.length()
            if (r2 >= r4) goto L5a
            char r4 = r10.charAt(r2)
            r5 = 47
            if (r4 != r5) goto L57
            int r3 = r3 + 1
            r4 = 3
            if (r3 != r4) goto L57
            int r2 = r2 + 1
            goto L5b
        L57:
            int r2 = r2 + 1
            goto L41
        L5a:
            r2 = -1
        L5b:
            if (r2 <= 0) goto L74
            int r3 = r10.length()
            if (r2 >= r3) goto L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r10 = r10.substring(r2)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            goto L76
        L74:
            java.lang.String r10 = ""
        L76:
            r3 = r10
            java.lang.String r10 = "openShortLink with url:%s to:%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r3}
            com.tencent.mars.xlog.Log.i(r0, r10, r1)
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L97
            java.lang.String r9 = "invalid url format %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.tencent.mars.xlog.Log.e(r0, r9, r8)
            com.tencent.mm.plugin.lite.api.o r8 = r7.f143443f
            java.lang.String r9 = "invalid url format"
            r8.a(r9)
            return
        L97:
            com.tencent.mm.pluginsdk.ui.span.l1 r5 = com.tencent.mm.pluginsdk.ui.span.l1.f191262s
            java.lang.Class<l81.r0> r8 = l81.r0.class
            i95.m r8 = i95.n0.c(r8)
            l81.r0 r8 = (l81.r0) r8
            android.content.Context r2 = r7.c()
            java.lang.String r4 = ""
            r6 = -1
            r1 = r8
            kj1.a0 r1 = (kj1.a0) r1
            r1.wi(r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.lite.api.o r8 = r7.f143443f
            r8.d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.g4.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
