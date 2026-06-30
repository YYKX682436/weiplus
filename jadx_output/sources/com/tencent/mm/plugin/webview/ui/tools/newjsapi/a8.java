package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class a8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.a8 f185946d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderTemplateSetView", "openFinderTemplateSetView");
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData();
        java.lang.Object obj2 = msg.f340790a.get("templateTopicId");
        java.lang.String str3 = "0";
        if (obj2 == null || (str = obj2.toString()) == null) {
            str = "0";
        }
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185901d = pm0.v.Z(str);
        java.lang.Object obj3 = msg.f340790a.get("finderEntryScene");
        if (obj3 == null || (str2 = obj3.toString()) == null) {
            str2 = "0";
        }
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185903f = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
        java.lang.Object obj4 = msg.f340790a.get("templateEnterScene");
        if (obj4 != null && (obj = obj4.toString()) != null) {
            str3 = obj;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185902e = P;
        if (P != 0) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData, com.tencent.mm.plugin.webview.ui.tools.newjsapi.x7.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z7(env, msg));
            return true;
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":no templateEnterScene", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderTemplateSetView";
    }
}
