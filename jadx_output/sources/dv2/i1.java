package dv2;

/* loaded from: classes2.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.j1 f243871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(dv2.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243871e = j1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dv2.i1(this.f243871e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((dv2.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243870d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dv2.j1 j1Var = this.f243871e;
            dv2.j1.O6(j1Var);
            kotlinx.coroutines.flow.j2 j2Var = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d;
            dv2.h1 h1Var = new dv2.h1(j1Var);
            this.f243870d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(h1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
