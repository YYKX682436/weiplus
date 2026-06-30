package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class e8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.e8 f186060d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderTopicView", "OpenFinderTopicView");
        java.lang.String str = (java.lang.String) msg.f340790a.get("extInfo");
        if (str == null) {
            str = "";
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$OpenFinderTopicTaskData(str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.b8.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.d8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 392;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderTopicView";
    }
}
