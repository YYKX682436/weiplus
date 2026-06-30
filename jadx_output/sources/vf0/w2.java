package vf0;

/* loaded from: classes11.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f436297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf0.y2 f436298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(kotlinx.coroutines.flow.j jVar, vf0.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436297e = jVar;
        this.f436298f = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vf0.w2(this.f436297e, this.f436298f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vf0.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436296d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vf0.v2 v2Var = new vf0.v2(this.f436298f);
            this.f436296d = 1;
            if (this.f436297e.a(v2Var, this) == aVar) {
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
