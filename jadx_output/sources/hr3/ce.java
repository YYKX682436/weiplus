package hr3;

/* loaded from: classes5.dex */
public final class ce extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f283454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(yz5.l lVar, r45.dz3 dz3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283454d = lVar;
        this.f283455e = dz3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.ce(this.f283454d, this.f283455e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hr3.ce ceVar = (hr3.ce) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ceVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f283454d.invoke(this.f283455e);
        return jz5.f0.f302826a;
    }
}
