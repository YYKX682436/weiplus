package nr2;

/* loaded from: classes2.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(nr2.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339188d = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.f1(this.f339188d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr2.f1 f1Var = (nr2.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nr2.l1 l1Var = this.f339188d.f339212c;
        if (l1Var != null) {
            l1Var.d().e(false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
