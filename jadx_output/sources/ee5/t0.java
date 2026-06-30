package ee5;

/* loaded from: classes9.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f252044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ee5.v0 v0Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252044d = v0Var;
        this.f252045e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.t0(this.f252044d, this.f252045e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.t0 t0Var = (ee5.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = this.f252045e;
        ee5.v0 v0Var = this.f252044d;
        v0Var.V6(arrayList);
        v0Var.f252052h.setValue(ae5.n.f4434f);
        return jz5.f0.f302826a;
    }
}
