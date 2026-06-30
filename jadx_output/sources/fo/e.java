package fo;

@j95.b
/* loaded from: classes9.dex */
public final class e extends jm0.o implements le5.e {
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (((r5 == null || (r5 = r5.r()) == null) ? false : r26.n0.B(r5, r6, false)) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Zi(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto Ld
            boolean r2 = r26.n0.N(r5)
            r2 = r2 ^ r0
            if (r2 != r0) goto Ld
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L11
            return r1
        L11:
            p15.e r2 = new p15.e
            r2.<init>()
            r2.fromXml(r5)
            p15.s r5 = r2.q()
            if (r5 == 0) goto L2f
            java.lang.Integer r5 = r5.q()
            if (r5 != 0) goto L26
            goto L2f
        L26:
            int r5 = r5.intValue()
            r3 = 4
            if (r5 != r3) goto L2f
            r5 = r0
            goto L30
        L2f:
            r5 = r1
        L30:
            if (r5 == 0) goto La4
            p15.s r5 = r2.q()
            if (r5 == 0) goto L47
            java.lang.String r5 = r5.s()
            if (r5 == 0) goto L47
            boolean r5 = r26.n0.N(r5)
            r5 = r5 ^ r0
            if (r5 != r0) goto L47
            r5 = r0
            goto L48
        L47:
            r5 = r1
        L48:
            if (r5 == 0) goto La4
            p15.s r5 = r2.q()
            if (r5 == 0) goto L55
            java.lang.String r5 = r5.r()
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L61
            boolean r5 = r26.n0.N(r5)
            if (r5 == 0) goto L5f
            goto L61
        L5f:
            r5 = r1
            goto L62
        L61:
            r5 = r0
        L62:
            java.lang.String r3 = "MicroMsg.ChattingItemSpamFeatureService"
            if (r5 == 0) goto L6c
            java.lang.String r5 = "handle msg source spam"
            com.tencent.mars.xlog.Log.i(r3, r5)
            return r0
        L6c:
            if (r6 == 0) goto L77
            boolean r5 = r26.n0.N(r6)
            r5 = r5 ^ r0
            if (r5 != r0) goto L77
            r5 = r0
            goto L78
        L77:
            r5 = r1
        L78:
            if (r5 == 0) goto L8f
            p15.s r5 = r2.q()
            if (r5 == 0) goto L8b
            java.lang.String r5 = r5.r()
            if (r5 == 0) goto L8b
            boolean r5 = r26.n0.B(r5, r6, r1)
            goto L8c
        L8b:
            r5 = r1
        L8c:
            if (r5 == 0) goto L8f
            goto L90
        L8f:
            r0 = r1
        L90:
            if (r0 == 0) goto La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "handle msg source spam md5:"
            r5.<init>(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r3, r5)
        La3:
            return r0
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.e.Zi(java.lang.String, java.lang.String):boolean");
    }

    public boolean aj(android.content.Context context, long j17, java.lang.String str) {
        return bj(context, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j8(j17), str);
    }

    public boolean bj(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String s17;
        java.lang.String r17;
        java.lang.String s18;
        java.lang.String s19;
        java.lang.Integer q17;
        boolean z17 = false;
        if (context == null) {
            return false;
        }
        if (!(str != null && (r26.n0.N(str) ^ true))) {
            return false;
        }
        p15.e eVar = new p15.e();
        eVar.fromXml(str);
        p15.s q18 = eVar.q();
        if ((q18 == null || (q17 = q18.q()) == null || q17.intValue() != 4) ? false : true) {
            p15.s q19 = eVar.q();
            if ((q19 == null || (s19 = q19.s()) == null || !(r26.n0.N(s19) ^ true)) ? false : true) {
                p15.s q27 = eVar.q();
                java.lang.String r18 = q27 != null ? q27.r() : null;
                java.lang.String str3 = "";
                if (r18 == null || r26.n0.N(r18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemSpamFeatureService", "handle msg source spam");
                    p15.s q28 = eVar.q();
                    if (q28 != null && (s18 = q28.s()) != null) {
                        str3 = s18;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str3);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    return true;
                }
                if (str2 != null && (r26.n0.N(str2) ^ true)) {
                    p15.s q29 = eVar.q();
                    if ((q29 == null || (r17 = q29.r()) == null) ? false : r26.n0.B(r17, str2, false)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemSpamFeatureService", "handle msg source spam md5:" + str2);
                    p15.s q37 = eVar.q();
                    if (q37 != null && (s17 = q37.s()) != null) {
                        str3 = s17;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", str3);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                }
            }
        }
        return z17;
    }
}
