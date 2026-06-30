package vj4;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l5 f437682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.service.l5 l5Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437682d = l5Var;
        this.f437683e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vj4.b(this.f437682d, this.f437683e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vj4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = this.f437682d;
        if (l5Var == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("current_text", this.f437683e);
        ((com.tencent.mm.plugin.appbrand.d9) l5Var).G("onRequestRecommendIconStart", jSONObject);
        return jz5.f0.f302826a;
    }
}
