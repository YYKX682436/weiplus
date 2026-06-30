package kk5;

/* loaded from: classes.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f308659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f308660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kk5.q qVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308659d = qVar;
        this.f308660e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.j(this.f308659d, this.f308660e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.j jVar = (kk5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kk5.q qVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (g95.e.f269801a.a() && (O6 = (qVar = this.f308659d).O6()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kk5.i(qVar, this.f308660e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
