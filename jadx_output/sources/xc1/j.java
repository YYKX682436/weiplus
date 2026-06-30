package xc1;

/* loaded from: classes7.dex */
public final class j implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f453044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f453045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f453046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f453047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f453048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc1.l f453049i;

    public j(com.tencent.mm.plugin.appbrand.y yVar, int i17, org.json.JSONObject jSONObject, com.tencent.luggage.sdk.launching.h hVar, java.lang.Object obj, xc1.l lVar) {
        this.f453044d = yVar;
        this.f453045e = i17;
        this.f453046f = jSONObject;
        this.f453047g = hVar;
        this.f453048h = obj;
        this.f453049i = lVar;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(state, "state");
        if (u81.b.BACKGROUND == state) {
            this.f453044d.t3().N.c(this);
            com.tencent.mm.sdk.platformtools.u3.h(new xc1.i(this.f453044d, this.f453045e, this.f453046f, this.f453047g, this.f453048h, this.f453049i));
        }
    }
}
