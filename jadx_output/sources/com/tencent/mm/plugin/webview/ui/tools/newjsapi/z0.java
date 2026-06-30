package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class z0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.z0 f186696d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("md5");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get("opType");
        java.lang.Object obj3 = ((java.util.HashMap) msg.f340790a).get("emojiInfoBuf");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("emotionScene");
        java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        if (num == null) {
            num = 9;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEmoticonSingleOperation", "handleMsg: md5:" + str + ", opType:" + obj2 + ", emojiInfoBuf:" + str2);
        nw4.g gVar = env.f340863d;
        if (str == null) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail_missing arguments", null);
            return true;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        if (kotlin.jvm.internal.o.b(obj2, "1")) {
            android.content.Context context = env.f340860a;
            int intValue = num.intValue();
            com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
            c4Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            c4Var.wi(context, str, str2, intValue, -1, false);
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        } else {
            gVar.e(msg.f341013c, msg.f341019i + ":fail_missing arguments", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 528;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "emoticonSingleOperation";
    }
}
