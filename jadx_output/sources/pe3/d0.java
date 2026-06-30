package pe3;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(pe3.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353647e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe3.d0(this.f353647e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353646d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return jz5.f0.f302826a;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.appcompat.app.AppCompatActivity activity = this.f353647e.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pe3.f fVar = (pe3.f) pf5.z.f353948a.a(activity).a(pe3.f.class);
        this.f353646d = 1;
        fVar.P6(this);
        return aVar;
    }
}
