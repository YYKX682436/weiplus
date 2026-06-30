package pe3;

/* loaded from: classes7.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pe3.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353651e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe3.e0(this.f353651e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353650d;
        pe3.g0 g0Var = this.f353651e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            se3.e eVar = g0Var.f353658d;
            this.f353650d = 1;
            if (eVar.O6("frames", "", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.lifecycle.j0 j0Var = g0Var.f353658d.f406915e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < 20; i18++) {
            arrayList.add(new se3.g());
        }
        j0Var.setValue(arrayList);
        return jz5.f0.f302826a;
    }
}
