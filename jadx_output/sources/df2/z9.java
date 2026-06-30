package df2;

/* loaded from: classes3.dex */
public final class z9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231935d = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.z9(this.f231935d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.z9 z9Var = (df2.z9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.zb zbVar = this.f231935d;
        zbVar.u7();
        df2.zb.w7(zbVar, false, null, 2, null);
        return jz5.f0.f302826a;
    }
}
