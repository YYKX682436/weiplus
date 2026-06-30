package kk5;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f308644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kk5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308644d = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.h(this.f308644d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.h hVar = (kk5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kk5.q qVar = this.f308644d;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = qVar.O6();
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kk5.g(qVar, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
