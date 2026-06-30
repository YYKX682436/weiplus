package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310444d;

    /* renamed from: e, reason: collision with root package name */
    public int f310445e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f310447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310448h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310447g = h0Var;
        this.f310448h = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.x xVar = new kotlinx.coroutines.flow.x(this.f310447g, this.f310448h, continuation);
        xVar.f310446f = obj;
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.flow.x) create(new u26.c0(((u26.c0) obj).f424141a), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.h0 h0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310445e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = ((u26.c0) this.f310446f).f424141a;
            boolean z17 = obj2 instanceof u26.b0;
            h0Var = this.f310447g;
            if (!z17) {
                h0Var.f310123d = obj2;
            }
            if (z17) {
                java.lang.Throwable a17 = u26.c0.a(obj2);
                if (a17 != null) {
                    throw a17;
                }
                java.lang.Object obj3 = h0Var.f310123d;
                if (obj3 != null) {
                    if (obj3 == v26.k0.f433020a) {
                        obj3 = null;
                    }
                    this.f310446f = obj2;
                    this.f310444d = h0Var;
                    this.f310445e = 1;
                    if (this.f310448h.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                    h0Var2 = h0Var;
                }
                h0Var.f310123d = v26.k0.f433022c;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var2 = (kotlin.jvm.internal.h0) this.f310444d;
        kotlin.ResultKt.throwOnFailure(obj);
        h0Var = h0Var2;
        h0Var.f310123d = v26.k0.f433022c;
        return jz5.f0.f302826a;
    }
}
