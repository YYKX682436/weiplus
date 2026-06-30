package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    public r45.in6 f175041a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.webview.j f175042b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.webview.WebSearchWebView f175043c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.webview.l f175044d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f175045e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f175046f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f175047g = new java.util.HashMap();

    public synchronized void a(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId begin: %s, %s", java.lang.Integer.valueOf(i17), str);
        s75.d.b(new com.tencent.mm.plugin.topstory.ui.home.l2(this, i17, str), "addNegDocId");
    }

    public void b(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "attachWebViewToActivity %s", java.lang.Integer.valueOf(jVar.hashCode()));
        com.tencent.mm.plugin.topstory.ui.webview.j jVar2 = this.f175042b;
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = this.f175043c;
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f175044d;
        r45.in6 in6Var = this.f175041a;
        jVar.f174990h = jVar2;
        jVar.f174991i = webSearchWebView;
        jVar.f174993m = lVar;
        lVar.f14326a = jVar;
        jVar.f174988f = in6Var;
        jVar2.f14844d = jVar;
        gm0.j1.d().a(2582, jVar2.f175210n);
        gm0.j1.d().a(2802, jVar2.f175209m);
        gm0.j1.d().a(2906, jVar2.f175208i);
        jVar.f174989g.addView(jVar.f174991i, new android.widget.FrameLayout.LayoutParams(-1, -1));
        jVar.f174991i.setOverScrollMode(0);
        this.f175042b = null;
        this.f175043c = null;
        this.f175044d = null;
        this.f175041a = null;
        this.f175045e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b4 A[Catch: Exception -> 0x01be, TRY_LEAVE, TryCatch #0 {Exception -> 0x01be, blocks: (B:24:0x0190, B:27:0x01ab, B:29:0x01b4), top: B:23:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(r45.in6 r18, boolean r19, java.util.LinkedList r20) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.home.m2.c(r45.in6, boolean, java.util.LinkedList):void");
    }

    public void d(int i17, java.lang.String str) {
        this.f175047g.put(java.lang.Integer.valueOf(i17), str);
        try {
            byte[] bytes = str.getBytes(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(pm4.w.h());
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            com.tencent.mm.vfs.w6.R(pm4.w.h() + i17, bytes);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putNegDataCache write data key: %d length: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bytes.length));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "putNegDataCache", new java.lang.Object[0]);
        }
    }
}
