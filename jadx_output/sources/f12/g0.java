package f12;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258607e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.g0(this.f258607e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258606d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        f12.j0 j0Var = this.f258607e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggViewModel", "load egg");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            f12.f0 f0Var2 = new f12.f0(j0Var, null);
            this.f258606d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, f0Var2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        f21.e eVar = (f21.e) obj;
        if ((eVar != null ? eVar.f258879o : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpringLuckyEggViewModel", "couldn't find the luck egg");
            j0Var.f258623m.setValue(d12.a.f225711g);
            return f0Var;
        }
        j0Var.f258628r.setValue(eVar.f258879o);
        j0Var.f258624n.setValue(eVar.f258879o.f258859n);
        j0Var.f258619f = eVar.f258879o.f258852d;
        this.f258606d = 2;
        return f12.j0.N6(j0Var, this) == aVar ? aVar : f0Var;
    }
}
