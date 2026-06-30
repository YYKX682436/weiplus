package t00;

/* loaded from: classes9.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f414307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f414308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t00.l2 f414309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414311i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f414312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(org.json.JSONObject jSONObject, com.tencent.mm.ui.widget.dialog.u3 u3Var, t00.l2 l2Var, android.content.Context context, c00.n3 n3Var, org.json.JSONObject jSONObject2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f414307e = jSONObject;
        this.f414308f = u3Var;
        this.f414309g = l2Var;
        this.f414310h = context;
        this.f414311i = n3Var;
        this.f414312m = jSONObject2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t00.k2(this.f414307e, this.f414308f, this.f414309g, this.f414310h, this.f414311i, this.f414312m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((t00.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f414306d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.ne0 ne0Var = new bw5.ne0();
            org.json.JSONObject jSONObject = this.f414307e;
            ne0Var.d(com.tencent.mm.sdk.platformtools.b8.c(jSONObject.optString("productId")));
            ne0Var.f30658m = jSONObject.optString("passBuffer");
            ne0Var.f30659n[7] = true;
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            this.f414306d = 1;
            obj = ((b00.r) z2Var).vj(ne0Var, 5, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.qe0 qe0Var = (bw5.qe0) obj;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        t00.j2 j2Var = new t00.j2(this.f414308f, qe0Var, this.f414309g, this.f414307e, this.f414310h, this.f414311i, this.f414312m, null);
        this.f414306d = 2;
        if (kotlinx.coroutines.l.g(g3Var, j2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
