package yu1;

/* loaded from: classes13.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu1.c f465843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yu1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465843d = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yu1.b(this.f465843d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yu1.b bVar = (yu1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.io.BufferedReader bufferedReader = this.f465843d.f465846c;
        if (bufferedReader != null) {
            bufferedReader.close();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("reader");
        throw null;
    }
}
