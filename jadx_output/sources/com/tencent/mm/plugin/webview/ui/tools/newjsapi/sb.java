package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public final class sb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.sb f186525d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.sb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        nw4.g gVar = env.f340863d;
        kotlin.jvm.internal.o.g(msg, "msg");
        try {
            java.lang.Object obj = msg.f340790a.get("businessId");
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
            java.lang.Object obj2 = msg.f340790a.get("isBatchReport");
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null, 0);
            java.lang.Object obj3 = msg.f340790a.get("infoList");
            java.lang.String u17 = com.tencent.mm.sdk.platformtools.t8.u1(obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSdkCgiReport", "bizId: " + D1 + ", isBatchReport: " + D12 + ", infoList: " + u17);
            if (D1 <= 0) {
                gVar.e(msg.f341013c, msg.f341019i + ":fail missing auguaments (cgiBizId)", null);
                return true;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                gVar.e(msg.f341013c, msg.f341019i + ":fail missing auguaments (infoList)", null);
                return true;
            }
            com.tencent.mm.autogen.events.JsSdkCgiReportEvent jsSdkCgiReportEvent = new com.tencent.mm.autogen.events.JsSdkCgiReportEvent();
            am.xh xhVar = jsSdkCgiReportEvent.f54448g;
            xhVar.f8378a = D1;
            xhVar.f8379b = D12 == 1;
            xhVar.f8380c = u17;
            jsSdkCgiReportEvent.e();
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSdkCgiReport", e17, "JsApiSdkCgiReport handleMsg", new java.lang.Object[0]);
            gVar.e(msg.f341013c, msg.f341019i + ":fail auguaments crash", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 537;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sdkCgiReport";
    }
}
