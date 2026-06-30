package vy3;

/* loaded from: classes.dex */
public final class w extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.w f441491e = new vy3.w();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("queryStr");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str3 = str2 != null ? str2 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch queryStr: " + str + ", scene: " + str3);
        boolean N = r26.n0.N(str);
        nw4.g gVar = env.f340863d;
        if (N || r26.n0.N(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f341013c, msg.f341019i + ":param invalid", hashMap);
        } else {
            int y17 = com.tencent.mm.sdk.platformtools.t8.y1(str3);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String l17 = o13.n.l(y17);
            kotlin.jvm.internal.o.f(l17, "getUnsignedMd5UInt(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call doStartWebSearch  scene:" + y17 + "  sessionId:" + l17);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412938a = env.f340860a;
            j2Var.f412939b = y17;
            j2Var.f412941d = str;
            j2Var.f412942e = l17;
            j2Var.f412943f = true;
            j2Var.f412945h = true;
            j2Var.f412946i = false;
            j2Var.f412958u = true;
            j2Var.f412953p = false;
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("ret", "0");
            gVar.e(msg.f341013c, msg.f341019i + ":ok", hashMap2);
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.me.NAME;
    }
}
