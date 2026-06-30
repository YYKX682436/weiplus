package dm1;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dm1.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241630d = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dm1.b(this.f241630d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dm1.b bVar = (dm1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dm1.m mVar = this.f241630d;
        if (mVar.f241648c != null) {
            mVar.f241659n = true;
            mVar.a(true, true);
        }
        return jz5.f0.f302826a;
    }
}
