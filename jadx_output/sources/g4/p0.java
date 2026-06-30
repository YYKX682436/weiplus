package g4;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268479d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268480e;

    /* renamed from: f, reason: collision with root package name */
    public int f268481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f268483h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f268484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.coroutines.flow.j jVar, java.lang.Object obj, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268482g = jVar;
        this.f268483h = obj;
        this.f268484i = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.p0 p0Var = new g4.p0(this.f268482g, this.f268483h, this.f268484i, completion);
        p0Var.f268479d = obj;
        return p0Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.p0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268481f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar2 = (kotlinx.coroutines.flow.k) this.f268479d;
            h0Var = new kotlin.jvm.internal.h0();
            java.lang.Object obj2 = this.f268483h;
            h0Var.f310123d = obj2;
            this.f268479d = kVar2;
            this.f268480e = h0Var;
            this.f268481f = 1;
            if (kVar2.emit(obj2, this) == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            h0Var = (kotlin.jvm.internal.h0) this.f268480e;
            kVar = (kotlinx.coroutines.flow.k) this.f268479d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        g4.o0 o0Var = new g4.o0(this, kVar, h0Var);
        this.f268479d = null;
        this.f268480e = null;
        this.f268481f = 2;
        if (this.f268482g.a(o0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
