package df2;

/* loaded from: classes3.dex */
public final class qs extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(dk2.h hVar, df2.lt ltVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231185d = hVar;
        this.f231186e = ltVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qs(this.f231185d, this.f231186e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.qs qsVar = (df2.qs) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qsVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList d17 = kz5.c0.d(this.f231185d);
        df2.lt ltVar = this.f231186e;
        df2.lt.b7(ltVar, d17);
        df2.lt.f7(ltVar, d17);
        return jz5.f0.f302826a;
    }
}
