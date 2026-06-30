package sg0;

/* loaded from: classes8.dex */
public final class c3 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg0.h3 f407687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f407690d;

    public c3(sg0.h3 h3Var, android.content.Context context, kotlin.jvm.internal.h0 h0Var, su4.h2 h2Var) {
        this.f407687a = h3Var;
        this.f407688b = context;
        this.f407689c = h0Var;
        this.f407690d = h2Var;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "preloadLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "checkLiteApp success: " + info + ", errCode: " + i17);
        this.f407687a.Bi(this.f407688b, (java.lang.String) this.f407689c.f310123d, this.f407690d);
    }
}
