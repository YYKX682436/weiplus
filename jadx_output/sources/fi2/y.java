package fi2;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f262945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi2.e0 f262946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(fi2.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f262946e = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fi2.y(this.f262946e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fi2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f262945d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fi2.e0 e0Var = this.f262946e;
            kotlinx.coroutines.flow.j e17 = e0Var.e();
            if (!(e17 instanceof kotlinx.coroutines.flow.j)) {
                e17 = null;
            }
            if (e17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(e17, kotlinx.coroutines.internal.b0.f310484a);
                if (n17 != null) {
                    fi2.x xVar = new fi2.x(e0Var);
                    this.f262945d = 1;
                    if (n17.a(xVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
