package rf2;

/* loaded from: classes10.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rf2.v0 v0Var, r45.f02 f02Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394776e = v0Var;
        this.f394777f = f02Var;
        this.f394778g = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.j0(this.f394776e, this.f394777f, this.f394778g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394775d;
        r45.f02 f02Var = this.f394777f;
        rf2.v0 v0Var = this.f394776e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f394775d = 1;
            if (rf2.v0.a(v0Var, f02Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.view.View view = this.f394778g;
        v0Var.k(view, f02Var);
        v0Var.j(view, f02Var);
        return jz5.f0.f302826a;
    }
}
