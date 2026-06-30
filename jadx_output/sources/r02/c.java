package r02;

/* loaded from: classes8.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView f368290d;

    public c(com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView bottomEntranceView) {
        this.f368290d = bottomEntranceView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView bottomEntranceView = this.f368290d;
        c02.g gVar = bottomEntranceView.f97357d;
        if (gVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(gVar.f37598e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                c02.g gVar2 = bottomEntranceView.f97357d;
                gVar2.f37598e = java.net.URLDecoder.decode(gVar2.f37598e, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                android.net.Uri parse = android.net.Uri.parse(bottomEntranceView.f97357d.f37598e);
                java.lang.String query = parse.getQuery();
                java.lang.String queryParameter = parse.getQueryParameter("liteapp");
                java.lang.String queryParameter2 = parse.getQueryParameter("wechat_pkgid");
                com.tencent.mars.xlog.Log.i("MicroMsg.BottomEntranceView", "uri:%s query:%s liteapp:%s wechat_pkgid:%s", parse, query, queryParameter, queryParameter2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BottomEntranceView", "liteapp is null, fallback to web");
                    bundle.putString("rawUrl", bottomEntranceView.f97357d.f37598e);
                    ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(bottomEntranceView.getContext(), bundle);
                } else {
                    android.net.Uri parse2 = android.net.Uri.parse(queryParameter);
                    java.lang.String host = parse2.getHost();
                    java.lang.String queryParameter3 = parse2.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2)) {
                        host = host + "@game?" + queryParameter2;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BottomEntranceView", "jump to liteapp. url: " + parse2 + ", appId: " + host + ", path: " + queryParameter3 + ", query: " + query + ", pkgId: " + queryParameter2);
                    q80.d0 d0Var = new q80.d0();
                    d0Var.f360649a = host;
                    d0Var.f360650b = queryParameter3;
                    d0Var.f360651c = query;
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(bottomEntranceView.getContext(), d0Var, new r02.b(this, bundle));
                }
                o02.a.b(10, 1005, 1, 40, "", "", "");
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BottomEntranceView", e17, "gamelog.util, jumpToPage, UnsupportedEncodingException", new java.lang.Object[0]);
                yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
