package xt2;

/* loaded from: classes3.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f457073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mm2.y5 f457074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(xt2.e3 e3Var, cm2.m0 m0Var, mm2.y5 y5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457072e = e3Var;
        this.f457073f = m0Var;
        this.f457074g = y5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.v2(this.f457072e, this.f457073f, this.f457074g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.y23 y23Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457071d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f457071d = 1;
            if (kotlinx.coroutines.k1.b(150L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xt2.e3 e3Var = this.f457072e;
        if (e3Var.U != null) {
            java.lang.String str = e3Var.f456706h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subsidy replay: clear stale playing flag before retrigger, productId=");
            cm2.m0 m0Var = e3Var.U;
            sb6.append((m0Var == null || (y23Var = m0Var.f43368v) == null) ? null : new java.lang.Long(y23Var.getLong(0)));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            e3Var.c();
        }
        e3Var.f456721x0 = true;
        e3Var.l(this.f457073f, this.f457074g.f329575b);
        return jz5.f0.f302826a;
    }
}
