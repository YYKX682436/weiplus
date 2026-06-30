package ku3;

/* loaded from: classes5.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.s4 f312344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f312345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(ku3.s4 s4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312344d = s4Var;
        this.f312345e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.n4(this.f312344d, this.f312345e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.n4 n4Var = (ku3.n4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.s4 s4Var = this.f312344d;
        zt3.a aVar2 = s4Var.f312409d;
        android.content.Context context = s4Var.f312410e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar2.W6(3, this.f312345e, context);
        return jz5.f0.f302826a;
    }
}
