package fg3;

/* loaded from: classes12.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f262452d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f262453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg3.v f262454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fg3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f262454f = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fg3.u uVar = new fg3.u(this.f262454f, continuation);
        uVar.f262453e = obj;
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fg3.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        fg3.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f262452d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f262453e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f262453e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            fg3.v vVar = this.f262454f;
            jz5.l a17 = ((ig3.i) vVar.U()).a();
            int intValue = ((java.lang.Number) a17.f302833d).intValue();
            int intValue2 = ((java.lang.Number) a17.f302834e).intValue();
            if (intValue2 > 0 && (hVar = (fg3.h) vVar.G().a(fg3.h.class)) != null) {
                hVar.w(intValue, intValue2);
            }
            long min = java.lang.Math.min(1000 - (intValue % 1000), 500L);
            this.f262453e = y0Var;
            this.f262452d = 1;
            if (kotlinx.coroutines.k1.b(min, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
