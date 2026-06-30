package ku3;

/* loaded from: classes5.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.r5 f312329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f312330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(ku3.r5 r5Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312329d = r5Var;
        this.f312330e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.m5(this.f312329d, this.f312330e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.m5 m5Var = (ku3.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.r5 r5Var = this.f312329d;
        zt3.a aVar2 = r5Var.f312381d;
        android.content.Context context = r5Var.f312382e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar2.W6(2, this.f312330e, context);
        return jz5.f0.f302826a;
    }
}
