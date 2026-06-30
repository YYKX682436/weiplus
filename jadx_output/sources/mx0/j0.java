package mx0;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f332062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(yz5.l lVar, jz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332061d = lVar;
        this.f332062e = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.j0(this.f332061d, this.f332062e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.j0 j0Var = (mx0.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f332061d.invoke(this.f332062e);
        return jz5.f0.f302826a;
    }
}
