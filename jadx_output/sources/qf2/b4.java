package qf2;

/* loaded from: classes3.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c4 f362303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f362304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(qf2.c4 c4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362303d = c4Var;
        this.f362304e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.b4(this.f362303d, this.f362304e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.b4 b4Var = (qf2.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.nv nvVar = (df2.nv) this.f362303d.controller(df2.nv.class);
        if (nvVar != null) {
            df2.nv.Z6(nvVar, this.f362304e, nvVar.a7(), false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
