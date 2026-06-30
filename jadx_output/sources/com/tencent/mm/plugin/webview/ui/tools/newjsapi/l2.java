package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class l2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.l2 f186330d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.webview.ui.tools.newjsapi.j2.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k2(new java.util.HashMap(), env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 413;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getUserConfig";
    }
}
