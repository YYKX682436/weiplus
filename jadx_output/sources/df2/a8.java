package df2;

/* loaded from: classes.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f229686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(df2.s8 s8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229686d = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.a8(this.f229686d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.s8 s8Var = this.f229686d;
        dk2.xf P6 = s8Var.P6();
        if (P6 == null) {
            return null;
        }
        ((dk2.r4) P6).T(java.lang.System.currentTimeMillis(), new df2.z7(s8Var));
        return jz5.f0.f302826a;
    }
}
