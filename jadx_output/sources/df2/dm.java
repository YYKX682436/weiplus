package df2;

/* loaded from: classes2.dex */
public final class dm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f229989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229989e = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.dm(this.f229989e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.dm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229988d;
        com.tencent.mm.view.MMPAGView pagView = this.f229989e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            pagView.o(ae2.in.f3688a.a(ym5.f6.A1));
            pagView.setRepeatCount(-1);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437818J;
            kotlin.jvm.internal.o.f(pagView, "$pagView");
            this.f229988d = 1;
            if (sVar.d(hVar, pagView, this) == aVar) {
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pagView.d();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        df2.cm cmVar = new df2.cm(pagView, null);
        this.f229988d = 2;
        if (kotlinx.coroutines.l.g(g3Var, cmVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
