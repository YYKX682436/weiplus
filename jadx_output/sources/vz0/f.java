package vz0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f441602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f441603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vz0.d0 d0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441602d = d0Var;
        this.f441603e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vz0.f(this.f441602d, this.f441603e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vz0.f fVar = (vz0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f441603e - 1;
        vz0.d0 d0Var = this.f441602d;
        int min = java.lang.Math.min(i17, d0Var.e());
        if (min < 0) {
            min = 0;
        }
        if (min != d0Var.e()) {
            ((n0.q4) d0Var.f441595b).setValue(java.lang.Integer.valueOf(min));
        }
        return jz5.f0.f302826a;
    }
}
