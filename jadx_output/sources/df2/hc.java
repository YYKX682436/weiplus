package df2;

/* loaded from: classes3.dex */
public final class hc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jc f230319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(df2.jc jcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230319d = jcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.hc(this.f230319d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.hc hcVar = (df2.hc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hcVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.jc.Z6(this.f230319d, "onLiveStart");
        return jz5.f0.f302826a;
    }
}
