package zi2;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zi2.w wVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473150d = wVar;
        this.f473151e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.u(this.f473150d, this.f473151e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi2.u uVar = (zi2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        db5.t7.g(this.f473150d.f365323d.getContext(), this.f473151e);
        return jz5.f0.f302826a;
    }
}
