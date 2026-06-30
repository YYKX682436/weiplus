package q71;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f360376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f360377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.q qVar, com.tencent.mm.modelbase.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360376d = qVar;
        this.f360377e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q71.z(this.f360376d, this.f360377e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        q71.z zVar = (q71.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelbase.f fVar = this.f360377e;
        this.f360376d.invoke(new java.lang.Integer(fVar.f70615a), new java.lang.Integer(fVar.f70616b), fVar.f70617c);
        return jz5.f0.f302826a;
    }
}
