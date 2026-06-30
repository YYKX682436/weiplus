package d22;

/* loaded from: classes15.dex */
public final class t implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.p f225874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225875b;

    public t(d22.p pVar, android.content.Context context) {
        this.f225874a = pVar;
        this.f225875b = context;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "checkLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "checkLiteApp success and preload appId:%s", this.f225874a.j());
        android.content.Context context = this.f225875b;
        java.lang.String appId = this.f225874a.j();
        java.lang.String page = this.f225874a.e();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        ku5.u0 u0Var = ku5.t0.f312615d;
        d22.s sVar = new d22.s(appId, page, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(sVar, 500L, false);
    }
}
