package gu0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f275780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f275781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f275782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gu0.k2 k2Var, org.json.JSONObject jSONObject, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275779e = k2Var;
        this.f275780f = jSONObject;
        this.f275781g = z17;
        this.f275782h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.o1(this.f275779e, this.f275780f, this.f275781g, this.f275782h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f275778d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                t26.a aVar2 = ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h;
                gu0.n1 n1Var = new gu0.n1(this.f275779e, null);
                this.f275778d = 1;
                if (kotlinx.coroutines.l.g(aVar2, n1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "releaseAndFinish: releaseResources failed: " + e17.getMessage());
        }
        this.f275779e.f275727c.invoke(this.f275780f);
        kotlinx.coroutines.v2.c(this.f275779e.f275736l, null, 1, null);
        kotlinx.coroutines.z0.e(this.f275779e.f275728d, null, 1, null);
        boolean z17 = this.f275781g;
        com.tencent.mars.xlog.Log.i("MJCC.SessionMgr", "clearSession");
        gu0.l2.f275761a = null;
        if (z17) {
            gu0.l2.f275763c = null;
            gu0.l2.f275762b = null;
        }
        com.tencent.mars.xlog.Log.i("MJCC.Session", "releaseAndFinish: cleanup done");
        yz5.a aVar3 = this.f275782h;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        return jz5.f0.f302826a;
    }
}
