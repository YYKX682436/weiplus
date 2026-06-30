package mu4;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f331415a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f331416b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331417c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f331418d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331419e;

    public h(java.lang.Class stubService, java.lang.String name, java.lang.String appId, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        kotlin.jvm.internal.o.g(stubService, "stubService");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f331415a = stubService;
        this.f331416b = name;
        this.f331417c = appId;
        this.f331418d = jsapiPermissionWrapper;
        this.f331419e = "MicroMsg.JsApiHandlerBuilder";
    }

    public final nw4.n a() {
        int hashCode = hashCode();
        nw4.n nVar = new nw4.n(null, null, hashCode);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f331416b);
        bundle.putString("appId", this.f331417c);
        nVar.H = this.f331418d;
        nVar.I = bundle;
        nVar.f340886J = true;
        com.tencent.mm.plugin.webview.core.m3.f181886a.a(true, this.f331415a, new mu4.g(nVar, hashCode, this));
        return nVar;
    }
}
