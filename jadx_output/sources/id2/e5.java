package id2;

/* loaded from: classes3.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ql1 f290556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f290557g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(id2.f5 f5Var, r45.ql1 ql1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290555e = f5Var;
        this.f290556f = ql1Var;
        this.f290557g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.e5(this.f290555e, this.f290556f, this.f290557g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.e5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290554d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.j5 j5Var = zl2.j5.f473850a;
            androidx.appcompat.app.AppCompatActivity activity = this.f290555e.getActivity();
            this.f290554d = 1;
            if (j5Var.d(activity, this.f290556f, this.f290557g, this) == aVar) {
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
