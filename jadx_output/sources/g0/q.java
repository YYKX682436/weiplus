package g0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f267366d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f267367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.r f267368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1.g f267369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.z f267370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.g f267371i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0.r rVar, d1.g gVar, s1.z zVar, d1.g gVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267368f = rVar;
        this.f267369g = gVar;
        this.f267370h = zVar;
        this.f267371i = gVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        g0.q qVar = new g0.q(this.f267368f, this.f267369g, this.f267370h, this.f267371i, continuation);
        qVar.f267367e = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f267366d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f267367e;
            g0.r rVar = this.f267368f;
            kotlinx.coroutines.l.d(y0Var, null, null, new g0.p(rVar, this.f267371i, null), 3, null);
            g0.e eVar = rVar.f267338e;
            if (eVar == null) {
                eVar = rVar.f267337d;
            }
            this.f267366d = 1;
            if (eVar.a(this.f267369g, this.f267370h, this) == aVar) {
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
