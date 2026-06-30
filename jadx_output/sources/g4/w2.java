package g4;

/* loaded from: classes5.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f268596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f268598f;

    /* renamed from: g, reason: collision with root package name */
    public int f268599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268600h = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.w2(this.f268600h, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.w2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        g4.y2 y2Var;
        g4.z2 z2Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268599g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                y2Var = this.f268600h;
                z2Var = y2Var.f268634e;
                kotlinx.coroutines.sync.d dVar = z2Var.f268651a;
                this.f268596d = z2Var;
                this.f268597e = dVar;
                this.f268598f = y2Var;
                this.f268599g = 1;
                kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
                java.lang.Object b17 = kVar.b(null, this);
                obj2 = kVar;
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return jz5.f0.f302826a;
                }
                y2Var = (g4.y2) this.f268598f;
                java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f268597e;
                z2Var = (g4.z2) this.f268596d;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj3;
            }
            g4.c3 c3Var = z2Var.f268652b;
            kotlinx.coroutines.flow.i0 i0Var = new kotlinx.coroutines.flow.i0(new g4.b3(c3Var, null), kotlinx.coroutines.flow.l.g(c3Var.f268236h));
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            g4.a1 a1Var = g4.a1.PREPEND;
            this.f268596d = null;
            this.f268597e = null;
            this.f268598f = null;
            this.f268599g = 2;
            if (y2Var.b(i0Var, a1Var, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            throw th6;
        }
    }
}
