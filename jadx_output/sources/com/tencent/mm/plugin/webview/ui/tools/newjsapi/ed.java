package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ed extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed f186068d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f186069e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186069e = msg.f341013c;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("placeholder");
        java.lang.Object obj = msg.f340790a.get("maxLength");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.Object obj2 = msg.f340790a.get("showRemindWordCount");
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null, 0);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) msg.f340790a.get("hidden"), false);
        java.lang.String str3 = (java.lang.String) msg.f340790a.get("customParams");
        bundle.putString("show_kb_placeholder", str2);
        bundle.putInt("show_kb_max_length", D1);
        bundle.putInt("show_kb_show_remind_word_count", D12);
        bundle.putString("show_kb_text", str);
        bundle.putBoolean("show_kb_to_show", z17);
        bundle.putString("key_show_kb_custom_params", str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowKeyBoard", "showKeyboard text=" + str + ", placeholder=" + str2 + ", maxLength=" + D1 + ", showRemindWordCount=" + D12 + ", toShow=" + z17 + ", customParamsString=" + str3);
        com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
        if (b17 != null) {
            b17.i(37, bundle);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 187;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return qc1.v.NAME;
    }
}
