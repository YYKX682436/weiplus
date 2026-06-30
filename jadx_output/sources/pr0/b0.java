package pr0;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357811e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.b0(this.f357811e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xr0.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357810d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pr0.g0 g0Var = this.f357811e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sr0.i iVar = g0Var.f357834e;
            if (iVar != null && (dVar = ((sr0.f) iVar).f411437n) != null) {
                boolean o17 = iVar != null ? iVar.o() : false;
                sr0.i iVar2 = g0Var.f357834e;
                boolean t17 = iVar2 != null ? iVar2.t() : false;
                boolean z17 = dVar.f456161c;
                if ((z17 && t17) || (!z17 && o17)) {
                    sr0.i iVar3 = g0Var.f357834e;
                    if (iVar3 != null) {
                        this.f357810d = 1;
                        obj = iVar3.p(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.f357810d = 2;
        int i18 = pr0.g0.f357839v;
        g0Var.getClass();
        sr0.i iVar4 = ((pr0.d) g0Var).f357834e;
        if ((iVar4 != null ? ((sr0.f) iVar4).f411437n : null) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("camera_boolean", !r9.f456161c);
            ((kotlinx.coroutines.flow.h3) g0Var.f357840u).emit(new jz5.l(bs0.g.f23789f, bundle), this);
        }
        return f0Var == aVar ? aVar : f0Var;
    }
}
