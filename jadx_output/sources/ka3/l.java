package ka3;

/* loaded from: classes15.dex */
public final class l implements ka3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule f306080c;

    public l(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule) {
        this.f306078a = str;
        this.f306079b = str2;
        this.f306080c = liteAppNFCModule;
    }

    @Override // ka3.i
    public void a(org.json.JSONObject resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (ka3.b.a(resp)) {
            ka3.e eVar = ka3.g.f306067g;
            java.lang.String uin = this.f306078a;
            kotlin.jvm.internal.o.f(uin, "$uin");
            java.lang.String appId = this.f306079b;
            kotlin.jvm.internal.o.f(appId, "$appId");
            com.tencent.mm.sdk.platformtools.o4 o4Var = ra3.q.f393527a;
            java.lang.String key = eVar.b(uin, appId);
            kotlin.jvm.internal.o.g(key, "key");
            ra3.q.f393527a.remove(key);
        }
        this.f306080c.getCallback().a(resp, false, false);
    }
}
