package mx0;

/* loaded from: classes.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yz5.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332162d = lVar;
        this.f332163e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.n0(this.f332162d, this.f332163e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.n0 n0Var = (mx0.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f332162d.invoke(java.lang.Boolean.valueOf(this.f332163e));
        return jz5.f0.f302826a;
    }
}
