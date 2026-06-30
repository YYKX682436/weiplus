package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f182948f;

    public j(boolean z17, java.lang.String str, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f182946d = z17;
        this.f182947e = str;
        this.f182948f = mMWebView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r0.matcher(r4).find() != false) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.f182946d
            r1 = 1
            if (r0 != 0) goto L8e
            java.util.regex.Pattern r0 = com.tencent.mm.plugin.webview.model.k.f182975b
            java.lang.String r2 = "MicroMsg.AutoPlayLogic"
            if (r0 != 0) goto L2c
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r3 = e42.d0.clicfg_webview_auto_play_list_3
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = "(^http(s)?://((mp|bc|game|pay|payapp|(.*)support)\\.weixin\\.qq|support\\.wechat)\\.com/(.*)|^http(s)?://(payapp|pay)\\.wechatpay\\.cn/(.*)|^http(s)?://([^?#&/]*.)?(weishi\\.com|weishi\\.qq\\.com|view\\.inews\\.qq\\.com)/(.*)|^webcompt://(.*))"
            java.lang.String r0 = r0.Zi(r3, r4, r1)
            java.lang.String r3 = "autoPlayHostsStr config:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r2, r3, r4)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tencent.mm.plugin.webview.model.k.f182975b = r0
        L2c:
            java.lang.String r0 = com.tencent.mm.plugin.webview.model.k.f182974a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r3 = 0
            if (r0 == 0) goto L62
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r4 = "file://"
            r0.<init>(r4)
            uv4.g r4 = com.tencent.mm.plugin.websearch.l2.g(r3)
            java.lang.String r4 = r4.l()
            r0.append(r4)
            java.lang.String r4 = "/app.html?"
            r0.append(r4)
            uv4.g r4 = com.tencent.mm.plugin.websearch.l2.g(r3)
            r4.getClass()
            java.lang.String r0 = r0.toString()
            com.tencent.mm.plugin.webview.model.k.f182974a = r0
            java.lang.String r4 = "isEnableAutoPlay websearch_white_list:%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r2, r4, r0)
        L62:
            java.lang.String r0 = com.tencent.mm.plugin.webview.model.k.f182974a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            java.lang.String r4 = r5.f182947e
            if (r0 != 0) goto L75
            java.lang.String r0 = com.tencent.mm.plugin.webview.model.k.f182974a
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L75
            goto L89
        L75:
            java.util.regex.Pattern r0 = com.tencent.mm.plugin.webview.model.k.f182975b
            if (r0 != 0) goto L7f
            java.lang.String r0 = "autoPlayHostsPattern is null"
            com.tencent.mars.xlog.Log.i(r2, r0)
            goto L8b
        L7f:
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            if (r0 == 0) goto L8b
        L89:
            r0 = r1
            goto L8c
        L8b:
            r0 = r3
        L8c:
            if (r0 == 0) goto L8f
        L8e:
            r3 = r1
        L8f:
            com.tencent.mm.plugin.webview.model.i r0 = new com.tencent.mm.plugin.webview.model.i
            r0.<init>(r5, r3)
            com.tencent.mm.ipcinvoker.w0.c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.model.j.run():void");
    }
}
