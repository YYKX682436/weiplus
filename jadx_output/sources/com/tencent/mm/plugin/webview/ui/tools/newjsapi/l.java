package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class l extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.l f186324d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186325e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186326f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186325e = env;
        f186326f = msg;
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c()) {
            env.f340863d.e(msg.f341013c, "bindPhone:hasBinded", null);
            return true;
        }
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(this);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.h(env.f340860a, intent, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 538;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "bindPhone";
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.g gVar;
        nw4.g gVar2;
        if (i17 != 222 || f186325e == null || f186326f == null) {
            return;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBindPhone", "mmOnActivityResult isUserBindOpMobile: " + c17 + " data: " + intent);
        if (c17) {
            nw4.k kVar = f186325e;
            if (kVar == null || (gVar2 = kVar.f340863d) == null) {
                return;
            }
            nw4.y2 y2Var = f186326f;
            gVar2.e(y2Var != null ? y2Var.f341013c : null, "bindPhone:ok", null);
            return;
        }
        nw4.k kVar2 = f186325e;
        if (kVar2 == null || (gVar = kVar2.f340863d) == null) {
            return;
        }
        nw4.y2 y2Var2 = f186326f;
        gVar.e(y2Var2 != null ? y2Var2.f341013c : null, "bindPhone:cancel", null);
    }
}
