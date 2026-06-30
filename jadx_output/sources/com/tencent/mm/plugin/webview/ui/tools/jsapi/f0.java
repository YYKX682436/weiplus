package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class f0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.f0 f185087d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.f0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPasteboardContent", "do get pasteboard content: handleMsg");
        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail nocontent", kz5.q0.f314001d);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 364;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getPasteboardContent";
    }
}
