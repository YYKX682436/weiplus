package j93;

/* loaded from: classes.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f298438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j93.r0 r0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298437d = r0Var;
        this.f298438e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.m0(this.f298437d, this.f298438e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j93.m0 m0Var = (j93.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j93.r0 r0Var = this.f298437d;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = r0Var.O6();
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new j93.l0(r0Var, this.f298438e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
