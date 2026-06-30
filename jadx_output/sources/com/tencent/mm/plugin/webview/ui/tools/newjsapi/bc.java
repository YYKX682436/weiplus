package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class bc extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.bc f185980d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.bc();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f185981e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f185982f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f185983g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f185984h;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.f340790a.isEmpty()) {
            env.f340863d.e(msg.f341013c, "sendRedCoverAppMsg:fail missing arguments", null);
            return false;
        }
        f185981e = env;
        f185982f = msg;
        java.lang.String str = (java.lang.String) msg.f340790a.get("receiveuri");
        f185983g = (java.lang.String) msg.f340790a.get("session_id");
        f185984h = (java.lang.String) msg.f340790a.get("cover_id");
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            mMActivity.mmSetOnActivityResultCallback(this);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = env.f340860a.getString(com.tencent.mm.R.string.gkc);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ((qd0.q0) e1Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmSelectContactFeatureService", "createSendRedCoverAppMsgRecentConversationIntent title:".concat(string));
            android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            intent.putExtra("titile", string);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
            pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            intent.putExtra("KEY_IS_HIDE_FORWARD_TO_WEWORK", true);
            intent.putExtra("KSendRedCoverAppMsgRequestUrl", str);
            intent.putExtra("KSendRedCoverAppMsgSessionId", f185983g);
            intent.putExtra("KSendRedCoverAppMsgCoverId", f185984h);
            intent.putExtra("QSRPRecentConversationDataSourceIsBlockOpenIM", true);
            ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).getClass();
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
            pf5.j0.a(intent, fb3.j.class);
            pf5.j0.a(intent, fb3.b.class);
            mMActivity.startActivityForResult(intent, 217);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.yc.NAME;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
        if (kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_SUCCESS")) {
            nw4.k kVar = f185981e;
            if (kVar != null) {
                android.content.Context context = kVar.f340860a;
                db5.t7.h(context, context.getString(com.tencent.mm.R.string.iid));
                nw4.y2 y2Var = f185982f;
                kVar.f340863d.e(y2Var != null ? y2Var.f341013c : null, "sendRedCoverAppMsg:ok ", null);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
            nw4.k kVar2 = f185981e;
            if (kVar2 != null) {
                nw4.y2 y2Var2 = f185982f;
                kVar2.f340863d.e(y2Var2 != null ? y2Var2.f341013c : null, "sendRedCoverAppMsg:cancel ", null);
                return;
            }
            return;
        }
        nw4.k kVar3 = f185981e;
        if (kVar3 != null) {
            nw4.y2 y2Var3 = f185982f;
            kVar3.f340863d.e(y2Var3 != null ? y2Var3.f341013c : null, "sendRedCoverAppMsg:fail ", null);
        }
    }
}
