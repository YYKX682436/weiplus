package py2;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f359070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f359071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(org.json.JSONObject jSONObject, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359070e = jSONObject;
        this.f359071f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new py2.f(this.f359070e, this.f359071f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((py2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359069d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("result=");
            org.json.JSONObject jSONObject = this.f359070e;
            sb6.append(jSONObject.toString(4));
            com.tencent.mars.xlog.Log.i("Finder.WebSearchService", sb6.toString());
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            this.f359069d = 1;
            if (this.f359071f.t(jSONObject2, this) == aVar) {
                return aVar;
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
