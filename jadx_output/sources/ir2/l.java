package ir2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.o f294169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f294170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ir2.o oVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294169d = oVar;
        this.f294170e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.l(this.f294169d, this.f294170e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ir2.l lVar = (ir2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ir2.y.W3(this.f294169d.f294188d, new ir2.e(0, 0L, this.f294170e, 3, null), false, 2, null);
        return jz5.f0.f302826a;
    }
}
