package ih1;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f291507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.m f291508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f291509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ih1.u uVar, org.json.JSONObject jSONObject, ih1.m mVar, yz5.l lVar) {
        super(0);
        this.f291506d = uVar;
        this.f291507e = jSONObject;
        this.f291508f = mVar;
        this.f291509g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ih1.u uVar = this.f291506d;
        if (uVar.f291532c == null) {
            com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], mbBizHandle  is null");
        } else {
            org.json.JSONObject jSONObject = this.f291507e;
            java.lang.String optString = jSONObject.optString("frameSetName");
            java.lang.String optString2 = jSONObject.optString("frameSetData");
            java.lang.String optString3 = jSONObject.optString("frameSetRootPath");
            int optInt = jSONObject.optInt("viewId");
            kotlin.jvm.internal.o.d(optString3);
            iq0.e eVar = new iq0.e(optString3, "", 0, 0, 12, null);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            iq0.c cVar = uVar.f291532c;
            kotlin.jvm.internal.o.d(cVar);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) uVar.f291533d).getValue();
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            ((nq0.p) tVar).Bi(cVar, eVar, frameLayout, optString, optString2, optInt, new ih1.k(this.f291508f, this.f291506d, optString, optString3, optString2, this.f291509g));
        }
        return jz5.f0.f302826a;
    }
}
