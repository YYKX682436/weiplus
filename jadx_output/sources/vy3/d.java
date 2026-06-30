package vy3;

/* loaded from: classes12.dex */
public final class d extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.d f441467e = new vy3.d();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("content");
        if (str4 == null) {
            str4 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCollect", "ScanJsApi-Call:collect sessionId: %s, content: %s", str2, str4);
        if (str4.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCollect", "ScanJsApi-Call collect content is empty");
        } else {
            jz5.g gVar = kz3.d.f313872a;
            kz3.a aVar = (kz3.a) kz3.d.f313873b.get(str2);
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.g(27);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6319e = str4;
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 1;
            r45.jq0 jq0Var2 = bq0Var.f370962d;
            if (jq0Var2 != null) {
                if (aVar != null && (str = aVar.f313864a) != null) {
                    str3 = str;
                }
                jq0Var2.e(str3);
            }
            android.content.Context context = env.f340860a;
            if (context instanceof android.app.Activity) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                c4Var.f6323i = (android.app.Activity) context;
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            android.view.View view = (android.view.View) (mMWebView != null ? mMWebView.getParent() : null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view != null ? view.getRootView() : null);
            c4Var.f6325k = viewGroup != null ? viewGroup.getChildAt(0) : null;
            c4Var.f6327m = 43;
            doFavoriteEvent.e();
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "collect";
    }
}
