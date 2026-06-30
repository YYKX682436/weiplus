package dy4;

/* loaded from: classes8.dex */
public final class d implements sf.f {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.k f244613a;

    /* renamed from: b, reason: collision with root package name */
    public final nw4.y2 f244614b;

    public d(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f244613a = env;
        this.f244614b = msg;
    }

    @Override // sf.f
    public org.json.JSONObject c() {
        org.json.JSONObject rawParams = this.f244614b.f341014d;
        kotlin.jvm.internal.o.f(rawParams, "rawParams");
        return rawParams;
    }

    @Override // sf.f
    public void e(sf.e eVar) {
        java.lang.Object obj = this.f244613a.f340860a;
        if (obj instanceof dy4.c) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
            ((dy4.c) obj).Q3(eVar);
        }
    }

    @Override // sf.f
    public void f() {
    }

    @Override // sf.f
    public java.lang.String g(java.lang.String str) {
        nw4.g gVar = this.f244613a.f340863d;
        nw4.y2 y2Var = this.f244614b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + str, null);
        return null;
    }

    @Override // sf.f
    public java.lang.String getAppId() {
        return "";
    }

    @Override // sf.f
    public android.content.Context getContext() {
        return this.f244613a.f340860a;
    }

    @Override // sf.f
    public java.lang.String h(java.lang.String str, java.util.Map map) {
        nw4.g gVar = this.f244613a.f340863d;
        nw4.y2 y2Var = this.f244614b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + str, map);
        return null;
    }

    @Override // sf.f
    public void i(sf.e eVar) {
        java.lang.Object obj = this.f244613a.f340860a;
        if (!(obj instanceof dy4.c) || eVar == null) {
            return;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
        ((dy4.c) obj).g6(eVar);
    }

    @Override // sf.f
    public boolean j() {
        return false;
    }

    @Override // sf.f
    public boolean k() {
        java.lang.String optString = c().optString("action", "");
        if (optString != null) {
            return r26.i0.y(optString, "insert", false);
        }
        return false;
    }

    @Override // sf.f
    public java.lang.String l() {
        java.lang.String function = this.f244614b.f341019i;
        kotlin.jvm.internal.o.f(function, "function");
        return function;
    }

    @Override // sf.f
    public com.tencent.mm.plugin.appbrand.jsapi.l m() {
        return null;
    }
}
