package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ad extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ad f185949d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ad();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        nw4.g gVar = env.f340863d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowBottomToast", "invoke, activity is null");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, activity is null!", null);
            return true;
        }
        java.lang.String str = (java.lang.String) msg.f340790a.get(dm.i4.COL_ID);
        java.lang.String str2 = (java.lang.String) msg.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String str3 = (java.lang.String) msg.f340790a.get("subtitle");
            if (kotlin.jvm.internal.o.b(msg.f340790a.get("clickable"), "true")) {
                com.tencent.mm.ui.widget.snackbar.j.c(str2, str3, activity, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.zc(str, env), null);
            } else {
                com.tencent.mm.ui.widget.snackbar.j.c(str2, str3, activity, null, null);
            }
            return true;
        }
        gVar.e(msg.f341013c, msg.f341019i + ":fail, id or title is null!", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.bio.face.g.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showBottomToast";
    }
}
