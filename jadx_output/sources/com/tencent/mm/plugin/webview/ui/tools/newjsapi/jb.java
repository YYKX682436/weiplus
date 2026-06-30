package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public abstract class jb extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public volatile nw4.k f186288d;

    /* renamed from: e, reason: collision with root package name */
    public volatile nw4.y2 f186289e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f186288d = env;
        this.f186289e = msg;
        android.content.Context context = env.f340860a;
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e(g(), "context is not MMActivity");
            env.f340863d.e(msg.f341013c, c() + ":fail", null);
            this.f186288d = null;
            this.f186289e = null;
            return true;
        }
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        mMActivity.mmSetOnActivityResultCallback(this);
        java.lang.Object obj = msg.f340790a.get("verify_id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("verify_id", str);
        jSONObject.put("version", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.Object obj2 = msg.f340790a.get("appId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("k_need_signature", true);
        bundle.putString("k_user_name", c01.z1.b());
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        bundle.putBoolean("needVideo", f());
        bundle.putBoolean("is_check_dyncfg", false);
        bundle.putString("key_function_name", c());
        bundle.putInt("key_business_type", 1);
        bundle.putString("appId", str3);
        bundle.putString("request_verify_pre_info", jSONObject2);
        bundle.putInt("check_alive_type", 4);
        bundle.putBoolean("key_is_need_confirm_page", true);
        com.tencent.mm.autogen.events.RequestStartFaceDetectEvent requestStartFaceDetectEvent = new com.tencent.mm.autogen.events.RequestStartFaceDetectEvent();
        am.or orVar = requestStartFaceDetectEvent.f54699g;
        orVar.f7573a = context;
        orVar.f7575c = e();
        requestStartFaceDetectEvent.f54699g.f7574b = bundle;
        requestStartFaceDetectEvent.e();
        com.tencent.mars.xlog.Log.i(g(), "start face detect event result: %b", java.lang.Boolean.valueOf(requestStartFaceDetectEvent.f54700h.f7654a));
        if (!requestStartFaceDetectEvent.f54700h.f7654a) {
            mMActivity.mmSetOnActivityResultCallback(null);
            env.f340863d.e(msg.f341013c, c() + ":fail", nw4.a.a(requestStartFaceDetectEvent.f54700h.f7655b));
            this.f186288d = null;
            this.f186289e = null;
        }
        return true;
    }

    public abstract int e();

    public abstract boolean f();

    public abstract java.lang.String g();

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        nw4.g gVar;
        if (i17 != e()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(g(), "onActivityResult requestCode: " + i17 + ", resultCode: " + i18);
        if (i18 == -1) {
            str = c() + ":ok";
        } else if (i18 != 0) {
            str = c() + ":fail";
        } else {
            str = c() + ":cancel";
        }
        nw4.k kVar = this.f186288d;
        if (kVar != null && (gVar = kVar.f340863d) != null) {
            nw4.y2 y2Var = this.f186289e;
            gVar.e(y2Var != null ? y2Var.f341013c : null, str, nw4.a.a(intent != null ? intent.getExtras() : null));
        }
        this.f186288d = null;
        this.f186289e = null;
    }
}
