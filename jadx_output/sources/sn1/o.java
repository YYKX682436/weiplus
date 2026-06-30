package sn1;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f410059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn1.j f410060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.util.function.Consumer consumer, sn1.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410059d = consumer;
        this.f410060e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sn1.o(this.f410059d, this.f410060e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sn1.o oVar = (sn1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f410059d.accept(this.f410060e);
        return jz5.f0.f302826a;
    }
}
