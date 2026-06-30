package du0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.t0 f243407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f243408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(du0.t0 t0Var, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243407d = t0Var;
        this.f243408e = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.p0(this.f243407d, this.f243408e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        du0.p0 p0Var = (du0.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        du0.t0 t0Var = this.f243407d;
        du0.t0.O6(t0Var, t0Var.f243440d, this.f243408e);
        return jz5.f0.f302826a;
    }
}
