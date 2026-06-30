package cr5;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr5.f f222008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cr5.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222008e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cr5.b(this.f222008e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cr5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222007d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cr5.f fVar = this.f222008e;
            br5.e eVar = fVar.f222029d;
            java.util.List i18 = kz5.c0.i(eVar.f23769r, eVar.f23771t, eVar.f23772u, eVar.f23761j);
            int i19 = kotlinx.coroutines.flow.i1.f310295a;
            v26.v vVar = new v26.v(i18, oz5.m.f350329d, -2, u26.u.SUSPEND);
            cr5.a aVar2 = new cr5.a(fVar);
            this.f222007d = 1;
            if (vVar.a(aVar2, this) == aVar) {
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
