package vn2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f438323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r45.l03 l03Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438323e = l03Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.m(this.f438323e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438322d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vn2.k kVar = vn2.l.f438315a;
            r45.l03 l03Var = this.f438323e;
            this.f438322d = 1;
            obj = vn2.k.b(kVar, "MicroMsg.LongVideoMainFeedsDataFetchModel", l03Var, null, 0L, null, this, 24, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
