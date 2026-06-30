package so2;

/* loaded from: classes10.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.z5 f410348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f410349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(so2.z5 z5Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410348d = z5Var;
        this.f410349e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.f6(this.f410348d, this.f410349e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so2.f6 f6Var = (so2.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so2.a6 a6Var = (so2.a6) this.f410348d;
        a6Var.getClass();
        java.util.ArrayList drawables = this.f410349e;
        kotlin.jvm.internal.o.g(drawables, "drawables");
        ((so2.k6) a6Var.f410261f).a(true, a6Var.f410256a.O6(a6Var.f410257b, a6Var.f410258c, a6Var.f410259d, a6Var.f410260e, drawables));
        return jz5.f0.f302826a;
    }
}
