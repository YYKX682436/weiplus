package ms5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f331157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331156e = str;
        this.f331157f = jSONArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ms5.e eVar = new ms5.e(this.f331156e, this.f331157f, continuation);
        eVar.f331155d = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ms5.e eVar = (ms5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f331155d;
        java.util.Iterator it = ms5.f.f331160c.entrySet().iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.b(y0Var, null, null, new ms5.d((java.util.Map.Entry) it.next(), this.f331156e, this.f331157f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
