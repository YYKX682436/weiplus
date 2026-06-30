package j93;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f298412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(j93.r0 r0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298411d = r0Var;
        this.f298412e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.j0(this.f298411d, this.f298412e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j93.j0 j0Var = (j93.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j93.r0 r0Var;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (g95.e.f269801a.a() && (O6 = (r0Var = this.f298411d).O6()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new j93.i0(r0Var, this.f298412e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
