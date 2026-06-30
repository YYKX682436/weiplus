package qg5;

/* loaded from: classes8.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363000d;

    /* renamed from: e, reason: collision with root package name */
    public int f363001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f363002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f363003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363004h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(kotlinx.coroutines.z zVar, qg5.n5 n5Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363002f = zVar;
        this.f363003g = n5Var;
        this.f363004h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.g5(this.f363002f, this.f363003g, this.f363004h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.z zVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363001e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ct.q2 T6 = qg5.n5.T6(this.f363003g);
            kotlinx.coroutines.z zVar2 = this.f363002f;
            this.f363000d = zVar2;
            this.f363001e = 1;
            obj = ((qg5.l0) T6).nj(this.f363004h, this);
            if (obj == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (kotlinx.coroutines.z) this.f363000d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((kotlinx.coroutines.a0) zVar).U(obj);
        return jz5.f0.f302826a;
    }
}
