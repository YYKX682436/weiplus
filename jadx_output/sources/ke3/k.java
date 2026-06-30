package ke3;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f307021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ke3.l f307022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f307023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI, org.json.JSONObject jSONObject, ke3.l lVar, yz5.l lVar2) {
        super(0);
        this.f307020d = magicSclCommonStarterDemoUI;
        this.f307021e = jSONObject;
        this.f307022f = lVar;
        this.f307023g = lVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI = this.f307020d;
        if (magicSclCommonStarterDemoUI.f148129e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bizHandle is null");
        } else {
            org.json.JSONObject jSONObject = this.f307021e;
            java.lang.String optString = jSONObject.optString("frameSetName");
            java.lang.String optString2 = jSONObject.optString("frameSetData");
            java.lang.String optString3 = jSONObject.optString("frameSetRootPath");
            int optInt = jSONObject.optInt("viewId");
            kotlin.jvm.internal.o.d(optString3);
            iq0.e eVar = new iq0.e(optString3, "", 0, 0, 12, null);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            android.view.ViewGroup viewGroup = magicSclCommonStarterDemoUI.f148128d;
            if (viewGroup != null) {
                ke3.l lVar = this.f307022f;
                yz5.l lVar2 = this.f307023g;
                iq0.c cVar = magicSclCommonStarterDemoUI.f148129e;
                kotlin.jvm.internal.o.d(cVar);
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString2);
                ((nq0.p) tVar).Bi(cVar, eVar, viewGroup, optString, optString2, optInt, new ke3.j(lVar, optString, optString3, optString2, lVar2));
            }
        }
        return jz5.f0.f302826a;
    }
}
