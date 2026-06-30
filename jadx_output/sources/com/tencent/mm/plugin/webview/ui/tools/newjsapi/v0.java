package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class v0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0 f186566d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f186567e = new java.util.concurrent.ConcurrentHashMap();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String url;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("mediaUrl");
        java.lang.Object obj = msg.f340790a.get("type");
        if (obj != null && obj.equals("video")) {
            java.lang.String str2 = "MMLive_" + com.tencent.mm.sdk.platformtools.w2.a(str);
            dn.o oVar = new dn.o();
            oVar.f241785d = "task_DownloadManager";
            oVar.field_mediaId = str2;
            oVar.M1 = str;
            oVar.H1 = 0;
            oVar.field_fileType = 100;
            oVar.Z = 3;
            oVar.f241809y0 = 4;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            sb6.append(lp0.b.h0("WebImageCache").o());
            sb6.append('/');
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            oVar.field_fullpath = sb7;
            f186567e.put(str2, new jz5.l(env, msg));
            oVar.f241815c2 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.u0(sb7, str);
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().e(oVar, false);
        } else {
            boolean l17 = gm0.j1.u().l();
            android.content.Context context = env.f340860a;
            zg0.q2 a17 = env.a();
            if (a17 == null || (url = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
                com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
                url = mMWebView != null ? mMWebView.getUrl() : null;
                if (url == null) {
                    url = "";
                }
            }
            com.tencent.mm.pluginsdk.ui.tools.e9.f(context, str, url, com.tencent.xweb.d.g().a(str), l17, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 547;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "downloadMediaByUrl";
    }
}
