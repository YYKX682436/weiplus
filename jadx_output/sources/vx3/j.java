package vx3;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f441310d;

    /* renamed from: e, reason: collision with root package name */
    public int f441311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f441312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t45.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441312f = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vx3.j(this.f441312f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vx3.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object b17;
        long j17;
        java.lang.Object g17;
        t45.a0 a0Var;
        t45.n0 n0Var;
        xx3.a aVar;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f441311e;
        vx3.k kVar = vx3.l.E;
        t45.l0 l0Var = this.f441312f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (l0Var.f415601d == 1) {
                t45.e0 e0Var = l0Var.f415604g;
                if (e0Var == null) {
                    return null;
                }
                int i18 = e0Var.f415547d;
                this.f441311e = 1;
                g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new mx3.o(i18, null), this);
                if (g17 == aVar2) {
                    return aVar2;
                }
                a0Var = (t45.a0) g17;
                if (a0Var != null) {
                    return vx3.k.h(kVar, l0Var.f415602e, l0Var.f415603f, n0Var, null, 8, null);
                }
            } else {
                t45.f fVar = l0Var.f415605h;
                if (fVar != null) {
                    long j18 = fVar.f415549d;
                    if (fVar != null && (str = fVar.f415550e) != null) {
                        this.f441310d = j18;
                        this.f441311e = 2;
                        b17 = xx3.h.b(j18, str, this);
                        if (b17 == aVar2) {
                            return aVar2;
                        }
                        j17 = j18;
                        aVar = (xx3.a) b17;
                        if (aVar != null) {
                            return vx3.k.c(kVar, l0Var.f415602e, l0Var.f415603f, finderObject, j17, null, null, false, 112, null);
                        }
                    }
                }
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            a0Var = (t45.a0) g17;
            if (a0Var != null && (n0Var = a0Var.f415523d) != null) {
                return vx3.k.h(kVar, l0Var.f415602e, l0Var.f415603f, n0Var, null, 8, null);
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = this.f441310d;
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = j19;
            b17 = obj;
            aVar = (xx3.a) b17;
            if (aVar != null && (finderObject = aVar.f457993a) != null) {
                return vx3.k.c(kVar, l0Var.f415602e, l0Var.f415603f, finderObject, j17, null, null, false, 112, null);
            }
        }
        return null;
    }
}
