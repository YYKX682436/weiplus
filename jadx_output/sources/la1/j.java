package la1;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.webrtc.n {

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f317499g;

    public j(android.util.SparseArray captureDelegateContainer) {
        kotlin.jvm.internal.o.g(captureDelegateContainer, "captureDelegateContainer");
        this.f317499g = captureDelegateContainer;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.n, gb1.f
    public /* bridge */ /* synthetic */ boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        J((com.tencent.luggage.sdk.jsapi.component.b) tVar, i17, view, jSONObject);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.n
    /* renamed from: K */
    public boolean J(com.tencent.luggage.sdk.jsapi.component.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        ce.g gVar;
        android.util.SparseArray sparseArray = this.f317499g;
        de.a aVar = (de.a) sparseArray.get(i17);
        if (aVar != null) {
            if (bVar != null && (gVar = (ce.g) bVar.B1(ce.g.class)) != null) {
                ((ce.o) gVar).f40696t.remove(aVar);
            }
            sparseArray.remove(i17);
        }
        super.J(bVar, i17, view, jSONObject);
        return true;
    }
}
