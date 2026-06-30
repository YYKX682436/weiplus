package wb5;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f444439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wb5.i iVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444438d = iVar;
        this.f444439e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wb5.d(this.f444438d, this.f444439e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wb5.d dVar = (wb5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wb5.i iVar = this.f444438d;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = iVar.O6();
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new wb5.c(iVar, this.f444439e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
