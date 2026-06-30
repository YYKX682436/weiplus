package mh2;

/* loaded from: classes10.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(mh2.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326479d = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.v0(this.f326479d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mh2.v0 v0Var = (mh2.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        mh2.f1 f1Var = this.f326479d;
        f1Var.i(f1Var.f326345t);
        return jz5.f0.f302826a;
    }
}
