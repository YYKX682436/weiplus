package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class q5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.q5 f186454d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToTabFind", "jumpToTabFind");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, msg.f340790a, com.tencent.mm.plugin.webview.ui.tools.newjsapi.n5.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o5(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "jumpToTabFind";
    }
}
