package go5;

/* loaded from: classes4.dex */
public final class p extends qz5.l implements yz5.p {
    public p(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new go5.p(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new go5.p((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new java.lang.Integer(((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).f272760n);
    }
}
