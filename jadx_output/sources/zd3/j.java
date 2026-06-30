package zd3;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f471619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f471622g;

    public j(zd3.k kVar, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f471619d = kVar;
        this.f471620e = i17;
        this.f471621f = str;
        this.f471622g = jSONObject;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.k kVar = this.f471619d;
        if (i17 != 0) {
            kVar.w(lc3.x.f317937d, iPCMBExternalCallbackData.f148160e);
            return;
        }
        kVar.v(this.f471620e, this.f471621f, this.f471622g);
    }
}
