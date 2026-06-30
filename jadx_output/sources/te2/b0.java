package te2;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f417889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.c0 f417890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(te2.i0 i0Var, te2.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417889e = i0Var;
        this.f417890f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.b0(this.f417889e, this.f417890f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417888d;
        te2.i0 i0Var = this.f417889e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (i0Var.f418096p == 1) {
                com.tencent.mm.view.MMPAGView D = i0Var.D();
                if (D != null) {
                    vl2.s sVar = vl2.s.f437868a;
                    vl2.h hVar = vl2.h.f437838y;
                    this.f417888d = 1;
                    if (sVar.d(hVar, D, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.tencent.mm.view.MMPAGView D2 = i0Var.D();
                if (D2 != null) {
                    vl2.s sVar2 = vl2.s.f437868a;
                    vl2.h hVar2 = vl2.h.f437839z;
                    this.f417888d = 2;
                    if (sVar2.d(hVar2, D2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.view.MMPAGView D3 = i0Var.D();
        if (D3 != null) {
            D3.i(this.f417890f);
        }
        com.tencent.mm.view.MMPAGView D4 = i0Var.D();
        if (D4 != null) {
            D4.setRepeatCount(0);
        }
        com.tencent.mm.view.MMPAGView D5 = i0Var.D();
        if (D5 != null) {
            D5.g();
        }
        return jz5.f0.f302826a;
    }
}
