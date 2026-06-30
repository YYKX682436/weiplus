package ka3;

/* loaded from: classes15.dex */
public final class j implements ka3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule f306076a;

    public j(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule) {
        this.f306076a = liteAppNFCModule;
    }

    @Override // ka3.i
    public void a(org.json.JSONObject resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f306076a.getCallback().a(resp, false, false);
    }
}
