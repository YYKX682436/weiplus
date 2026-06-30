package hr3;

/* loaded from: classes.dex */
public final class vf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f284116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f284117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(java.lang.String str, r45.v60 v60Var, android.content.Context context, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284115e = str;
        this.f284116f = v60Var;
        this.f284117g = context;
        this.f284118h = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.vf(this.f284115e, this.f284116f, this.f284117g, this.f284118h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.vf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284114d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr3.ag agVar = hr3.ag.f283404a;
            this.f284114d = 1;
            obj = agVar.c(this.f284115e, this.f284116f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        yz5.p pVar = this.f284118h;
        if (z17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            hr3.uf ufVar = new hr3.uf(pVar, null);
            this.f284114d = 3;
            if (kotlinx.coroutines.l.g(g3Var, ufVar, this) == aVar) {
                return aVar;
            }
        } else {
            android.graphics.Bitmap a17 = com.tencent.mm.sdk.platformtools.j.a(str, i65.a.g(this.f284117g));
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            hr3.tf tfVar = new hr3.tf(pVar, str, a17, null);
            this.f284114d = 2;
            if (kotlinx.coroutines.l.g(g3Var2, tfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
