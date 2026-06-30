package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class j6 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f186279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.l6 f186280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f186282e;

    public j6(com.tencent.mm.ipcinvoker.r rVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.ui.tools.newjsapi.l6 l6Var, boolean z17, android.content.Context context) {
        this.f186278a = rVar;
        this.f186279b = jSONObject;
        this.f186280c = l6Var;
        this.f186281d = z17;
        this.f186282e = context;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImage", "checkHasFinishRegisterAndLogin, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.tencent.mm.ipcinvoker.r rVar = this.f186278a;
        if (!z17) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet(false, err_msg, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject != null ? jSONObject.toString() : null)));
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.h6 h6Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h6(rVar);
        tk.v vVar = tk.w.f419878e;
        org.json.JSONObject jSONObject2 = this.f186279b;
        java.lang.String optString = jSONObject2.optString("mpPublishAction", "openImage");
        l81.b1 a17 = this.f186280c.a(jSONObject2);
        a17.f317037o = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.i6(rVar);
        boolean d17 = u46.l.d(optString, "openImage");
        android.content.Context activity = this.f186282e;
        if (d17) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            kotlin.jvm.internal.o.f(activity, "$activity");
            ((ox.g) oVar).rj(this.f186281d, activity, a17, h6Var);
        } else {
            tk.o oVar2 = (tk.o) i95.n0.c(tk.o.class);
            kotlin.jvm.internal.o.f(activity, "$activity");
            ((ox.g) oVar2).sj(activity, a17, h6Var);
        }
    }
}
