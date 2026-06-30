package fw4;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267099d;

    public g(java.lang.String str) {
        this.f267099d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if ((r9 == null || r9.length() == 0) == false) goto L48;
     */
    @Override // com.tencent.mm.modelbase.e3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int callback(int r6, int r7, java.lang.String r8, com.tencent.mm.modelbase.o r9, com.tencent.mm.modelbase.m1 r10) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDownloadAppInfo callback errType: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", errCode: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", errMsg: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.GetDownloadAppInfoManager"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = fw4.h.f267100a
            r1 = 0
            if (r10 == 0) goto L2d
            int r10 = r10.hashCode()
            goto L2e
        L2d:
            r10 = r1
        L2e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.remove(r10)
            fw4.f r10 = (fw4.f) r10
            if (r10 == 0) goto Lbe
            fw4.e r10 = r10.f267098b
            java.lang.String r0 = r5.f267099d
            if (r6 != 0) goto Lb9
            if (r7 != 0) goto Lb9
            r2 = 0
            if (r9 == 0) goto L4a
            com.tencent.mm.modelbase.n r9 = r9.f70711b
            com.tencent.mm.protobuf.f r9 = r9.f70700a
            goto L4b
        L4a:
            r9 = r2
        L4b:
            boolean r3 = r9 instanceof r45.ke3
            if (r3 == 0) goto L52
            r2 = r9
            r45.ke3 r2 = (r45.ke3) r2
        L52:
            if (r2 == 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap r9 = fw4.h.f267100a
            r45.pf0 r9 = r2.f378624d
            if (r9 != 0) goto L5b
            goto L8d
        L5b:
            java.lang.String r3 = r9.f382998i
            r4 = 1
            if (r3 == 0) goto L69
            int r3 = r3.length()
            if (r3 != 0) goto L67
            goto L69
        L67:
            r3 = r1
            goto L6a
        L69:
            r3 = r4
        L6a:
            if (r3 != 0) goto L8d
            java.lang.String r3 = r9.f382994e
            if (r3 == 0) goto L79
            int r3 = r3.length()
            if (r3 != 0) goto L77
            goto L79
        L77:
            r3 = r1
            goto L7a
        L79:
            r3 = r4
        L7a:
            if (r3 != 0) goto L8d
            java.lang.String r9 = r9.f382997h
            if (r9 == 0) goto L89
            int r9 = r9.length()
            if (r9 != 0) goto L87
            goto L89
        L87:
            r9 = r1
            goto L8a
        L89:
            r9 = r4
        L8a:
            if (r9 != 0) goto L8d
            goto L8e
        L8d:
            r4 = r1
        L8e:
            if (r4 == 0) goto Lb3
            r45.pf0 r6 = r2.f378624d
            java.lang.String r7 = "download_app_info"
            kotlin.jvm.internal.o.f(r6, r7)
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.tencent.mm.plugin.webview.ui.tools.k4) r10
            r10.getClass()
            java.lang.String r7 = r6.f382994e
            java.lang.String r8 = r10.f185603a
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7}
            java.lang.String r8 = "MicroMsg.WebViewDownloadUI"
            java.lang.String r9 = "getDownloadAppInfo onSuccess downloadAppId: %s, name: %s"
            com.tencent.mars.xlog.Log.i(r8, r9, r7)
            java.util.List r7 = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI r7 = r10.f185604b
            r7.a7(r6)
            goto Lbe
        Lb3:
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.tencent.mm.plugin.webview.ui.tools.k4) r10
            r10.a(r0, r6, r7, r8)
            goto Lbe
        Lb9:
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.tencent.mm.plugin.webview.ui.tools.k4) r10
            r10.a(r0, r6, r7, r8)
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fw4.g.callback(int, int, java.lang.String, com.tencent.mm.modelbase.o, com.tencent.mm.modelbase.m1):int");
    }
}
