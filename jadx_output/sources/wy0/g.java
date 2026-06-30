package wy0;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f450612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450611d = list;
        this.f450612e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wy0.g(this.f450611d, this.f450612e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wy0.g gVar = (wy0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = this.f450611d.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        float c17 = wy0.m.c((java.lang.String) it.next());
        while (it.hasNext()) {
            c17 = java.lang.Math.max(c17, wy0.m.c((java.lang.String) it.next()));
        }
        this.f450612e.setValue(java.lang.Float.valueOf(c17));
        return jz5.f0.f302826a;
    }
}
