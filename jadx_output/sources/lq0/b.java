package lq0;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lq0.d f320449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f320450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, lq0.d dVar, org.json.JSONObject jSONObject) {
        super(1);
        this.f320448d = lVar;
        this.f320449e = dVar;
        this.f320450f = jSONObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context;
        android.view.View view = (android.view.View) obj;
        yz5.l lVar = this.f320448d;
        if (view != null) {
            lVar.invoke(view);
        } else {
            lq0.d dVar = this.f320449e;
            lc3.s sVar = (lc3.s) dVar.f317890a;
            if (sVar == null || (context = sVar.B0()) == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context2 = context;
            kotlin.jvm.internal.o.d(context2);
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = new com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer(context2, null, 0, 6, null);
            org.json.JSONObject jSONObject = this.f320450f;
            int v17 = dVar.v(jSONObject);
            magicSclViewContainer.f68683p = v17;
            fq0.x xVar = magicSclViewContainer.frameSet;
            if (xVar != null) {
                xVar.f265492p = v17;
            }
            java.lang.String optString = jSONObject.optString("frameSetName");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            magicSclViewContainer.e(optString);
            lVar.invoke(magicSclViewContainer);
        }
        return jz5.f0.f302826a;
    }
}
