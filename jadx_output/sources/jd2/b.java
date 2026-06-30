package jd2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jd2.d f299141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jd2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299141e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jd2.b(this.f299141e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299140d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jd2.d dVar = this.f299141e;
            dVar.f299144a.d();
            ym5.l2 l2Var = ym5.l2.f463424a;
            com.tencent.mm.view.MMPAGView mMPAGView = dVar.f299144a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            dVar.f299144a.o(ae2.in.f3688a.a(ym5.f6.f463314m));
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437831s;
            com.tencent.mm.view.MMPAGView mMPAGView2 = dVar.f299144a;
            this.f299140d = 1;
            if (sVar.d(hVar, mMPAGView2, this) == aVar) {
                return aVar;
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
