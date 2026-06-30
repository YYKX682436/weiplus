package rv0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ex0.a0 a0Var, ex0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400298d = a0Var;
        this.f400299e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.w(this.f400298d, this.f400299e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rv0.w wVar = (rv0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.base.MJID segmentID = this.f400299e.f257168b;
        ex0.a0 a0Var = this.f400298d;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        a0Var.H.b(segmentID);
        return jz5.f0.f302826a;
    }
}
