package vp;

/* loaded from: classes14.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f438820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.a f438821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(vp.v0 v0Var, wp.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438820e = v0Var;
        this.f438821f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp.o0(this.f438820e, this.f438821f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438819d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f438820e.f438851m) {
                return f0Var;
            }
            java.lang.Object obj2 = this.f438820e.f438845g;
            if (obj2 == null) {
                kotlin.jvm.internal.o.o("taskChannel");
                throw null;
            }
            vp.l0 l0Var = new vp.l0(this.f438821f);
            this.f438819d = 1;
            if (((u26.o) obj2).t(l0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
