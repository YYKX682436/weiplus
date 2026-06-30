package mw4;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.webview.core.i3 {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r9 == null) goto L21;
     */
    @Override // com.tencent.mm.plugin.webview.core.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView r8, com.tencent.xweb.x0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "webview"
            kotlin.jvm.internal.o.g(r8, r1)
            java.lang.String r8 = "request"
            kotlin.jvm.internal.o.g(r9, r8)
            android.net.Uri r8 = r9.getUrl()
            java.lang.String r9 = r8.toString()
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            java.lang.String r1 = "MicroMsg.EmoticonInterceptor"
            r2 = 0
            if (r9 == 0) goto L26
            java.lang.String r8 = "requestUrlStr empty!"
            com.tencent.mars.xlog.Log.i(r1, r8)
            return r2
        L26:
            java.lang.String r9 = r8.getScheme()
            java.lang.String r3 = "wxemoticon"
            boolean r9 = kotlin.jvm.internal.o.b(r9, r3)
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L4f
            java.lang.String r9 = r8.getPath()
            java.lang.String r5 = "/getlocalemoticon"
            boolean r9 = kotlin.jvm.internal.o.b(r9, r5)
            if (r9 != 0) goto L4d
            java.lang.String r9 = r8.getPath()
            java.lang.String r5 = "getlocalemoticon"
            boolean r9 = kotlin.jvm.internal.o.b(r9, r5)
            if (r9 == 0) goto L4f
        L4d:
            r9 = r4
            goto L50
        L4f:
            r9 = r3
        L50:
            if (r9 != 0) goto L53
            return r2
        L53:
            java.lang.String r9 = "md5"
            boolean r5 = r8.isHierarchical()     // Catch: java.lang.Exception -> L61
            if (r5 == 0) goto L61
            java.lang.String r9 = r8.getQueryParameter(r9)     // Catch: java.lang.Exception -> L61
            if (r9 != 0) goto L62
        L61:
            r9 = r0
        L62:
            java.lang.String r5 = "emojiInfoBuf"
            boolean r6 = r8.isHierarchical()     // Catch: java.lang.Exception -> L72
            if (r6 == 0) goto L72
            java.lang.String r8 = r8.getQueryParameter(r5)     // Catch: java.lang.Exception -> L72
            if (r8 != 0) goto L71
            goto L72
        L71:
            r0 = r8
        L72:
            java.lang.String r8 = android.net.Uri.decode(r0)
            int r0 = r9.length()
            if (r0 != 0) goto L7e
            r0 = r4
            goto L7f
        L7e:
            r0 = r3
        L7f:
            if (r0 != 0) goto Leb
            if (r8 == 0) goto L8c
            int r0 = r8.length()
            if (r0 != 0) goto L8a
            goto L8c
        L8a:
            r0 = r3
            goto L8d
        L8c:
            r0 = r4
        L8d:
            if (r0 == 0) goto L90
            goto Leb
        L90:
            com.tencent.mm.plugin.webview.core.r0 r0 = r7.c()
            com.tencent.mm.plugin.webview.permission.w r0 = r0.R
            com.tencent.mm.protocal.JsapiPermissionWrapper r0 = r0.c()
            r5 = 529(0x211, float:7.41E-43)
            boolean r0 = r0.f(r5)
            if (r0 != 0) goto La8
            java.lang.String r8 = "no permission to get emoticon!"
            com.tencent.mars.xlog.Log.e(r1, r8)
            return r2
        La8:
            java.lang.String r0 = "start get emoticon data for md5 :"
            java.lang.String r0 = r0.concat(r9)
            com.tencent.mars.xlog.Log.i(r1, r0)
            mw4.b r0 = new mw4.b
            r0.<init>(r9, r8, r2)
            java.lang.Object r8 = kotlinx.coroutines.l.f(r2, r0, r4, r2)
            byte[] r8 = (byte[]) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "on got emoticon, md5:"
            r0.<init>(r5)
            r0.append(r9)
            java.lang.String r9 = ". is valid: "
            r0.append(r9)
            if (r8 == 0) goto Lcf
            r3 = r4
        Lcf:
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            if (r8 == 0) goto Lea
            com.tencent.xweb.y0 r2 = new com.tencent.xweb.y0
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            r9.<init>(r8)
            java.lang.String r8 = "image/*"
            java.lang.String r0 = "utf-8"
            r2.<init>(r8, r0, r9)
        Lea:
            return r2
        Leb:
            java.lang.String r8 = "md5 or emojiInfoBuf is empty!"
            com.tencent.mars.xlog.Log.e(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mw4.c.f(com.tencent.xweb.WebView, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }
}
