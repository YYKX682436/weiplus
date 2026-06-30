package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136859f;

    public d0(java.lang.String str, com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper, boolean z17) {
        this.f136857d = str;
        this.f136858e = finderWebViewHelper;
        this.f136859f = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        r0 = r3.homeContext;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f136857d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            java.lang.String r2 = ""
            com.tencent.mm.plugin.finder.webview.FinderWebViewHelper r3 = r7.f136858e
            if (r1 != 0) goto Ld
            goto L18
        Ld:
            r45.sn r0 = com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$getHomeContext$p(r3)
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.f385852f
            if (r0 != 0) goto L18
        L17:
            r0 = r2
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "startLoadUrl "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "Finder.AdWebViewImpl"
            com.tencent.mars.xlog.Log.i(r4, r1)
            com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$setMCurrentURL$p(r3, r0)
            boolean r1 = r7.f136859f
            if (r1 != 0) goto L72
            zg0.q2 r1 = com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$getWebViewController$p(r3)
            if (r1 == 0) goto L64
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "rawUrl"
            r4.putExtra(r5, r0)
            java.lang.String r0 = "useJs"
            r5 = 1
            r4.putExtra(r0, r5)
            java.lang.String r0 = "startTime"
            long r5 = java.lang.System.currentTimeMillis()
            r4.putExtra(r0, r5)
            java.lang.String r0 = com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$getTransitCommonUxInfo$p(r3)
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r2 = r0
        L5c:
            java.lang.String r0 = "common_ux_info_for_jsapi_pay"
            r4.putExtra(r0, r2)
            r1.j(r4)
        L64:
            java.lang.String r0 = com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$getTransitCommonUxInfo$p(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "FinderWebViewController-start, commonUxInfo=%s"
            qp3.a.b(r1, r0)
            goto L7d
        L72:
            zg0.q2 r0 = com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$getWebViewController$p(r3)
            if (r0 == 0) goto L7d
            com.tencent.mm.plugin.webview.core.r0 r0 = (com.tencent.mm.plugin.webview.core.r0) r0
            r0.J0()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.webview.d0.run():void");
    }
}
