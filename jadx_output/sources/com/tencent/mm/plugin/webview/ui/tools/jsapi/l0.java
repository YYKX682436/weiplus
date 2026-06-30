package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class l0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.l0 f185241d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.l0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRedPacketDone", "do get red packet done: " + msg.f340790a);
        boolean b17 = kotlin.jvm.internal.o.b(msg.f340790a.get("shouldShowRedDot"), "1");
        boolean b18 = kotlin.jvm.internal.o.b(msg.f340790a.get("isNeedRefresh"), "1");
        boolean b19 = kotlin.jvm.internal.o.b(msg.f340790a.get("shouldOpenSelectSkinPage"), "1");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRedPacketDone", "isNeedRefresh: " + msg.f340790a.get("isNeedRefresh") + ", shouldShowRedDot: " + msg.f340790a.get("shouldShowRedDot") + ", shouldOpenSelectSkinPage: " + b19 + ", packageId: " + msg.f340790a.get("packetId"));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("shouldShowRedDot", b17);
        bundle.putBoolean("isNeedRefresh", b18);
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.ipcinvoker.d0.f(str, bundle, com.tencent.mm.plugin.webview.ui.tools.jsapi.j0.class);
        if (!b19) {
            com.tencent.mm.ipcinvoker.d0.f(str, bundle, com.tencent.mm.plugin.webview.ui.tools.jsapi.i0.class);
            env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object obj = msg.f340790a.get("packetId");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("packetId", (java.lang.String) obj);
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.ui.tools.jsapi.k0(env, msg));
        }
        j45.l.n(env.f340860a, "luckymoney", ".ui.LuckyMoneyPickEnvelopeUI", intent, 207);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 365;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getRedPacketDone";
    }
}
