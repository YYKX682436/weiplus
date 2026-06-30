package jd3;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f299179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jd3.g f299180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lc3.a0 a0Var, jd3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299179e = a0Var;
        this.f299180f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jd3.f(this.f299179e, this.f299180f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            org.json.JSONArray optJSONArray = this.f299179e.optJSONArray("jsFiles");
            jd3.g gVar = this.f299180f;
            lc3.h0 h0Var = (lc3.h0) gVar.f317890a;
            if (h0Var != null) {
                jd3.e eVar = new jd3.e(gVar);
                this.f299178d = 1;
                if (jd3.g.u(gVar, h0Var, optJSONArray, eVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
