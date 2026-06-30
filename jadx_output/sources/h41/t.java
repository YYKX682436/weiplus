package h41;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f278856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f278857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h41.x xVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278856e = xVar;
        this.f278857f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.t(this.f278856e, this.f278857f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278855d;
        h41.x xVar = this.f278856e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h41.j jVar = xVar.f278885b;
            h41.m mVar = new h41.m(xVar);
            h41.n nVar = new h41.n(xVar);
            h41.o oVar = new h41.o(xVar);
            h41.p pVar = new h41.p(xVar);
            h41.q qVar = new h41.q(xVar);
            h41.r rVar = new h41.r(xVar);
            h41.s sVar = new h41.s(xVar);
            this.f278855d = 1;
            obj = jVar.b(mVar, nVar, oVar, pVar, qVar, rVar, sVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.wechat.aff.ovc.a aVar2 = xVar.f278884a;
        if (aVar2 != null) {
            aVar2.H1(this.f278857f, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
