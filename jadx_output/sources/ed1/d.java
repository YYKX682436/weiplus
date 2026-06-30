package ed1;

/* loaded from: classes15.dex */
public final class d implements ed1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f251236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed1.f f251237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f251238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd1.a f251239d;

    public d(org.json.JSONObject jSONObject, ed1.f fVar, android.content.Context context, dd1.a aVar) {
        this.f251236a = jSONObject;
        this.f251237b = fVar;
        this.f251238c = context;
        this.f251239d = aVar;
    }

    @Override // ed1.i
    public final void onResult(int i17, java.lang.String str) {
        android.nfc.cardemulation.CardEmulation f17;
        new java.util.HashMap().put("errCode", java.lang.Integer.valueOf(i17));
        dd1.a aVar = this.f251239d;
        ed1.f fVar = this.f251237b;
        if (i17 != 0) {
            aVar.b(fVar.c(i17, str));
            return;
        }
        org.json.JSONObject jSONObject = this.f251236a;
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("aidList");
        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("removeAidList");
        jSONArray.length();
        fVar.getClass();
        jSONArray.toString();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        c75.c.d(jSONArray, new ed1.b(linkedHashSet));
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        kotlin.jvm.internal.o.d(jSONArray2);
        c75.c.d(jSONArray2, new ed1.c(linkedHashSet2));
        android.content.Context context = this.f251238c;
        kotlin.jvm.internal.o.d(context);
        java.util.Set W0 = kz5.n0.W0(fVar.a(context, aVar));
        W0.toString();
        W0.removeAll(linkedHashSet2);
        W0.addAll(linkedHashSet);
        W0.toString();
        linkedHashSet.toString();
        if (W0.isEmpty() && (f17 = fVar.f(context, aVar)) != null) {
            if (f17.removeAidsForService(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class), "payment")) {
                aVar.b(ed1.k.e(fVar, null, 1, null));
            } else {
                aVar.b(fVar.b("fail to removeAidsForService"));
            }
        }
        if (!W0.isEmpty()) {
            fVar.g(context, W0, aVar);
        }
    }
}
