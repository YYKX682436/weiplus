package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.m0 f186351d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDispatchLiteAppAction", "DispatchLiteAppAction");
        android.content.Context context = env.f340860a;
        java.lang.String str = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.getStringExtra("liteAppSource");
        }
        if (str == null) {
            env.f340863d.a(msg, "expected appId");
            return false;
        }
        android.os.Bundle b17 = nw4.y2.b(msg.f340790a);
        kotlin.jvm.internal.o.d(b17);
        h73.e.d(b17, "sourceAppId", str);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, b17, com.tencent.mm.plugin.webview.ui.tools.newjsapi.k0.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 473;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "dispatchLiteAppAction";
    }
}
