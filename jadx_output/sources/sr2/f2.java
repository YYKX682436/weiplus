package sr2;

/* loaded from: classes2.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f411562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(sr2.y2 y2Var, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411561d = y2Var;
        this.f411562e = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sr2.f2(this.f411561d, this.f411562e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sr2.f2 f2Var = (sr2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f411561d.Y6(this.f411562e);
        return jz5.f0.f302826a;
    }
}
