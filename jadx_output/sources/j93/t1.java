package j93;

/* loaded from: classes.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f298500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f298501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f298502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f298503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f298504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, j93.w1 w1Var, wi5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298501e = i2Var;
        this.f298502f = hashMap;
        this.f298503g = w1Var;
        this.f298504h = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.t1(this.f298501e, this.f298502f, this.f298503g, this.f298504h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((j93.t1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f298500d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j93.s1 s1Var = new j93.s1(this.f298502f, this.f298503g, this.f298504h);
            this.f298500d = 1;
            if (this.f298501e.a(s1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
